package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfcm {
    private final JSONObject zza;

    public zzfcm(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        zzbcc zzbcc = zzbcl.zzfh;
        return this.zza.optBoolean((String) zzbe.zzc().zza(zzbcc), true);
    }

    public final int zzc() {
        int optInt = this.zza.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
