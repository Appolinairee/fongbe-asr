package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzell implements zzetr {
    private final Context zza;

    zzell(Context context) {
        this.zza = context;
    }

    public final int zza() {
        return 2;
    }

    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzelm(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
