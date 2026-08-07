package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcns implements zzher {
    private final zzhfj zza;

    public zzcns(zzhfj zzhfj) {
        this.zza = zzhfj;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfbo zza2 = ((zzcrq) this.zza).zza();
        zzfbo zzfbo = zza2;
        try {
            return new JSONObject(zza2.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
