package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdkv implements Callable {
    public final /* synthetic */ zzfca zza;
    public final /* synthetic */ zzfbo zzb;
    public final /* synthetic */ JSONObject zzc;

    public /* synthetic */ zzdkv(zzdla zzdla, zzfca zzfca, zzfbo zzfbo, JSONObject jSONObject) {
        this.zza = zzfca;
        this.zzb = zzfbo;
        this.zzc = jSONObject;
    }

    public final Object call() {
        zzdif zzdif = new zzdif();
        JSONObject jSONObject = this.zzc;
        zzdif.zzaa(jSONObject.optInt("template_id", -1));
        zzdif.zzK(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
        zzfca zzfca = this.zza;
        zzdif.zzV(optString);
        zzfcj zzfcj = zzfca.zza.zza;
        if (zzfcj.zzg.contains(Integer.toString(zzdif.zzc()))) {
            if (zzdif.zzc() == 3) {
                if (zzdif.zzA() == null) {
                    throw new zzegu(1, "No custom template id for custom template ad response.");
                } else if (!zzfcj.zzh.contains(zzdif.zzA())) {
                    throw new zzegu(1, "Unexpected custom template id in the response.");
                }
            }
            zzfbo zzfbo = this.zzb;
            zzdif.zzY(jSONObject.optDouble("rating", -1.0d));
            String optString2 = jSONObject.optString("headline", (String) null);
            if (zzfbo.zzM) {
                zzv.zzq();
                optString2 = zzs.zzz() + " : " + optString2;
            }
            zzdif.zzZ("headline", optString2);
            zzdif.zzZ("body", jSONObject.optString("body", (String) null));
            zzdif.zzZ("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzdif.zzZ("store", jSONObject.optString("store", (String) null));
            zzdif.zzZ("price", jSONObject.optString("price", (String) null));
            zzdif.zzZ("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzdif;
        }
        throw new zzegu(1, "Invalid template ID: " + zzdif.zzc());
    }
}
