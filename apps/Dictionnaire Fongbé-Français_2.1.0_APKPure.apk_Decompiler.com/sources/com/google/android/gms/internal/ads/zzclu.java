package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzclu implements zzclb {
    private final zzbxz zza;

    zzclu(zzbxz zzbxz) {
        this.zza = zzbxz;
    }

    public final void zza(JSONObject jSONObject) {
        int i;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            i = -1;
        } else {
            i = jSONObject.optBoolean("npa");
        }
        this.zza.zzb(i, optLong);
    }
}
