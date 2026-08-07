package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfmd implements Runnable {
    final /* synthetic */ zzfme zza;
    private final WebView zzb;

    zzfmd(zzfme zzfme) {
        this.zza = zzfme;
        this.zzb = zzfme.zza;
    }

    public final void run() {
        this.zzb.destroy();
    }
}
