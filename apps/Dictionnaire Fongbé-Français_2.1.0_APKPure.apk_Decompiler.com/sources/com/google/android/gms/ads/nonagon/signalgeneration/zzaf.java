package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzaf implements zzgbo {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzdnl[] zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzaf(zzau zzau, zzdnl[] zzdnlArr, String str) {
        this.zza = zzau;
        this.zzb = zzdnlArr;
        this.zzc = str;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzv(this.zzb, this.zzc, (zzdnl) obj);
    }
}
