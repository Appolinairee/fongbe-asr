package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaec implements zzadm {
    final /* synthetic */ zzaef zza;
    private final long zzb;

    public zzaec(zzaef zzaef, long j) {
        this.zza = zzaef;
        this.zzb = j;
    }

    public final long zza() {
        return this.zzb;
    }

    public final zzadk zzg(long j) {
        zzadk zza2 = this.zza.zzi[0].zza(j);
        int i = 1;
        while (true) {
            zzaef zzaef = this.zza;
            if (i >= zzaef.zzi.length) {
                return zza2;
            }
            zzadk zza3 = zzaef.zzi[i].zza(j);
            if (zza3.zza.zzc < zza2.zza.zzc) {
                zza2 = zza3;
            }
            i++;
        }
    }

    public final boolean zzh() {
        return true;
    }
}
