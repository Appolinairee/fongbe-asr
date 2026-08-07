package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzefl implements Callable {
    public final /* synthetic */ zzefq zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ zzfca zzd;
    public final /* synthetic */ zzfbo zze;
    public final /* synthetic */ JSONObject zzf;

    public /* synthetic */ zzefl(zzefq zzefq, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfca zzfca, zzfbo zzfbo, JSONObject jSONObject) {
        this.zza = zzefq;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = zzfca;
        this.zze = zzfbo;
        this.zzf = jSONObject;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
