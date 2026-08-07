package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcnq implements Runnable {
    public final /* synthetic */ zzcnr zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcnq(zzcnr zzcnr, JSONObject jSONObject) {
        this.zza = zzcnr;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzd(this.zzb);
    }
}
