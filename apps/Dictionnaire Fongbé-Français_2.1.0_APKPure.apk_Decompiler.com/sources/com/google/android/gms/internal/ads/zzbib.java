package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzbib implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzby zzb;
    final /* synthetic */ zzbic zzc;

    zzbib(zzbic zzbic, AdManagerAdView adManagerAdView, zzby zzby) {
        this.zza = adManagerAdView;
        this.zzb = zzby;
        this.zzc = zzbic;
    }

    public final void run() {
        if (this.zza.zzb(this.zzb)) {
            zzbic zzbic = this.zzc;
            zzbic.zza.onAdManagerAdViewLoaded(this.zza);
            return;
        }
        zzo.zzj("Could not bind.");
    }
}
