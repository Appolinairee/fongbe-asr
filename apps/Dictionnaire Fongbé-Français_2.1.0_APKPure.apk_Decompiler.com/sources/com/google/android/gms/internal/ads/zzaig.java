package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaig implements zzaid {
    private final int zza;
    private final int zzb;
    private final zzdy zzc;

    public zzaig(zzeo zzeo, zzab zzab) {
        zzdy zzdy = zzeo.zza;
        this.zzc = zzdy;
        zzdy.zzL(12);
        int zzp = zzdy.zzp();
        if ("audio/raw".equals(zzab.zzo)) {
            int zzk = zzei.zzk(zzab.zzF) * zzab.zzD;
            if (zzp == 0 || zzp % zzk != 0) {
                zzdo.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + zzk + ", stsz sample size: " + zzp);
                zzp = zzk;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzdy.zzp();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzp() : i;
    }
}
