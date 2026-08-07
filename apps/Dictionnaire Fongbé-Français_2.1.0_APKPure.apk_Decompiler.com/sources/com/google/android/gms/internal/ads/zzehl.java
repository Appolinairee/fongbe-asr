package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzehl implements zzecy {
    private final Map zza = new HashMap();
    private final zzdpm zzb;

    public zzehl(zzdpm zzdpm) {
        this.zzb = zzdpm;
    }

    public final zzecz zza(String str, JSONObject jSONObject) throws zzfcq {
        zzecz zzecz;
        synchronized (this) {
            zzecz = (zzecz) this.zza.get(str);
            if (zzecz == null) {
                zzecz = new zzecz(this.zzb.zzc(str, jSONObject), new zzeet(), str);
                this.zza.put(str, zzecz);
            }
        }
        return zzecz;
    }
}
