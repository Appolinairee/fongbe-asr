package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeej implements zzgbo {
    public final /* synthetic */ zzeel zza;
    public final /* synthetic */ Uri zzb;
    public final /* synthetic */ zzfca zzc;
    public final /* synthetic */ zzfbo zzd;
    public final /* synthetic */ zzfbr zze;

    public /* synthetic */ zzeej(zzeel zzeel, Uri uri, zzfca zzfca, zzfbo zzfbo, zzfbr zzfbr) {
        this.zza = zzeel;
        this.zzb = uri;
        this.zzc = zzfca;
        this.zzd = zzfbo;
        this.zze = zzfbr;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, obj);
    }
}
