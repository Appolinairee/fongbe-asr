package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcjy extends zzcy {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdpm zzc;
    private final zzecy zzd;
    private final zzejj zze;
    private final zzdua zzf;
    private final zzbyi zzg;
    private final zzdpr zzh;
    private final zzduv zzi;
    private final zzbfe zzj;
    private final zzfhk zzk;
    private final zzfdf zzl;
    private final zzctj zzm;
    private final zzdrw zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(zzv.zzC().elapsedRealtime());

    zzcjy(Context context, VersionInfoParcel versionInfoParcel, zzdpm zzdpm, zzecy zzecy, zzejj zzejj, zzdua zzdua, zzbyi zzbyi, zzdpr zzdpr, zzduv zzduv, zzbfe zzbfe, zzfhk zzfhk, zzfdf zzfdf, zzctj zzctj, zzdrw zzdrw) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdpm;
        this.zzd = zzecy;
        this.zze = zzejj;
        this.zzf = zzdua;
        this.zzg = zzbyi;
        this.zzh = zzdpr;
        this.zzi = zzduv;
        this.zzj = zzbfe;
        this.zzk = zzfhk;
        this.zzl = zzfdf;
        this.zzm = zzctj;
        this.zzn = zzdrw;
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        if (zzv.zzp().zzi().zzM()) {
            String zzi2 = zzv.zzp().zzi().zzi();
            if (!zzv.zzt().zzj(this.zza, zzi2, this.zzb.afmaVersion)) {
                zzv.zzp().zzi().zzx(false);
                zzv.zzp().zzi().zzw("");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze2 = zzv.zzp().zzi().zzg().zze();
        if (!zze2.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzo.zzk("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.zzc.zzd()) {
                HashMap hashMap = new HashMap();
                for (zzboy zzboy : zze2.values()) {
                    for (zzbox zzbox : zzboy.zza) {
                        String str = zzbox.zzb;
                        for (String str2 : zzbox.zza) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((List) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzecz zza2 = this.zzd.zza(str3, jSONObject);
                        if (zza2 != null) {
                            zzfdh zzfdh = (zzfdh) zza2.zzb;
                            if (!zzfdh.zzC() && zzfdh.zzB()) {
                                zzfdh.zzj(this.zza, (zzeet) zza2.zzc, (List) entry.getValue());
                                zzo.zze("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzfcq e) {
                        zzo.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzfdn.zzb(this.zza, true);
    }

    public final synchronized float zze() {
        return zzv.zzs().zza();
    }

    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    public final void zzi() {
        this.zzf.zzl();
    }

    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfrb.zza(this.zza).zzc(z);
            if (!z) {
                try {
                    if (!this.zza.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                        throw new IOException("Failed to remove query_info_shared_prefs");
                    }
                } catch (IOException e) {
                    zzv.zzp().zzw(e, "clearStorageOnGpidPubDisable_scar");
                }
            }
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzk() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzo     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "Mobile ads is initialized already."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r3)
            return
        L_0x000c:
            android.content.Context r0 = r3.zza     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbcl.zza(r0)     // Catch:{ all -> 0x00d9 }
            android.content.Context r0 = r3.zza     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r3.zzb     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x00d9 }
            r2.zzu(r0, r1)     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzctj r0 = r3.zzm     // Catch:{ all -> 0x00d9 }
            r0.zzd()     // Catch:{ all -> 0x00d9 }
            android.content.Context r0 = r3.zza     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbar r1 = com.google.android.gms.ads.internal.zzv.zzc()     // Catch:{ all -> 0x00d9 }
            r1.zzi(r0)     // Catch:{ all -> 0x00d9 }
            r0 = 1
            r3.zzo = r0     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzdua r0 = r3.zzf     // Catch:{ all -> 0x00d9 }
            r0.zzr()     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzejj r0 = r3.zze     // Catch:{ all -> 0x00d9 }
            r0.zze()     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzed     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.internal.ads.zzdpr r0 = r3.zzh     // Catch:{ all -> 0x00d9 }
            r0.zzd()     // Catch:{ all -> 0x00d9 }
        L_0x004e:
            com.google.android.gms.internal.ads.zzduv r0 = r3.zzi     // Catch:{ all -> 0x00d9 }
            r0.zzg()     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzjc     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.zzgcs r0 = com.google.android.gms.internal.ads.zzbzw.zza     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzcjt r1 = new com.google.android.gms.internal.ads.zzcjt     // Catch:{ all -> 0x00d9 }
            r1.<init>(r3)     // Catch:{ all -> 0x00d9 }
            r0.execute(r1)     // Catch:{ all -> 0x00d9 }
        L_0x006f:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzkO     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x008b
            com.google.android.gms.internal.ads.zzgcs r0 = com.google.android.gms.internal.ads.zzbzw.zza     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzcjw r1 = new com.google.android.gms.internal.ads.zzcjw     // Catch:{ all -> 0x00d9 }
            r1.<init>(r3)     // Catch:{ all -> 0x00d9 }
            r0.execute(r1)     // Catch:{ all -> 0x00d9 }
        L_0x008b:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzdb     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.zzgcs r0 = com.google.android.gms.internal.ads.zzbzw.zza     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzcju r1 = new com.google.android.gms.internal.ads.zzcju     // Catch:{ all -> 0x00d9 }
            r1.<init>(r3)     // Catch:{ all -> 0x00d9 }
            r0.execute(r1)     // Catch:{ all -> 0x00d9 }
        L_0x00a7:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzeG     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d7
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzeH     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d7
            com.google.android.gms.internal.ads.zzgcs r0 = com.google.android.gms.internal.ads.zzbzw.zza     // Catch:{ all -> 0x00d9 }
            com.google.android.gms.internal.ads.zzcjv r1 = new com.google.android.gms.internal.ads.zzcjv     // Catch:{ all -> 0x00d9 }
            r1.<init>(r3)     // Catch:{ all -> 0x00d9 }
            r0.execute(r1)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r3)
            return
        L_0x00d7:
            monitor-exit(r3)
            return
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjy.zzk():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzl(java.lang.String r12, com.google.android.gms.dynamic.IObjectWrapper r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.zza
            com.google.android.gms.internal.ads.zzbcl.zza(r0)
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzei
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch:{ RuntimeException -> 0x0023, RemoteException -> 0x0021 }
            android.content.Context r0 = r11.zza     // Catch:{ RuntimeException -> 0x0023, RemoteException -> 0x0021 }
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzs.zzq(r0)     // Catch:{ RuntimeException -> 0x0023, RemoteException -> 0x0021 }
            goto L_0x002f
        L_0x0021:
            r0 = move-exception
            goto L_0x0024
        L_0x0023:
            r0 = move-exception
        L_0x0024:
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r1)
        L_0x002d:
            java.lang.String r0 = ""
        L_0x002f:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L_0x0038
            r6 = r12
            goto L_0x0039
        L_0x0038:
            r6 = r0
        L_0x0039:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L_0x0040
            goto L_0x0095
        L_0x0040:
            com.google.android.gms.internal.ads.zzbcc r12 = com.google.android.gms.internal.ads.zzbcl.zzeb
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r0.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzba
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r12 = r12 | r0
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzba
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r12 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r13)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            com.google.android.gms.internal.ads.zzcjx r13 = new com.google.android.gms.internal.ads.zzcjx
            r13.<init>(r11, r12)
            goto L_0x0081
        L_0x007f:
            r13 = 0
            r2 = r12
        L_0x0081:
            r7 = r13
            if (r2 == 0) goto L_0x0095
            android.content.Context r4 = r11.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r11.zzb
            com.google.android.gms.internal.ads.zzfhk r8 = r11.zzk
            com.google.android.gms.internal.ads.zzdrw r9 = r11.zzn
            java.lang.Long r10 = r11.zzp
            com.google.android.gms.ads.internal.zzf r3 = com.google.android.gms.ads.internal.zzv.zza()
            r3.zza(r4, r5, r6, r7, r8, r9, r10)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjy.zzl(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final void zzm(zzdl zzdl) throws RemoteException {
        this.zzi.zzh(zzdl, zzduu.API);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzo.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzau zzau = new zzau(context);
        zzau.zzn(str);
        zzau.zzo(this.zzb.afmaVersion);
        zzau.zzr();
    }

    public final void zzo(zzbpe zzbpe) throws RemoteException {
        this.zzl.zzf(zzbpe);
    }

    public final synchronized void zzp(boolean z) {
        zzv.zzs().zzc(z);
    }

    public final synchronized void zzq(float f) {
        zzv.zzs().zzd(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzr(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.content.Context r0 = r9.zza     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.zzbcl.zza(r0)     // Catch:{ all -> 0x0033 }
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzeb     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x0033 }
            java.lang.Object r0 = r1.zza(r0)     // Catch:{ all -> 0x0033 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            android.content.Context r2 = r9.zza     // Catch:{ all -> 0x0033 }
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r9.zzb     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.zzfhk r6 = r9.zzk     // Catch:{ all -> 0x0033 }
            com.google.android.gms.ads.internal.zzf r1 = com.google.android.gms.ads.internal.zzv.zza()     // Catch:{ all -> 0x0033 }
            r7 = 0
            r8 = 0
            r5 = 0
            r4 = r10
            r1.zza(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0033 }
            monitor-exit(r9)
            return
        L_0x0031:
            monitor-exit(r9)
            return
        L_0x0033:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0033 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjy.zzr(java.lang.String):void");
    }

    public final void zzs(zzblu zzblu) throws RemoteException {
        this.zzf.zzs(zzblu);
    }

    public final void zzt(String str) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
            zzv.zzp().zzz(str);
        }
    }

    public final void zzu(zzfv zzfv) throws RemoteException {
        this.zzg.zzn(this.zza, zzfv);
    }

    public final synchronized boolean zzv() {
        return zzv.zzs().zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw() {
        zzv.zzf().zzb(this.zza, this.zzn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzx() {
        this.zzj.zza(new zzbum());
    }
}
