package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdua {
    private boolean zza = false;
    private boolean zzb = false;
    /* access modifiers changed from: private */
    public boolean zzc = false;
    /* access modifiers changed from: private */
    public final long zzd;
    /* access modifiers changed from: private */
    public final zzcab zze = new zzcab();
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdpm zzh;
    /* access modifiers changed from: private */
    public final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    /* access modifiers changed from: private */
    public final zzdsh zzl;
    private final VersionInfoParcel zzm;
    private final Map zzn = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final zzdcr zzo;
    /* access modifiers changed from: private */
    public final zzfhk zzp;
    private boolean zzq = true;

    public zzdua(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdpm zzdpm, ScheduledExecutorService scheduledExecutorService, zzdsh zzdsh, VersionInfoParcel versionInfoParcel, zzdcr zzdcr, zzfhk zzfhk) {
        this.zzh = zzdpm;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsh;
        this.zzm = versionInfoParcel;
        this.zzo = zzdcr;
        this.zzp = zzfhk;
        this.zzd = zzv.zzC().elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(zzdua zzdua, String str) {
        zzdua zzdua2 = zzdua;
        int i = 5;
        zzfgw zza2 = zzfgv.zza(zzdua2.zzf, 5);
        zza2.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzfgw zza3 = zzfgv.zza(zzdua2.zzf, i);
                zza3.zzi();
                zza3.zzd(next);
                Object obj = new Object();
                zzcab zzcab = new zzcab();
                ListenableFuture zzo2 = zzgch.zzo(zzcab, ((Long) zzbe.zzc().zza(zzbcl.zzbW)).longValue(), TimeUnit.SECONDS, zzdua2.zzk);
                zzdua2.zzl.zzc(next);
                zzdua2.zzo.zzc(next);
                long elapsedRealtime = zzv.zzC().elapsedRealtime();
                zzdtq zzdtq = r1;
                ListenableFuture listenableFuture = zzo2;
                zzdtq zzdtq2 = new zzdtq(zzdua, obj, zzcab, next, elapsedRealtime, zza3);
                listenableFuture.addListener(zzdtq, zzdua2.zzi);
                arrayList.add(listenableFuture);
                zzdtz zzdtz = new zzdtz(zzdua, obj, next, elapsedRealtime, zza3, zzcab);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzblx(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdua2.zzv(next, false, "", 0);
                try {
                    zzdua2.zzj.execute(new zzdtv(zzdua, next, zzdtz, zzdua2.zzh.zzc(next, new JSONObject()), arrayList2));
                } catch (zzfcq e) {
                    String str2 = "Failed to create Adapter.";
                    try {
                        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmP)).booleanValue()) {
                            str2 = str2 + " " + e.getMessage();
                        }
                        zzdtz.zze(str2);
                    } catch (RemoteException e2) {
                        zzo.zzh("", e2);
                    }
                }
                i = 5;
            }
            zzgch.zza(arrayList).zza(new zzdtr(zzdua2, zza2), zzdua2.zzi);
        } catch (JSONException e3) {
            zze.zzb("Malformed CLD response", e3);
            zzdua2.zzo.zza("MalformedJson");
            zzdua2.zzl.zza("MalformedJson");
            zzdua2.zze.zzd(e3);
            zzv.zzp().zzw(e3, "AdapterInitializer.updateAdapterStatus");
            zzfhk zzfhk = zzdua2.zzp;
            zza2.zzh(e3);
            zza2.zzg(false);
            zzfhk.zzb(zza2.zzm());
        }
    }

    private final synchronized ListenableFuture zzu() {
        String zzc2 = zzv.zzp().zzi().zzg().zzc();
        if (!TextUtils.isEmpty(zzc2)) {
            return zzgch.zzh(zzc2);
        }
        zzcab zzcab = new zzcab();
        zzv.zzp().zzi().zzo(new zzdts(this, zzcab));
        return zzcab;
    }

    /* access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbln(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(zzfgw zzfgw) throws Exception {
        this.zze.zzc(true);
        zzfgw.zzg(true);
        this.zzp.zzb(zzfgw.zzm());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbln zzbln = (zzbln) this.zzn.get(str);
            arrayList.add(new zzbln(str, zzbln.zzb, zzbln.zzc, zzbln.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (!this.zzc) {
                zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzv.zzC().elapsedRealtime() - this.zzd));
                this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzn(java.lang.String r3, com.google.android.gms.internal.ads.zzblr r4, com.google.android.gms.internal.ads.zzfdh r5, java.util.List r6) {
        /*
            r2 = this;
            java.lang.String r0 = "Failed to initialize adapter. "
            java.lang.String r1 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r1 = java.util.Objects.equals(r3, r1)     // Catch:{ zzfcq -> 0x0026, RemoteException -> 0x001f }
            if (r1 == 0) goto L_0x000e
            r4.zzf()     // Catch:{ zzfcq -> 0x0026, RemoteException -> 0x001f }
            return
        L_0x000e:
            java.lang.ref.WeakReference r1 = r2.zzg     // Catch:{ zzfcq -> 0x0026, RemoteException -> 0x001f }
            java.lang.Object r1 = r1.get()     // Catch:{ zzfcq -> 0x0026, RemoteException -> 0x001f }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ zzfcq -> 0x0026, RemoteException -> 0x001f }
            if (r1 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            android.content.Context r1 = r2.zzf     // Catch:{ zzfcq -> 0x0026, RemoteException -> 0x001f }
        L_0x001b:
            r5.zzi(r1, r4, r6)     // Catch:{ zzfcq -> 0x0026, RemoteException -> 0x001f }
            return
        L_0x001f:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzfvl r4 = new com.google.android.gms.internal.ads.zzfvl
            r4.<init>(r3)
            throw r4
        L_0x0026:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x003b }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x003b }
            r5.append(r3)     // Catch:{ RemoteException -> 0x003b }
            java.lang.String r3 = " does not implement the initialize() method."
            r5.append(r3)     // Catch:{ RemoteException -> 0x003b }
            java.lang.String r3 = r5.toString()     // Catch:{ RemoteException -> 0x003b }
            r4.zze(r3)     // Catch:{ RemoteException -> 0x003b }
            return
        L_0x003b:
            r3 = move-exception
            java.lang.String r4 = ""
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdua.zzn(java.lang.String, com.google.android.gms.internal.ads.zzblr, com.google.android.gms.internal.ads.zzfdh, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzcab zzcab) {
        this.zzi.execute(new zzdtu(this, zzcab));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Object obj, zzcab zzcab, String str, long j, zzfgw zzfgw) {
        synchronized (obj) {
            if (!zzcab.isDone()) {
                zzv(str, false, "Timeout.", (int) (zzv.zzC().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfhk zzfhk = this.zzp;
                zzfgw.zzc("Timeout");
                zzfgw.zzg(false);
                zzfhk.zzb(zzfgw.zzm());
                zzcab.zzc(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzber.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) zzbe.zzc().zza(zzbcl.zzbV)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        if (!this.zza) {
                            this.zzl.zzf();
                            this.zzo.zzf();
                            this.zze.addListener(new zzdtw(this), this.zzi);
                            this.zza = true;
                            ListenableFuture zzu = zzu();
                            this.zzk.schedule(new zzdtp(this), ((Long) zzbe.zzc().zza(zzbcl.zzbX)).longValue(), TimeUnit.SECONDS);
                            zzgch.zzr(zzu, new zzdty(this), this.zzi);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzc(false);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(zzblu zzblu) {
        this.zze.addListener(new zzdtt(this, zzblu), this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
