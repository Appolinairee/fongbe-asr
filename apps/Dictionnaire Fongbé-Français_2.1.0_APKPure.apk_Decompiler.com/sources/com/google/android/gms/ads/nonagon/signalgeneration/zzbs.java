package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.ValueCallback;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbs implements Runnable {
    public final /* synthetic */ zzbu zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbs(zzbu zzbu, String str) {
        this.zza = zzbu;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzb.zzb.evaluateJavascript(this.zzb, (ValueCallback) null);
    }
}
