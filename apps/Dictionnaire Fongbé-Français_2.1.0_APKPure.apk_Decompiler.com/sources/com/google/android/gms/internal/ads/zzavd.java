package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzavd {
    private final ListenableFuture zza;

    public zzavd(Context context, Executor executor) {
        this.zza = zzgch.zzj(new zzavc(this, context), executor);
    }

    public final ListenableFuture zza() {
        return this.zza;
    }
}
