package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcfw extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcex {
    public static final /* synthetic */ int zza = 0;
    private final String zzA = "";
    private zzcfz zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbfk zzE;
    private zzbfi zzF;
    private zzazx zzG;
    private int zzH;
    /* access modifiers changed from: private */
    public int zzI;
    private zzbcx zzJ;
    private final zzbcx zzK;
    private zzbcx zzL;
    private final zzbcy zzM;
    private int zzN;
    private zzm zzO;
    private boolean zzP;
    private final zzck zzQ;
    private int zzR = -1;
    private int zzS = -1;
    private int zzT = -1;
    private int zzU = -1;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbbj zzX;
    private boolean zzY;
    private final zzcgq zzb;
    private final zzava zzc;
    private final zzfcn zzd;
    private final zzbds zze;
    private final VersionInfoParcel zzf;
    private zzn zzg;
    private final zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfbo zzk;
    private zzfbr zzl;
    private boolean zzm = false;
    private boolean zzn = false;
    private zzcff zzo;
    private zzm zzp;
    private zzecr zzq;
    private zzecp zzr;
    private zzcgr zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected zzcfw(zzcgq zzcgq, zzcgr zzcgr, String str, boolean z, boolean z2, zzava zzava, zzbds zzbds, VersionInfoParcel versionInfoParcel, zzbda zzbda, zzn zzn2, zza zza2, zzbbj zzbbj, zzfbo zzfbo, zzfbr zzfbr, zzfcn zzfcn) {
        super(zzcgq);
        zzfbr zzfbr2;
        VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
        this.zzb = zzcgq;
        this.zzs = zzcgr;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzava;
        this.zzd = zzfcn;
        this.zze = zzbds;
        this.zzf = versionInfoParcel2;
        this.zzg = zzn2;
        this.zzh = zza2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        zzv.zzq();
        DisplayMetrics zzu2 = zzs.zzu(windowManager);
        this.zzi = zzu2;
        this.zzj = zzu2.density;
        this.zzX = zzbbj;
        this.zzk = zzfbo;
        this.zzl = zzfbr;
        this.zzQ = new zzck(zzcgq.zza(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        this.zzY = false;
        setBackgroundColor(0);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlv)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzo.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlu)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzv.zzq().zzc(zzcgq, versionInfoParcel2.afmaVersion));
        zzv.zzq();
        Context context = getContext();
        zzcd.zza(context, new zzk(settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcgd(this, new zzcgc(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbcy zzbcy = new zzbcy(new zzbda(true, "make_wv", this.zzt));
        this.zzM = zzbcy;
        zzbcy.zza().zzc((zzbda) null);
        if (!(!((Boolean) zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() || (zzfbr2 = this.zzl) == null || zzfbr2.zzb == null)) {
            zzbcy.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbcy.zza();
        zzbcx zzf2 = zzbda.zzf();
        this.zzK = zzf2;
        zzbcy.zzb("native:view_create", zzf2);
        this.zzL = null;
        this.zzJ = null;
        zzcg.zza().zzb(zzcgq);
        zzv.zzp().zzt();
    }

    private final synchronized void zzba() {
        zzfbo zzfbo = this.zzk;
        if (zzfbo != null) {
            if (zzfbo.zzam) {
                zzo.zze("Disabling hardware acceleration on an overlay.");
                zzbc();
                return;
            }
        }
        if (!this.zzw) {
            if (!this.zzs.zzi()) {
                zzo.zze("Enabling hardware acceleration on an AdView.");
                zzbe();
                return;
            }
        }
        zzo.zze("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (!this.zzP) {
            this.zzP = true;
            zzv.zzp().zzr();
        }
    }

    private final synchronized void zzbc() {
        if (!this.zzx) {
            setLayerType(1, (Paint) null);
        }
        this.zzx = true;
    }

    private final void zzbd(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, (Paint) null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf(String str) {
        try {
            zzs.zza.post(new zzcfr(this, "about:blank"));
        } catch (Throwable th) {
            zzv.zzp().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            zzo.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbcs.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        Map map = this.zzV;
        if (map != null) {
            for (zzcde release : map.values()) {
                release.release();
            }
        }
        this.zzV = null;
    }

    private final void zzbi() {
        zzbcy zzbcy = this.zzM;
        if (zzbcy != null) {
            zzbda zza2 = zzbcy.zza();
            zzbcq zzg2 = zzv.zzp().zzg();
            if (zzg2 != null) {
                zzg2.zzf(zza2);
            }
        }
    }

    private final synchronized void zzbj() {
        Boolean zzl2 = zzv.zzp().zzl();
        this.zzy = zzl2;
        if (zzl2 == null) {
            try {
                evaluateJavascript("(function(){})()", (ValueCallback) null);
                zzaY(true);
            } catch (IllegalStateException unused) {
                zzaY(false);
            }
        }
    }

    public final synchronized void destroy() {
        zzbi();
        this.zzQ.zza();
        zzm zzm2 = this.zzp;
        if (zzm2 != null) {
            zzm2.zzb();
            this.zzp.zzm();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzr = null;
        this.zzo.zzi();
        this.zzG = null;
        this.zzg = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.zzv) {
            zzv.zzz().zzd(this);
            zzbh();
            this.zzv = true;
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkF)).booleanValue()) {
                Activity zza2 = this.zzb.zza();
                if (zza2 == null || !zza2.isDestroyed()) {
                    zze.zza("Initiating WebView self destruct sequence in 3...");
                    zze.zza("Loading blank page in WebView, 2...");
                    zzbf("about:blank");
                    return;
                }
                zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            }
            zze.zza("Destroying the WebView immediately...");
            zzX();
        }
    }

    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (zzaE()) {
            zzo.zzl("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkG)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzbzw.zzf.zza(new zzcfq(this, str, valueCallback));
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzi();
                    zzv.zzz().zzd(this);
                    zzbh();
                    zzbb();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaE()) {
            super.loadData(str, str2, str3);
        } else {
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaE()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!zzaE()) {
            try {
                zzs.zza.post(new zzcft(this, str));
            } catch (Throwable th) {
                zzv.zzp().zzw(th, "AdWebViewImpl.loadUrl");
                zzo.zzk("Could not call loadUrl. ", th);
            }
        } else {
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void onAdClicked() {
        zzcff zzcff = this.zzo;
        if (zzcff != null) {
            zzcff.onAdClicked();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaE()) {
            this.zzQ.zzc();
        }
        if (this.zzY) {
            onResume();
            this.zzY = false;
        }
        boolean z = this.zzC;
        zzcff zzcff = this.zzo;
        if (zzcff != null && zzcff.zzU()) {
            if (!this.zzD) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = true;
            }
            zzaZ();
            z = true;
        }
        zzbd(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        zzcff zzcff;
        synchronized (this) {
            if (!zzaE()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzcff = this.zzo) != null && zzcff.zzU() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = false;
            }
        }
        zzbd(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkU)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            zzv.zzq();
            zzs.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            zzo.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            zzv.zzp().zzw(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (!zzaE()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean zzaZ = zzaZ();
        zzm zzL2 = zzL();
        if (zzL2 != null && zzaZ) {
            zzL2.zzn();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01bc A[SYNTHETIC, Splitter:B:114:0x01bc] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Not enough space to show ad. Needs "
            monitor-enter(r9)
            boolean r1 = r9.zzaE()     // Catch:{ all -> 0x01e2 }
            r2 = 0
            if (r1 == 0) goto L_0x000f
            r9.setMeasuredDimension(r2, r2)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x000f:
            boolean r1 = r9.isInEditMode()     // Catch:{ all -> 0x01e2 }
            if (r1 != 0) goto L_0x01dd
            boolean r1 = r9.zzw     // Catch:{ all -> 0x01e2 }
            if (r1 != 0) goto L_0x01dd
            com.google.android.gms.internal.ads.zzcgr r1 = r9.zzs     // Catch:{ all -> 0x01e2 }
            boolean r1 = r1.zzf()     // Catch:{ all -> 0x01e2 }
            if (r1 == 0) goto L_0x0023
            goto L_0x01dd
        L_0x0023:
            com.google.android.gms.internal.ads.zzcgr r1 = r9.zzs     // Catch:{ all -> 0x01e2 }
            boolean r1 = r1.zzh()     // Catch:{ all -> 0x01e2 }
            if (r1 == 0) goto L_0x0030
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x0030:
            com.google.android.gms.internal.ads.zzcgr r1 = r9.zzs     // Catch:{ all -> 0x01e2 }
            boolean r1 = r1.zzj()     // Catch:{ all -> 0x01e2 }
            if (r1 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzdV     // Catch:{ all -> 0x01e2 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x01e2 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x01e2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x004f
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x004f:
            com.google.android.gms.internal.ads.zzcfz r0 = r9.zzq()     // Catch:{ all -> 0x01e2 }
            r1 = 0
            if (r0 == 0) goto L_0x005b
            float r0 = r0.zze()     // Catch:{ all -> 0x01e2 }
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0065
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x0065:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e2 }
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x01e2 }
            float r1 = (float) r11     // Catch:{ all -> 0x01e2 }
            float r1 = r1 * r0
            float r3 = (float) r10     // Catch:{ all -> 0x01e2 }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01e2 }
            if (r11 != 0) goto L_0x007f
            if (r3 == 0) goto L_0x007e
            float r11 = (float) r3     // Catch:{ all -> 0x01e2 }
            float r11 = r11 * r0
            int r11 = (int) r11     // Catch:{ all -> 0x01e2 }
            r2 = r10
            r10 = r3
            goto L_0x008e
        L_0x007e:
            r11 = 0
        L_0x007f:
            int r1 = (int) r1     // Catch:{ all -> 0x01e2 }
            if (r10 != 0) goto L_0x008b
            if (r1 == 0) goto L_0x008c
            float r10 = (float) r1     // Catch:{ all -> 0x01e2 }
            float r10 = r10 / r0
            int r3 = (int) r10     // Catch:{ all -> 0x01e2 }
            r10 = r11
            r11 = r1
            r2 = r11
            goto L_0x008e
        L_0x008b:
            r2 = r10
        L_0x008c:
            r10 = r11
            r11 = r1
        L_0x008e:
            int r11 = java.lang.Math.min(r11, r2)     // Catch:{ all -> 0x01e2 }
            int r10 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x01e2 }
            r9.setMeasuredDimension(r11, r10)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x009b:
            com.google.android.gms.internal.ads.zzcgr r1 = r9.zzs     // Catch:{ all -> 0x01e2 }
            boolean r1 = r1.zzg()     // Catch:{ all -> 0x01e2 }
            if (r1 == 0) goto L_0x00e4
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzea     // Catch:{ all -> 0x01e2 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x01e2 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x01e2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x00ba
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x00ba:
            com.google.android.gms.internal.ads.zzcfu r0 = new com.google.android.gms.internal.ads.zzcfu     // Catch:{ all -> 0x01e2 }
            r0.<init>(r9)     // Catch:{ all -> 0x01e2 }
            java.lang.String r1 = "/contentHeight"
            r9.zzag(r1, r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r9.zzaT(r0)     // Catch:{ all -> 0x01e2 }
            android.util.DisplayMetrics r0 = r9.zzi     // Catch:{ all -> 0x01e2 }
            float r0 = r0.density     // Catch:{ all -> 0x01e2 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e2 }
            int r1 = r9.zzI     // Catch:{ all -> 0x01e2 }
            r2 = -1
            if (r1 == r2) goto L_0x00db
            float r11 = (float) r1     // Catch:{ all -> 0x01e2 }
            float r11 = r11 * r0
            int r11 = (int) r11     // Catch:{ all -> 0x01e2 }
            goto L_0x00df
        L_0x00db:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x01e2 }
        L_0x00df:
            r9.setMeasuredDimension(r10, r11)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x00e4:
            com.google.android.gms.internal.ads.zzcgr r1 = r9.zzs     // Catch:{ all -> 0x01e2 }
            boolean r1 = r1.zzi()     // Catch:{ all -> 0x01e2 }
            if (r1 == 0) goto L_0x00f7
            android.util.DisplayMetrics r10 = r9.zzi     // Catch:{ all -> 0x01e2 }
            int r11 = r10.widthPixels     // Catch:{ all -> 0x01e2 }
            int r10 = r10.heightPixels     // Catch:{ all -> 0x01e2 }
            r9.setMeasuredDimension(r11, r10)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x00f7:
            int r1 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01e2 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e2 }
            int r3 = android.view.View.MeasureSpec.getMode(r11)     // Catch:{ all -> 0x01e2 }
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x01e2 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L_0x0117
            if (r1 != r5) goto L_0x0113
            goto L_0x0117
        L_0x0113:
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0118
        L_0x0117:
            r1 = r10
        L_0x0118:
            if (r3 == r6) goto L_0x011c
            if (r3 != r5) goto L_0x011d
        L_0x011c:
            r4 = r11
        L_0x011d:
            com.google.android.gms.internal.ads.zzcgr r3 = r9.zzs     // Catch:{ all -> 0x01e2 }
            int r5 = r3.zzb     // Catch:{ all -> 0x01e2 }
            r6 = 1
            if (r5 > r1) goto L_0x012b
            int r3 = r3.zza     // Catch:{ all -> 0x01e2 }
            if (r3 <= r4) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r3 = 0
            goto L_0x012c
        L_0x012b:
            r3 = 1
        L_0x012c:
            com.google.android.gms.internal.ads.zzbcc r5 = com.google.android.gms.internal.ads.zzbcl.zzfs     // Catch:{ all -> 0x01e2 }
            com.google.android.gms.internal.ads.zzbcj r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x01e2 }
            java.lang.Object r5 = r7.zza(r5)     // Catch:{ all -> 0x01e2 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x01e2 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x01e2 }
            if (r5 == 0) goto L_0x015a
            com.google.android.gms.internal.ads.zzcgr r5 = r9.zzs     // Catch:{ all -> 0x01e2 }
            int r7 = r5.zzb     // Catch:{ all -> 0x01e2 }
            float r7 = (float) r7     // Catch:{ all -> 0x01e2 }
            float r8 = r9.zzj     // Catch:{ all -> 0x01e2 }
            float r1 = (float) r1     // Catch:{ all -> 0x01e2 }
            float r7 = r7 / r8
            float r1 = r1 / r8
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0158
            int r1 = r5.zza     // Catch:{ all -> 0x01e2 }
            float r1 = (float) r1     // Catch:{ all -> 0x01e2 }
            float r1 = r1 / r8
            float r4 = (float) r4     // Catch:{ all -> 0x01e2 }
            float r4 = r4 / r8
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0158
            r1 = 1
            goto L_0x0159
        L_0x0158:
            r1 = 0
        L_0x0159:
            r3 = r3 & r1
        L_0x015a:
            r1 = 8
            if (r3 == 0) goto L_0x01bc
            com.google.android.gms.internal.ads.zzcgr r3 = r9.zzs     // Catch:{ all -> 0x01e2 }
            int r4 = r3.zzb     // Catch:{ all -> 0x01e2 }
            float r4 = (float) r4     // Catch:{ all -> 0x01e2 }
            float r5 = r9.zzj     // Catch:{ all -> 0x01e2 }
            int r3 = r3.zza     // Catch:{ all -> 0x01e2 }
            float r3 = (float) r3     // Catch:{ all -> 0x01e2 }
            float r10 = (float) r10     // Catch:{ all -> 0x01e2 }
            float r11 = (float) r11     // Catch:{ all -> 0x01e2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e2 }
            r7.<init>(r0)     // Catch:{ all -> 0x01e2 }
            float r4 = r4 / r5
            int r0 = (int) r4     // Catch:{ all -> 0x01e2 }
            r7.append(r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = "x"
            r7.append(r0)     // Catch:{ all -> 0x01e2 }
            float r3 = r3 / r5
            int r0 = (int) r3     // Catch:{ all -> 0x01e2 }
            r7.append(r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = " dp, but only has "
            r7.append(r0)     // Catch:{ all -> 0x01e2 }
            float r10 = r10 / r5
            int r10 = (int) r10     // Catch:{ all -> 0x01e2 }
            r7.append(r10)     // Catch:{ all -> 0x01e2 }
            java.lang.String r10 = "x"
            r7.append(r10)     // Catch:{ all -> 0x01e2 }
            float r11 = r11 / r5
            int r10 = (int) r11     // Catch:{ all -> 0x01e2 }
            r7.append(r10)     // Catch:{ all -> 0x01e2 }
            java.lang.String r10 = " dp."
            r7.append(r10)     // Catch:{ all -> 0x01e2 }
            java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x01e2 }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r10)     // Catch:{ all -> 0x01e2 }
            int r10 = r9.getVisibility()     // Catch:{ all -> 0x01e2 }
            if (r10 == r1) goto L_0x01a8
            r10 = 4
            r9.setVisibility(r10)     // Catch:{ all -> 0x01e2 }
        L_0x01a8:
            r9.setMeasuredDimension(r2, r2)     // Catch:{ all -> 0x01e2 }
            boolean r10 = r9.zzm     // Catch:{ all -> 0x01e2 }
            if (r10 != 0) goto L_0x01ba
            com.google.android.gms.internal.ads.zzbbj r10 = r9.zzX     // Catch:{ all -> 0x01e2 }
            r11 = 10001(0x2711, float:1.4014E-41)
            r10.zzc(r11)     // Catch:{ all -> 0x01e2 }
            r9.zzm = r6     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x01ba:
            monitor-exit(r9)
            return
        L_0x01bc:
            int r10 = r9.getVisibility()     // Catch:{ all -> 0x01e2 }
            if (r10 == r1) goto L_0x01c5
            r9.setVisibility(r2)     // Catch:{ all -> 0x01e2 }
        L_0x01c5:
            boolean r10 = r9.zzn     // Catch:{ all -> 0x01e2 }
            if (r10 != 0) goto L_0x01d2
            com.google.android.gms.internal.ads.zzbbj r10 = r9.zzX     // Catch:{ all -> 0x01e2 }
            r11 = 10002(0x2712, float:1.4016E-41)
            r10.zzc(r11)     // Catch:{ all -> 0x01e2 }
            r9.zzn = r6     // Catch:{ all -> 0x01e2 }
        L_0x01d2:
            com.google.android.gms.internal.ads.zzcgr r10 = r9.zzs     // Catch:{ all -> 0x01e2 }
            int r11 = r10.zzb     // Catch:{ all -> 0x01e2 }
            int r10 = r10.zza     // Catch:{ all -> 0x01e2 }
            r9.setMeasuredDimension(r11, r10)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x01dd:
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r9)
            return
        L_0x01e2:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01e2 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfw.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!zzaE()) {
            try {
                super.onPause();
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzmu)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                    zzo.zze("Muting webview");
                    WebViewCompat.setAudioMuted(this, true);
                }
            } catch (Exception e) {
                zzo.zzh("Could not pause webview.", e);
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzmx)).booleanValue()) {
                    zzv.zzp().zzw(e, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    public final void onResume() {
        if (!zzaE()) {
            try {
                super.onResume();
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzmu)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                    zzo.zze("Unmuting webview");
                    WebViewCompat.setAudioMuted(this, false);
                }
            } catch (Exception e) {
                zzo.zzh("Could not resume webview.", e);
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzmx)).booleanValue()) {
                    zzv.zzp().zzw(e, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = ((Boolean) zzbe.zzc().zza(zzbcl.zzdD)).booleanValue() && this.zzo.zzR();
        if ((!this.zzo.zzU() || this.zzo.zzS()) && !z) {
            zzava zzava = this.zzc;
            if (zzava != null) {
                zzava.zzd(motionEvent);
            }
            zzbds zzbds = this.zze;
            if (zzbds != null) {
                zzbds.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbfk zzbfk = this.zzE;
                if (zzbfk != null) {
                    zzbfk.zzd(motionEvent);
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcff) {
            this.zzo = (zzcff) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!zzaE()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                zzo.zzh("Could not stop loading webview.", e);
            }
        }
    }

    public final synchronized void zzA(int i) {
        this.zzN = i;
    }

    public final void zzB(int i) {
    }

    public final synchronized void zzC(zzcfz zzcfz) {
        if (this.zzB != null) {
            zzo.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzB = zzcfz;
        }
    }

    public final zzfbo zzD() {
        return this.zzk;
    }

    public final Context zzE() {
        return this.zzb.zzb();
    }

    public final View zzF() {
        return this;
    }

    public final WebView zzG() {
        return this;
    }

    public final WebViewClient zzH() {
        return this.zzo;
    }

    public final zzava zzI() {
        return this.zzc;
    }

    public final synchronized zzazx zzJ() {
        return this.zzG;
    }

    public final synchronized zzbfk zzK() {
        return this.zzE;
    }

    public final synchronized zzm zzL() {
        return this.zzp;
    }

    public final synchronized zzm zzM() {
        return this.zzO;
    }

    public final /* synthetic */ zzcgp zzN() {
        return this.zzo;
    }

    public final synchronized zzcgr zzO() {
        return this.zzs;
    }

    public final synchronized zzecp zzP() {
        return this.zzr;
    }

    public final synchronized zzecr zzQ() {
        return this.zzq;
    }

    public final zzfbr zzR() {
        return this.zzl;
    }

    public final zzfcn zzS() {
        return this.zzd;
    }

    public final ListenableFuture zzT() {
        zzbds zzbds = this.zze;
        if (zzbds == null) {
            return zzgch.zzh((Object) null);
        }
        return zzbds.zza();
    }

    public final synchronized String zzU() {
        return this.zzt;
    }

    public final List zzV() {
        return new ArrayList();
    }

    public final void zzW(zzfbo zzfbo, zzfbr zzfbr) {
        this.zzk = zzfbo;
        this.zzl = zzfbr;
    }

    public final synchronized void zzX() {
        zze.zza("Destroying WebView!");
        zzbb();
        zzs.zza.post(new zzcfv(this));
    }

    public final void zzY() {
        zzbg();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    public final void zzZ(int i) {
        if (i == 0) {
            zzbcy zzbcy = this.zzM;
            zzbcs.zza(zzbcy.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    public final void zza(String str) {
        zzaT(str);
    }

    public final void zzaA(String str, Predicate predicate) {
        zzcff zzcff = this.zzo;
        if (zzcff != null) {
            zzcff.zzQ(str, predicate);
        }
    }

    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    public final boolean zzaD(boolean z, int i) {
        destroy();
        this.zzX.zzb(new zzcfs(z, i));
        this.zzX.zzc(10003);
        return true;
    }

    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    public final boolean zzaG() {
        return false;
    }

    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    public final void zzaJ(zzc zzc2, boolean z, boolean z2, String str) {
        this.zzo.zzv(zzc2, z, z2, str);
    }

    public final void zzaK(String str, String str2, int i) {
        this.zzo.zzw(str, str2, 14);
    }

    public final void zzaL(boolean z, int i, boolean z2) {
        this.zzo.zzx(z, i, z2);
    }

    public final void zzaM(boolean z, int i, String str, String str2, boolean z2) {
        this.zzo.zzz(z, i, str, str2, z2);
    }

    public final void zzaN(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzo.zzA(z, i, str, z2, z3);
    }

    public final zzcff zzaO() {
        return this.zzo;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzaS(String str, ValueCallback valueCallback) {
        if (!zzaE()) {
            evaluateJavascript(str, (ValueCallback) null);
        } else {
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaT(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaP() == null) {
                zzbj();
            }
            if (zzaP().booleanValue()) {
                zzaS(str, (ValueCallback) null);
            } else {
                zzaX("javascript:".concat(str));
            }
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzaX(String str) {
        if (!zzaE()) {
            loadUrl(str);
        } else {
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        zzv.zzp().zzy(bool);
    }

    public final boolean zzaZ() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzo.zzT() || this.zzo.zzU()) {
            zzbc.zzb();
            DisplayMetrics displayMetrics = this.zzi;
            int zzv2 = zzf.zzv(displayMetrics, displayMetrics.widthPixels);
            zzbc.zzb();
            DisplayMetrics displayMetrics2 = this.zzi;
            int zzv3 = zzf.zzv(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i2 = zzv2;
                i = zzv3;
            } else {
                zzv.zzq();
                int[] zzQ2 = zzs.zzQ(zza2);
                zzbc.zzb();
                int zzv4 = zzf.zzv(this.zzi, zzQ2[0]);
                zzbc.zzb();
                i = zzf.zzv(this.zzi, zzQ2[1]);
                i2 = zzv4;
            }
            int i3 = this.zzS;
            if (!(i3 == zzv2 && this.zzR == zzv3 && this.zzT == i2 && this.zzU == i)) {
                if (!(i3 == zzv2 && this.zzR == zzv3)) {
                    z = true;
                }
                this.zzS = zzv2;
                this.zzR = zzv3;
                this.zzT = i2;
                this.zzU = i;
                new zzbsi(this, "").zzj(zzv2, zzv3, i2, i, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    public final void zzaa() {
        if (this.zzJ == null) {
            zzbcy zzbcy = this.zzM;
            zzbcs.zza(zzbcy.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbcx zzf2 = zzbda.zzf();
            this.zzJ = zzf2;
            this.zzM.zzb("native:view_show", zzf2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onshow", hashMap);
    }

    public final void zzab() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzv.zzs().zze()));
        hashMap.put("app_volume", String.valueOf(zzv.zzs().zza()));
        hashMap.put("device_volume", String.valueOf(zzab.zzb(getContext())));
        zzd("volume", hashMap);
    }

    public final void zzac(boolean z) {
        this.zzo.zzj(z);
    }

    public final void zzad() {
        this.zzQ.zzb();
    }

    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        if (!zzaE()) {
            String str5 = (String) zzbe.zzc().zza(zzbcl.zzab);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                zzo.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            super.loadDataWithBaseURL(str, zzcgi.zzb(str2, str4), "text/html", "UTF-8", (String) null);
            return;
        }
        zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbcx zzf2 = zzbda.zzf();
            this.zzL = zzf2;
            this.zzM.zzb("native:view_load", zzf2);
        }
    }

    public final void zzag(String str, zzbjp zzbjp) {
        zzcff zzcff = this.zzo;
        if (zzcff != null) {
            zzcff.zzB(str, zzbjp);
        }
    }

    public final void zzah() {
        zze.zza("Cannot add text view to inner AdWebView");
    }

    public final synchronized void zzai(zzm zzm2) {
        this.zzp = zzm2;
    }

    public final synchronized void zzaj(zzcgr zzcgr) {
        this.zzs = zzcgr;
        requestLayout();
    }

    public final synchronized void zzak(zzazx zzazx) {
        this.zzG = zzazx;
    }

    public final synchronized void zzal(boolean z) {
        this.zzz = z;
    }

    public final void zzam() {
        setBackgroundColor(0);
    }

    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    public final synchronized void zzao(boolean z) {
        zzm zzm2 = this.zzp;
        if (zzm2 != null) {
            zzm2.zzy(this.zzo.zzT(), z);
        } else {
            this.zzu = z;
        }
    }

    public final synchronized void zzap(zzbfi zzbfi) {
        this.zzF = zzbfi;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzaq(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzw     // Catch:{ all -> 0x003a }
            r2.zzw = r3     // Catch:{ all -> 0x003a }
            r2.zzba()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzac     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzcgr r0 = r2.zzs     // Catch:{ all -> 0x003a }
            boolean r0 = r0.zzi()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            java.lang.String r0 = ""
            com.google.android.gms.internal.ads.zzbsi r1 = new com.google.android.gms.internal.ads.zzbsi     // Catch:{ all -> 0x003a }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x003a }
            r0 = 1
            if (r0 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r1.zzl(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfw.zzaq(boolean):void");
    }

    public final synchronized void zzar(zzbfk zzbfk) {
        this.zzE = zzbfk;
    }

    public final synchronized void zzas(zzecp zzecp) {
        this.zzr = zzecp;
    }

    public final synchronized void zzat(zzecr zzecr) {
        this.zzq = zzecr;
    }

    public final synchronized void zzau(int i) {
        zzm zzm2 = this.zzp;
        if (zzm2 != null) {
            zzm2.zzA(i);
        }
    }

    public final void zzav(boolean z) {
        this.zzY = true;
    }

    public final synchronized void zzaw(zzm zzm2) {
        this.zzO = zzm2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzax(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zzH     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.zzH = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            com.google.android.gms.ads.internal.overlay.zzm r3 = r2.zzp     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.zzE()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfw.zzax(boolean):void");
    }

    public final synchronized void zzay(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        zzm zzm2 = this.zzp;
        if (zzm2 != null) {
            zzm2.zzB(z);
        }
    }

    public final void zzaz(String str, zzbjp zzbjp) {
        zzcff zzcff = this.zzo;
        if (zzcff != null) {
            zzcff.zzP(str, zzbjp);
        }
    }

    public final void zzb(String str, String str2) {
        zzaT(str + "(" + str2 + ");");
    }

    public final void zzd(String str, Map map) {
        try {
            zze(str, zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    public final void zzdd() {
        zzcff zzcff = this.zzo;
        if (zzcff != null) {
            zzcff.zzdd();
        }
    }

    public final synchronized void zzde() {
        zzn zzn2 = this.zzg;
        if (zzn2 != null) {
            zzn2.zzde();
        }
    }

    public final synchronized void zzdf() {
        zzn zzn2 = this.zzg;
        if (zzn2 != null) {
            zzn2.zzdf();
        }
    }

    public final void zzdg() {
        zzm zzL2 = zzL();
        if (zzL2 != null) {
            zzL2.zzd();
        }
    }

    public final void zzdn(zzayj zzayj) {
        synchronized (this) {
            this.zzC = zzayj.zzj;
        }
        zzbd(zzayj.zzj);
    }

    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zzo.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaT(sb.toString());
    }

    public final synchronized int zzf() {
        return this.zzN;
    }

    public final int zzg() {
        return getMeasuredHeight();
    }

    public final int zzh() {
        return getMeasuredWidth();
    }

    public final Activity zzi() {
        return this.zzb.zza();
    }

    public final zza zzj() {
        return this.zzh;
    }

    public final zzbcx zzk() {
        return this.zzK;
    }

    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    public final zzbcy zzm() {
        return this.zzM;
    }

    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    public final zzcbh zzo() {
        return null;
    }

    public final synchronized zzcde zzp(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcde) map.get(str);
    }

    public final synchronized zzcfz zzq() {
        return this.zzB;
    }

    public final synchronized String zzr() {
        zzfbr zzfbr = this.zzl;
        if (zzfbr == null) {
            return null;
        }
        return zzfbr.zzb;
    }

    public final synchronized String zzs() {
        return this.zzA;
    }

    public final synchronized void zzt(String str, zzcde zzcde) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzcde);
    }

    public final void zzu() {
        zzcff zzcff = this.zzo;
        if (zzcff != null) {
            zzcff.zzu();
        }
    }

    public final void zzv(boolean z, long j) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put(TypedValues.TransitionType.S_DURATION, Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    public final synchronized void zzw() {
        zzbfi zzbfi = this.zzF;
        if (zzbfi != null) {
            zzs.zza.post(new zzdmk((zzdmm) zzbfi));
        }
    }

    public final void zzx(int i) {
    }

    public final void zzy(int i) {
    }

    public final void zzz(boolean z) {
        this.zzo.zzE(false);
    }
}
