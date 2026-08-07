package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzedz implements zzgbo {
    public final /* synthetic */ zzeeb zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzfbo zzc;

    public /* synthetic */ zzedz(zzeeb zzeeb, View view, zzfbo zzfbo) {
        this.zza = zzeeb;
        this.zzb = view;
        this.zzc = zzfbo;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzc(this.zzb, this.zzc, obj);
    }
}
