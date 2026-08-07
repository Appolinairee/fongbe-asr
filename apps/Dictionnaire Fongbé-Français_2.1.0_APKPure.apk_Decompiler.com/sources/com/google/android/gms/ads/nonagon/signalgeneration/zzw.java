package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzdee;
import com.google.android.gms.internal.ads.zzdrq;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzw implements zzdee {
    private final zzdrq zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    public zzw(zzdrq zzdrq, zzv zzv, String str, int i) {
        this.zza = zzdrq;
        this.zzb = zzv;
        this.zzc = str;
        this.zzd = i;
    }

    public final void zze(zzbk zzbk) {
        String str;
        if (zzbk != null && this.zzd != 2) {
            if (!TextUtils.isEmpty(zzbk.zzc)) {
                try {
                    str = new JSONObject(zzbk.zzc).optString("request_id");
                } catch (JSONException e) {
                    zzv.zzp().zzw(e, "RenderSignals.getRequestId");
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    this.zzb.zzd(str, zzbk.zzc, this.zza);
                    return;
                }
                return;
            }
            this.zzb.zzd(this.zzc, zzbk.zzb, this.zza);
        }
    }

    public final void zzf(String str) {
    }
}
