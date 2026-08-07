package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdsb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzo {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzdsb zzd;
    private final ExecutorService zze;

    zzo(Context context, zzdsb zzdsb, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdsb;
        this.zze = executorService;
    }

    private final void zzh(boolean z) {
        Map map = this.zzb;
        Boolean valueOf = Boolean.valueOf(z);
        if (!map.containsKey(valueOf)) {
            this.zzb.put(valueOf, new ArrayList());
            this.zze.submit(new zzm(this, z));
        }
    }

    private final void zzi(zzq zzq, Pair pair, boolean z) {
        zzq.zzd();
        QueryInfo zzb2 = zzq.zzb();
        if (zzb2 != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zzb2);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzq.zzc());
        }
        zzaa.zzd(this.zzd, (zzdrq) null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(zzv.zzC().currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(zzq.zzb() != null)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[SYNTHETIC, Splitter:B:18:0x007c] */
    /* renamed from: zzj */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzd(boolean r8, boolean r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0085 }
            r0.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = "query_info_type"
            java.lang.String r2 = "requester_type_6"
            r0.putString(r1, r2)     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = "accept_3p_cookie"
            r0.putBoolean(r1, r8)     // Catch:{ all -> 0x0085 }
            java.util.Map r1 = r7.zza     // Catch:{ all -> 0x0085 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0085 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzq r1 = (com.google.android.gms.ads.nonagon.signalgeneration.zzq) r1     // Catch:{ all -> 0x0085 }
            r3 = 0
            if (r9 == 0) goto L_0x002c
            if (r1 != 0) goto L_0x0024
            goto L_0x002c
        L_0x0024:
            int r9 = r1.zza()     // Catch:{ all -> 0x0085 }
            int r3 = r9 + 1
            r4 = r3
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            java.util.Map r9 = r7.zza     // Catch:{ all -> 0x0085 }
            java.lang.Object r9 = r9.get(r2)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzq r9 = (com.google.android.gms.ads.nonagon.signalgeneration.zzq) r9     // Catch:{ all -> 0x0085 }
            if (r9 != 0) goto L_0x003a
            r9 = 0
        L_0x0038:
            r5 = r9
            goto L_0x0043
        L_0x003a:
            boolean r9 = r9.zzf()     // Catch:{ all -> 0x0085 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0085 }
            goto L_0x0038
        L_0x0043:
            com.google.android.gms.internal.ads.zzdsb r6 = r7.zzd     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzp r9 = new com.google.android.gms.ads.nonagon.signalgeneration.zzp     // Catch:{ all -> 0x0085 }
            r1 = r9
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.AdRequest$Builder r8 = new com.google.android.gms.ads.AdRequest$Builder     // Catch:{ all -> 0x0085 }
            r8.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r1 = com.google.ads.mediation.admob.AdMobAdapter.class
            com.google.android.gms.ads.AbstractAdRequestBuilder r8 = r8.addNetworkExtrasBundle(r1, r0)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.AdRequest$Builder r8 = (com.google.android.gms.ads.AdRequest.Builder) r8     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.AdRequest r8 = r8.build()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzkV     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x0085 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x0085 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0085 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x007c
            java.util.concurrent.ExecutorService r0 = r7.zze     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzn r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzn     // Catch:{ all -> 0x0085 }
            r1.<init>(r7, r8, r9)     // Catch:{ all -> 0x0085 }
            r0.submit(r1)     // Catch:{ all -> 0x0085 }
            monitor-exit(r7)
            return
        L_0x007c:
            android.content.Context r0 = r7.zzc     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.BANNER     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.query.QueryInfo.generate(r0, r1, r8, r9)     // Catch:{ all -> 0x0085 }
            monitor-exit(r7)
            return
        L_0x0085:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0085 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzo.zzd(boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(AdRequest adRequest, zzp zzp) throws Exception {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzp);
        return true;
    }

    public final synchronized void zzb() {
        zzh(true);
        zzh(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(boolean z) {
        zzd(z, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Object obj, Pair pair) {
        CookieManager zza2;
        boolean z = false;
        if ((obj instanceof WebView) && (zza2 = zzv.zzr().zza(this.zzc)) != null) {
            z = zza2.acceptThirdPartyCookies((WebView) obj);
        }
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzq zzq = (zzq) map.get(valueOf);
        if (zzq == null || zzq.zze()) {
            List list = (List) this.zzb.get(valueOf);
            if (list == null) {
                list = new ArrayList();
                this.zzb.put(valueOf, list);
            }
            list.add(pair);
            return;
        }
        zzi(zzq, pair, true);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzf(boolean z, zzq zzq) {
        Long l;
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzq zzq2 = (zzq) map.get(valueOf);
        if (zzq2 == null || zzq2.zze() || zzq2.zzb() == null || zzq.zzb() != null) {
            this.zza.put(valueOf, zzq);
        }
        if (zzq.zzb() != null) {
            l = (Long) zzbeq.zzd.zze();
        } else {
            l = (Long) zzbeq.zze.zze();
        }
        zzbzw.zzd.schedule(new zzl(this, z, zzq.zzb() == null), l.longValue(), TimeUnit.SECONDS);
        List<Pair> list = (List) this.zzb.get(valueOf);
        this.zzb.put(valueOf, new ArrayList());
        if (list != null) {
            for (Pair zzi : list) {
                zzi(zzq, zzi, false);
            }
        }
    }

    public final synchronized void zzg(Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbzw.zzf.execute(new zzk(this, obj, new Pair(queryInfoGenerationCallback, Long.valueOf(zzv.zzC().currentTimeMillis()))));
    }
}
