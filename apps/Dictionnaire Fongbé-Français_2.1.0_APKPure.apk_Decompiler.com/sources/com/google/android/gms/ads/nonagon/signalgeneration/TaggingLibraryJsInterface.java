package com.google.android.gms.ads.nonagon.signalgeneration;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzfcn;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfja;
import com.google.android.gms.internal.ads.zzgcs;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    /* access modifiers changed from: private */
    public final WebView zzb;
    private final zzava zzc;
    private final zzfcn zzd;
    private final int zze;
    private final zzdsb zzf;
    private final boolean zzg;
    /* access modifiers changed from: private */
    public final zzgcs zzh = zzbzw.zzf;
    private final zzfja zzi;
    private final zzo zzj;
    /* access modifiers changed from: private */
    public final zzf zzk;
    /* access modifiers changed from: private */
    public final zzj zzl;

    TaggingLibraryJsInterface(WebView webView, zzava zzava, zzdsb zzdsb, zzfja zzfja, zzfcn zzfcn, zzo zzo, zzf zzf2, zzj zzj2) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzava;
        this.zzf = zzdsb;
        zzbcl.zza(context);
        this.zze = ((Integer) zzbe.zzc().zza(zzbcl.zzjv)).intValue();
        this.zzg = ((Boolean) zzbe.zzc().zza(zzbcl.zzjw)).booleanValue();
        this.zzi = zzfja;
        this.zzd = zzfcn;
        this.zzj = zzo;
        this.zzk = zzf2;
        this.zzl = zzj2;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = zzv.zzC().currentTimeMillis();
            String zzd2 = this.zzc.zzc().zzd(this.zza, str, this.zzb);
            if (this.zzg) {
                long currentTimeMillis2 = zzv.zzC().currentTimeMillis() - currentTimeMillis;
                zzaa.zzd(this.zzf, (zzdrq) null, "csg", new Pair("clat", String.valueOf(currentTimeMillis2)));
            }
            return zzd2;
        } catch (RuntimeException e) {
            zzo.zzh("Exception getting click signals. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            zzo.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.zze);
        try {
            return (String) zzbzw.zza.zzb(new zzbq(this, str)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzo.zzh("Exception getting click signals with timeout. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        zzbu zzbu = new zzbu(this, uuid);
        if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbu);
        } else {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzjy)).booleanValue()) {
                this.zzh.execute(new zzbr(this, bundle, zzbu));
            } else {
                QueryInfo.generate(this.zza, AdFormat.BANNER, ((AdRequest.Builder) new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build(), zzbu);
            }
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long currentTimeMillis = zzv.zzC().currentTimeMillis();
            String zzh2 = this.zzc.zzc().zzh(this.zza, this.zzb, (Activity) null);
            if (this.zzg) {
                long currentTimeMillis2 = zzv.zzC().currentTimeMillis() - currentTimeMillis;
                zzaa.zzd(this.zzf, (zzdrq) null, "vsg", new Pair("vlat", String.valueOf(currentTimeMillis2)));
            }
            return zzh2;
        } catch (RuntimeException e) {
            zzo.zzh("Exception getting view signals. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            zzo.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.zze);
        try {
            return (String) zzbzw.zza.zzb(new zzbo(this)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzo.zzh("Exception getting view signals with timeout. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjA)).booleanValue() && !TextUtils.isEmpty(str)) {
            zzbzw.zza.execute(new zzbp(this, str));
        }
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("x");
            int i2 = jSONObject.getInt("y");
            int i3 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i4 = jSONObject.getInt("type");
            try {
                this.zzc.zzd(MotionEvent.obtain(0, (long) i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, (float) i, (float) i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException | JSONException e) {
                e = e;
                zzo.zzh("Failed to parse the touch string. ", e);
                zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e2) {
            e = e2;
            zzo.zzh("Failed to parse the touch string. ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zza2 = zzv.zzr().zza(this.zza);
        bundle.putBoolean("accept_3p_cookie", zza2 != null ? zza2.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(this.zza, AdFormat.BANNER, ((AdRequest.Builder) new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build(), queryInfoGenerationCallback);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(String str) {
        zzfcn zzfcn;
        Uri parse = Uri.parse(str);
        try {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || (zzfcn = this.zzd) == null) {
                parse = this.zzc.zza(parse, this.zza, this.zzb, (Activity) null);
            } else {
                parse = zzfcn.zza(parse, this.zza, this.zzb, (Activity) null);
            }
        } catch (zzavb e) {
            zzo.zzf("Failed to append the click signal to URL: ", e);
            zzv.zzp().zzw(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzd(parse.toString(), (com.google.android.gms.ads.internal.util.client.zzv) null, (zzfhh) null);
    }
}
