package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzers implements zzetq {
    public final zzfbn zza;

    public zzers(zzfbn zzfbn) {
        this.zza = zzfbn;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuv = (zzcuv) obj;
        if (this.zza != null) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlN)).booleanValue()) {
                zzcuv.zza.putBoolean("render_in_browser", this.zza.zzd());
                zzcuv.zza.putBoolean("disable_ml", this.zza.zzc());
            }
        }
    }
}
