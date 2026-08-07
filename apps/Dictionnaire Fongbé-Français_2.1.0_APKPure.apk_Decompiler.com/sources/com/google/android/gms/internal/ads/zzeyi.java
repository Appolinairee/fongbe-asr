package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeyi implements zzgbo {
    public final /* synthetic */ zzeyl zza;
    public final /* synthetic */ zzezg zzb;
    public final /* synthetic */ zzeyk zzc;
    public final /* synthetic */ zzeze zzd;
    public final /* synthetic */ zzcuz zze;

    public /* synthetic */ zzeyi(zzeyl zzeyl, zzezg zzezg, zzeyk zzeyk, zzeze zzeze, zzcuz zzcuz) {
        this.zza = zzeyl;
        this.zzb = zzezg;
        this.zzc = zzeyk;
        this.zzd = zzeze;
        this.zze = zzcuz;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzb(this.zzb, this.zzc, this.zzd, this.zze, (zzeyq) obj);
    }
}
