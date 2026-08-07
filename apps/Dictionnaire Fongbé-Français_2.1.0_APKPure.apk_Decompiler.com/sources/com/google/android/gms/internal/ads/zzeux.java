package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeux implements zzetr {
    private final Executor zza;
    private final String zzb;

    public zzeux(zzbzd zzbzd, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    public final int zza() {
        return 41;
    }

    public final ListenableFuture zzb() {
        return zzgch.zzf(zzgch.zzm(zzgch.zzh(this.zzb), new zzeuv(), this.zza), Throwable.class, new zzeuw(this), this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        return zzgch.zzh(new zzeuy(this.zzb));
    }
}
