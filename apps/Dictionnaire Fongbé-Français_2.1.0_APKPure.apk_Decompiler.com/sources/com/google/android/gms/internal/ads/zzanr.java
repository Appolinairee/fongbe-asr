package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzanr implements zzank {
    final /* synthetic */ zzant zza;
    private final zzdx zzb = new zzdx(new byte[4], 4);

    public zzanr(zzant zzant) {
        this.zza = zzant;
    }

    public final void zza(zzdy zzdy) {
        if (zzdy.zzm() == 0 && (zzdy.zzm() & 128) != 0) {
            zzdy.zzM(6);
            int zzb2 = zzdy.zzb() / 4;
            for (int i = 0; i < zzb2; i++) {
                zzdy.zzG(this.zzb, 4);
                zzdx zzdx = this.zzb;
                int zzd = zzdx.zzd(16);
                zzdx.zzn(3);
                if (zzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    if (this.zza.zzg.get(zzd2) == null) {
                        zzant zzant = this.zza;
                        zzant.zzg.put(zzd2, new zzanl(new zzans(zzant, zzd2)));
                        zzant zzant2 = this.zza;
                        zzant2.zzm = zzant2.zzm + 1;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    public final void zzb(zzef zzef, zzacq zzacq, zzanx zzanx) {
    }
}
