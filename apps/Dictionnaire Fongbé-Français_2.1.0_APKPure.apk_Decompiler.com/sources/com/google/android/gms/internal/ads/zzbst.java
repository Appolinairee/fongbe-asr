package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbst extends zzbhj {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbst(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    public final void zze(zzbht zzbht) {
        this.zza.onNativeAdLoaded(new zzbsn(zzbht));
    }
}
