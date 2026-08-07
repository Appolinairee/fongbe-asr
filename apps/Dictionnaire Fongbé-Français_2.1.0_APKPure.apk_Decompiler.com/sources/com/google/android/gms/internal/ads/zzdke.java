package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdke implements Runnable {
    public final /* synthetic */ zzcex zza;

    public /* synthetic */ zzdke(zzcex zzcex) {
        this.zza = zzcex;
    }

    public final void run() {
        this.zza.zzd("onSdkImpression", new ArrayMap());
    }
}
