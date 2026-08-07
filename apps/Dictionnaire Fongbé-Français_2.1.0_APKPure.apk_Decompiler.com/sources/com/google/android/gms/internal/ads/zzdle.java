package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdle implements zzgbo {
    public final /* synthetic */ zzdlp zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdle(zzdlp zzdlp, String str) {
        this.zza = zzdlp;
        this.zzb = str;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzc(this.zzb, obj);
    }
}
