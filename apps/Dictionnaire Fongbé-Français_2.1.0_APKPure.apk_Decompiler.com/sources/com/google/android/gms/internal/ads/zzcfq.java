package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcfq implements Runnable {
    public final /* synthetic */ zzcfw zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ ValueCallback zzc;

    public /* synthetic */ zzcfq(zzcfw zzcfw, String str, ValueCallback valueCallback) {
        this.zza = zzcfw;
        this.zzb = str;
        this.zzc = valueCallback;
    }

    public final void run() {
        this.zza.zzaU(this.zzb, this.zzc);
    }
}
