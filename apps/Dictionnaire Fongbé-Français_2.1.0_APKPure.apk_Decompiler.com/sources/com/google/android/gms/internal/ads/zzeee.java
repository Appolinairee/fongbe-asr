package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeee implements zzgbo {
    public final /* synthetic */ zzeeh zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzfbo zzc;

    public /* synthetic */ zzeee(zzeeh zzeeh, View view, zzfbo zzfbo) {
        this.zza = zzeeh;
        this.zzb = view;
        this.zzc = zzfbo;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzc(this.zzb, this.zzc, obj);
    }
}
