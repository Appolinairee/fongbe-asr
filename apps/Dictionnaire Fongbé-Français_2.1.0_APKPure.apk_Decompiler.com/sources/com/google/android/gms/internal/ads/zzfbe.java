package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfbe implements zzelc {
    final /* synthetic */ zzfbf zza;

    zzfbe(zzfbf zzfbf) {
        this.zza = zzfbf;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdoa zzdoa = (zzdoa) obj;
        synchronized (this.zza) {
            this.zza.zzi = zzdoa;
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdF)).booleanValue()) {
                zzdoa.zzd().zza = this.zza.zzd;
            }
            this.zza.zzi.zzk();
        }
    }
}
