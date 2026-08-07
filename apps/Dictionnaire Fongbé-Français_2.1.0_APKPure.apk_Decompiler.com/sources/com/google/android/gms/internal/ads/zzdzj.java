package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdzj implements zzbnz {
    zzdzj() {
    }

    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzdzk zzdzk = (zzdzk) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjg)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzdzk.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzdzk.zzd.zzf());
        }
        jSONObject2.put("base_url", zzdzk.zzd.zzd());
        jSONObject2.put("signals", zzdzk.zzc);
        jSONObject3.put("body", zzdzk.zzb.zzc);
        jSONObject3.put("headers", zzbc.zzb().zzj(zzdzk.zzb.zzb));
        jSONObject3.put("response_code", zzdzk.zzb.zza);
        jSONObject3.put("latency", zzdzk.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzdzk.zzd.zzi());
        return jSONObject;
    }
}
