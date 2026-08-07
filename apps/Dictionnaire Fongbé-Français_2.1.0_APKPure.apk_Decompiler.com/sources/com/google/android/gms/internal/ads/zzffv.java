package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzffv {
    final /* synthetic */ zzfgf zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzffv(zzfgf zzfgf, Object obj, List list, zzfge zzfge) {
        this.zza = zzfgf;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfgd zza(Callable callable) {
        zzgcf zzb2 = zzgch.zzb(this.zzc);
        ListenableFuture zza2 = zzb2.zza(new zzffu(), zzbzw.zzg);
        ListenableFuture zza3 = zzb2.zza(callable, this.zza.zzb);
        return new zzfgd(this.zza, this.zzb, (String) null, zza2, this.zzc, zza3, (zzfge) null);
    }
}
