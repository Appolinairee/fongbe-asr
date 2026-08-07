package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcmb implements zzgbo {
    public final /* synthetic */ zzcmk zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcmb(zzcmk zzcmk, String str) {
        this.zza = zzcmk;
        this.zzb = str;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzc(this.zzb, (Throwable) obj);
    }
}
