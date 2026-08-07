package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbuh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ BaseAdView zza;

    public /* synthetic */ zze(BaseAdView baseAdView) {
        this.zza = baseAdView;
    }

    public final void run() {
        BaseAdView baseAdView = this.zza;
        try {
            baseAdView.zza.zzk();
        } catch (IllegalStateException e) {
            zzbuh.zza(baseAdView.getContext()).zzh(e, "BaseAdView.destroy");
        }
    }
}
