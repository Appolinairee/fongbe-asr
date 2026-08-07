package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzewi implements zzetq {
    private final String zza;

    public zzewi(String str) {
        this.zza = str;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                zzbs.zzg(jSONObject, "pii").put("adsid", this.zza);
            }
        } catch (JSONException e) {
            zzo.zzk("Failed putting trustless token.", e);
        }
    }
}
