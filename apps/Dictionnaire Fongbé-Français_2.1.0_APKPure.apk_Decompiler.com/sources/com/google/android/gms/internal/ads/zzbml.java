package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbml {
    public static void zza(zzbmm zzbmm, String str, Map map) {
        try {
            zzbmm.zze(str, zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbmm zzbmm, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zzo.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbmm.zza(sb.toString());
    }

    public static void zzc(zzbmm zzbmm, String str, String str2) {
        zzbmm.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbmm zzbmm, String str, JSONObject jSONObject) {
        zzbmm.zzb(str, jSONObject.toString());
    }
}
