package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.android.gms.internal.ads.zzgch;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzai implements zzgbo {
    public final /* synthetic */ zzau zza;

    public /* synthetic */ zzai(zzau zzau) {
        this.zza = zzau;
    }

    public final ListenableFuture zza(Object obj) {
        return zzgch.zzm(this.zza.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzaj(this.zza, (Uri) obj), this.zza.zzk);
    }
}
