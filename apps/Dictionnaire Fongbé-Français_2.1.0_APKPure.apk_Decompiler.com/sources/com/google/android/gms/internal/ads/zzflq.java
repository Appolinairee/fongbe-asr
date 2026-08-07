package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzflq implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    zzflq(zzflr zzflr, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    public final void run() {
        zzflr.zzk(this.zza, this.zzb);
    }
}
