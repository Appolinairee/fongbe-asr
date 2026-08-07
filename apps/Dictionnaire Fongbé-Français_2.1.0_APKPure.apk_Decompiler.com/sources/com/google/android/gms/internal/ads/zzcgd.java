package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcgd {
    private final zzcge zza;
    private final zzcgc zzb;

    public zzcgd(zzcge zzcge, zzcgc zzcgc) {
        this.zzb = zzcgc;
        this.zza = zzcge;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzava zzI = ((zzcgk) this.zza).zzI();
        if (zzI == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzauv zzc = zzI.zzc();
        if (zzc == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (this.zza.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        } else {
            zzcge zzcge = this.zza;
            return zzc.zze(zzcge.getContext(), str, ((zzcgm) zzcge).zzF(), this.zza.zzi());
        }
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzava zzI = ((zzcgk) this.zza).zzI();
        if (zzI == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzauv zzc = zzI.zzc();
        if (zzc == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (this.zza.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        } else {
            zzcge zzcge = this.zza;
            return zzc.zzh(zzcge.getContext(), ((zzcgm) zzcge).zzF(), this.zza.zzi());
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzo.zzj("URL is empty, ignoring message");
        } else {
            zzs.zza.post(new zzcgb(this, str));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        Uri parse = Uri.parse(str);
        zzcff zzaO = ((zzcfw) this.zzb.zza).zzaO();
        if (zzaO == null) {
            zzo.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaO.zzk(parse);
        }
    }
}
