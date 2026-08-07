package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbie implements zzbjp {
    private final zzbif zza;

    public zzbie(zzbif zzbif) {
        this.zza = zzbif;
    }

    public final void zza(Object obj, Map map) {
        if (this.zza != null) {
            String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (str == null) {
                zzo.zzi("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = zzbs.zza(new JSONObject((String) map.get("info")));
                } catch (JSONException e) {
                    zzo.zzh("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                zzo.zzg("Failed to convert ad metadata to Bundle.");
            } else {
                this.zza.zza(str, bundle);
            }
        }
    }
}
