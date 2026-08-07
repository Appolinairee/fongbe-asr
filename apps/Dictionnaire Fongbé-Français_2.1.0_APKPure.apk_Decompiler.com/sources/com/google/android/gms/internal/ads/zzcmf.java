package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcmf implements zzgbo {
    public final /* synthetic */ zzcmk zza;
    public final /* synthetic */ Uri.Builder zzb;

    public /* synthetic */ zzcmf(zzcmk zzcmk, Uri.Builder builder) {
        this.zza = zzcmk;
        this.zzb = builder;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zze(this.zzb, (Throwable) obj);
    }
}
