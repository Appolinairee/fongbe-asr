package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final /* synthetic */ class zzeq implements Consumer {
    public final /* synthetic */ PreloadCallback zza;

    public /* synthetic */ zzeq(PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
    }

    public final void accept(Object obj) {
        this.zza.onAdsAvailable((PreloadConfiguration) obj);
    }
}
