package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzecf implements Runnable {
    public final /* synthetic */ zzfla zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzecf(zzfla zzfla, View view) {
        this.zza = zzfla;
        this.zzb = view;
    }

    public final void run() {
        this.zza.zzf(this.zzb, zzfkw.NOT_VISIBLE, "Ad overlay");
    }
}
