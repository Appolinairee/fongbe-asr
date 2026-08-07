package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbor implements zzbke {
    private final zzcab zza;

    public zzbor(zzbos zzbos, zzcab zzcab) {
        this.zza = zzcab;
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.zza.zzd(new zzbnv());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.zza.zzd(new zzbnv(str));
        }
    }

    public final void zzb(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zza.zzd(e);
        }
    }
}
