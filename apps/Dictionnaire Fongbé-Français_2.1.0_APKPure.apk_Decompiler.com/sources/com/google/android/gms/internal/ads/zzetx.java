package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzetx implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    zzetx(Context context, zzgcs zzgcs) {
        this.zza = context;
        this.zzb = zzgcs;
    }

    public final int zza() {
        return 59;
    }

    public final ListenableFuture zzb() {
        if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
            return this.zzb.zzb(new zzetw(this));
        }
        return zzgch.zzh(new zzety(-1, -1));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzety zzc() throws Exception {
        Context context = this.zza;
        return new zzety(zzbbv.zzb(context), zzbbv.zza(context));
    }
}
