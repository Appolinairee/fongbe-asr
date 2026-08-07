package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbxp implements zzbxu {
    public static final /* synthetic */ int zzb = 0;
    /* access modifiers changed from: private */
    public static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhbn zzd;
    private final LinkedHashMap zze;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Context zzh;
    private final zzbxr zzi;
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxp(Context context, VersionInfoParcel versionInfoParcel, zzbxr zzbxr, String str, zzbxq zzbxq) {
        Preconditions.checkNotNull(zzbxr, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxr;
        for (String lowerCase : zzbxr.zze) {
            this.zzk.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhbn zzc2 = zzhdm.zzc();
        zzc2.zzn(9);
        zzc2.zzj(str);
        zzc2.zzh(str);
        zzhbo zzc3 = zzhbp.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc3.zza(str2);
        }
        zzc2.zzg((zzhbp) zzc3.zzbr());
        zzhdd zzc4 = zzhde.zzc();
        zzc4.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc4.zza(str3);
        }
        long apkVersion = (long) GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc4.zzb(apkVersion);
        }
        zzc2.zzf((zzhde) zzc4.zzbr());
        this.zzd = zzc2;
    }

    public final zzbxr zza() {
        return this.zzi;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(Map map) throws Exception {
        ListenableFuture zzm2;
        zzhdb zzhdb;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzhdb = (zzhdb) this.zze.get(str);
                            }
                            if (zzhdb == null) {
                                zzbxt.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    zzhdb.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                boolean z2 = this.zza;
                                if (length > 0) {
                                    z = true;
                                }
                                this.zza = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbet.zza.zze()).booleanValue()) {
                    zzo.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgch.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z3 = this.zza;
        if ((!z3 || !this.zzi.zzg) && ((!this.zzm || !this.zzi.zzf) && (z3 || !this.zzi.zzd))) {
            return zzgch.zzh((Object) null);
        }
        synchronized (this.zzj) {
            for (zzhdb zzbn : this.zze.values()) {
                this.zzd.zzc((zzhdc) zzbn.zzbr());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbxt.zzb()) {
                String zzl2 = this.zzd.zzl();
                String zzk2 = this.zzd.zzk();
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzl2 + "\n  clickUrl: " + zzk2 + "\n  resources: \n");
                for (zzhdc zzhdc : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzhdc.zzc());
                    sb.append("] ");
                    sb.append(zzhdc.zzg());
                }
                zzbxt.zza(sb.toString());
            }
            byte[] zzaV = ((zzhdm) this.zzd.zzbr()).zzaV();
            ListenableFuture zzb2 = new zzbo(this.zzh).zzb(1, this.zzi.zzb, (Map) null, zzaV);
            if (zzbxt.zzb()) {
                zzb2.addListener(new zzbxm(), zzbzw.zza);
            }
            zzm2 = zzgch.zzm(zzb2, new zzbxn(), zzbzw.zzg);
        }
        return zzm2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(java.lang.String r7, java.util.Map r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzj
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.zzm = r2     // Catch:{ all -> 0x00b4 }
        L_0x0009:
            java.util.LinkedHashMap r2 = r6.zze     // Catch:{ all -> 0x00b4 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x0021
            if (r9 != r1) goto L_0x001f
            java.util.LinkedHashMap r8 = r6.zze     // Catch:{ all -> 0x00b4 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.ads.zzhdb r7 = (com.google.android.gms.internal.ads.zzhdb) r7     // Catch:{ all -> 0x00b4 }
            r8 = 4
            r7.zze(r8)     // Catch:{ all -> 0x00b4 }
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            return
        L_0x0021:
            com.google.android.gms.internal.ads.zzhdb r1 = com.google.android.gms.internal.ads.zzhdc.zzd()     // Catch:{ all -> 0x00b4 }
            int r9 = com.google.android.gms.internal.ads.zzhda.zza(r9)     // Catch:{ all -> 0x00b4 }
            if (r9 == 0) goto L_0x002e
            r1.zze(r9)     // Catch:{ all -> 0x00b4 }
        L_0x002e:
            java.util.LinkedHashMap r9 = r6.zze     // Catch:{ all -> 0x00b4 }
            int r9 = r9.size()     // Catch:{ all -> 0x00b4 }
            r1.zzb(r9)     // Catch:{ all -> 0x00b4 }
            r1.zzd(r7)     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.ads.zzhca r9 = com.google.android.gms.internal.ads.zzhcd.zzc()     // Catch:{ all -> 0x00b4 }
            java.util.HashSet r2 = r6.zzk     // Catch:{ all -> 0x00b4 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b4 }
            if (r2 != 0) goto L_0x00a4
            if (r8 == 0) goto L_0x00a4
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00b4 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00b4 }
        L_0x0050:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x00a4
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00b4 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b4 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b4 }
            if (r3 == 0) goto L_0x0069
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b4 }
            goto L_0x006b
        L_0x0069:
            java.lang.String r3 = ""
        L_0x006b:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00b4 }
            if (r4 == 0) goto L_0x0078
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b4 }
            goto L_0x007a
        L_0x0078:
            java.lang.String r2 = ""
        L_0x007a:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00b4 }
            java.util.HashSet r5 = r6.zzk     // Catch:{ all -> 0x00b4 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00b4 }
            if (r4 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.zzhby r4 = com.google.android.gms.internal.ads.zzhbz.zzc()     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.ads.zzgwj r3 = com.google.android.gms.internal.ads.zzgwj.zzw(r3)     // Catch:{ all -> 0x00b4 }
            r4.zza(r3)     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.ads.zzgwj r2 = com.google.android.gms.internal.ads.zzgwj.zzw(r2)     // Catch:{ all -> 0x00b4 }
            r4.zzb(r2)     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.ads.zzgxr r2 = r4.zzbr()     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.ads.zzhbz r2 = (com.google.android.gms.internal.ads.zzhbz) r2     // Catch:{ all -> 0x00b4 }
            r9.zza(r2)     // Catch:{ all -> 0x00b4 }
            goto L_0x0050
        L_0x00a4:
            com.google.android.gms.internal.ads.zzgxr r8 = r9.zzbr()     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.ads.zzhcd r8 = (com.google.android.gms.internal.ads.zzhcd) r8     // Catch:{ all -> 0x00b4 }
            r1.zzc(r8)     // Catch:{ all -> 0x00b4 }
            java.util.LinkedHashMap r8 = r6.zze     // Catch:{ all -> 0x00b4 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            return
        L_0x00b4:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxp.zzd(java.lang.String, java.util.Map, int):void");
    }

    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zzn = zzgch.zzn(zzgch.zzh(Collections.emptyMap()), new zzbxk(this), zzbzw.zzg);
            ListenableFuture zzo = zzgch.zzo(zzn, 10, TimeUnit.SECONDS, zzbzw.zzd);
            zzgch.zzr(zzn, new zzbxo(this, zzo), zzbzw.zzg);
            zzc.add(zzo);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgwh zzt = zzgwj.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzhbn zzhbn = this.zzd;
            zzhcv zzc2 = zzhcx.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(2);
            zzhbn.zzi((zzhcx) zzc2.zzbr());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[SYNTHETIC, Splitter:B:18:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbxr r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L_0x0008
            goto L_0x007f
        L_0x0008:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L_0x007f
            com.google.android.gms.ads.internal.zzv.zzq()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0014
            goto L_0x006d
        L_0x0014:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002d }
            r8.setDrawingCacheEnabled(r0)     // Catch:{ RuntimeException -> 0x002d }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002d }
            if (r3 == 0) goto L_0x0026
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            goto L_0x002f
        L_0x002d:
            r2 = move-exception
            r3 = r1
        L_0x002f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r4, r2)
        L_0x0034:
            if (r3 != 0) goto L_0x006c
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            if (r2 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0065 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0065 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0065 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0065 }
            r1 = r4
            goto L_0x006d
        L_0x005f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r8)     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r8)
            goto L_0x006d
        L_0x006c:
            r1 = r3
        L_0x006d:
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbxt.zza(r8)
            return
        L_0x0075:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbxl r8 = new com.google.android.gms.internal.ads.zzbxl
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.zzs.zzh(r8)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxp.zzg(android.view.View):void");
    }

    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
