package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzu implements zze {
    private final String zza;

    public zzu() {
        throw null;
    }

    public zzu(String str) {
        this.zza = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0094, code lost:
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e4, code lost:
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e9, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = ". "
            java.lang.String r1 = "Received non-success response code "
            java.lang.String r2 = "Error while pinging URL: "
            java.lang.String r3 = "Error while parsing ping URL: "
            java.lang.String r4 = "Pinging URL: "
            com.google.android.gms.ads.internal.util.client.zzt r5 = com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE
            boolean r6 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            if (r6 == 0) goto L_0x0017
            r6 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
        L_0x0017:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            r6.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            r6.append(r10)     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            java.lang.String r4 = r6.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            com.google.android.gms.ads.internal.util.client.zzo.zze(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            java.net.URI r4 = new java.net.URI     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            r4.<init>(r10)     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            java.net.URL r4 = r4.toURL()     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch:{ all -> 0x009b }
            java.lang.String r6 = r9.zza     // Catch:{ all -> 0x009b }
            r7 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r7)     // Catch:{ all -> 0x009b }
            r8 = 1
            r4.setInstanceFollowRedirects(r8)     // Catch:{ all -> 0x009b }
            r4.setReadTimeout(r7)     // Catch:{ all -> 0x009b }
            if (r6 == 0) goto L_0x004e
            java.lang.String r7 = "User-Agent"
            r4.setRequestProperty(r7, r6)     // Catch:{ all -> 0x009b }
        L_0x004e:
            r6 = 0
            r4.setUseCaches(r6)     // Catch:{ all -> 0x009b }
            com.google.android.gms.ads.internal.util.client.zzl r6 = new com.google.android.gms.ads.internal.util.client.zzl     // Catch:{ all -> 0x009b }
            r7 = 0
            r6.<init>(r7)     // Catch:{ all -> 0x009b }
            r6.zzc(r4, r7)     // Catch:{ all -> 0x009b }
            int r7 = r4.getResponseCode()     // Catch:{ all -> 0x009b }
            r6.zze(r4, r7)     // Catch:{ all -> 0x009b }
            r6 = 200(0xc8, float:2.8E-43)
            if (r7 < r6) goto L_0x006f
            r6 = 300(0x12c, float:4.2E-43)
            if (r7 < r6) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            com.google.android.gms.ads.internal.util.client.zzt r1 = com.google.android.gms.ads.internal.util.client.zzt.SUCCESS     // Catch:{ all -> 0x009b }
        L_0x006d:
            r5 = r1
            goto L_0x008d
        L_0x006f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r6.<init>(r1)     // Catch:{ all -> 0x009b }
            r6.append(r7)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = " from pinging URL: "
            r6.append(r1)     // Catch:{ all -> 0x009b }
            r6.append(r10)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x009b }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r1)     // Catch:{ all -> 0x009b }
            r1 = 502(0x1f6, float:7.03E-43)
            if (r7 != r1) goto L_0x008d
            com.google.android.gms.ads.internal.util.client.zzt r1 = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE     // Catch:{ all -> 0x009b }
            goto L_0x006d
        L_0x008d:
            r4.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto L_0x00e9
            goto L_0x00e6
        L_0x0097:
            r1 = move-exception
            goto L_0x00c7
        L_0x0099:
            r1 = move-exception
            goto L_0x00c7
        L_0x009b:
            r1 = move-exception
            r4.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
            throw r1     // Catch:{ IndexOutOfBoundsException -> 0x0099, URISyntaxException -> 0x0097, IOException -> 0x00a4, RuntimeException -> 0x00a2 }
        L_0x00a0:
            r10 = move-exception
            goto L_0x00ea
        L_0x00a2:
            r1 = move-exception
            goto L_0x00a5
        L_0x00a4:
            r1 = move-exception
        L_0x00a5:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r3.<init>(r2)     // Catch:{ all -> 0x00a0 }
            r3.append(r10)     // Catch:{ all -> 0x00a0 }
            r3.append(r0)     // Catch:{ all -> 0x00a0 }
            r3.append(r1)     // Catch:{ all -> 0x00a0 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r10)     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.ads.internal.util.client.zzt r5 = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE     // Catch:{ all -> 0x00a0 }
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto L_0x00e9
            goto L_0x00e6
        L_0x00c7:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r2.<init>(r3)     // Catch:{ all -> 0x00a0 }
            r2.append(r10)     // Catch:{ all -> 0x00a0 }
            r2.append(r0)     // Catch:{ all -> 0x00a0 }
            r2.append(r1)     // Catch:{ all -> 0x00a0 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r10)     // Catch:{ all -> 0x00a0 }
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto L_0x00e9
        L_0x00e6:
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00e9:
            return r5
        L_0x00ea:
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r0 == 0) goto L_0x00f3
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00f3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.zzu.zza(java.lang.String):com.google.android.gms.ads.internal.util.client.zzt");
    }
}
