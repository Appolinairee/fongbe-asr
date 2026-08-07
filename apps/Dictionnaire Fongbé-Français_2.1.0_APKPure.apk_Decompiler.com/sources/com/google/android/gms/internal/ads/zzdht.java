package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdht implements Runnable {
    public final /* synthetic */ zzcex zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdht(zzcex zzcex, JSONObject jSONObject) {
        this.zza = zzcex;
        this.zzb = jSONObject;
    }

    public final void run() {
        int i = zzdia.zzc;
        this.zza.zze("onVideoEvent", this.zzb);
    }
}
