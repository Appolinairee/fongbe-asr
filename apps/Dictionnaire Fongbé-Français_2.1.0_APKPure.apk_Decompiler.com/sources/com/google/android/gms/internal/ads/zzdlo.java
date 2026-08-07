package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdlo implements zzgcd {
    final /* synthetic */ zzcab zza;

    zzdlo(zzdlp zzdlp, zzcab zzcab) {
        this.zza = zzcab;
    }

    public final void zza(Throwable th) {
        zzo.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcex zzcex = (zzcex) obj;
        if (zzcex != null) {
            zzcex.zzag("/video", new zzccq(new zzdln(this.zza)));
            zzcex.zzaa();
            return;
        }
        this.zza.zzd(new zzegu(1, "Missing webview from video view future."));
    }
}
