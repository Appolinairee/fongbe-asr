package com.google.android.gms.ads.internal.util.client;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzv {
    private final zzx zza;

    public zzv() {
        this.zza = new zzn(1, 0, 1.0d, false);
    }

    private zzv(zzx zzx) {
        this.zza = zzx;
    }

    public static zzv zza(JSONObject jSONObject) {
        zzn zzn;
        JSONObject optJSONObject = jSONObject.optJSONObject("ping_strategy");
        if (optJSONObject == null) {
            zzn = new zzn(1, 0, 1.0d, false);
        } else {
            zzn = new zzn(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false));
        }
        return new zzv(zzn);
    }

    public final zzx zzb() {
        return this.zza;
    }
}
