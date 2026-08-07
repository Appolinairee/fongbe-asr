package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzefz implements zzgcd {
    final /* synthetic */ zzfbo zza;
    final /* synthetic */ zzega zzb;

    zzefz(zzega zzega, zzfbo zzfbo) {
        this.zza = zzfbo;
        this.zzb = zzega;
    }

    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zzh.zzb(th, this.zza);
            zzfbo zza2 = this.zzb.zzh.zza();
            if (this.zza.zzav) {
                while (zza2 != null) {
                    this.zzb.zze(zza2);
                    zza2 = this.zzb.zzh.zza();
                }
            } else if (zza2 != null) {
                this.zzb.zze(zza2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegr zzegr = (zzegr) obj;
        synchronized (this.zzb) {
            this.zzb.zzh.zzc(zzegr, this.zza);
            zzfbo zza2 = this.zzb.zzh.zza();
            if (zza2 != null) {
                this.zzb.zze(zza2);
            }
        }
    }
}
