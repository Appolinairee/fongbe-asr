package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdmz implements zzgbo {
    public final /* synthetic */ zzdnl zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ JSONObject zzc;

    public /* synthetic */ zzdmz(zzdnl zzdnl, String str, JSONObject jSONObject) {
        this.zza = zzdnl;
        this.zzb = str;
        this.zzc = jSONObject;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzf(this.zzb, this.zzc, (zzcex) obj);
    }
}
