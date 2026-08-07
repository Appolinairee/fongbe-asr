package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdlu {
    private final Executor zza;
    private final zzdlp zzb;

    public zzdlu(Executor executor, zzdlp zzdlp) {
        this.zza = executor;
        this.zzb = zzdlp;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture listenableFuture;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgch.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                listenableFuture = zzgch.zzh((Object) null);
            } else {
                String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (optString == null) {
                    listenableFuture = zzgch.zzh((Object) null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if (TypedValues.Custom.S_STRING.equals(optString2)) {
                        listenableFuture = zzgch.zzh(new zzdlt(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        listenableFuture = zzgch.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzdlr(optString), this.zza);
                    } else {
                        listenableFuture = zzgch.zzh((Object) null);
                    }
                }
            }
            arrayList.add(listenableFuture);
        }
        return zzgch.zzm(zzgch.zzd(arrayList), new zzdls(), this.zza);
    }
}
