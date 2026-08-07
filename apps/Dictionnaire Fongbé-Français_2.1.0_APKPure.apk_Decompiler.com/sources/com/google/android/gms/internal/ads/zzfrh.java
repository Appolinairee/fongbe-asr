package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfrh implements OnCompleteListener {
    public final /* synthetic */ zzfri zza;

    public /* synthetic */ zzfrh(zzfri zzfri) {
        this.zza = zzfri;
    }

    public final void onComplete(Task task) {
        zzfri zzfri = this.zza;
        if (task.isCanceled()) {
            zzfri.cancel(false);
        } else if (task.isSuccessful()) {
            zzfri.zzc(task.getResult());
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                zzfri.zzd(exception);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
