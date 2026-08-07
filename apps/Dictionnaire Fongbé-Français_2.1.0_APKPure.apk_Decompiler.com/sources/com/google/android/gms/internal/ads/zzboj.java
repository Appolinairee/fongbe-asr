package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzboj implements zzbke {
    final /* synthetic */ zzbok zza;
    private final zzbnm zzb;
    private final zzcab zzc;

    public zzboj(zzbok zzbok, zzbnm zzbnm, zzcab zzcab) {
        this.zza = zzbok;
        this.zzb = zzbnm;
        this.zzc = zzcab;
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.zzc.zzd(new zzbnv());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.zzb.zzb();
                throw th;
            }
        } else {
            this.zzc.zzd(new zzbnv(str));
        }
        this.zzb.zzb();
    }

    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzc.zzc(this.zza.zza.zza(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzc.zzd(e);
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }
}
