package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfnf implements Continuation {
    public final /* synthetic */ zzari zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzfnf(zzari zzari, int i) {
        this.zza = zzari;
        this.zzb = i;
    }

    public final Object then(Task task) {
        int i = zzfni.zza;
        if (!task.isSuccessful()) {
            return false;
        }
        int i2 = this.zzb;
        zzfpi zza2 = ((zzfpk) task.getResult()).zza(((zzarm) this.zza.zzbr()).zzaV());
        zza2.zza(i2);
        zza2.zzc();
        return true;
    }
}
