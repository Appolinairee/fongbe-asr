package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfeo implements zzgcd {
    final /* synthetic */ zzfer zza;
    final /* synthetic */ zzfes zzb;

    zzfeo(zzfes zzfes, zzfer zzfer) {
        this.zza = zzfer;
        this.zzb = zzfes;
    }

    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfes zzfes = this.zzb;
            if (zzfes.zzf == 1) {
                zzfes.zzh();
            }
        }
    }
}
