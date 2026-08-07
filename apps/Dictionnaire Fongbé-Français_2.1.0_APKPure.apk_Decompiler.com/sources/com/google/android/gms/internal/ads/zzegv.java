package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzegv implements zzgbo {
    public final /* synthetic */ zzegx zza;
    public final /* synthetic */ zzfbo zzb;
    public final /* synthetic */ zzfca zzc;
    public final /* synthetic */ zzecw zzd;

    public /* synthetic */ zzegv(zzegx zzegx, zzfbo zzfbo, zzfca zzfca, zzecw zzecw) {
        this.zza = zzegx;
        this.zzb = zzfbo;
        this.zzc = zzfca;
        this.zzd = zzecw;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzb(this.zzb, this.zzc, this.zzd, (Throwable) obj);
    }
}
