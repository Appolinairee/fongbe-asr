package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzk {
    public static final zzk zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzi zzi = new zzi();
        zzi.zzc(1);
        zzi.zzb(2);
        zzi.zzd(3);
        zza = zzi.zzg();
        zzi zzi2 = new zzi();
        zzi2.zzc(1);
        zzi2.zzb(1);
        zzi2.zzd(2);
        zzi2.zzg();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ zzk(int i, int i2, int i3, byte[] bArr, int i4, int i5, zzj zzj) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = bArr;
        this.zzf = i4;
        this.zzg = i5;
    }

    @Pure
    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        r1 = r5.zzd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        r1 = r5.zzg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        r5 = r5.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r1 = r5.zzc;
     */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzg(com.google.android.gms.internal.ads.zzk r5) {
        /*
            r0 = 1
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r5.zzb
            r2 = 2
            r3 = -1
            r4 = 0
            if (r1 == r3) goto L_0x000f
            if (r1 == r0) goto L_0x000f
            if (r1 != r2) goto L_0x0016
        L_0x000f:
            int r1 = r5.zzc
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0032
        L_0x0018:
            int r1 = r5.zzd
            if (r1 == r3) goto L_0x001f
            r2 = 3
            if (r1 != r2) goto L_0x0016
        L_0x001f:
            byte[] r1 = r5.zze
            if (r1 != 0) goto L_0x0016
            int r1 = r5.zzg
            r2 = 8
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0016
        L_0x002b:
            int r5 = r5.zzf
            if (r5 == r3) goto L_0x0032
            if (r5 == r2) goto L_0x0032
            goto L_0x0016
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzk.zzg(com.google.android.gms.internal.ads.zzk):boolean");
    }

    private static String zzh(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i;
    }

    private static String zzi(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        return "Undefined color space " + i;
    }

    private static String zzj(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzk zzk = (zzk) obj;
            return this.zzb == zzk.zzb && this.zzc == zzk.zzc && this.zzd == zzk.zzd && Arrays.equals(this.zze, zzk.zze) && this.zzf == zzk.zzf && this.zzg == zzk.zzg;
        }
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31) + Arrays.hashCode(this.zze)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        int i = this.zzf;
        int i2 = this.zzd;
        int i3 = this.zzc;
        String zzi = zzi(this.zzb);
        String zzh2 = zzh(i3);
        String zzj = zzj(i2);
        String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = str2;
        }
        int i4 = this.zzg;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        return "ColorInfo(" + zzi + ", " + zzh2 + ", " + zzj + ", " + (this.zze != null) + ", " + str + ", " + str2 + ")";
    }

    public final zzi zzc() {
        return new zzi(this, (zzj) null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            str = String.format(Locale.US, "%s/%s/%s", new Object[]{zzi(this.zzb), zzh(this.zzc), zzj(this.zzd)});
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzf + "/" + this.zzg;
        } else {
            str2 = "NA/NA";
        }
        return str + "/" + str2;
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }
}
