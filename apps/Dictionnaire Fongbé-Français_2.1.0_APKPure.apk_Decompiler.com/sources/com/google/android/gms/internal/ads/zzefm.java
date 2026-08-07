package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzefm implements zzgbo {
    public final /* synthetic */ zzefq zza;
    public final /* synthetic */ zzdnl zzb;

    public /* synthetic */ zzefm(zzefq zzefq, zzdnl zzdnl) {
        this.zza = zzefq;
        this.zzb = zzdnl;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzd(this.zzb, (JSONObject) obj);
    }
}
