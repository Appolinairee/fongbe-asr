package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdta {
    /* access modifiers changed from: private */
    public Long zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public Integer zzd;
    /* access modifiers changed from: private */
    public String zze;
    /* access modifiers changed from: private */
    public Integer zzf;

    /* synthetic */ zzdta(String str, zzdtb zzdtb) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdta zzdta) {
        String str = (String) zzbe.zzc().zza(zzbcl.zzjQ);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdta.zza);
            jSONObject.put("eventCategory", zzdta.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdta.zzc);
            jSONObject.putOpt("errorCode", zzdta.zzd);
            jSONObject.putOpt("rewardType", zzdta.zze);
            jSONObject.putOpt("rewardAmount", zzdta.zzf);
        } catch (JSONException unused) {
            zzo.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
