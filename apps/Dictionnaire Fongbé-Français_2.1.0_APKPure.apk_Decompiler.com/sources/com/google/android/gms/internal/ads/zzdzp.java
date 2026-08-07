package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdzp implements zzffr {
    protected final Context zza;
    protected final String zzb;

    public zzdzp(Context context, String str, zzbvs zzbvs, int i) {
        this.zza = context;
        this.zzb = str;
    }

    /* renamed from: zzb */
    public final zzdzo zza(zzdzn zzdzn) throws zzdvy {
        return zzc(zzdzn.zza, zzdzn.zzb, zzdzn.zzc, zzdzn.zzd, zzdzn.zze, zzv.zzC().elapsedRealtime());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2 = new java.io.InputStreamReader(r4.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        com.google.android.gms.ads.internal.zzv.zzq();
        r0 = new java.lang.StringBuilder(8192);
        r3 = new char[2048];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0130, code lost:
        r5 = r2.read(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0135, code lost:
        if (r5 == -1) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0137, code lost:
        r0.append(r3, 0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013b, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r2);
        r11.zzg(r0);
        r7.zzc = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014b, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015d, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfv)).booleanValue() == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0166, code lost:
        throw new com.google.android.gms.internal.ads.zzdvy(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0167, code lost:
        r7.zzd = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0178, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0179, code lost:
        r12 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0219, code lost:
        throw new com.google.android.gms.internal.ads.zzdvy(1, "Received error HTTP response code: " + r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzdzo zzc(java.lang.String r18, int r19, java.util.Map r20, byte[] r21, java.lang.String r22, long r23) throws com.google.android.gms.internal.ads.zzdvy {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r21
            java.lang.String r3 = "Received error HTTP response code: "
            java.lang.String r4 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r5 = "SDK version: "
            r6 = 1
            com.google.android.gms.internal.ads.zzdzo r7 = new com.google.android.gms.internal.ads.zzdzo     // Catch:{ IOException -> 0x0243 }
            r7.<init>()     // Catch:{ IOException -> 0x0243 }
            java.lang.String r8 = r1.zzb     // Catch:{ IOException -> 0x0243 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0243 }
            r9.<init>(r5)     // Catch:{ IOException -> 0x0243 }
            r9.append(r8)     // Catch:{ IOException -> 0x0243 }
            java.lang.String r5 = r9.toString()     // Catch:{ IOException -> 0x0243 }
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r5)     // Catch:{ IOException -> 0x0243 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0243 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0243 }
            r5.append(r0)     // Catch:{ IOException -> 0x0243 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x0243 }
            com.google.android.gms.ads.internal.util.client.zzo.zze(r4)     // Catch:{ IOException -> 0x0243 }
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x0243 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0243 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ IOException -> 0x0243 }
            r5.<init>()     // Catch:{ IOException -> 0x0243 }
            r8 = 0
            r9 = 0
        L_0x003e:
            java.net.URLConnection r0 = r4.openConnection()     // Catch:{ IOException -> 0x0243 }
            r4 = r0
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0243 }
            com.google.android.gms.ads.internal.util.zzs r10 = com.google.android.gms.ads.internal.zzv.zzq()     // Catch:{ zzdvy -> 0x021c }
            android.content.Context r11 = r1.zza     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r12 = r1.zzb     // Catch:{ zzdvy -> 0x021c }
            r13 = 0
            r15 = 0
            r14 = r4
            r16 = r19
            r10.zzf(r11, r12, r13, r14, r15, r16)     // Catch:{ zzdvy -> 0x021c }
            java.util.Set r0 = r20.entrySet()     // Catch:{ zzdvy -> 0x021c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ zzdvy -> 0x021c }
        L_0x005d:
            boolean r10 = r0.hasNext()     // Catch:{ zzdvy -> 0x021c }
            if (r10 == 0) goto L_0x0079
            java.lang.Object r10 = r0.next()     // Catch:{ zzdvy -> 0x021c }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ zzdvy -> 0x021c }
            java.lang.Object r11 = r10.getKey()     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ zzdvy -> 0x021c }
            java.lang.Object r10 = r10.getValue()     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ zzdvy -> 0x021c }
            r4.addRequestProperty(r11, r10)     // Catch:{ zzdvy -> 0x021c }
            goto L_0x005d
        L_0x0079:
            boolean r0 = android.text.TextUtils.isEmpty(r22)     // Catch:{ zzdvy -> 0x021c }
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = "Content-Type"
            r10 = r22
            r4.setRequestProperty(r0, r10)     // Catch:{ zzdvy -> 0x021c }
            goto L_0x0089
        L_0x0087:
            r10 = r22
        L_0x0089:
            com.google.android.gms.ads.internal.util.client.zzl r11 = new com.google.android.gms.ads.internal.util.client.zzl     // Catch:{ zzdvy -> 0x021c }
            r12 = 0
            r11.<init>(r12)     // Catch:{ zzdvy -> 0x021c }
            r11.zzc(r4, r2)     // Catch:{ all -> 0x0093 }
            goto L_0x00a3
        L_0x0093:
            r0 = move-exception
            r13 = r0
            java.lang.String r0 = "Network request logging failed."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r13)     // Catch:{ zzdvy -> 0x021c }
            com.google.android.gms.internal.ads.zzbzm r0 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r14 = "HttpRequestFunction.logAdRequest"
            r0.zzv(r13, r14)     // Catch:{ zzdvy -> 0x021c }
        L_0x00a3:
            int r0 = r2.length     // Catch:{ zzdvy -> 0x021c }
            if (r0 <= 0) goto L_0x00c4
            r4.setDoOutput(r6)     // Catch:{ zzdvy -> 0x021c }
            r4.setFixedLengthStreamingMode(r0)     // Catch:{ zzdvy -> 0x021c }
            java.io.BufferedOutputStream r13 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00bf }
            java.io.OutputStream r0 = r4.getOutputStream()     // Catch:{ all -> 0x00bf }
            r13.<init>(r0)     // Catch:{ all -> 0x00bf }
            r13.write(r2)     // Catch:{ all -> 0x00bc }
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r13)     // Catch:{ zzdvy -> 0x021c }
            goto L_0x00c4
        L_0x00bc:
            r0 = move-exception
            r12 = r13
            goto L_0x00c0
        L_0x00bf:
            r0 = move-exception
        L_0x00c0:
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r12)     // Catch:{ zzdvy -> 0x021c }
            throw r0     // Catch:{ zzdvy -> 0x021c }
        L_0x00c4:
            int r0 = r4.getResponseCode()     // Catch:{ zzdvy -> 0x021c }
            java.util.Map r13 = r4.getHeaderFields()     // Catch:{ zzdvy -> 0x021c }
            java.util.Set r13 = r13.entrySet()     // Catch:{ zzdvy -> 0x021c }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ zzdvy -> 0x021c }
        L_0x00d4:
            boolean r14 = r13.hasNext()     // Catch:{ zzdvy -> 0x021c }
            if (r14 == 0) goto L_0x0106
            java.lang.Object r14 = r13.next()     // Catch:{ zzdvy -> 0x021c }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ zzdvy -> 0x021c }
            java.lang.Object r15 = r14.getKey()     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ zzdvy -> 0x021c }
            java.lang.Object r14 = r14.getValue()     // Catch:{ zzdvy -> 0x021c }
            java.util.List r14 = (java.util.List) r14     // Catch:{ zzdvy -> 0x021c }
            boolean r16 = r5.containsKey(r15)     // Catch:{ zzdvy -> 0x021c }
            if (r16 == 0) goto L_0x00fc
            java.lang.Object r15 = r5.get(r15)     // Catch:{ zzdvy -> 0x021c }
            java.util.List r15 = (java.util.List) r15     // Catch:{ zzdvy -> 0x021c }
            r15.addAll(r14)     // Catch:{ zzdvy -> 0x021c }
            goto L_0x00d4
        L_0x00fc:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ zzdvy -> 0x021c }
            r12.<init>(r14)     // Catch:{ zzdvy -> 0x021c }
            r5.put(r15, r12)     // Catch:{ zzdvy -> 0x021c }
            r12 = 0
            goto L_0x00d4
        L_0x0106:
            r11.zze(r4, r0)     // Catch:{ zzdvy -> 0x021c }
            r7.zza = r0     // Catch:{ zzdvy -> 0x021c }
            r7.zzb = r5     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r12 = ""
            r7.zzc = r12     // Catch:{ zzdvy -> 0x021c }
            r12 = 200(0xc8, float:2.8E-43)
            r13 = 300(0x12c, float:4.2E-43)
            if (r0 < r12) goto L_0x0181
            if (r0 >= r13) goto L_0x0181
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x017b }
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ all -> 0x017b }
            r2.<init>(r0)     // Catch:{ all -> 0x017b }
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch:{ all -> 0x0178 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0178 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3)     // Catch:{ all -> 0x0178 }
            r3 = 2048(0x800, float:2.87E-42)
            char[] r3 = new char[r3]     // Catch:{ all -> 0x0178 }
        L_0x0130:
            int r5 = r2.read(r3)     // Catch:{ all -> 0x0178 }
            r9 = -1
            if (r5 == r9) goto L_0x013b
            r0.append(r3, r8, r5)     // Catch:{ all -> 0x0178 }
            goto L_0x0130
        L_0x013b:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0178 }
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r2)     // Catch:{ zzdvy -> 0x021c }
            r11.zzg(r0)     // Catch:{ zzdvy -> 0x021c }
            r7.zzc = r0     // Catch:{ zzdvy -> 0x021c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ zzdvy -> 0x021c }
            if (r0 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzfv     // Catch:{ zzdvy -> 0x021c }
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ zzdvy -> 0x021c }
            java.lang.Object r0 = r2.zza(r0)     // Catch:{ zzdvy -> 0x021c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ zzdvy -> 0x021c }
            boolean r0 = r0.booleanValue()     // Catch:{ zzdvy -> 0x021c }
            if (r0 == 0) goto L_0x0160
            goto L_0x0167
        L_0x0160:
            com.google.android.gms.internal.ads.zzdvy r0 = new com.google.android.gms.internal.ads.zzdvy     // Catch:{ zzdvy -> 0x021c }
            r2 = 3
            r0.<init>(r2)     // Catch:{ zzdvy -> 0x021c }
            throw r0     // Catch:{ zzdvy -> 0x021c }
        L_0x0167:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ zzdvy -> 0x021c }
            long r2 = r0.elapsedRealtime()     // Catch:{ zzdvy -> 0x021c }
            long r2 = r2 - r23
            r7.zzd = r2     // Catch:{ zzdvy -> 0x021c }
        L_0x0173:
            r4.disconnect()     // Catch:{ IOException -> 0x0243 }
            goto L_0x023d
        L_0x0178:
            r0 = move-exception
            r12 = r2
            goto L_0x017d
        L_0x017b:
            r0 = move-exception
            r12 = 0
        L_0x017d:
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r12)     // Catch:{ zzdvy -> 0x021c }
            throw r0     // Catch:{ zzdvy -> 0x021c }
        L_0x0181:
            if (r0 < r13) goto L_0x01f3
            r11 = 400(0x190, float:5.6E-43)
            if (r0 >= r11) goto L_0x01f3
            java.lang.String r0 = "Location"
            java.lang.String r0 = r4.getHeaderField(r0)     // Catch:{ zzdvy -> 0x021c }
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch:{ zzdvy -> 0x021c }
            if (r11 != 0) goto L_0x01e6
            com.google.android.gms.internal.ads.zzbcc r11 = com.google.android.gms.internal.ads.zzbcl.zzhH     // Catch:{ zzdvy -> 0x021c }
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ zzdvy -> 0x021c }
            java.lang.Object r11 = r12.zza(r11)     // Catch:{ zzdvy -> 0x021c }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ zzdvy -> 0x021c }
            boolean r11 = r11.booleanValue()     // Catch:{ zzdvy -> 0x021c }
            if (r11 == 0) goto L_0x01bb
            java.net.URI r11 = new java.net.URI     // Catch:{ URISyntaxException -> 0x01b0 }
            r11.<init>(r0)     // Catch:{ URISyntaxException -> 0x01b0 }
            java.net.URL r0 = r11.toURL()     // Catch:{ URISyntaxException -> 0x01b0 }
            r11 = r0
            goto L_0x01c0
        L_0x01b0:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzdvy r2 = new com.google.android.gms.internal.ads.zzdvy     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r3 = r0.getMessage()     // Catch:{ zzdvy -> 0x021c }
            r2.<init>(r6, r3, r0)     // Catch:{ zzdvy -> 0x021c }
            throw r2     // Catch:{ zzdvy -> 0x021c }
        L_0x01bb:
            java.net.URL r11 = new java.net.URL     // Catch:{ zzdvy -> 0x021c }
            r11.<init>(r0)     // Catch:{ zzdvy -> 0x021c }
        L_0x01c0:
            int r9 = r9 + r6
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzfb     // Catch:{ zzdvy -> 0x021c }
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ zzdvy -> 0x021c }
            java.lang.Object r0 = r12.zza(r0)     // Catch:{ zzdvy -> 0x021c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ zzdvy -> 0x021c }
            int r0 = r0.intValue()     // Catch:{ zzdvy -> 0x021c }
            if (r9 > r0) goto L_0x01d9
            r4.disconnect()     // Catch:{ IOException -> 0x0243 }
            r4 = r11
            goto L_0x003e
        L_0x01d9:
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ zzdvy -> 0x021c }
            com.google.android.gms.internal.ads.zzdvy r0 = new com.google.android.gms.internal.ads.zzdvy     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r2 = "Too many redirects"
            r0.<init>(r6, r2)     // Catch:{ zzdvy -> 0x021c }
            throw r0     // Catch:{ zzdvy -> 0x021c }
        L_0x01e6:
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ zzdvy -> 0x021c }
            com.google.android.gms.internal.ads.zzdvy r0 = new com.google.android.gms.internal.ads.zzdvy     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r2 = "No location header to follow redirect"
            r0.<init>(r6, r2)     // Catch:{ zzdvy -> 0x021c }
            throw r0     // Catch:{ zzdvy -> 0x021c }
        L_0x01f3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ zzdvy -> 0x021c }
            r2.<init>()     // Catch:{ zzdvy -> 0x021c }
            r2.append(r3)     // Catch:{ zzdvy -> 0x021c }
            r2.append(r0)     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r2 = r2.toString()     // Catch:{ zzdvy -> 0x021c }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r2)     // Catch:{ zzdvy -> 0x021c }
            com.google.android.gms.internal.ads.zzdvy r2 = new com.google.android.gms.internal.ads.zzdvy     // Catch:{ zzdvy -> 0x021c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ zzdvy -> 0x021c }
            r5.<init>()     // Catch:{ zzdvy -> 0x021c }
            r5.append(r3)     // Catch:{ zzdvy -> 0x021c }
            r5.append(r0)     // Catch:{ zzdvy -> 0x021c }
            java.lang.String r0 = r5.toString()     // Catch:{ zzdvy -> 0x021c }
            r2.<init>(r6, r0)     // Catch:{ zzdvy -> 0x021c }
            throw r2     // Catch:{ zzdvy -> 0x021c }
        L_0x021a:
            r0 = move-exception
            goto L_0x023f
        L_0x021c:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzih     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x021a }
            java.lang.Object r2 = r3.zza(r2)     // Catch:{ all -> 0x021a }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x021a }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x023e
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x021a }
            long r2 = r0.elapsedRealtime()     // Catch:{ all -> 0x021a }
            long r2 = r2 - r23
            r7.zzd = r2     // Catch:{ all -> 0x021a }
            goto L_0x0173
        L_0x023d:
            return r7
        L_0x023e:
            throw r0     // Catch:{ all -> 0x021a }
        L_0x023f:
            r4.disconnect()     // Catch:{ IOException -> 0x0243 }
            throw r0     // Catch:{ IOException -> 0x0243 }
        L_0x0243:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Error while connecting to ad server: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r2)
            com.google.android.gms.internal.ads.zzdvy r3 = new com.google.android.gms.internal.ads.zzdvy
            r3.<init>(r6, r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzp.zzc(java.lang.String, int, java.util.Map, byte[], java.lang.String, long):com.google.android.gms.internal.ads.zzdzo");
    }
}
