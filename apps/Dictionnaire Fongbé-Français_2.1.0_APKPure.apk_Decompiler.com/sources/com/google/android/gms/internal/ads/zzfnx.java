package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfnx implements OnFailureListener {
    public final /* synthetic */ zzfob zza;

    public /* synthetic */ zzfnx(zzfob zzfob) {
        this.zza = zzfob;
    }

    public final void onFailure(Exception exc) {
        this.zza.zzf(exc);
    }
}
