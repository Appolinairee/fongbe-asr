package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Predicate;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzcff extends WebViewClient implements zzcgp {
    public static final /* synthetic */ int zzb = 0;
    private zzdrw zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final HashSet zzF;
    private final zzebv zzG;
    private View.OnAttachStateChangeListener zzH;
    protected zzbxu zza;
    private final zzcex zzc;
    private final zzbbj zzd;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private zza zzg;
    private zzr zzh;
    private zzcgn zzi;
    private zzcgo zzj;
    private zzbif zzk;
    private zzbih zzl;
    private zzdds zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private zzac zzw;
    private zzbsh zzx;
    private zzb zzy;
    private zzbsc zzz;

    public zzcff(zzcex zzcex, zzbbj zzbbj, boolean z, zzbsh zzbsh, zzbsc zzbsc, zzebv zzebv) {
        this.zzd = zzbbj;
        this.zzc = zzcex;
        this.zzs = z;
        this.zzx = zzbsh;
        this.zzz = null;
        this.zzF = new HashSet(Arrays.asList(((String) zzbe.zzc().zza(zzbcl.zzfC)).split(",")));
        this.zzG = zzebv;
    }

    private static WebResourceResponse zzW() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzaU)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzX(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        String str2;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        zzv.zzq().zzf(this.zzc.getContext(), this.zzc.zzn().afmaVersion, false, httpURLConnection, false, 60000);
                        webResourceResponse = null;
                        zzl zzl2 = new zzl((String) null);
                        zzl2.zzc(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzl2.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            zzv.zzq();
                            zzv.zzq();
                            String contentType = httpURLConnection.getContentType();
                        } else {
                            String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                            if (headerField != null) {
                                if (!headerField.startsWith("tel:")) {
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol != null) {
                                        if (!protocol.equals(ProxyConfig.MATCH_HTTP) && !protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                                            zzo.zzj("Unsupported scheme: " + protocol);
                                            webResourceResponse = zzW();
                                            break;
                                        }
                                        zzo.zze("Redirecting to " + headerField);
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    } else {
                                        zzo.zzj("Protocol is null");
                                        webResourceResponse = zzW();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                throw new IOException("Missing Location header in redirect");
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            zzv.zzq();
            zzv.zzq();
            String contentType2 = httpURLConnection.getContentType();
            String str3 = "";
            if (TextUtils.isEmpty(contentType2)) {
                str2 = str3;
            } else {
                str2 = contentType2.split(";")[0].trim();
            }
            zzv.zzq();
            String contentType3 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType3)) {
                String[] split = contentType3.split(";");
                if (split.length != 1) {
                    int i2 = 1;
                    while (true) {
                        if (i2 >= split.length) {
                            break;
                        }
                        if (split[i2].trim().startsWith("charset")) {
                            String[] split2 = split[i2].trim().split("=");
                            if (split2.length > 1) {
                                str3 = split2[1].trim();
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            String str4 = str3;
            Map headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry entry2 : headerFields.entrySet()) {
                if (!(entry2.getKey() == null || entry2.getValue() == null || ((List) entry2.getValue()).isEmpty())) {
                    hashMap.put((String) entry2.getKey(), (String) ((List) entry2.getValue()).get(0));
                }
            }
            webResourceResponse = zzv.zzr().zzb(str2, str4, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    public final void zzY(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjp) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzZ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener != null) {
            ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    public final void zzaa(View view, zzbxu zzbxu, int i) {
        if (zzbxu.zzi() && i > 0) {
            zzbxu.zzg(view);
            if (zzbxu.zzi()) {
                zzs.zza.postDelayed(new zzcey(this, view, zzbxu, i), 100);
            }
        }
    }

    private static final boolean zzab(zzcex zzcex) {
        return zzcex.zzD() != null && zzcex.zzD().zzb();
    }

    private static final boolean zzac(boolean z, zzcex zzcex) {
        return z && !zzcex.zzO().zzi() && !zzcex.zzU().equals("interstitial_mb");
    }

    public final void onAdClicked() {
        zza zza2 = this.zzg;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzk(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r2 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r2.zza();
        r1.zzj = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        zzh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r1.zzc.zzL() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlM)).booleanValue() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r1.zzc.zzL().zzG(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r1.zzB = true;
        r2 = r1.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.Object r2 = r1.zzf
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcex r0 = r1.zzc     // Catch:{ all -> 0x004c }
            boolean r0 = r0.zzaE()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0017
            java.lang.String r3 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.zze.zza(r3)     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzcex r3 = r1.zzc     // Catch:{ all -> 0x004c }
            r3.zzX()     // Catch:{ all -> 0x004c }
            monitor-exit(r2)     // Catch:{ all -> 0x004c }
            return
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x004c }
            r2 = 1
            r1.zzB = r2
            com.google.android.gms.internal.ads.zzcgo r2 = r1.zzj
            if (r2 == 0) goto L_0x0025
            r2.zza()
            r2 = 0
            r1.zzj = r2
        L_0x0025:
            r1.zzh()
            com.google.android.gms.internal.ads.zzcex r2 = r1.zzc
            com.google.android.gms.ads.internal.overlay.zzm r2 = r2.zzL()
            if (r2 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzlM
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzcex r2 = r1.zzc
            com.google.android.gms.ads.internal.overlay.zzm r2 = r2.zzL()
            r2.zzG(r3)
        L_0x004b:
            return
        L_0x004c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcff.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(ProcessUtils$$ExternalSyntheticApiModelOutline0.m(renderProcessGoneDetail), ProcessUtils$$ExternalSyntheticApiModelOutline0.m(renderProcessGoneDetail));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case WorkQueueKt.MASK /*127*/:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "AdWebView shouldOverrideUrlLoading: "
            java.lang.String r1 = java.lang.String.valueOf(r14)
            java.lang.String r0 = r0.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            android.net.Uri r0 = android.net.Uri.parse(r14)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "gmsg"
            boolean r1 = r2.equalsIgnoreCase(r1)
            r2 = 1
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r0.getHost()
            java.lang.String r3 = "mobileads.google.com"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x002f
            r12.zzk(r0)
            goto L_0x011b
        L_0x002f:
            boolean r1 = r12.zzn
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.zzcex r1 = r12.zzc
            android.webkit.WebView r1 = r1.zzG()
            if (r13 != r1) goto L_0x006e
            java.lang.String r1 = r0.getScheme()
            java.lang.String r3 = "http"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 != 0) goto L_0x004f
            java.lang.String r3 = "https"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x006e
        L_0x004f:
            com.google.android.gms.ads.internal.client.zza r0 = r12.zzg
            r1 = 0
            if (r0 == 0) goto L_0x0060
            r0.onAdClicked()
            com.google.android.gms.internal.ads.zzbxu r0 = r12.zza
            if (r0 == 0) goto L_0x005e
            r0.zzh(r14)
        L_0x005e:
            r12.zzg = r1
        L_0x0060:
            com.google.android.gms.internal.ads.zzdds r0 = r12.zzm
            if (r0 == 0) goto L_0x0069
            r0.zzdd()
            r12.zzm = r1
        L_0x0069:
            boolean r13 = super.shouldOverrideUrlLoading(r13, r14)
            return r13
        L_0x006e:
            com.google.android.gms.internal.ads.zzcex r13 = r12.zzc
            android.webkit.WebView r13 = r13.zzG()
            boolean r13 = r13.willNotDraw()
            if (r13 != 0) goto L_0x010e
            com.google.android.gms.internal.ads.zzcex r13 = r12.zzc     // Catch:{ zzavb -> 0x00d0 }
            com.google.android.gms.internal.ads.zzava r13 = r13.zzI()     // Catch:{ zzavb -> 0x00d0 }
            com.google.android.gms.internal.ads.zzcex r1 = r12.zzc     // Catch:{ zzavb -> 0x00d0 }
            com.google.android.gms.internal.ads.zzfcn r1 = r1.zzS()     // Catch:{ zzavb -> 0x00d0 }
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzlR     // Catch:{ zzavb -> 0x00d0 }
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ zzavb -> 0x00d0 }
            java.lang.Object r3 = r4.zza(r3)     // Catch:{ zzavb -> 0x00d0 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ zzavb -> 0x00d0 }
            boolean r3 = r3.booleanValue()     // Catch:{ zzavb -> 0x00d0 }
            if (r3 == 0) goto L_0x00b5
            if (r1 == 0) goto L_0x00b5
            if (r13 == 0) goto L_0x00dd
            boolean r13 = r13.zzf(r0)     // Catch:{ zzavb -> 0x00d0 }
            if (r13 == 0) goto L_0x00dd
            com.google.android.gms.internal.ads.zzcex r13 = r12.zzc     // Catch:{ zzavb -> 0x00d0 }
            android.content.Context r13 = r13.getContext()     // Catch:{ zzavb -> 0x00d0 }
            com.google.android.gms.internal.ads.zzcex r3 = r12.zzc     // Catch:{ zzavb -> 0x00d0 }
            android.app.Activity r4 = r3.zzi()     // Catch:{ zzavb -> 0x00d0 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ zzavb -> 0x00d0 }
            android.net.Uri r0 = r1.zza(r0, r13, r3, r4)     // Catch:{ zzavb -> 0x00d0 }
            goto L_0x00dd
        L_0x00b5:
            if (r13 == 0) goto L_0x00dd
            boolean r1 = r13.zzf(r0)     // Catch:{ zzavb -> 0x00d0 }
            if (r1 == 0) goto L_0x00dd
            com.google.android.gms.internal.ads.zzcex r1 = r12.zzc     // Catch:{ zzavb -> 0x00d0 }
            android.content.Context r1 = r1.getContext()     // Catch:{ zzavb -> 0x00d0 }
            com.google.android.gms.internal.ads.zzcex r3 = r12.zzc     // Catch:{ zzavb -> 0x00d0 }
            android.app.Activity r4 = r3.zzi()     // Catch:{ zzavb -> 0x00d0 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ zzavb -> 0x00d0 }
            android.net.Uri r0 = r13.zza(r0, r1, r3, r4)     // Catch:{ zzavb -> 0x00d0 }
            goto L_0x00dd
        L_0x00d0:
            java.lang.String r13 = java.lang.String.valueOf(r14)
            java.lang.String r1 = "Unable to append parameter to URL: "
            java.lang.String r13 = r1.concat(r13)
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r13)
        L_0x00dd:
            com.google.android.gms.ads.internal.zzb r13 = r12.zzy
            if (r13 == 0) goto L_0x00ec
            boolean r1 = r13.zzc()
            if (r1 == 0) goto L_0x00e8
            goto L_0x00ec
        L_0x00e8:
            r13.zzb(r14)
            goto L_0x011b
        L_0x00ec:
            com.google.android.gms.ads.internal.overlay.zzc r13 = new com.google.android.gms.ads.internal.overlay.zzc
            java.lang.String r5 = r0.toString()
            r10 = 0
            r11 = 0
            java.lang.String r4 = "android.intent.action.VIEW"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            com.google.android.gms.internal.ads.zzcex r14 = r12.zzc
            if (r14 == 0) goto L_0x0107
            java.lang.String r14 = r14.zzr()
            goto L_0x0109
        L_0x0107:
            java.lang.String r14 = ""
        L_0x0109:
            r0 = 0
            r12.zzv(r13, r2, r0, r14)
            goto L_0x011b
        L_0x010e:
            java.lang.String r13 = java.lang.String.valueOf(r14)
            java.lang.String r14 = "AdWebView unable to handle URL: "
            java.lang.String r13 = r14.concat(r13)
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r13)
        L_0x011b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcff.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void zzA(boolean z, int i, String str, boolean z2, boolean z3) {
        zza zza2;
        zzdds zzdds;
        zzcex zzcex = this.zzc;
        boolean zzaF = zzcex.zzaF();
        boolean zzac = zzac(zzaF, zzcex);
        boolean z4 = true;
        if (!zzac && z2) {
            z4 = false;
        }
        if (zzac) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        zzcfe zzcfe = zzaF ? null : new zzcfe(this.zzc, this.zzh);
        zzbif zzbif = this.zzk;
        zzbih zzbih = this.zzl;
        zzac zzac2 = this.zzw;
        zzcex zzcex2 = this.zzc;
        VersionInfoParcel zzn2 = zzcex2.zzn();
        if (z4) {
            zzdds = null;
        } else {
            zzdds = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza2, (zzr) zzcfe, zzbif, zzbih, zzac2, zzcex2, z, i, str, zzn2, zzdds, (zzbsx) zzab(this.zzc) ? this.zzG : null, z3);
        zzy(adOverlayInfoParcel);
    }

    public final void zzB(String str, zzbjp zzbjp) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbjp);
        }
    }

    public final void zzC(zzcgn zzcgn) {
        this.zzi = zzcgn;
    }

    public final void zzD(int i, int i2) {
        zzbsc zzbsc = this.zzz;
        if (zzbsc != null) {
            zzbsc.zze(i, i2);
        }
    }

    public final void zzE(boolean z) {
        this.zzn = false;
    }

    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    public final void zzH() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzbzw.zzf.execute(new zzcez(this));
        }
    }

    public final void zzI(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    public final void zzJ(zzcgo zzcgo) {
        this.zzj = zzcgo;
    }

    public final void zzK(zzcmk zzcmk, zzebk zzebk, zzfja zzfja) {
        zzO("/click");
        if (zzebk == null || zzfja == null) {
            zzB("/click", new zzbin(this.zzm, zzcmk));
        } else {
            zzB("/click", new zzfcr(this.zzm, zzcmk, zzfja, zzebk));
        }
    }

    public final void zzL(zzcmk zzcmk) {
        zzO("/click");
        zzB("/click", new zzbin(this.zzm, zzcmk));
    }

    public final void zzM(zzcmk zzcmk, zzebk zzebk, zzdrw zzdrw) {
        zzO("/open");
        zzB("/open", new zzbkb(this.zzy, this.zzz, zzebk, zzdrw, zzcmk));
    }

    public final void zzN(zzfbo zzfbo) {
        if (zzv.zzo().zzp(this.zzc.getContext())) {
            zzO("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbjv(this.zzc.getContext(), zzfbo.zzaw));
        }
    }

    public final void zzO(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list != null) {
                list.clear();
            }
        }
    }

    public final void zzP(String str, zzbjp zzbjp) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list != null) {
                list.remove(zzbjp);
            }
        }
    }

    public final void zzQ(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbjp> list = (List) this.zze.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzbjp zzbjp : list) {
                    if (predicate.apply(zzbjp)) {
                        arrayList.add(zzbjp);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final boolean zzR() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzS() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    public final boolean zzT() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzU() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01c6: MOVE  (r1v48 com.google.android.gms.internal.ads.zzbjq) = (r35v0 com.google.android.gms.internal.ads.zzbjq)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    public final void zzV(com.google.android.gms.ads.internal.client.zza r18, com.google.android.gms.internal.ads.zzbif r19, com.google.android.gms.ads.internal.overlay.zzr r20, com.google.android.gms.internal.ads.zzbih r21, com.google.android.gms.ads.internal.overlay.zzac r22, boolean r23, com.google.android.gms.internal.ads.zzbjs r24, com.google.android.gms.ads.internal.zzb r25, com.google.android.gms.internal.ads.zzbsj r26, com.google.android.gms.internal.ads.zzbxu r27, com.google.android.gms.internal.ads.zzebk r28, com.google.android.gms.internal.ads.zzfja r29, com.google.android.gms.internal.ads.zzdrw r30, com.google.android.gms.internal.ads.zzbkj r31, com.google.android.gms.internal.ads.zzdds r32, com.google.android.gms.internal.ads.zzbki r33, com.google.android.gms.internal.ads.zzbkc r34, com.google.android.gms.internal.ads.zzbjq r35, com.google.android.gms.internal.ads.zzcmk r36) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r21
            r3 = r24
            r4 = r26
            r5 = r27
            r10 = r28
            r11 = r29
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r9 = r35
            r8 = r36
            if (r25 != 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzcex r6 = r0.zzc
            com.google.android.gms.ads.internal.zzb r7 = new com.google.android.gms.ads.internal.zzb
            android.content.Context r6 = r6.getContext()
            r8 = 0
            r7.<init>(r6, r5, r8)
            r8 = r7
            goto L_0x002e
        L_0x002c:
            r8 = r25
        L_0x002e:
            com.google.android.gms.internal.ads.zzcex r6 = r0.zzc
            com.google.android.gms.internal.ads.zzbsc r7 = new com.google.android.gms.internal.ads.zzbsc
            r7.<init>(r6, r4)
            r0.zzz = r7
            r0.zza = r5
            com.google.android.gms.internal.ads.zzbcc r5 = com.google.android.gms.internal.ads.zzbcl.zzbb
            com.google.android.gms.internal.ads.zzbcj r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0055
            com.google.android.gms.internal.ads.zzbie r5 = new com.google.android.gms.internal.ads.zzbie
            r5.<init>(r1)
            java.lang.String r6 = "/adMetadata"
            r0.zzB(r6, r5)
        L_0x0055:
            if (r2 == 0) goto L_0x0061
            com.google.android.gms.internal.ads.zzbig r5 = new com.google.android.gms.internal.ads.zzbig
            r5.<init>(r2)
            java.lang.String r6 = "/appEvent"
            r0.zzB(r6, r5)
        L_0x0061:
            java.lang.String r5 = "/backButton"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzj
            r0.zzB(r5, r6)
            java.lang.String r5 = "/refresh"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzk
            r0.zzB(r5, r6)
            java.lang.String r5 = "/canOpenApp"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzb
            r0.zzB(r5, r6)
            java.lang.String r5 = "/canOpenURLs"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zza
            r0.zzB(r5, r6)
            java.lang.String r5 = "/canOpenIntents"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzc
            r0.zzB(r5, r6)
            java.lang.String r5 = "/close"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzd
            r0.zzB(r5, r6)
            java.lang.String r5 = "/customClose"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zze
            r0.zzB(r5, r6)
            java.lang.String r5 = "/instrument"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzn
            r0.zzB(r5, r6)
            java.lang.String r5 = "/delayPageLoaded"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzp
            r0.zzB(r5, r6)
            java.lang.String r5 = "/delayPageClosed"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzq
            r0.zzB(r5, r6)
            java.lang.String r5 = "/getLocationInfo"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzr
            r0.zzB(r5, r6)
            java.lang.String r5 = "/log"
            com.google.android.gms.internal.ads.zzbjp r6 = com.google.android.gms.internal.ads.zzbjo.zzg
            r0.zzB(r5, r6)
            com.google.android.gms.internal.ads.zzbjw r5 = new com.google.android.gms.internal.ads.zzbjw
            com.google.android.gms.internal.ads.zzbsc r6 = r0.zzz
            r5.<init>(r8, r6, r4)
            java.lang.String r4 = "/mraid"
            r0.zzB(r4, r5)
            com.google.android.gms.internal.ads.zzbsh r4 = r0.zzx
            if (r4 == 0) goto L_0x00ca
            java.lang.String r5 = "/mraidLoaded"
            r0.zzB(r5, r4)
        L_0x00ca:
            com.google.android.gms.internal.ads.zzbkb r7 = new com.google.android.gms.internal.ads.zzbkb
            com.google.android.gms.internal.ads.zzbsc r6 = r0.zzz
            r4 = r7
            r5 = r8
            r2 = r7
            r7 = r28
            r1 = r36
            r16 = r8
            r8 = r30
            r9 = r36
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r4 = "/open"
            r0.zzB(r4, r2)
            com.google.android.gms.internal.ads.zzcdf r2 = new com.google.android.gms.internal.ads.zzcdf
            r2.<init>()
            java.lang.String r4 = "/precache"
            r0.zzB(r4, r2)
            java.lang.String r2 = "/touch"
            com.google.android.gms.internal.ads.zzbjp r4 = com.google.android.gms.internal.ads.zzbjo.zzi
            r0.zzB(r2, r4)
            java.lang.String r2 = "/video"
            com.google.android.gms.internal.ads.zzbjp r4 = com.google.android.gms.internal.ads.zzbjo.zzl
            r0.zzB(r2, r4)
            java.lang.String r2 = "/videoMeta"
            com.google.android.gms.internal.ads.zzbjp r4 = com.google.android.gms.internal.ads.zzbjo.zzm
            r0.zzB(r2, r4)
            java.lang.String r2 = "/httpTrack"
            java.lang.String r4 = "/click"
            if (r10 == 0) goto L_0x011b
            if (r11 == 0) goto L_0x011b
            com.google.android.gms.internal.ads.zzfcr r5 = new com.google.android.gms.internal.ads.zzfcr
            r5.<init>(r13, r1, r11, r10)
            r0.zzB(r4, r5)
            com.google.android.gms.internal.ads.zzfcs r1 = new com.google.android.gms.internal.ads.zzfcs
            r1.<init>(r11, r10)
            r0.zzB(r2, r1)
            goto L_0x0128
        L_0x011b:
            com.google.android.gms.internal.ads.zzbin r5 = new com.google.android.gms.internal.ads.zzbin
            r5.<init>(r13, r1)
            r0.zzB(r4, r5)
            com.google.android.gms.internal.ads.zzbjp r1 = com.google.android.gms.internal.ads.zzbjo.zzf
            r0.zzB(r2, r1)
        L_0x0128:
            com.google.android.gms.internal.ads.zzcex r1 = r0.zzc
            com.google.android.gms.internal.ads.zzbyi r2 = com.google.android.gms.ads.internal.zzv.zzo()
            android.content.Context r1 = r1.getContext()
            boolean r1 = r2.zzp(r1)
            if (r1 == 0) goto L_0x015d
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.zzcex r2 = r0.zzc
            com.google.android.gms.internal.ads.zzfbo r2 = r2.zzD()
            if (r2 == 0) goto L_0x014d
            com.google.android.gms.internal.ads.zzcex r1 = r0.zzc
            com.google.android.gms.internal.ads.zzfbo r1 = r1.zzD()
            java.util.Map r1 = r1.zzaw
        L_0x014d:
            com.google.android.gms.internal.ads.zzcex r2 = r0.zzc
            com.google.android.gms.internal.ads.zzbjv r4 = new com.google.android.gms.internal.ads.zzbjv
            android.content.Context r2 = r2.getContext()
            r4.<init>(r2, r1)
            java.lang.String r1 = "/logScionEvent"
            r0.zzB(r1, r4)
        L_0x015d:
            if (r3 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.zzbjr r1 = new com.google.android.gms.internal.ads.zzbjr
            r1.<init>(r3)
            java.lang.String r2 = "/setInterstitialProperties"
            r0.zzB(r2, r1)
        L_0x0169:
            if (r12 == 0) goto L_0x0182
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zziN
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0182
            java.lang.String r1 = "/inspectorNetworkExtras"
            r0.zzB(r1, r12)
        L_0x0182:
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzjg
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x019b
            if (r14 == 0) goto L_0x019b
            java.lang.String r1 = "/shareSheet"
            r0.zzB(r1, r14)
        L_0x019b:
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzjl
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01b4
            if (r15 == 0) goto L_0x01b4
            java.lang.String r1 = "/inspectorOutOfContextTest"
            r0.zzB(r1, r15)
        L_0x01b4:
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzjp
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01cf
            r1 = r35
            if (r1 == 0) goto L_0x01cf
            java.lang.String r2 = "/inspectorStorage"
            r0.zzB(r2, r1)
        L_0x01cf:
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzlr
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0204
            java.lang.String r1 = "/bindPlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.internal.ads.zzbjo.zzu
            r0.zzB(r1, r2)
            java.lang.String r1 = "/presentPlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.internal.ads.zzbjo.zzv
            r0.zzB(r1, r2)
            java.lang.String r1 = "/expandPlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.internal.ads.zzbjo.zzw
            r0.zzB(r1, r2)
            java.lang.String r1 = "/collapsePlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.internal.ads.zzbjo.zzx
            r0.zzB(r1, r2)
            java.lang.String r1 = "/closePlayStoreOverlay"
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.internal.ads.zzbjo.zzy
            r0.zzB(r1, r2)
        L_0x0204:
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzdr
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0224
            java.lang.String r1 = "/setPAIDPersonalizationEnabled"
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.internal.ads.zzbjo.zzA
            r0.zzB(r1, r2)
            java.lang.String r1 = "/resetPAID"
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.internal.ads.zzbjo.zzz
            r0.zzB(r1, r2)
        L_0x0224:
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzlL
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0254
            com.google.android.gms.internal.ads.zzcex r1 = r0.zzc
            com.google.android.gms.internal.ads.zzfbo r2 = r1.zzD()
            if (r2 == 0) goto L_0x0254
            com.google.android.gms.internal.ads.zzfbo r1 = r1.zzD()
            boolean r1 = r1.zzar
            if (r1 == 0) goto L_0x0254
            java.lang.String r1 = "/writeToLocalStorage"
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.internal.ads.zzbjo.zzB
            r0.zzB(r1, r2)
            java.lang.String r1 = "/clearLocalStorageKeys"
            com.google.android.gms.internal.ads.zzbjp r2 = com.google.android.gms.internal.ads.zzbjo.zzC
            r0.zzB(r1, r2)
        L_0x0254:
            r1 = r18
            r0.zzg = r1
            r1 = r20
            r0.zzh = r1
            r1 = r19
            r0.zzk = r1
            r1 = r21
            r0.zzl = r1
            r1 = r22
            r0.zzw = r1
            r7 = r16
            r0.zzy = r7
            r0.zzm = r13
            r1 = r30
            r0.zzA = r1
            r1 = r23
            r0.zzn = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcff.zzV(com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzbif, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzbih, com.google.android.gms.ads.internal.overlay.zzac, boolean, com.google.android.gms.internal.ads.zzbjs, com.google.android.gms.ads.internal.zzb, com.google.android.gms.internal.ads.zzbsj, com.google.android.gms.internal.ads.zzbxu, com.google.android.gms.internal.ads.zzebk, com.google.android.gms.internal.ads.zzfja, com.google.android.gms.internal.ads.zzdrw, com.google.android.gms.internal.ads.zzbkj, com.google.android.gms.internal.ads.zzdds, com.google.android.gms.internal.ads.zzbki, com.google.android.gms.internal.ads.zzbkc, com.google.android.gms.internal.ads.zzbjq, com.google.android.gms.internal.ads.zzcmk):void");
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0168, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0169, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016d, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0170, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0173, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018f, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "AdWebViewClient.interceptRequest.gcache");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e1, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "AdWebViewClient.interceptRequest.gcache");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2 A[SYNTHETIC, Splitter:B:23:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0168 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018f A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e1 A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x023a A[Catch:{ Exception | NoClassDefFoundError -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0289 A[Catch:{ Exception | NoClassDefFoundError -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02ac A[Catch:{ Exception | NoClassDefFoundError -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x017d=Splitter:B:54:0x017d, B:65:0x01cf=Splitter:B:65:0x01cf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r19, java.util.Map r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r3 = "AdWebViewClient.interceptRequest.gcache"
            java.lang.String r0 = "range"
            java.lang.String r4 = "ms"
            java.lang.String r5 = "Cache connection took "
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r6.<init>()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzcex r7 = r1.zzc     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzfbo r7 = r7.zzD()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            if (r7 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzcex r6 = r1.zzc     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzfbo r6 = r6.zzD()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.util.Map r6 = r6.zzaw     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
        L_0x0021:
            com.google.android.gms.internal.ads.zzcex r7 = r1.zzc     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            android.content.Context r7 = r7.getContext()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            boolean r8 = r1.zzE     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyk.zzc(r2, r7, r8, r6)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            boolean r7 = r6.equals(r2)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            if (r7 != 0) goto L_0x003a
            r7 = r20
            android.webkit.WebResourceResponse r0 = r1.zzX(r6, r7)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            return r0
        L_0x003a:
            r7 = r20
            android.net.Uri r6 = android.net.Uri.parse(r19)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzbav r6 = com.google.android.gms.internal.ads.zzbav.zza(r6)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            if (r6 == 0) goto L_0x0298
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r14.<init>()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r9 = "Access-Control-Allow-Origin"
            java.lang.String r10 = "*"
            r14.put(r9, r10)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            android.net.Uri r9 = android.net.Uri.parse(r19)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.util.Set r10 = r9.getQueryParameterNames()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            boolean r10 = r10.contains(r0)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x0097
            r10 = 45
            com.google.android.gms.internal.ads.zzfty r10 = com.google.android.gms.internal.ads.zzfty.zzc(r10)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzfvc r10 = com.google.android.gms.internal.ads.zzfvc.zzb(r10)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r0 = r9.getQueryParameter(r0)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.util.List r0 = r10.zzf(r0)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            int r9 = r0.size()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r10 = 2
            if (r9 != r10) goto L_0x0097
            java.lang.Object r9 = r0.get(r11)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            int r0 = r0 + r13
            if (r9 <= 0) goto L_0x0095
            long r11 = (long) r9     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r6.zzh = r11     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
        L_0x0095:
            int r0 = r0 - r9
            goto L_0x0098
        L_0x0097:
            r0 = -1
        L_0x0098:
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zzeq     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzbcj r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.Object r9 = r11.zza(r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r11 = "X-Afma-Gcache-CachedBytes"
            java.lang.String r12 = "X-Afma-Gcache-IsDownloaded"
            java.lang.String r10 = "X-Afma-Gcache-IsGcacheHit"
            java.lang.String r15 = "X-Afma-Gcache-HasAdditionalMetadataFromReadV2"
            if (r9 == 0) goto L_0x023a
            com.google.android.gms.internal.ads.zzcex r9 = r1.zzc     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r9 = r9.zzr()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r9 = com.google.android.gms.internal.ads.zzfve.zzc(r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r6.zzi = r9     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzcex r9 = r1.zzc     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            int r9 = r9.zzf()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r6.zzj = r9     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            boolean r9 = r6.zzg     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            if (r9 == 0) goto L_0x00d7
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zzes     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzbcj r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.Object r8 = r8.zza(r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            goto L_0x00e3
        L_0x00d7:
            com.google.android.gms.internal.ads.zzbcc r8 = com.google.android.gms.internal.ads.zzbcl.zzer     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzbcj r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.Object r8 = r9.zza(r8)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
        L_0x00e3:
            long r8 = r8.longValue()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.common.util.Clock r16 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r16 = r16.elapsedRealtime()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.ads.internal.zzv.zzd()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzcex r13 = r1.zzc     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            android.content.Context r13 = r13.getContext()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.util.concurrent.Future r6 = com.google.android.gms.internal.ads.zzbbg.zza(r13, r6)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x01cc, TimeoutException -> 0x01ca, InterruptedException -> 0x017a, all -> 0x0176 }
            java.lang.Object r8 = r6.get(r8, r13)     // Catch:{ ExecutionException -> 0x01cc, TimeoutException -> 0x01ca, InterruptedException -> 0x017a, all -> 0x0176 }
            com.google.android.gms.internal.ads.zzbbh r8 = (com.google.android.gms.internal.ads.zzbbh) r8     // Catch:{ ExecutionException -> 0x01cc, TimeoutException -> 0x01ca, InterruptedException -> 0x017a, all -> 0x0176 }
            boolean r9 = r8.zzd()     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            java.lang.String r9 = java.lang.Boolean.toString(r9)     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            r14.put(r15, r9)     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            boolean r9 = r8.zzf()     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            java.lang.String r9 = java.lang.Boolean.toString(r9)     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            r14.put(r10, r9)     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            boolean r9 = r8.zze()     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            java.lang.String r9 = java.lang.Boolean.toString(r9)     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            r14.put(r12, r9)     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            long r9 = r8.zza()     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            java.lang.String r9 = java.lang.Long.toString(r9)     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            r14.put(r11, r9)     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            java.io.InputStream r8 = r8.zzc()     // Catch:{ ExecutionException -> 0x0172, TimeoutException -> 0x0170, InterruptedException -> 0x016c, all -> 0x0168 }
            r9 = -1
            if (r0 == r9) goto L_0x0143
            long r9 = (long) r0
            java.io.InputStream r8 = com.google.android.gms.internal.ads.zzgad.zza(r8, r9)     // Catch:{ ExecutionException -> 0x0141, TimeoutException -> 0x013f, InterruptedException -> 0x013d, all -> 0x0168 }
            goto L_0x0143
        L_0x013d:
            r0 = move-exception
            goto L_0x016e
        L_0x013f:
            r0 = move-exception
            goto L_0x0174
        L_0x0141:
            r0 = move-exception
            goto L_0x0174
        L_0x0143:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r9 = r0.elapsedRealtime()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r9 = r9 - r16
            com.google.android.gms.internal.ads.zzfqw r0 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzcfb r3 = new com.google.android.gms.internal.ads.zzcfb     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r6 = 1
            r3.<init>(r1, r6, r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.post(r3)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.append(r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.append(r4)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            goto L_0x01c4
        L_0x0168:
            r0 = move-exception
            r11 = 1
            goto L_0x0213
        L_0x016c:
            r0 = move-exception
            r8 = 0
        L_0x016e:
            r11 = 1
            goto L_0x017d
        L_0x0170:
            r0 = move-exception
            goto L_0x0173
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            r8 = 0
        L_0x0174:
            r11 = 1
            goto L_0x01cf
        L_0x0176:
            r0 = move-exception
            r11 = 0
            goto L_0x0213
        L_0x017a:
            r0 = move-exception
            r8 = 0
            r11 = 0
        L_0x017d:
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zzev     // Catch:{ all -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbcj r10 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x01c8 }
            java.lang.Object r9 = r10.zza(r9)     // Catch:{ all -> 0x01c8 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x01c8 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x01c8 }
            if (r9 == 0) goto L_0x0196
            com.google.android.gms.internal.ads.zzbzm r9 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x01c8 }
            r9.zzw(r0, r3)     // Catch:{ all -> 0x01c8 }
        L_0x0196:
            r3 = 1
            r6.cancel(r3)     // Catch:{ all -> 0x01c8 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01c8 }
            r0.interrupt()     // Catch:{ all -> 0x01c8 }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r9 = r0.elapsedRealtime()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r9 = r9 - r16
            com.google.android.gms.internal.ads.zzfqw r0 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzcfb r3 = new com.google.android.gms.internal.ads.zzcfb     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r3.<init>(r1, r11, r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.post(r3)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.append(r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.append(r4)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
        L_0x01c4:
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            goto L_0x0210
        L_0x01c8:
            r0 = move-exception
            goto L_0x0213
        L_0x01ca:
            r0 = move-exception
            goto L_0x01cd
        L_0x01cc:
            r0 = move-exception
        L_0x01cd:
            r8 = 0
            r11 = 0
        L_0x01cf:
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zzev     // Catch:{ all -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbcj r10 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x01c8 }
            java.lang.Object r9 = r10.zza(r9)     // Catch:{ all -> 0x01c8 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x01c8 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x01c8 }
            if (r9 == 0) goto L_0x01e8
            com.google.android.gms.internal.ads.zzbzm r9 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x01c8 }
            r9.zzw(r0, r3)     // Catch:{ all -> 0x01c8 }
        L_0x01e8:
            r3 = 1
            r6.cancel(r3)     // Catch:{ all -> 0x01c8 }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r9 = r0.elapsedRealtime()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r9 = r9 - r16
            com.google.android.gms.internal.ads.zzfqw r0 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzcfb r3 = new com.google.android.gms.internal.ads.zzcfb     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r3.<init>(r1, r11, r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.post(r3)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.append(r9)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r0.append(r4)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            goto L_0x01c4
        L_0x0210:
            r15 = r8
            goto L_0x0287
        L_0x0213:
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r2 = r2.elapsedRealtime()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r2 = r2 - r16
            com.google.android.gms.internal.ads.zzfqw r6 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzcfb r7 = new com.google.android.gms.internal.ads.zzcfb     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r7.<init>(r1, r11, r2)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r6.post(r7)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r6.append(r2)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r6.append(r4)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.ads.internal.util.zze.zza(r2)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            throw r0     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
        L_0x023a:
            com.google.android.gms.internal.ads.zzbar r4 = com.google.android.gms.ads.internal.zzv.zzc()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            com.google.android.gms.internal.ads.zzbas r4 = r4.zzb(r6)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            if (r4 == 0) goto L_0x0286
            boolean r5 = r4.zze()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            if (r5 == 0) goto L_0x0286
            boolean r5 = r4.zzd()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r14.put(r15, r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            boolean r5 = r4.zzg()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r14.put(r10, r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            boolean r5 = r4.zzf()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r14.put(r12, r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            long r5 = r4.zza()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r14.put(r11, r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.io.InputStream r4 = r4.zzc()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r3 = -1
            if (r0 == r3) goto L_0x0284
            long r5 = (long) r0     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.io.InputStream r0 = com.google.android.gms.internal.ads.zzgad.zza(r4, r5)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            r15 = r0
            goto L_0x0287
        L_0x0284:
            r15 = r4
            goto L_0x0287
        L_0x0286:
            r15 = 0
        L_0x0287:
            if (r15 == 0) goto L_0x0298
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r13 = "OK"
            r12 = 200(0xc8, float:2.8E-43)
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            return r0
        L_0x0298:
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzl.zzk()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            if (r0 == 0) goto L_0x02b1
            com.google.android.gms.internal.ads.zzbdv r0 = com.google.android.gms.internal.ads.zzbeh.zzb     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.Object r0 = r0.zze()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            if (r0 == 0) goto L_0x02b1
            android.webkit.WebResourceResponse r0 = r18.zzX(r19, r20)     // Catch:{ Exception -> 0x02b5, NoClassDefFoundError -> 0x02b3 }
            return r0
        L_0x02b1:
            r2 = 0
            return r2
        L_0x02b3:
            r0 = move-exception
            goto L_0x02b6
        L_0x02b5:
            r0 = move-exception
        L_0x02b6:
            java.lang.String r2 = "AdWebViewClient.interceptRequest"
            com.google.android.gms.internal.ads.zzbzm r3 = com.google.android.gms.ads.internal.zzv.zzp()
            r3.zzw(r0, r2)
            android.webkit.WebResourceResponse r0 = zzW()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcff.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final zzb zzd() {
        return this.zzy;
    }

    public final void zzdd() {
        zzdds zzdds = this.zzm;
        if (zzdds != null) {
            zzdds.zzdd();
        }
    }

    public final zzdrw zze() {
        return this.zzA;
    }

    public final void zzh() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && this.zzc.zzm() != null) {
                zzbcs.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcgn zzcgn = this.zzi;
            boolean z = false;
            if (!this.zzC && !this.zzo) {
                z = true;
            }
            zzcgn.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzi() {
        zzbxu zzbxu = this.zza;
        if (zzbxu != null) {
            zzbxu.zze();
            this.zza = null;
        }
        zzZ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbsc zzbsc = this.zzz;
            if (zzbsc != null) {
                zzbsc.zza(true);
                this.zzz = null;
            }
        }
    }

    public final void zzj(boolean z) {
        this.zzE = z;
    }

    public final void zzk(Uri uri) {
        String str;
        zze.zza("Received GMSG: ".concat(String.valueOf(String.valueOf(uri))));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzgB)).booleanValue() && zzv.zzp().zzg() != null) {
                if (path == null || path.length() < 2) {
                    str = "null";
                } else {
                    str = path.substring(1);
                }
                zzbzw.zza.execute(new zzcfa(str));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfB)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzbe.zzc().zza(zzbcl.zzfD)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgch.zzr(zzv.zzq().zzb(uri), new zzcfd(this, list, path, uri), zzbzw.zzf);
                return;
            }
        }
        zzv.zzq();
        zzY(zzs.zzP(uri), list, path);
    }

    public final void zzl() {
        zzbbj zzbbj = this.zzd;
        if (zzbbj != null) {
            zzbbj.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzh();
        this.zzc.destroy();
    }

    public final void zzm() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzh();
    }

    public final void zzn() {
        this.zzD--;
        zzh();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo() {
        this.zzc.zzad();
        zzm zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(View view, zzbxu zzbxu, int i) {
        zzaa(view, zzbxu, i - 1);
    }

    public final void zzr(int i, int i2, boolean z) {
        zzbsh zzbsh = this.zzx;
        if (zzbsh != null) {
            zzbsh.zzb(i, i2);
        }
        zzbsc zzbsc = this.zzz;
        if (zzbsc != null) {
            zzbsc.zzd(i, i2, false);
        }
    }

    public final void zzs() {
        zzbxu zzbxu = this.zza;
        if (zzbxu != null) {
            WebView zzG2 = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(zzG2)) {
                zzaa(zzG2, zzbxu, 10);
                return;
            }
            zzZ();
            zzcfc zzcfc = new zzcfc(this, zzbxu);
            this.zzH = zzcfc;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcfc);
        }
    }

    public final void zzu() {
        zzdds zzdds = this.zzm;
        if (zzdds != null) {
            zzdds.zzu();
        }
    }

    public final void zzv(zzc zzc2, boolean z, boolean z2, String str) {
        zzdds zzdds;
        zzcex zzcex = this.zzc;
        boolean zzaF = zzcex.zzaF();
        boolean z3 = false;
        boolean z4 = zzac(zzaF, zzcex) || z2;
        if (z4 || !z) {
            z3 = true;
        }
        zza zza2 = z4 ? null : this.zzg;
        zzr zzr2 = zzaF ? null : this.zzh;
        zzac zzac = this.zzw;
        zzcex zzcex2 = this.zzc;
        VersionInfoParcel zzn2 = zzcex2.zzn();
        if (z3) {
            zzdds = null;
        } else {
            zzdds = this.zzm;
        }
        zzy(new AdOverlayInfoParcel(zzc2, zza2, zzr2, zzac, zzn2, zzcex2, zzdds, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzebv zzebv = this.zzG;
        zzcex zzcex = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcex, zzcex.zzn(), str, str2, 14, zzebv));
    }

    public final void zzx(boolean z, int i, boolean z2) {
        zzdds zzdds;
        zzcex zzcex = this.zzc;
        boolean zzac = zzac(zzcex.zzaF(), zzcex);
        boolean z3 = true;
        if (!zzac && z2) {
            z3 = false;
        }
        zza zza2 = zzac ? null : this.zzg;
        zzr zzr2 = this.zzh;
        zzac zzac2 = this.zzw;
        zzcex zzcex2 = this.zzc;
        VersionInfoParcel zzn2 = zzcex2.zzn();
        if (z3) {
            zzdds = null;
        } else {
            zzdds = this.zzm;
        }
        zzy(new AdOverlayInfoParcel(zza2, zzr2, zzac2, zzcex2, z, i, zzn2, zzdds, zzab(this.zzc) ? this.zzG : null));
    }

    public final void zzy(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc2;
        zzbsc zzbsc = this.zzz;
        boolean zzf2 = zzbsc != null ? zzbsc.zzf() : false;
        zzv.zzj();
        zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zzf2, this.zzA);
        zzbxu zzbxu = this.zza;
        if (zzbxu != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzc2 = adOverlayInfoParcel.zza) != null) {
                str = zzc2.zzb;
            }
            zzbxu.zzh(str);
        }
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zza zza2;
        zzdds zzdds;
        zzcex zzcex = this.zzc;
        boolean zzaF = zzcex.zzaF();
        boolean zzac = zzac(zzaF, zzcex);
        boolean z3 = true;
        if (!zzac && z2) {
            z3 = false;
        }
        if (zzac) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        zzcfe zzcfe = zzaF ? null : new zzcfe(this.zzc, this.zzh);
        zzbif zzbif = this.zzk;
        zzbih zzbih = this.zzl;
        zzac zzac2 = this.zzw;
        zzcex zzcex2 = this.zzc;
        VersionInfoParcel zzn2 = zzcex2.zzn();
        if (z3) {
            zzdds = null;
        } else {
            zzdds = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza2, (zzr) zzcfe, zzbif, zzbih, zzac2, zzcex2, z, i, str, str2, zzn2, zzdds, (zzbsx) zzab(this.zzc) ? this.zzG : null);
        zzy(adOverlayInfoParcel);
    }
}
