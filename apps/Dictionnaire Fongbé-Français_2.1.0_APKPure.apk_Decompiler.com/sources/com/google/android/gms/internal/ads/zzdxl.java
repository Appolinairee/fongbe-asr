package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdxl {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcgx zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfcj zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfhh zzi;
    private final zzdrq zzj;
    private final Object zzk = new Object();
    private final zzbvs zzl;

    zzdxl(zzcgx zzcgx, Context context, VersionInfoParcel versionInfoParcel, zzfcj zzfcj, Executor executor, String str, zzfhh zzfhh, zzdrq zzdrq, zzbvs zzbvs, zzdzq zzdzq, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = zzcgx;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfcj;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfhh;
        zzcgx.zzx();
        this.zzj = zzdrq;
        this.zzl = zzbvs;
        this.zzg = scheduledExecutorService;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.zzegu r12 = new com.google.android.gms.internal.ads.zzegu
            r13 = 15
            java.lang.String r0 = "Invalid ad string."
            r12.<init>(r13, r0)
            com.google.common.util.concurrent.ListenableFuture r12 = com.google.android.gms.internal.ads.zzgch.zzg(r12)
            return r12
        L_0x0016:
            android.content.Context r1 = r11.zzc
            r2 = 11
            com.google.android.gms.internal.ads.zzfgw r1 = com.google.android.gms.internal.ads.zzfgv.zza(r1, r2)
            r1.zzi()
            android.content.Context r2 = r11.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r11.zzd
            com.google.android.gms.internal.ads.zzcgx r4 = r11.zzb
            com.google.android.gms.internal.ads.zzbnx r5 = com.google.android.gms.ads.internal.zzv.zzg()
            com.google.android.gms.internal.ads.zzfhk r4 = r4.zzz()
            com.google.android.gms.internal.ads.zzbog r2 = r5.zza(r2, r3, r4)
            com.google.android.gms.internal.ads.zzboa r3 = com.google.android.gms.internal.ads.zzbod.zza
            com.google.android.gms.internal.ads.zzboa r4 = com.google.android.gms.internal.ads.zzbod.zza
            java.lang.String r5 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.zzbnw r2 = r2.zza(r5, r3, r4)
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzgS
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r4 = "1"
            java.lang.String r5 = "sst"
            if (r3 == 0) goto L_0x0125
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005f }
            r3.<init>(r12)     // Catch:{ JSONException -> 0x005f }
            java.lang.String r6 = "fetch_url"
            java.lang.String r3 = r3.optString(r6, r0)
            goto L_0x0061
        L_0x005f:
            r3 = r0
        L_0x0061:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x011b
            com.google.android.gms.internal.ads.zzdrq r12 = r11.zzj
            java.lang.String r4 = "2"
            r12.zzc(r5, r4)
            com.google.android.gms.internal.ads.zzbcc r12 = com.google.android.gms.internal.ads.zzbcl.zzgU
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r4.zza(r12)
            r9 = r12
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.gms.internal.ads.zzbcc r12 = com.google.android.gms.internal.ads.zzbcl.zzgT
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r4.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00cb
            java.util.regex.Pattern r12 = zza
            com.google.android.gms.internal.ads.zzfvc r12 = com.google.android.gms.internal.ads.zzfvc.zzc(r12)
            java.util.List r12 = r12.zzf(r3)
            int r0 = r12.size()
            r4 = 2
            r5 = 1
            if (r0 >= r4) goto L_0x00ac
            com.google.android.gms.internal.ads.zzegu r12 = new com.google.android.gms.internal.ads.zzegu
            java.lang.String r0 = "Invalid fetch URL."
            r12.<init>(r5, r0)
            com.google.common.util.concurrent.ListenableFuture r12 = com.google.android.gms.internal.ads.zzgch.zzg(r12)
            goto L_0x012e
        L_0x00ac:
            java.lang.Object r12 = r12.get(r5)
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.ads.internal.zzv.zzq()
            android.net.Uri r12 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r12 = r12.buildUpon()
            r3 = 0
            android.net.Uri$Builder r12 = r12.query(r3)
            android.net.Uri r12 = r12.build()
            java.lang.String r3 = r12.toString()
        L_0x00cb:
            r5 = r3
            com.google.android.gms.internal.ads.zzdzn r12 = new com.google.android.gms.internal.ads.zzdzn
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r8 = r0.getBytes(r3)
            r10 = 0
            r6 = 60000(0xea60, float:8.4078E-41)
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.google.android.gms.internal.ads.zzgcs r0 = com.google.android.gms.internal.ads.zzbzw.zza
            com.google.android.gms.internal.ads.zzdxj r3 = new com.google.android.gms.internal.ads.zzdxj
            r3.<init>(r11, r12)
            com.google.common.util.concurrent.ListenableFuture r12 = r0.zzb(r3)
            com.google.android.gms.internal.ads.zzgby r12 = com.google.android.gms.internal.ads.zzgby.zzu(r12)
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzgV
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r3 = (long) r0
            java.util.concurrent.ScheduledExecutorService r0 = r11.zzg
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r12 = com.google.android.gms.internal.ads.zzgch.zzo(r12, r3, r5, r0)
            com.google.android.gms.internal.ads.zzgby r12 = (com.google.android.gms.internal.ads.zzgby) r12
            com.google.android.gms.internal.ads.zzdxk r0 = new com.google.android.gms.internal.ads.zzdxk
            r0.<init>()
            java.util.concurrent.Executor r3 = r11.zzf
            java.lang.Class<java.lang.Exception> r4 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r12 = com.google.android.gms.internal.ads.zzgch.zzf(r12, r4, r0, r3)
            com.google.android.gms.internal.ads.zzgby r12 = (com.google.android.gms.internal.ads.zzgby) r12
            goto L_0x012e
        L_0x011b:
            com.google.common.util.concurrent.ListenableFuture r12 = com.google.android.gms.internal.ads.zzgch.zzh(r12)
            com.google.android.gms.internal.ads.zzdrq r0 = r11.zzj
            r0.zzc(r5, r4)
            goto L_0x012e
        L_0x0125:
            com.google.common.util.concurrent.ListenableFuture r12 = com.google.android.gms.internal.ads.zzgch.zzh(r12)
            com.google.android.gms.internal.ads.zzdrq r0 = r11.zzj
            r0.zzc(r5, r4)
        L_0x012e:
            com.google.android.gms.internal.ads.zzdxg r0 = new com.google.android.gms.internal.ads.zzdxg
            r0.<init>(r11, r13)
            java.util.concurrent.Executor r13 = r11.zzf
            com.google.common.util.concurrent.ListenableFuture r12 = com.google.android.gms.internal.ads.zzgch.zzn(r12, r0, r13)
            com.google.android.gms.internal.ads.zzdxh r13 = new com.google.android.gms.internal.ads.zzdxh
            r13.<init>(r2)
            java.util.concurrent.Executor r0 = r11.zzf
            com.google.common.util.concurrent.ListenableFuture r12 = com.google.android.gms.internal.ads.zzgch.zzn(r12, r13, r0)
            com.google.android.gms.internal.ads.zzdxi r13 = new com.google.android.gms.internal.ads.zzdxi
            r13.<init>(r11)
            java.util.concurrent.Executor r0 = r11.zzf
            com.google.common.util.concurrent.ListenableFuture r12 = com.google.android.gms.internal.ads.zzgch.zzn(r12, r13, r0)
            com.google.android.gms.internal.ads.zzfhh r13 = r11.zzi
            com.google.android.gms.internal.ads.zzfhg.zza(r12, r13, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxl.zzd(java.lang.String, java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }

    private final String zze(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzo.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private final void zzf(zzdre zzdre) {
        Bundle zza2 = this.zzj.zza();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgX)).booleanValue()) {
            zza2.putLong(zzdre.zza(), zzv.zzC().currentTimeMillis());
        }
    }

    private static final String zzg(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:21|22|(3:24|27|(1:29)(4:30|(1:32)(1:33)|34|(6:36|37|38|(3:41|42|46)|40|46)))|25|26|27|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c4, code lost:
        if (r4.zzg(r1, r3, r6) == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ce, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d9, code lost:
        return zzd(r0, zze(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c A[Catch:{ UnsupportedEncodingException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d A[Catch:{ UnsupportedEncodingException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0182 A[Catch:{ UnsupportedEncodingException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018c A[Catch:{ UnsupportedEncodingException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b1 A[Catch:{ UnsupportedEncodingException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c0 A[Catch:{ UnsupportedEncodingException -> 0x00ef }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzfcj r0 = r14.zze
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            java.lang.String r0 = r0.zzx
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x01dd
            java.lang.String r1 = zzg(r0)
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzgR
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = -1
            if (r2 == 0) goto L_0x003a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x003a
            java.lang.String r1 = "&request_id="
            int r1 = r0.lastIndexOf(r1)
            if (r1 == r3) goto L_0x0038
            int r1 = r1 + 12
            java.lang.String r1 = r0.substring(r1)
            goto L_0x003a
        L_0x0038:
            java.lang.String r1 = ""
        L_0x003a:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x004e
            com.google.android.gms.internal.ads.zzegu r0 = new com.google.android.gms.internal.ads.zzegu
            r1 = 15
            java.lang.String r2 = "Invalid ad string."
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgch.zzg(r0)
            return r0
        L_0x004e:
            java.lang.Object r2 = r14.zzk
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcgx r4 = r14.zzb     // Catch:{ all -> 0x01da }
            com.google.android.gms.ads.nonagon.signalgeneration.zzv r4 = r4.zzo()     // Catch:{ all -> 0x01da }
            com.google.android.gms.internal.ads.zzdrq r5 = r14.zzj     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r4.zzb(r1, r5)     // Catch:{ all -> 0x01da }
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzgR     // Catch:{ all -> 0x01da }
            com.google.android.gms.internal.ads.zzbcj r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x01da }
            java.lang.Object r6 = r7.zza(r6)     // Catch:{ all -> 0x01da }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x01da }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x01da }
            r7 = 1
            r8 = 0
            r9 = 0
            if (r6 == 0) goto L_0x0106
            com.google.android.gms.internal.ads.zzdrq r6 = r14.zzj     // Catch:{ all -> 0x01da }
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x01da }
            if (r10 != 0) goto L_0x0106
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0092 }
            r10.<init>(r5)     // Catch:{ JSONException -> 0x0092 }
            java.lang.String r11 = "is_gbid"
            java.lang.String r10 = r10.optString(r11)     // Catch:{ JSONException -> 0x0092 }
            java.lang.String r11 = "true"
            boolean r10 = r10.equals(r11)     // Catch:{ JSONException -> 0x0092 }
            if (r10 == 0) goto L_0x0092
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x01da }
        L_0x0096:
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x01da }
            if (r10 != 0) goto L_0x009d
            goto L_0x0106
        L_0x009d:
            java.lang.String r10 = "&"
            int r10 = r0.lastIndexOf(r10)     // Catch:{ all -> 0x01da }
            if (r10 == r3) goto L_0x00aa
            java.lang.String r3 = r0.substring(r9, r10)     // Catch:{ all -> 0x01da }
            goto L_0x00ab
        L_0x00aa:
            r3 = r8
        L_0x00ab:
            boolean r10 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x01da }
            if (r10 == 0) goto L_0x00b2
            goto L_0x0106
        L_0x00b2:
            r10 = 11
            byte[] r3 = android.util.Base64.decode(r3, r10)     // Catch:{ UnsupportedEncodingException -> 0x00ef }
            java.lang.String r10 = "UTF-8"
            byte[] r10 = r1.getBytes(r10)     // Catch:{ UnsupportedEncodingException -> 0x00ef }
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch:{ UnsupportedEncodingException -> 0x00ef }
            if (r11 == 0) goto L_0x00c6
        L_0x00c4:
            r11 = r8
            goto L_0x00ea
        L_0x00c6:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d2 }
            r11.<init>(r5)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r12 = "arek"
            java.lang.String r11 = r11.getString(r12)     // Catch:{ JSONException -> 0x00d2 }
            goto L_0x00ea
        L_0x00d2:
            r11 = move-exception
            java.lang.String r12 = r11.toString()     // Catch:{ UnsupportedEncodingException -> 0x00ef }
            java.lang.String r13 = "Failed to get key from QueryJSONMap"
            java.lang.String r12 = r13.concat(r12)     // Catch:{ UnsupportedEncodingException -> 0x00ef }
            com.google.android.gms.ads.internal.util.zze.zza(r12)     // Catch:{ UnsupportedEncodingException -> 0x00ef }
            com.google.android.gms.internal.ads.zzbzm r12 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ UnsupportedEncodingException -> 0x00ef }
            java.lang.String r13 = "CryptoUtils.getKeyFromQueryJsonMap"
            r12.zzw(r11, r13)     // Catch:{ UnsupportedEncodingException -> 0x00ef }
            goto L_0x00c4
        L_0x00ea:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfcy.zzb(r3, r10, r11, r6)     // Catch:{ UnsupportedEncodingException -> 0x00ef }
            goto L_0x0106
        L_0x00ef:
            r3 = move-exception
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x01da }
            java.lang.String r10 = "Failed to decode the adResponse. "
            java.lang.String r6 = r10.concat(r6)     // Catch:{ all -> 0x01da }
            com.google.android.gms.ads.internal.util.zze.zza(r6)     // Catch:{ all -> 0x01da }
            com.google.android.gms.internal.ads.zzbzm r6 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x01da }
            java.lang.String r10 = "PreloadedLoader.decryptAdResponseIfNecessary"
            r6.zzw(r3, r10)     // Catch:{ all -> 0x01da }
        L_0x0106:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01da }
            if (r3 == 0) goto L_0x010f
            java.lang.String r3 = ""
            goto L_0x011f
        L_0x010f:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011d }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x011d }
            java.lang.String r6 = "render_id"
            java.lang.String r10 = ""
            java.lang.String r3 = r3.optString(r6, r10)     // Catch:{ all -> 0x01da }
            goto L_0x011f
        L_0x011d:
            java.lang.String r3 = ""
        L_0x011f:
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x01da }
            if (r6 != 0) goto L_0x017f
            java.lang.String r6 = ""
            java.lang.String r10 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0134 }
            byte[] r11 = android.util.Base64.decode(r3, r9)     // Catch:{ IllegalArgumentException -> 0x0134 }
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IllegalArgumentException -> 0x0134 }
            r10.<init>(r11, r12)     // Catch:{ IllegalArgumentException -> 0x0134 }
            r6 = r10
            goto L_0x014b
        L_0x0134:
            r10 = move-exception
            java.lang.String r11 = "Ad grouping: Has render_id, but not base64 encoded: "
            java.lang.String r12 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01da }
            java.lang.String r11 = r11.concat(r12)     // Catch:{ all -> 0x01da }
            com.google.android.gms.ads.internal.util.zze.zza(r11)     // Catch:{ all -> 0x01da }
            com.google.android.gms.internal.ads.zzbzm r11 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x01da }
            java.lang.String r12 = "PreloadedLoader.decodeRenderId"
            r11.zzw(r10, r12)     // Catch:{ all -> 0x01da }
        L_0x014b:
            r10 = 58
            com.google.android.gms.internal.ads.zzfty r10 = com.google.android.gms.internal.ads.zzfty.zzc(r10)     // Catch:{ all -> 0x01da }
            com.google.android.gms.internal.ads.zzfvc r10 = com.google.android.gms.internal.ads.zzfvc.zzb(r10)     // Catch:{ all -> 0x01da }
            java.util.List r6 = r10.zzf(r6)     // Catch:{ all -> 0x01da }
            int r10 = r6.size()     // Catch:{ all -> 0x01da }
            r11 = 2
            if (r10 != r11) goto L_0x0172
            java.lang.Object r3 = r6.get(r9)     // Catch:{ all -> 0x01da }
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01da }
            java.lang.Object r3 = r6.get(r7)     // Catch:{ all -> 0x01da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01da }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x01da }
            goto L_0x0180
        L_0x0172:
            java.lang.String r6 = "Ad grouping: Has render_id, but invalid format: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01da }
            java.lang.String r3 = r6.concat(r3)     // Catch:{ all -> 0x01da }
            com.google.android.gms.ads.internal.util.zze.zza(r3)     // Catch:{ all -> 0x01da }
        L_0x017f:
            r3 = 0
        L_0x0180:
            if (r8 == 0) goto L_0x018c
            android.util.Pair r6 = new android.util.Pair     // Catch:{ all -> 0x01da }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01da }
            r6.<init>(r8, r3)     // Catch:{ all -> 0x01da }
            goto L_0x0197
        L_0x018c:
            android.util.Pair r6 = new android.util.Pair     // Catch:{ all -> 0x01da }
            java.lang.String r3 = ""
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01da }
            r6.<init>(r3, r7)     // Catch:{ all -> 0x01da }
        L_0x0197:
            java.lang.Object r3 = r6.first     // Catch:{ all -> 0x01da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01da }
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x01da }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x01da }
            int r6 = r6.intValue()     // Catch:{ all -> 0x01da }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x01da }
            if (r7 != 0) goto L_0x01c6
            if (r6 <= 0) goto L_0x01c6
            boolean r7 = r4.zzh(r1, r3)     // Catch:{ all -> 0x01da }
            if (r7 == 0) goto L_0x01c0
            com.google.android.gms.internal.ads.zzegu r0 = new com.google.android.gms.internal.ads.zzegu     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "The ad has already been shown."
            r3 = 10
            r0.<init>(r3, r1)     // Catch:{ all -> 0x01da }
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgch.zzg(r0)     // Catch:{ all -> 0x01da }
            monitor-exit(r2)     // Catch:{ all -> 0x01da }
            return r0
        L_0x01c0:
            boolean r3 = r4.zzg(r1, r3, r6)     // Catch:{ all -> 0x01da }
            if (r3 != 0) goto L_0x01c9
        L_0x01c6:
            r4.zzf(r1)     // Catch:{ all -> 0x01da }
        L_0x01c9:
            monitor-exit(r2)     // Catch:{ all -> 0x01da }
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L_0x01d1
            goto L_0x01dd
        L_0x01d1:
            java.lang.String r1 = r14.zze(r5)
            com.google.common.util.concurrent.ListenableFuture r0 = r14.zzd(r0, r1)
            return r0
        L_0x01da:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01da }
            throw r0
        L_0x01dd:
            com.google.android.gms.internal.ads.zzfcj r0 = r14.zze
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs
            if (r0 == 0) goto L_0x023e
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzgJ
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01f8
            goto L_0x0224
        L_0x01f8:
            java.lang.String r1 = r0.zza
            java.lang.String r2 = r0.zzb
            java.lang.String r1 = zzg(r1)
            java.lang.String r2 = zzg(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0231
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0231
            com.google.android.gms.internal.ads.zzcgx r2 = r14.zzb
            com.google.android.gms.ads.nonagon.signalgeneration.zzv r2 = r2.zzo()
            r2.zzf(r1)
            com.google.android.gms.internal.ads.zzdrq r2 = r14.zzj
            java.util.Map r2 = r2.zzb()
            java.lang.String r3 = "request_id"
            r2.put(r3, r1)
        L_0x0224:
            java.lang.String r1 = r0.zza
            java.lang.String r0 = r0.zzb
            java.lang.String r0 = r14.zze(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r14.zzd(r1, r0)
            return r0
        L_0x0231:
            com.google.android.gms.internal.ads.zzdrq r0 = r14.zzj
            java.util.Map r0 = r0.zzb()
            java.lang.String r1 = "ridmm"
            java.lang.String r2 = "true"
            r0.put(r1, r2)
        L_0x023e:
            com.google.android.gms.internal.ads.zzegu r0 = new com.google.android.gms.internal.ads.zzegu
            r1 = 14
            java.lang.String r2 = "Mismatch request IDs."
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgch.zzg(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxl.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(JSONObject jSONObject) throws Exception {
        return zzgch.zzh(new zzfca(new zzfbx(this.zze), zzfbz.zza(new StringReader(jSONObject.toString()), (zzbvk) null)));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzc(zzdzn zzdzn) throws Exception {
        zzf(zzdre.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i < ((Integer) zzbe.zzc().zza(zzbcl.zzgW)).intValue()) {
                    zzdzn zzdzn2 = zzdzn;
                    zzdzo zzb2 = new zzdzp(this.zzc, this.zzd.afmaVersion, this.zzl, Binder.getCallingUid()).zza(zzdzn);
                    zzdzo zzdzo = zzb2;
                    int i3 = zzb2.zza;
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzgX)).booleanValue()) {
                        this.zzj.zzc("fr", String.valueOf(i));
                    }
                    if (i3 == 200) {
                        zzf(zzdre.RENDERING_ADSTRING_TYPE2_FETCH_END);
                        return zzb2.zzc;
                    }
                    i++;
                    i2 = i3;
                } else {
                    throw new zzegu(1, "Received HTTP error code from ad server: " + i2);
                }
            } catch (Exception e) {
                throw new zzegu(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }
}
