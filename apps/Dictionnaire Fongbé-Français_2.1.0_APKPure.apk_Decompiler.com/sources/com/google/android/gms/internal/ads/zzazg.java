package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzazg implements ValueCallback {
    public final /* synthetic */ zzazh zza;
    public final /* synthetic */ zzayz zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;

    public /* synthetic */ zzazg(zzazh zzazh, zzayz zzayz, WebView webView, boolean z) {
        this.zza = zzazh;
        this.zzb = zzayz;
        this.zzc = webView;
        this.zzd = z;
    }

    public final void onReceiveValue(Object obj) {
        this.zza.zze.zzc(this.zzb, this.zzc, (String) obj, this.zzd);
    }
}
