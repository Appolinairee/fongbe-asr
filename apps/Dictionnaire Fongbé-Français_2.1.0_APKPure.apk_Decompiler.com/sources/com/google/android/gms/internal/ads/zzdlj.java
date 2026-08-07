package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdlj implements zzfuc {
    public final /* synthetic */ zzdlp zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdlj(zzdlp zzdlp, JSONObject jSONObject) {
        this.zza = zzdlp;
        this.zzb = jSONObject;
    }

    public final Object apply(Object obj) {
        return this.zza.zza(this.zzb, (List) obj);
    }
}
