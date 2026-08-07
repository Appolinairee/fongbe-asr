package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzext implements zzelc {
    final /* synthetic */ zzexu zza;

    zzext(zzexu zzexu) {
        this.zza = zzexu;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcog zzcog = (zzcog) obj;
        synchronized (this.zza) {
            zzcog zzcog2 = this.zza.zza;
            if (zzcog2 != null) {
                zzcog2.zzb();
            }
            zzexu zzexu = this.zza;
            zzexu.zza = zzcog;
            zzcog.zzc(zzexu);
            zzexu zzexu2 = this.zza;
            zzexu2.zzg.zzk(new zzcoh(zzcog, zzexu2, zzexu2.zzg, zzexu2.zzi));
            zzcog.zzk();
        }
    }
}
