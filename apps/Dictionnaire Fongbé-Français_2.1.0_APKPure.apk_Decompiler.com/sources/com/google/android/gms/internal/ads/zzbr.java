package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbr {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzab[] zzd;
    private int zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbr(String str, zzab... zzabArr) {
        int length = zzabArr.length;
        int i = 1;
        zzcw.zzd(length > 0);
        this.zzb = str;
        this.zzd = zzabArr;
        this.zza = length;
        int zzb2 = zzbb.zzb(zzabArr[0].zzo);
        this.zzc = zzb2 == -1 ? zzbb.zzb(zzabArr[0].zzn) : zzb2;
        String zzc2 = zzc(zzabArr[0].zzd);
        int i2 = zzabArr[0].zzf | 16384;
        while (true) {
            zzab[] zzabArr2 = this.zzd;
            if (i >= zzabArr2.length) {
                return;
            }
            if (!zzc2.equals(zzc(zzabArr2[i].zzd))) {
                zzab[] zzabArr3 = this.zzd;
                zzd("languages", zzabArr3[0].zzd, zzabArr3[i].zzd, i);
                return;
            }
            zzab[] zzabArr4 = this.zzd;
            if (i2 != (zzabArr4[i].zzf | 16384)) {
                zzd("role flags", Integer.toBinaryString(zzabArr4[0].zzf), Integer.toBinaryString(this.zzd[i].zzf), i);
                return;
            }
            i++;
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i) {
        zzdo.zzd("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbr zzbr = (zzbr) obj;
            return this.zzb.equals(zzbr.zzb) && Arrays.equals(this.zzd, zzbr.zzd);
        }
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.zzb.hashCode() + 527) * 31) + Arrays.hashCode(this.zzd);
        this.zze = hashCode;
        return hashCode;
    }

    public final int zza(zzab zzab) {
        int i = 0;
        while (true) {
            zzab[] zzabArr = this.zzd;
            if (i >= zzabArr.length) {
                return -1;
            }
            if (zzab == zzabArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final zzab zzb(int i) {
        return this.zzd[i];
    }
}
