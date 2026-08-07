package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesh implements zzetr {
    private final Bundle zza;

    zzesh(Bundle bundle) {
        this.zza = bundle;
    }

    public final int zza() {
        return 30;
    }

    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzesi(this.zza));
    }
}
