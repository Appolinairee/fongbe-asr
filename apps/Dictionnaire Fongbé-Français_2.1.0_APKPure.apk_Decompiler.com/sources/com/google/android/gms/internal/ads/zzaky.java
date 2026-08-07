package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import io.flutter.embedding.android.KeyboardMap;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaky {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzaky(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    public static zzaky zzb(String str, zzakw zzakw) {
        int i;
        String str2 = str;
        zzakw zzakw2 = zzakw;
        zzcw.zzd(str2.startsWith("Style:"));
        String[] split = TextUtils.split(str2.substring(6), ",");
        int length = split.length;
        int i2 = zzakw2.zzk;
        if (length != i2) {
            zzdo.zzf("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", new Object[]{Integer.valueOf(i2), Integer.valueOf(length), str2}));
            return null;
        }
        try {
            String trim = split[zzakw2.zza].trim();
            int i3 = zzakw2.zzb;
            int zzd2 = i3 != -1 ? zzd(split[i3].trim()) : -1;
            int i4 = zzakw2.zzc;
            Integer zzc2 = i4 != -1 ? zzc(split[i4].trim()) : null;
            int i5 = zzakw2.zzd;
            Integer zzc3 = i5 != -1 ? zzc(split[i5].trim()) : null;
            int i6 = zzakw2.zze;
            float f = -3.4028235E38f;
            if (i6 != -1) {
                String trim2 = split[i6].trim();
                try {
                    f = Float.parseFloat(trim2);
                } catch (NumberFormatException e) {
                    NumberFormatException numberFormatException = e;
                    zzdo.zzg("SsaStyle", "Failed to parse font size: '" + trim2 + "'", numberFormatException);
                }
            }
            int i7 = zzakw2.zzf;
            boolean z = i7 != -1 && zze(split[i7].trim());
            int i8 = zzakw2.zzg;
            boolean z2 = i8 != -1 && zze(split[i8].trim());
            int i9 = zzakw2.zzh;
            boolean z3 = i9 != -1 && zze(split[i9].trim());
            int i10 = zzakw2.zzi;
            boolean z4 = i10 != -1 && zze(split[i10].trim());
            int i11 = zzakw2.zzj;
            if (i11 != -1) {
                String trim3 = split[i11].trim();
                try {
                    int parseInt = Integer.parseInt(trim3.trim());
                    if (parseInt == 1 || parseInt == 3) {
                        i = parseInt;
                        return new zzaky(trim, zzd2, zzc2, zzc3, f, z, z2, z3, z4, i);
                    }
                } catch (NumberFormatException unused) {
                }
                zzdo.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim3)));
            }
            i = -1;
            return new zzaky(trim, zzd2, zzc2, zzc3, f, z, z2, z3, z4, i);
        } catch (RuntimeException e2) {
            zzdo.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str2 + "'", e2);
            return null;
        }
    }

    public static Integer zzc(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            zzcw.zzd(j <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(zzgaq.zzb(((j >> 24) & 255) ^ 255), zzgaq.zzb(j & 255), zzgaq.zzb((j >> 8) & 255), zzgaq.zzb((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            zzdo.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        zzdo.zzf("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
        return -1;
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            zzdo.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
