package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdza implements Callable {
    public final /* synthetic */ zzdzl zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ zzbvk zzd;
    public final /* synthetic */ zzfgw zze;

    public /* synthetic */ zzdza(zzdzl zzdzl, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbvk zzbvk, zzfgw zzfgw) {
        this.zza = zzdzl;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = zzbvk;
        this.zze = zzfgw;
    }

    public final Object call() {
        return this.zza.zzk(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
