package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzffx {
    public static final zzfgd zza(Callable callable, Object obj, zzfgf zzfgf) {
        return zzb(callable, zzfgf.zzb, obj, zzfgf);
    }

    public static final zzfgd zzb(Callable callable, zzgcs zzgcs, Object obj, zzfgf zzfgf) {
        return new zzfgd(zzfgf, obj, (String) null, zzfgf.zza, Collections.emptyList(), zzgcs.zzb(callable), (zzfge) null);
    }

    public static final zzfgd zzc(ListenableFuture listenableFuture, Object obj, zzfgf zzfgf) {
        return new zzfgd(zzfgf, obj, (String) null, zzfgf.zza, Collections.emptyList(), listenableFuture, (zzfge) null);
    }

    public static final zzfgd zzd(zzffs zzffs, zzgcs zzgcs, Object obj, zzfgf zzfgf) {
        return zzb(new zzffw(zzffs), zzgcs, obj, zzfgf);
    }
}
