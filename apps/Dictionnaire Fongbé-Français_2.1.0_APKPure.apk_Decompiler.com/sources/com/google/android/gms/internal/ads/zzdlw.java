package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzs;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdlw implements zzgbo {
    public final /* synthetic */ zzdmh zza;
    public final /* synthetic */ zzs zzb;
    public final /* synthetic */ zzfbo zzc;
    public final /* synthetic */ zzfbr zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ String zzf;

    public /* synthetic */ zzdlw(zzdmh zzdmh, zzs zzs, zzfbo zzfbo, zzfbr zzfbr, String str, String str2) {
        this.zza = zzdmh;
        this.zzb = zzs;
        this.zzc = zzfbo;
        this.zzd = zzfbr;
        this.zze = str;
        this.zzf = str2;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, obj);
    }
}
