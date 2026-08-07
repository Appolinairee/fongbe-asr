package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfip implements zzgbo {
    public final /* synthetic */ zzfiq zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ String zzd;

    public /* synthetic */ zzfip(zzfiq zzfiq, int i, long j, String str) {
        this.zza = zzfiq;
        this.zzb = i;
        this.zzc = j;
        this.zzd = str;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, (zzt) obj);
    }
}
