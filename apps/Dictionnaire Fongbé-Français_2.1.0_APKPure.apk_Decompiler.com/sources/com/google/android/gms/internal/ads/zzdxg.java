package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdxg implements zzgbo {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzdxg(zzdxl zzdxl, String str) {
        this.zza = str;
    }

    public final ListenableFuture zza(Object obj) {
        String str = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        String str2 = this.zza;
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put("body", str);
            jSONObject2.put("base_url", "");
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return zzgch.zzh(jSONObject);
        } catch (JSONException e) {
            throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e.getCause()))));
        }
    }
}
