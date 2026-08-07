package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzevc implements zzetq {
    final String zza;
    final int zzb;

    public zzevc(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            try {
                JSONObject zzg = zzbs.zzg(jSONObject, "pii");
                zzg.put("pvid", this.zza);
                zzg.put("pvid_s", this.zzb);
            } catch (JSONException e) {
                zze.zzb("Failed putting gms core app set ID info.", e);
            }
        }
    }
}
