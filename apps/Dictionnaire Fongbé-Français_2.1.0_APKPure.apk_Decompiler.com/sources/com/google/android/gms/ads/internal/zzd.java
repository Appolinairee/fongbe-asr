package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzd implements zzgbo {
    public final /* synthetic */ Long zza;
    public final /* synthetic */ zzdrw zzb;
    public final /* synthetic */ zzfhk zzc;
    public final /* synthetic */ zzfgw zzd;

    public /* synthetic */ zzd(zzf zzf, Long l, zzdrw zzdrw, zzfhk zzfhk, zzfgw zzfgw) {
        this.zza = l;
        this.zzb = zzdrw;
        this.zzc = zzfhk;
        this.zzd = zzfgw;
    }

    public final ListenableFuture zza(Object obj) {
        return zzf.zzd(this.zza, this.zzb, this.zzc, this.zzd, (JSONObject) obj);
    }
}
