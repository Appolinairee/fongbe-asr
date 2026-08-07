package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzanc implements zzank {
    private zzab zza;
    private zzef zzb;
    private zzadt zzc;

    public zzanc(String str) {
        zzz zzz = new zzz();
        zzz.zzaa(str);
        this.zza = zzz.zzag();
    }

    public final void zza(zzdy zzdy) {
        zzcw.zzb(this.zzb);
        int i = zzei.zza;
        long zze = this.zzb.zze();
        long zzf = this.zzb.zzf();
        if (zze != -9223372036854775807L && zzf != -9223372036854775807L) {
            zzab zzab = this.zza;
            if (zzf != zzab.zzt) {
                zzz zzb2 = zzab.zzb();
                zzb2.zzae(zzf);
                zzab zzag = zzb2.zzag();
                this.zza = zzag;
                this.zzc.zzm(zzag);
            }
            int zzb3 = zzdy.zzb();
            this.zzc.zzr(zzdy, zzb3);
            this.zzc.zzt(zze, 1, zzb3, 0, (zzads) null);
        }
    }

    public final void zzb(zzef zzef, zzacq zzacq, zzanx zzanx) {
        this.zzb = zzef;
        zzanx.zzc();
        zzadt zzw = zzacq.zzw(zzanx.zza(), 5);
        this.zzc = zzw;
        zzw.zzm(this.zza);
    }
}
