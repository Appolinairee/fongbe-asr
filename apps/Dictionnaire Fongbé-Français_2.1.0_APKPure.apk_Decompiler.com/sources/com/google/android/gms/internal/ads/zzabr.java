package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzabr {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzabr(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static zzabr zza(zzdy zzdy) throws zzbc {
        String str;
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        try {
            zzdy.zzM(4);
            int zzm = zzdy.zzm() & 3;
            int i9 = zzm + 1;
            if (i9 != 3) {
                ArrayList arrayList = new ArrayList();
                int zzm2 = zzdy.zzm() & 31;
                for (int i10 = 0; i10 < zzm2; i10++) {
                    arrayList.add(zzb(zzdy));
                }
                int zzm3 = zzdy.zzm();
                for (int i11 = 0; i11 < zzm3; i11++) {
                    arrayList.add(zzb(zzdy));
                }
                if (zzm2 > 0) {
                    zzfj zzf2 = zzfk.zzf((byte[]) arrayList.get(0), zzm + 2, ((byte[]) arrayList.get(0)).length);
                    int i12 = zzf2.zze;
                    int i13 = zzf2.zzf;
                    int i14 = zzf2.zzj;
                    int i15 = zzf2.zzk;
                    int i16 = zzf2.zzl;
                    int i17 = zzf2.zzm;
                    float f2 = zzf2.zzg;
                    str = zzcy.zzc(zzf2.zza, zzf2.zzb, zzf2.zzc);
                    i2 = i16;
                    i = i17;
                    f = f2;
                    i5 = zzf2.zzi + 8;
                    i4 = i14;
                    i3 = i15;
                    i8 = i12;
                    i7 = i13;
                    i6 = zzf2.zzh + 8;
                } else {
                    str = null;
                    i8 = -1;
                    i7 = -1;
                    i6 = -1;
                    i5 = -1;
                    i4 = -1;
                    i3 = -1;
                    i2 = -1;
                    i = 16;
                    f = 1.0f;
                }
                return new zzabr(arrayList, i9, i8, i7, i6, i5, i4, i3, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbc.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzdy zzdy) {
        int zzq = zzdy.zzq();
        int zzd2 = zzdy.zzd();
        zzdy.zzM(zzq);
        return zzcy.zze(zzdy.zzN(), zzd2, zzq);
    }
}
