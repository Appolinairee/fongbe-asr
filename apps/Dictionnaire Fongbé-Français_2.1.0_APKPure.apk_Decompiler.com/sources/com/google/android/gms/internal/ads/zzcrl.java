package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcrl implements zzgbo {
    public final /* synthetic */ zzcro zza;
    public final /* synthetic */ zzgcd zzb;
    public final /* synthetic */ ListenableFuture zzc;

    public /* synthetic */ zzcrl(zzcro zzcro, zzgcd zzgcd, ListenableFuture listenableFuture) {
        this.zza = zzcro;
        this.zzb = zzgcd;
        this.zzc = listenableFuture;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zza(this.zzb, this.zzc, (zzcqz) obj);
    }
}
