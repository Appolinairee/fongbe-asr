package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzefo implements zzgbo {
    public final /* synthetic */ zzefq zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzfbo zzc;

    public /* synthetic */ zzefo(zzefq zzefq, zzfca zzfca, zzfbo zzfbo) {
        this.zza = zzefq;
        this.zzb = zzfca;
        this.zzc = zzfbo;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzf(this.zzb, this.zzc, (JSONArray) obj);
    }
}
