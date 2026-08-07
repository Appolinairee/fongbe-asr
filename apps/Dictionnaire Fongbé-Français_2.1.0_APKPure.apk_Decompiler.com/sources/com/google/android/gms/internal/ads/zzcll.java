package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcll implements zzclb {
    private final zzduv zza;

    zzcll(zzduv zzduv) {
        this.zza = zzduv;
    }

    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzjd)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
