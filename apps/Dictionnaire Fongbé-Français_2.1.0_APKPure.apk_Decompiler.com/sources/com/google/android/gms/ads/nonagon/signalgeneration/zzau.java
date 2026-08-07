package com.google.android.gms.ads.nonagon.signalgeneration;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzdre;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzfcn;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzfja;
import com.google.android.gms.internal.ads.zzfve;
import com.google.android.gms.internal.ads.zzgby;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzgcs;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzau extends zzbyt {
    protected static final List zza = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
    protected static final List zzb = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    protected static final List zzc = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
    protected static final List zzd = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    public static final /* synthetic */ int zze = 0;
    /* access modifiers changed from: private */
    public final String zzA;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final AtomicBoolean zzG = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final AtomicInteger zzH = new AtomicInteger(0);
    private final zzbdq zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final zzcgx zzf;
    /* access modifiers changed from: private */
    public Context zzg;
    private final zzava zzh;
    private final zzfcn zzi;
    private final zzfdi zzj;
    private final zzgcs zzk;
    private final ScheduledExecutorService zzl;
    private zzbuc zzm;
    private Point zzn = new Point();
    private Point zzo = new Point();
    /* access modifiers changed from: private */
    public final zzdsb zzp;
    /* access modifiers changed from: private */
    public final zzfja zzq;
    /* access modifiers changed from: private */
    public final boolean zzr;
    /* access modifiers changed from: private */
    public final boolean zzs;
    /* access modifiers changed from: private */
    public final boolean zzt;
    /* access modifiers changed from: private */
    public final boolean zzu;
    /* access modifiers changed from: private */
    public final String zzv;
    /* access modifiers changed from: private */
    public final String zzw;
    /* access modifiers changed from: private */
    public final AtomicInteger zzx = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final VersionInfoParcel zzy;
    /* access modifiers changed from: private */
    public String zzz;

    zzau(zzcgx zzcgx, Context context, zzava zzava, zzfdi zzfdi, zzgcs zzgcs, ScheduledExecutorService scheduledExecutorService, zzdsb zzdsb, zzfja zzfja, VersionInfoParcel versionInfoParcel, zzbdq zzbdq, zzfcn zzfcn, zzo zzo2, zzf zzf2) {
        List list;
        this.zzf = zzcgx;
        this.zzg = context;
        this.zzh = zzava;
        this.zzi = zzfcn;
        this.zzj = zzfdi;
        this.zzk = zzgcs;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdsb;
        this.zzq = zzfja;
        this.zzy = versionInfoParcel;
        this.zzI = zzbdq;
        this.zzr = ((Boolean) zzbe.zzc().zza(zzbcl.zzha)).booleanValue();
        this.zzs = ((Boolean) zzbe.zzc().zza(zzbcl.zzgZ)).booleanValue();
        this.zzt = ((Boolean) zzbe.zzc().zza(zzbcl.zzhc)).booleanValue();
        this.zzu = ((Boolean) zzbe.zzc().zza(zzbcl.zzhe)).booleanValue();
        this.zzv = (String) zzbe.zzc().zza(zzbcl.zzhd);
        this.zzw = (String) zzbe.zzc().zza(zzbcl.zzhf);
        this.zzA = (String) zzbe.zzc().zza(zzbcl.zzhg);
        this.zzJ = zzo2;
        this.zzK = zzf2;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhh)).booleanValue()) {
            this.zzB = zzaa((String) zzbe.zzc().zza(zzbcl.zzhi));
            this.zzC = zzaa((String) zzbe.zzc().zza(zzbcl.zzhj));
            this.zzD = zzaa((String) zzbe.zzc().zza(zzbcl.zzhk));
            list = zzaa((String) zzbe.zzc().zza(zzbcl.zzhl));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            list = zzd;
        }
        this.zzE = list;
    }

    static /* bridge */ /* synthetic */ void zzH(zzau zzau, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzau.zzO((Uri) it.next())) {
                zzau.zzx.getAndIncrement();
                return;
            }
        }
    }

    static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzR(android.content.Context r14, java.lang.String r15, java.lang.String r16, com.google.android.gms.ads.internal.client.zzs r17, com.google.android.gms.ads.internal.client.zzm r18, int r19, java.lang.String r20, android.os.Bundle r21, com.google.android.gms.internal.ads.zzbyy r22) {
        /*
            r13 = this;
            r0 = r14
            r1 = r16
            com.google.android.gms.internal.ads.zzfch r2 = new com.google.android.gms.internal.ads.zzfch
            r2.<init>()
            java.lang.String r3 = "REWARDED"
            boolean r4 = r3.equals(r1)
            java.lang.String r5 = "REWARDED_INTERSTITIAL"
            r6 = 3
            r7 = 2
            if (r4 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzfbu r4 = r2.zzp()
            r4.zza(r7)
            goto L_0x0029
        L_0x001c:
            boolean r4 = r5.equals(r1)
            if (r4 == 0) goto L_0x0029
            com.google.android.gms.internal.ads.zzfbu r4 = r2.zzp()
            r4.zza(r6)
        L_0x0029:
            r4 = r13
            com.google.android.gms.internal.ads.zzcgx r8 = r4.zzf
            com.google.android.gms.ads.nonagon.signalgeneration.zzab r8 = r8.zzp()
            com.google.android.gms.internal.ads.zzcva r9 = new com.google.android.gms.internal.ads.zzcva
            r9.<init>()
            r9.zzf(r14)
            if (r15 != 0) goto L_0x003d
            java.lang.String r10 = "adUnitId"
            goto L_0x003e
        L_0x003d:
            r10 = r15
        L_0x003e:
            r2.zzt(r10)
            if (r18 != 0) goto L_0x004d
            com.google.android.gms.ads.internal.client.zzn r10 = new com.google.android.gms.ads.internal.client.zzn
            r10.<init>()
            com.google.android.gms.ads.internal.client.zzm r10 = r10.zza()
            goto L_0x004f
        L_0x004d:
            r10 = r18
        L_0x004f:
            r2.zzH(r10)
            r10 = 1
            if (r17 != 0) goto L_0x00b5
            int r11 = r16.hashCode()
            r12 = 4
            switch(r11) {
                case -1999289321: goto L_0x0082;
                case -428325382: goto L_0x0078;
                case 543046670: goto L_0x0070;
                case 1854800829: goto L_0x0068;
                case 1951953708: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x008c
        L_0x005e:
            java.lang.String r3 = "BANNER"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r3 = 0
            goto L_0x008d
        L_0x0068:
            boolean r3 = r1.equals(r5)
            if (r3 == 0) goto L_0x008c
            r3 = 2
            goto L_0x008d
        L_0x0070:
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r3 = 1
            goto L_0x008d
        L_0x0078:
            java.lang.String r3 = "APP_OPEN_AD"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r3 = 4
            goto L_0x008d
        L_0x0082:
            java.lang.String r3 = "NATIVE"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r3 = 3
            goto L_0x008d
        L_0x008c:
            r3 = -1
        L_0x008d:
            if (r3 == 0) goto L_0x00ac
            if (r3 == r10) goto L_0x00a7
            if (r3 == r7) goto L_0x00a7
            if (r3 == r6) goto L_0x00a2
            if (r3 == r12) goto L_0x009d
            com.google.android.gms.ads.internal.client.zzs r0 = new com.google.android.gms.ads.internal.client.zzs
            r0.<init>()
            goto L_0x00b7
        L_0x009d:
            com.google.android.gms.ads.internal.client.zzs r0 = com.google.android.gms.ads.internal.client.zzs.zzb()
            goto L_0x00b7
        L_0x00a2:
            com.google.android.gms.ads.internal.client.zzs r0 = com.google.android.gms.ads.internal.client.zzs.zzc()
            goto L_0x00b7
        L_0x00a7:
            com.google.android.gms.ads.internal.client.zzs r0 = com.google.android.gms.ads.internal.client.zzs.zzd()
            goto L_0x00b7
        L_0x00ac:
            com.google.android.gms.ads.internal.client.zzs r3 = new com.google.android.gms.ads.internal.client.zzs
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.BANNER
            r3.<init>((android.content.Context) r14, (com.google.android.gms.ads.AdSize) r5)
            r0 = r3
            goto L_0x00b7
        L_0x00b5:
            r0 = r17
        L_0x00b7:
            r2.zzs(r0)
            r2.zzz(r10)
            r0 = r21
            r2.zzA(r0)
            com.google.android.gms.internal.ads.zzfcj r0 = r2.zzJ()
            r9.zzk(r0)
            r0 = r19
            r9.zzi(r0)
            com.google.android.gms.internal.ads.zzcvc r0 = r9.zzl()
            r8.zza(r0)
            com.google.android.gms.ads.nonagon.signalgeneration.zzax r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzax
            r0.<init>()
            r0.zzb(r1)
            r1 = r20
            r0.zzc(r1)
            r1 = r22
            r0.zzd(r1)
            com.google.android.gms.ads.nonagon.signalgeneration.zzaz r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            r2 = 0
            r1.<init>(r0, r2)
            r8.zzb(r1)
            com.google.android.gms.internal.ads.zzdbk r0 = new com.google.android.gms.internal.ads.zzdbk
            r0.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzac r0 = r8.zzc()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzR(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzs, com.google.android.gms.ads.internal.client.zzm, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.zzbyy):com.google.android.gms.ads.nonagon.signalgeneration.zzac");
    }

    private final ListenableFuture zzS(String str) {
        zzdnl[] zzdnlArr = new zzdnl[1];
        ListenableFuture zzn2 = zzgch.zzn(this.zzj.zza(), new zzaf(this, zzdnlArr, str), this.zzk);
        zzn2.addListener(new zzag(this, zzdnlArr), this.zzk);
        return (zzgby) zzgch.zze((zzgby) zzgch.zzm((zzgby) zzgch.zzo(zzgby.zzu(zzn2), (long) ((Integer) zzbe.zzc().zza(zzbcl.zzhy)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzam(), this.zzk), Exception.class, new zzan(), this.zzk);
    }

    /* access modifiers changed from: private */
    public final void zzT() {
        ListenableFuture listenableFuture;
        if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
            this.zzJ.zzb();
            return;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkV)).booleanValue()) {
            listenableFuture = zzgch.zzk(new zzad(this), zzbzw.zza);
        } else {
            listenableFuture = zzR(this.zzg, (String) null, AdFormat.BANNER.name(), (zzs) null, (zzm) null, 0, (String) null, new Bundle(), (zzbyy) null).zzb();
        }
        zzgch.zzr(listenableFuture, new zzat(this), this.zzf.zzC());
    }

    private final void zzU() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzju)).booleanValue()) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjx)).booleanValue()) {
                if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjB)).booleanValue() || !this.zzF.getAndSet(true)) {
                    zzT();
                }
            }
        }
    }

    private final void zzV(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt, boolean z) {
        ListenableFuture listenableFuture;
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            zzo.zzj("The updating URL feature is not enabled.");
            try {
                zzbtt.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                zzo.zzh("", e);
            }
        } else {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (zzO((Uri) it.next())) {
                    i++;
                }
            }
            if (i > 1) {
                zzo.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                if (!zzO(uri)) {
                    zzo.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                    listenableFuture = zzgch.zzh(uri);
                } else {
                    listenableFuture = this.zzk.zzb(new zzah(this, uri, iObjectWrapper));
                    if (zzY()) {
                        listenableFuture = zzgch.zzn(listenableFuture, new zzai(this), this.zzk);
                    } else {
                        zzo.zzi("Asset view map is empty.");
                    }
                }
                arrayList.add(listenableFuture);
            }
            zzgch.zzr(zzgch.zzd(arrayList), new zzas(this, zzbtt, z), this.zzf.zzC());
        }
    }

    private final void zzW(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt, boolean z) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            try {
                zzbtt.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                zzo.zzh("", e);
            }
        } else {
            ListenableFuture zzb2 = this.zzk.zzb(new zzao(this, list, iObjectWrapper));
            if (zzY()) {
                zzb2 = zzgch.zzn(zzb2, new zzap(this), this.zzk);
            } else {
                zzo.zzi("Asset view map is empty.");
            }
            zzgch.zzr(zzb2, new zzar(this, zzbtt, z), this.zzf.zzC());
        }
    }

    private static boolean zzX(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzY() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzbuc r0 = r1.zzm
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = r0.zzb
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzY():boolean");
    }

    /* access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    private static final List zzaa(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfve.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzfhh zzr(ListenableFuture listenableFuture, zzbyy zzbyy) {
        String str;
        if (!zzfhk.zza() || !((Boolean) zzbee.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfhh zza2 = ((zzac) zzgch.zzp(listenableFuture)).zza();
            zza2.zzd(new ArrayList(Collections.singletonList(zzbyy.zzb)));
            zzm zzm2 = zzbyy.zzd;
            if (zzm2 == null) {
                str = "";
            } else {
                str = zzm2.zzp;
            }
            zza2.zzb(str);
            zza2.zzf(zzbyy.zzd.zzm);
            return zza2;
        } catch (ExecutionException e) {
            zzv.zzp().zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zzh2 = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null) : "";
        if (!TextUtils.isEmpty(zzh2)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzP(uri)) {
                    zzo.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzZ(uri, "ms", zzh2));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(zzdnl[] zzdnlArr) {
        zzdnl zzdnl = zzdnlArr[0];
        if (zzdnl != null) {
            this.zzj.zzb(zzgch.zzh(zzdnl));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzO(Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzP(Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjH)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        this.zzI.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2), str, (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3));
        if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
            this.zzJ.zzb();
        }
        if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
            this.zzK.zzb();
        }
        return ObjectWrapper.wrap(this.zzI.zzb());
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzbyy zzbyy, zzbyr zzbyr) {
        ListenableFuture listenableFuture;
        ListenableFuture listenableFuture2;
        ListenableFuture listenableFuture3;
        ListenableFuture listenableFuture4;
        Bundle bundle = new Bundle();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            bundle.putLong(zzdre.PUBLIC_API_CALL.zza(), zzbyy.zzd.zzz);
            bundle.putLong(zzdre.DYNAMITE_ENTER.zza(), zzv.zzC().currentTimeMillis());
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfgw zza2 = zzfgv.zza(context, 22);
        zza2.zzi();
        int i = (!((Boolean) zzbe.zzc().zza(zzbcl.zzhq)).booleanValue() || !zzbyy.zzd.zzc.getBoolean("optimize_for_app_start", false) || !Objects.equals(zzaa.zzc(zzbyy.zzd), "requester_type_8")) ? 0 : zzbyy.zze == 2 ? 2 : 1;
        if ("UNKNOWN".equals(zzbyy.zzb)) {
            List arrayList = new ArrayList();
            if (!((String) zzbe.zzc().zza(zzbcl.zzhp)).isEmpty()) {
                arrayList = Arrays.asList(((String) zzbe.zzc().zza(zzbcl.zzhp)).split(","));
            }
            if (arrayList.contains(zzaa.zzc(zzbyy.zzd))) {
                listenableFuture4 = zzgch.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                listenableFuture3 = zzgch.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                listenableFuture = listenableFuture4;
                listenableFuture2 = listenableFuture3;
                zzgch.zzr(listenableFuture2, new zzaq(this, listenableFuture, zzbyy, zzbyr, zza2), this.zzf.zzC());
            }
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkV)).booleanValue()) {
            listenableFuture4 = zzbzw.zza.zzb(new zzak(this, zzbyy, i, bundle));
            listenableFuture3 = zzgch.zzn(listenableFuture4, new zzal(), zzbzw.zza);
            listenableFuture = listenableFuture4;
            listenableFuture2 = listenableFuture3;
            zzgch.zzr(listenableFuture2, new zzaq(this, listenableFuture, zzbyy, zzbyr, zza2), this.zzf.zzC());
        }
        zzac zzR = zzR(this.zzg, zzbyy.zza, zzbyy.zzb, zzbyy.zzc, zzbyy.zzd, i, zzbyy.zzf, bundle, zzbyy);
        ListenableFuture zzh2 = zzgch.zzh(zzR);
        listenableFuture2 = zzR.zzb();
        listenableFuture = zzh2;
        zzgch.zzr(listenableFuture2, new zzaq(this, listenableFuture, zzbyy, zzbyr, zza2), this.zzf.zzC());
    }

    public final void zzg(zzbuc zzbuc) {
        this.zzm = zzbuc;
        this.zzj.zzc(1);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt) {
        zzV(list, iObjectWrapper, zzbtt, true);
    }

    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt) {
        zzW(list, iObjectWrapper, zzbtt, true);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjt)).booleanValue()) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzho)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zzo.zzg("The webView cannot be null.");
                return;
            }
            zzj zzj2 = new zzj(webView, this.zzK, zzbzw.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, this.zzK, zzj2), "gmaSdk");
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzjD)).booleanValue()) {
                zzv.zzp().zzs();
            }
            if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                this.zzK.zzb();
                if (((Boolean) zzbeq.zzb.zze()).booleanValue()) {
                    zzbzw.zzd.scheduleWithFixedDelay(new zzi(zzj2), 0, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzjE)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzho)).booleanValue()) {
                zzU();
            }
        }
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        View view;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbuc zzbuc = this.zzm;
            if (zzbuc == null) {
                view = null;
            } else {
                view = zzbuc.zza;
            }
            this.zzn = zzbv.zza(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) this.zzn.x, (float) this.zzn.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt) {
        zzV(list, iObjectWrapper, zzbtt, false);
    }

    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt) {
        zzW(list, iObjectWrapper, zzbtt, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Uri zzn(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfcn zzfcn;
        try {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || (zzfcn = this.zzi) == null) {
                uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
            } else {
                uri = zzfcn.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
            }
        } catch (zzavb e) {
            zzo.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzac zzq(zzbyy zzbyy, int i, Bundle bundle) throws Exception {
        return zzR(this.zzg, zzbyy.zza, zzbyy.zzb, zzbyy.zzc, zzbyy.zzd, i, zzbyy.zzf, bundle, zzbyy);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzu() throws Exception {
        return zzR(this.zzg, (String) null, AdFormat.BANNER.name(), (zzs) null, (zzm) null, 0, (String) null, new Bundle(), (zzbyy) null).zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzv(zzdnl[] zzdnlArr, String str, zzdnl zzdnl) throws Exception {
        zzdnlArr[0] = zzdnl;
        Context context = this.zzg;
        zzbuc zzbuc = this.zzm;
        Map map = zzbuc.zzb;
        JSONObject zzd2 = zzbv.zzd(context, map, map, zzbuc.zza, (ImageView.ScaleType) null);
        JSONObject zzg2 = zzbv.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf2 = zzbv.zzf(this.zzm.zza);
        JSONObject zze2 = zzbv.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg2);
        jSONObject.put("scroll_view_signal", zzf2);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbv.zzc((String) null, this.zzg, this.zzo, this.zzn));
        }
        return zzdnl.zzg(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzw(ArrayList arrayList) throws Exception {
        return zzgch.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzae(this, arrayList), this.zzk);
    }
}
