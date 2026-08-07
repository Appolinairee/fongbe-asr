package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzboo implements zzgbo {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzbjp zzb;

    public /* synthetic */ zzboo(String str, zzbjp zzbjp) {
        this.zza = str;
        this.zzb = zzbjp;
    }

    public final ListenableFuture zza(Object obj) {
        zzbnt zzbnt = (zzbnt) obj;
        zzbnt.zzq(this.zza, this.zzb);
        return zzgch.zzh(zzbnt);
    }
}
