package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbbp {
    zzayf zza;
    boolean zzb;
    /* access modifiers changed from: private */
    public final ExecutorService zzc;

    public zzbbp() {
        this.zzc = zzb.zzb;
    }

    public zzbbp(Context context) {
        ExecutorService executorService = zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new zzbbk(this, context));
    }
}
