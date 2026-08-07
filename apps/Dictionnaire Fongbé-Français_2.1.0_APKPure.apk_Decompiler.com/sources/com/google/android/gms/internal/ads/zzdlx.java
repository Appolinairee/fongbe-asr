package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdlx implements zzgbo {
    public final /* synthetic */ zzdmh zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdlx(zzdmh zzdmh, JSONObject jSONObject) {
        this.zza = zzdmh;
        this.zzb = jSONObject;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzc(this.zzb, (zzcex) obj);
    }
}
