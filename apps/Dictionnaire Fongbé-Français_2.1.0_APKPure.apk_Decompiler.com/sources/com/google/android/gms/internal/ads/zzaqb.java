package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzaqb implements zzapf {
    protected final zzaqd zza;
    private final zzaqa zzb;

    public zzaqb(zzaqa zzaqa) {
        zzaqd zzaqd = new zzaqd(4096);
        this.zzb = zzaqa;
        this.zza = zzaqd;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0137 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0149 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzapi zza(com.google.android.gms.internal.ads.zzapm r21) throws com.google.android.gms.internal.ads.zzapv {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r3 = "Error occurred when closing InputStream"
            long r4 = android.os.SystemClock.elapsedRealtime()
        L_0x000a:
            java.util.Collections.emptyList()
            r9 = 0
            com.google.android.gms.internal.ads.zzaov r0 = r21.zzd()     // Catch:{ IOException -> 0x01bf }
            if (r0 != 0) goto L_0x0019
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ IOException -> 0x01bf }
            goto L_0x0039
        L_0x0019:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ IOException -> 0x01bf }
            r10.<init>()     // Catch:{ IOException -> 0x01bf }
            java.lang.String r11 = r0.zzb     // Catch:{ IOException -> 0x01bf }
            if (r11 == 0) goto L_0x0027
            java.lang.String r12 = "If-None-Match"
            r10.put(r12, r11)     // Catch:{ IOException -> 0x01bf }
        L_0x0027:
            long r11 = r0.zzd     // Catch:{ IOException -> 0x01bf }
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            java.lang.String r0 = "If-Modified-Since"
            java.lang.String r11 = com.google.android.gms.internal.ads.zzaqj.zzc(r11)     // Catch:{ IOException -> 0x01bf }
            r10.put(r0, r11)     // Catch:{ IOException -> 0x01bf }
        L_0x0038:
            r0 = r10
        L_0x0039:
            com.google.android.gms.internal.ads.zzaqa r10 = r1.zzb     // Catch:{ IOException -> 0x01bf }
            com.google.android.gms.internal.ads.zzaqk r10 = r10.zza(r2, r0)     // Catch:{ IOException -> 0x01bf }
            int r12 = r10.zzb()     // Catch:{ IOException -> 0x01bd }
            java.util.List r0 = r10.zzd()     // Catch:{ IOException -> 0x01bd }
            r11 = 304(0x130, float:4.26E-43)
            if (r12 != r11) goto L_0x010b
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01bd }
            long r17 = r11 - r4
            com.google.android.gms.internal.ads.zzaov r11 = r21.zzd()     // Catch:{ IOException -> 0x01bd }
            if (r11 != 0) goto L_0x0066
            com.google.android.gms.internal.ads.zzapi r11 = new com.google.android.gms.internal.ads.zzapi     // Catch:{ IOException -> 0x01bd }
            r15 = 0
            r16 = 1
            r14 = 304(0x130, float:4.26E-43)
            r13 = r11
            r19 = r0
            r13.<init>((int) r14, (byte[]) r15, (boolean) r16, (long) r17, (java.util.List) r19)     // Catch:{ IOException -> 0x01bd }
            goto L_0x010a
        L_0x0066:
            java.util.TreeSet r12 = new java.util.TreeSet     // Catch:{ IOException -> 0x01bd }
            java.util.Comparator r13 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ IOException -> 0x01bd }
            r12.<init>(r13)     // Catch:{ IOException -> 0x01bd }
            boolean r13 = r0.isEmpty()     // Catch:{ IOException -> 0x01bd }
            if (r13 != 0) goto L_0x008b
            java.util.Iterator r13 = r0.iterator()     // Catch:{ IOException -> 0x01bd }
        L_0x0077:
            boolean r14 = r13.hasNext()     // Catch:{ IOException -> 0x01bd }
            if (r14 == 0) goto L_0x008b
            java.lang.Object r14 = r13.next()     // Catch:{ IOException -> 0x01bd }
            com.google.android.gms.internal.ads.zzape r14 = (com.google.android.gms.internal.ads.zzape) r14     // Catch:{ IOException -> 0x01bd }
            java.lang.String r14 = r14.zza()     // Catch:{ IOException -> 0x01bd }
            r12.add(r14)     // Catch:{ IOException -> 0x01bd }
            goto L_0x0077
        L_0x008b:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ IOException -> 0x01bd }
            r15.<init>(r0)     // Catch:{ IOException -> 0x01bd }
            java.util.List r0 = r11.zzh     // Catch:{ IOException -> 0x01bd }
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x01bd }
            if (r0 != 0) goto L_0x00f9
            java.util.List r0 = r11.zzh     // Catch:{ IOException -> 0x01bd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01bd }
        L_0x00a0:
            boolean r13 = r0.hasNext()     // Catch:{ IOException -> 0x01bd }
            if (r13 == 0) goto L_0x00f9
            java.lang.Object r13 = r0.next()     // Catch:{ IOException -> 0x01bd }
            com.google.android.gms.internal.ads.zzape r13 = (com.google.android.gms.internal.ads.zzape) r13     // Catch:{ IOException -> 0x01bd }
            java.lang.String r14 = r13.zza()     // Catch:{ IOException -> 0x01bd }
            boolean r14 = r12.contains(r14)     // Catch:{ IOException -> 0x01bd }
            if (r14 != 0) goto L_0x00a0
            r15.add(r13)     // Catch:{ IOException -> 0x01bd }
            goto L_0x00a0
        L_0x00ba:
            java.util.Map r0 = r11.zzg     // Catch:{ IOException -> 0x01bd }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x01bd }
            if (r0 != 0) goto L_0x00f9
            java.util.Map r0 = r11.zzg     // Catch:{ IOException -> 0x01bd }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x01bd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01bd }
        L_0x00cc:
            boolean r13 = r0.hasNext()     // Catch:{ IOException -> 0x01bd }
            if (r13 == 0) goto L_0x00f9
            java.lang.Object r13 = r0.next()     // Catch:{ IOException -> 0x01bd }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ IOException -> 0x01bd }
            java.lang.Object r14 = r13.getKey()     // Catch:{ IOException -> 0x01bd }
            boolean r14 = r12.contains(r14)     // Catch:{ IOException -> 0x01bd }
            if (r14 != 0) goto L_0x00cc
            com.google.android.gms.internal.ads.zzape r14 = new com.google.android.gms.internal.ads.zzape     // Catch:{ IOException -> 0x01bd }
            java.lang.Object r16 = r13.getKey()     // Catch:{ IOException -> 0x01bd }
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x01bd }
            java.lang.Object r13 = r13.getValue()     // Catch:{ IOException -> 0x01bd }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IOException -> 0x01bd }
            r14.<init>(r8, r13)     // Catch:{ IOException -> 0x01bd }
            r15.add(r14)     // Catch:{ IOException -> 0x01bd }
            goto L_0x00cc
        L_0x00f9:
            com.google.android.gms.internal.ads.zzapi r0 = new com.google.android.gms.internal.ads.zzapi     // Catch:{ IOException -> 0x01bd }
            byte[] r8 = r11.zza     // Catch:{ IOException -> 0x01bd }
            r16 = 1
            r14 = 304(0x130, float:4.26E-43)
            r13 = r0
            r11 = r15
            r15 = r8
            r19 = r11
            r13.<init>((int) r14, (byte[]) r15, (boolean) r16, (long) r17, (java.util.List) r19)     // Catch:{ IOException -> 0x01bd }
            r11 = r0
        L_0x010a:
            return r11
        L_0x010b:
            java.io.InputStream r8 = r10.zzc()     // Catch:{ IOException -> 0x01bd }
            if (r8 == 0) goto L_0x0155
            int r11 = r10.zza()     // Catch:{ IOException -> 0x01bd }
            com.google.android.gms.internal.ads.zzaqd r13 = r1.zza     // Catch:{ IOException -> 0x01bd }
            com.google.android.gms.internal.ads.zzaqq r14 = new com.google.android.gms.internal.ads.zzaqq     // Catch:{ IOException -> 0x01bd }
            r14.<init>(r13, r11)     // Catch:{ IOException -> 0x01bd }
            r11 = 1024(0x400, float:1.435E-42)
            byte[] r11 = r13.zzb(r11)     // Catch:{ all -> 0x0143 }
        L_0x0122:
            int r15 = r8.read(r11)     // Catch:{ all -> 0x012d }
            r7 = -1
            if (r15 == r7) goto L_0x012f
            r14.write(r11, r9, r15)     // Catch:{ all -> 0x012d }
            goto L_0x0122
        L_0x012d:
            r0 = move-exception
            goto L_0x0145
        L_0x012f:
            byte[] r7 = r14.toByteArray()     // Catch:{ all -> 0x012d }
            r8.close()     // Catch:{ IOException -> 0x0137 }
            goto L_0x013c
        L_0x0137:
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x01bd }
            com.google.android.gms.internal.ads.zzapy.zzd(r3, r8)     // Catch:{ IOException -> 0x01bd }
        L_0x013c:
            r13.zza(r11)     // Catch:{ IOException -> 0x01bd }
            r14.close()     // Catch:{ IOException -> 0x01bd }
            goto L_0x0157
        L_0x0143:
            r0 = move-exception
            r11 = 0
        L_0x0145:
            r8.close()     // Catch:{ IOException -> 0x0149 }
            goto L_0x014e
        L_0x0149:
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x01bd }
            com.google.android.gms.internal.ads.zzapy.zzd(r3, r7)     // Catch:{ IOException -> 0x01bd }
        L_0x014e:
            r13.zza(r11)     // Catch:{ IOException -> 0x01bd }
            r14.close()     // Catch:{ IOException -> 0x01bd }
            throw r0     // Catch:{ IOException -> 0x01bd }
        L_0x0155:
            byte[] r7 = new byte[r9]     // Catch:{ IOException -> 0x01bd }
        L_0x0157:
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01ba }
            long r13 = r13 - r4
            boolean r8 = com.google.android.gms.internal.ads.zzapy.zzb     // Catch:{ IOException -> 0x01ba }
            if (r8 != 0) goto L_0x0166
            r15 = 3000(0xbb8, double:1.482E-320)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x019b
        L_0x0166:
            java.lang.String r8 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ IOException -> 0x01ba }
            if (r7 == 0) goto L_0x0174
            int r13 = r7.length     // Catch:{ IOException -> 0x01ba }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x01ba }
            goto L_0x0176
        L_0x0174:
            java.lang.String r13 = "null"
        L_0x0176:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x01ba }
            com.google.android.gms.internal.ads.zzapa r15 = r21.zzy()     // Catch:{ IOException -> 0x01ba }
            int r15 = r15.zza()     // Catch:{ IOException -> 0x01ba }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x01ba }
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x01ba }
            r6[r9] = r2     // Catch:{ IOException -> 0x01ba }
            r16 = 1
            r6[r16] = r11     // Catch:{ IOException -> 0x01ba }
            r11 = 2
            r6[r11] = r13     // Catch:{ IOException -> 0x01ba }
            r11 = 3
            r6[r11] = r14     // Catch:{ IOException -> 0x01ba }
            r11 = 4
            r6[r11] = r15     // Catch:{ IOException -> 0x01ba }
            com.google.android.gms.internal.ads.zzapy.zza(r8, r6)     // Catch:{ IOException -> 0x01ba }
        L_0x019b:
            r6 = 200(0xc8, float:2.8E-43)
            if (r12 < r6) goto L_0x01b4
            r6 = 299(0x12b, float:4.19E-43)
            if (r12 > r6) goto L_0x01b4
            com.google.android.gms.internal.ads.zzapi r6 = new com.google.android.gms.internal.ads.zzapi     // Catch:{ IOException -> 0x01ba }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01ba }
            long r15 = r13 - r4
            r14 = 0
            r11 = r6
            r13 = r7
            r17 = r0
            r11.<init>((int) r12, (byte[]) r13, (boolean) r14, (long) r15, (java.util.List) r17)     // Catch:{ IOException -> 0x01ba }
            return r6
        L_0x01b4:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01ba }
            r0.<init>()     // Catch:{ IOException -> 0x01ba }
            throw r0     // Catch:{ IOException -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            r12 = r7
            goto L_0x01c2
        L_0x01bd:
            r0 = move-exception
            goto L_0x01c1
        L_0x01bf:
            r0 = move-exception
            r10 = 0
        L_0x01c1:
            r12 = 0
        L_0x01c2:
            boolean r6 = r0 instanceof java.net.SocketTimeoutException
            if (r6 == 0) goto L_0x01d6
            com.google.android.gms.internal.ads.zzaqo r0 = new com.google.android.gms.internal.ads.zzaqo
            com.google.android.gms.internal.ads.zzapu r6 = new com.google.android.gms.internal.ads.zzapu
            r6.<init>()
            java.lang.String r7 = "socket"
            r8 = 0
            r0.<init>(r7, r6, r8)
        L_0x01d3:
            r6 = r0
            goto L_0x0242
        L_0x01d6:
            boolean r6 = r0 instanceof java.net.MalformedURLException
            if (r6 != 0) goto L_0x028d
            if (r10 == 0) goto L_0x0287
            int r0 = r10.zzb()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = r21.zzk()
            r8 = 2
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r6
            r6 = 1
            r11[r6] = r7
            java.lang.String r6 = "Unexpected response code %d for %s"
            com.google.android.gms.internal.ads.zzapy.zzb(r6, r11)
            if (r12 == 0) goto L_0x0234
            java.util.List r16 = r10.zzd()
            com.google.android.gms.internal.ads.zzapi r6 = new com.google.android.gms.internal.ads.zzapi
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r14 = r7 - r4
            r13 = 0
            r10 = r6
            r11 = r0
            r10.<init>((int) r11, (byte[]) r12, (boolean) r13, (long) r14, (java.util.List) r16)
            r7 = 401(0x191, float:5.62E-43)
            if (r0 == r7) goto L_0x0226
            r7 = 403(0x193, float:5.65E-43)
            if (r0 != r7) goto L_0x0212
            goto L_0x0226
        L_0x0212:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x0220
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 > r2) goto L_0x0220
            com.google.android.gms.internal.ads.zzaoz r0 = new com.google.android.gms.internal.ads.zzaoz
            r0.<init>(r6)
            throw r0
        L_0x0220:
            com.google.android.gms.internal.ads.zzapt r0 = new com.google.android.gms.internal.ads.zzapt
            r0.<init>(r6)
            throw r0
        L_0x0226:
            com.google.android.gms.internal.ads.zzaqo r0 = new com.google.android.gms.internal.ads.zzaqo
            com.google.android.gms.internal.ads.zzaou r7 = new com.google.android.gms.internal.ads.zzaou
            r7.<init>(r6)
            java.lang.String r6 = "auth"
            r8 = 0
            r0.<init>(r6, r7, r8)
            goto L_0x01d3
        L_0x0234:
            r8 = 0
            com.google.android.gms.internal.ads.zzaqo r0 = new com.google.android.gms.internal.ads.zzaqo
            com.google.android.gms.internal.ads.zzaph r6 = new com.google.android.gms.internal.ads.zzaph
            r6.<init>()
            java.lang.String r7 = "network"
            r0.<init>(r7, r6, r8)
            goto L_0x01d3
        L_0x0242:
            com.google.android.gms.internal.ads.zzapa r0 = r21.zzy()
            int r7 = r21.zzb()
            com.google.android.gms.internal.ads.zzapv r8 = r6.zzb     // Catch:{ zzapv -> 0x026c }
            r0.zzc(r8)     // Catch:{ zzapv -> 0x026c }
            java.lang.String r0 = r6.zza
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r9] = r0
            r8 = 1
            r7[r8] = r6
            java.lang.String r0 = "%s-retry [timeout=%s]"
            java.lang.String r0 = java.lang.String.format(r0, r7)
            r2.zzm(r0)
            goto L_0x000a
        L_0x026c:
            r0 = move-exception
            java.lang.String r3 = r6.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r9] = r3
            r3 = 1
            r5[r3] = r4
            java.lang.String r3 = "%s-timeout-giveup [timeout=%s]"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r2.zzm(r3)
            throw r0
        L_0x0287:
            com.google.android.gms.internal.ads.zzapj r2 = new com.google.android.gms.internal.ads.zzapj
            r2.<init>(r0)
            throw r2
        L_0x028d:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r2 = r21.zzk()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r4.concat(r2)
            r3.<init>(r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqb.zza(com.google.android.gms.internal.ads.zzapm):com.google.android.gms.internal.ads.zzapi");
    }
}
