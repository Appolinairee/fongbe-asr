package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzadl implements zzadm {
    private final long zza;
    private final zzadk zzb;

    public final long zza() {
        return this.zza;
    }

    public final zzadk zzg(long j) {
        return this.zzb;
    }

    public final boolean zzh() {
        return false;
    }

    public zzadl(long j, long j2) {
        zzadn zzadn;
        this.zza = j;
        if (j2 == 0) {
            zzadn = zzadn.zza;
        } else {
            zzadn = new zzadn(0, j2);
        }
        this.zzb = new zzadk(zzadn, zzadn);
    }
}
