package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfkr {
    private final zzflc zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfks zzg;

    private zzfkr(zzflc zzflc, WebView webView, String str, List list, String str2, String str3, zzfks zzfks) {
        this.zza = zzflc;
        this.zzb = webView;
        this.zzg = zzfks;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfkr zzb(zzflc zzflc, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzfmk.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfkr(zzflc, webView, (String) null, (List) null, str, str2, zzfks.HTML);
    }

    public static zzfkr zzc(zzflc zzflc, WebView webView, String str, String str2) {
        zzfmk.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfkr(zzflc, webView, (String) null, (List) null, str, "", zzfks.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfks zzd() {
        return this.zzg;
    }

    public final zzflc zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
