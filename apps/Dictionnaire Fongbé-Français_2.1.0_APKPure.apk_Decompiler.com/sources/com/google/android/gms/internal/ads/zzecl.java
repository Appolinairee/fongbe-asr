package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzecl implements zzecm {
    static /* synthetic */ zzecr zzc(String str, String str2, String str3, zzecn zzecn, String str4, WebView webView, String str5, String str6, zzeco zzeco) {
        zzflc zza = zzflc.zza("Google", str2);
        zzflb zzp = zzp("javascript");
        zzfku zzn = zzn(zzecn.toString());
        if (zzp == zzflb.NONE) {
            zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            zzo.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzecn))));
            return null;
        } else {
            zzflb zzp2 = zzp(str4);
            if (zzn == zzfku.VIDEO && zzp2 == zzflb.NONE) {
                zzo.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
            zzfkr zzb = zzfkr.zzb(zza, webView, str5, "");
            return new zzecr(zzfkp.zza(zzfkq.zza(zzn, zzo(zzeco.toString()), zzp, zzp2, true), zzb), zzb);
        }
    }

    static /* synthetic */ zzecr zzd(String str, String str2, String str3, String str4, zzecn zzecn, WebView webView, String str5, String str6, zzeco zzeco) {
        zzflc zza = zzflc.zza(str, str2);
        zzflb zzp = zzp("javascript");
        zzflb zzp2 = zzp(str4);
        zzfku zzn = zzn(zzecn.toString());
        if (zzp == zzflb.NONE) {
            zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            zzo.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzecn))));
            return null;
        } else if (zzn == zzfku.VIDEO && zzp2 == zzflb.NONE) {
            zzo.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        } else {
            zzfkr zzc = zzfkr.zzc(zza, webView, str5, "");
            return new zzecr(zzfkp.zza(zzfkq.zza(zzn, zzo(zzeco.toString()), zzp, zzp2, true), zzc), zzc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzfku zzn(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.zzfku r4 = com.google.android.gms.internal.ads.zzfku.VIDEO
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.zzfku r4 = com.google.android.gms.internal.ads.zzfku.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.zzfku r4 = com.google.android.gms.internal.ads.zzfku.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecl.zzn(java.lang.String):com.google.android.gms.internal.ads.zzfku");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzfkx zzo(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.zzfkx r4 = com.google.android.gms.internal.ads.zzfkx.UNSPECIFIED
            return r4
        L_0x003e:
            com.google.android.gms.internal.ads.zzfkx r4 = com.google.android.gms.internal.ads.zzfkx.ONE_PIXEL
            return r4
        L_0x0041:
            com.google.android.gms.internal.ads.zzfkx r4 = com.google.android.gms.internal.ads.zzfkx.DEFINED_BY_JAVASCRIPT
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.zzfkx r4 = com.google.android.gms.internal.ads.zzfkx.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecl.zzo(java.lang.String):com.google.android.gms.internal.ads.zzfkx");
    }

    private static zzflb zzp(String str) {
        if ("native".equals(str)) {
            return zzflb.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzflb.JAVASCRIPT;
        }
        return zzflb.NONE;
    }

    private static final Object zzq(zzeck zzeck) {
        try {
            return zzeck.zza();
        } catch (RuntimeException e) {
            zzv.zzp().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            zzv.zzp().zzv(e, "omid exception");
        }
    }

    public final zzecr zza(String str, WebView webView, String str2, String str3, String str4, zzeco zzeco, zzecn zzecn, String str5) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() || !zzfkn.zzb()) {
            return null;
        }
        return (zzecr) zzq(new zzeca("Google", str, "javascript", zzecn, str4, webView, str5, "", zzeco));
    }

    public final zzecr zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzeco zzeco, zzecn zzecn, String str6) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() || !zzfkn.zzb()) {
            return null;
        }
        return (zzecr) zzq(new zzecd(str5, str, "javascript", str4, zzecn, webView, str6, "", zzeco));
    }

    public final zzfla zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean z) {
        return (zzfla) zzq(new zzeci(versionInfoParcel, webView, true));
    }

    public final String zzf(Context context) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzfc)).booleanValue()) {
            return null;
        }
        return (String) zzq(new zzecg());
    }

    public final void zzg(zzfkp zzfkp, View view) {
        zzr(new zzebz(zzfkp, view));
    }

    public final void zzh(zzfla zzfla, View view) {
        zzr(new zzecf(zzfla, view));
    }

    public final void zzi(zzfkp zzfkp) {
        zzr(new zzecj(zzfkp));
    }

    public final void zzj(zzfkp zzfkp, View view) {
        zzr(new zzecb(zzfkp, view));
    }

    public final void zzk(zzfkp zzfkp) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && zzfkn.zzb()) {
            Objects.requireNonNull(zzfkp);
            zzr(new zzecc(zzfkp));
        }
    }

    public final boolean zzl(Context context) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzfc)).booleanValue()) {
            zzo.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzq(new zzece(context));
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void zzm(zzfla zzfla, zzcfo zzcfo) {
        zzr(new zzech(zzfla, zzcfo));
    }
}
