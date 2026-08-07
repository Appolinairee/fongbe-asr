package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfrj {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        zzfri zzfri = new zzfri(task, (Runnable) null);
        task.addOnCompleteListener(zzgcz.zzc(), new zzfrh(zzfri));
        return zzfri;
    }
}
