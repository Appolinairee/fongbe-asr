package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzefj implements zzecy {
    private final zzdpm zza;

    public zzefj(zzdpm zzdpm) {
        this.zza = zzdpm;
    }

    public final zzecz zza(String str, JSONObject jSONObject) throws zzfcq {
        return new zzecz(this.zza.zzc(str, jSONObject), new zzees(), str);
    }
}
