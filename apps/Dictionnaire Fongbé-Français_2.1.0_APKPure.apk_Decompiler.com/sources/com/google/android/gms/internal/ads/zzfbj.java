package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfbj implements zzelc {
    final /* synthetic */ zzfbl zza;

    zzfbj(zzfbl zzfbl) {
        this.zza = zzfbl;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdoa zzdoa = (zzdoa) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdoa;
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdF)).booleanValue()) {
                zzdoa.zzd().zza = this.zza.zzc;
            }
            this.zza.zzd.zzk();
        }
    }
}
