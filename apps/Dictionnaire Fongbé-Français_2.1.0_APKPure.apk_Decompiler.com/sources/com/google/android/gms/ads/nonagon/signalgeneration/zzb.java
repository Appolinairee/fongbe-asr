package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzdre;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzb {
    private final Context zza;
    private final zzd zzb;
    private final long zzc;
    private final ScheduledExecutorService zzd;
    private final PackageInfo zze;

    zzb(Context context, long j, PackageInfo packageInfo, zzd zzd2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzc = j;
        this.zze = packageInfo;
        this.zzb = zzd2;
        this.zzd = scheduledExecutorService;
    }

    public static String zzb(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i % 555));
        }
        return new String(charArray);
    }

    private final boolean zze() {
        return this.zzb.zzf().size() >= ((Integer) zzbe.zzc().zza(zzbcl.zzhv)).intValue();
    }

    private static final void zzf(Bundle bundle, zzdre zzdre) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhw)).booleanValue()) {
            bundle.putLong(zzdre.zza(), zzv.zzC().currentTimeMillis());
        }
    }

    private static final void zzg(Bundle bundle, int i) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010e, code lost:
        if (r10.zza() > r8) goto L_0x0120;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zza(com.google.android.gms.internal.ads.zzbyy r18, com.google.android.gms.ads.nonagon.signalgeneration.zzau r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r20
            java.lang.String r3 = "DiskCachingManager.getSignalResponse"
            com.google.android.gms.internal.ads.zzdre r4 = com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_VALIDATION_START
            zzf(r2, r4)
            com.google.android.gms.internal.ads.zzbzm r4 = com.google.android.gms.ads.internal.zzv.zzp()
            com.google.android.gms.ads.internal.util.zzg r4 = r4.zzi()
            boolean r4 = r4.zzN()
            r5 = 0
            if (r4 == 0) goto L_0x0026
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r1.zzb
            r0.zzg()
            r0 = 7
            zzg(r2, r0)
            goto L_0x0034
        L_0x0026:
            android.content.pm.PackageInfo r4 = r1.zze
            r6 = 10
            if (r4 != 0) goto L_0x0035
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r1.zzb
            r0.zzg()
            zzg(r2, r6)
        L_0x0034:
            return r5
        L_0x0035:
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r4 = r1.zzb
            android.content.Context r7 = r1.zza
            java.lang.String r8 = r4.zze()
            int r9 = r4.zzb()
            java.lang.String r10 = r4.zzd()
            int r4 = r4.zza()
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()
            java.lang.String r7 = r7.packageName
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L_0x0130
            android.content.pm.PackageInfo r7 = r1.zze
            int r7 = r7.versionCode
            if (r9 != r7) goto L_0x0130
            java.lang.String r7 = android.os.Build.MODEL
            boolean r7 = android.text.TextUtils.equals(r7, r10)
            if (r7 == 0) goto L_0x0130
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r4 == r7) goto L_0x0069
            goto L_0x0130
        L_0x0069:
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r4 = r1.zzb
            java.util.Map r4 = r4.zzf()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0077:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x014a
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.Object r9 = r7.getValue()     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException | JSONException -> 0x012d }
            r8.<init>(r9)     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.String r9 = "ts_ms"
            long r8 = r8.getLong(r9)     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.common.util.Clock r10 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ IOException | JSONException -> 0x012d }
            long r10 = r10.currentTimeMillis()     // Catch:{ IOException | JSONException -> 0x012d }
            long r10 = r10 - r8
            com.google.android.gms.internal.ads.zzbcc r12 = com.google.android.gms.internal.ads.zzbcl.zzhu     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzbcj r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.Object r12 = r13.zza(r12)     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ IOException | JSONException -> 0x012d }
            long r12 = r12.longValue()     // Catch:{ IOException | JSONException -> 0x012d }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x00b2
            goto L_0x0120
        L_0x00b2:
            android.content.Context r10 = r1.zza     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzfre r10 = com.google.android.gms.internal.ads.zzfre.zzj(r10)     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzbcc r11 = com.google.android.gms.internal.ads.zzbcl.zzdp     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.Object r11 = r12.zza(r11)     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ IOException | JSONException -> 0x012d }
            long r11 = r11.longValue()     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzbzm r13 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.ads.internal.util.zzg r13 = r13.zzi()     // Catch:{ IOException | JSONException -> 0x012d }
            boolean r13 = r13.zzN()     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzfra r10 = r10.zzh(r11, r13)     // Catch:{ IOException | JSONException -> 0x012d }
            android.content.Context r11 = r1.zza     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzfrf r11 = com.google.android.gms.internal.ads.zzfrf.zzi(r11)     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzbcc r12 = com.google.android.gms.internal.ads.zzbcl.zzdq     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzbcj r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.Object r12 = r13.zza(r12)     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ IOException | JSONException -> 0x012d }
            long r12 = r12.longValue()     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzbzm r14 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.ads.internal.util.zzg r14 = r14.zzi()     // Catch:{ IOException | JSONException -> 0x012d }
            boolean r14 = r14.zzN()     // Catch:{ IOException | JSONException -> 0x012d }
            com.google.android.gms.internal.ads.zzfra r11 = r11.zzh(r12, r14)     // Catch:{ IOException | JSONException -> 0x012d }
            long r12 = r10.zza()     // Catch:{ IOException | JSONException -> 0x012d }
            r14 = -1
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0110
            long r12 = r10.zza()     // Catch:{ IOException | JSONException -> 0x012d }
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0120
        L_0x0110:
            long r12 = r11.zza()     // Catch:{ IOException | JSONException -> 0x012d }
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0077
            long r10 = r11.zza()     // Catch:{ IOException | JSONException -> 0x012d }
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0077
        L_0x0120:
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r8 = r1.zzb     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.Object r7 = r7.getKey()     // Catch:{ IOException | JSONException -> 0x012d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException | JSONException -> 0x012d }
            r8.zzc(r7)     // Catch:{ IOException | JSONException -> 0x012d }
            goto L_0x0077
        L_0x012d:
            goto L_0x0077
        L_0x0130:
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r4 = r1.zzb
            r4.zzg()
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r4 = r1.zzb
            android.content.Context r7 = r1.zza
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()
            java.lang.String r7 = r7.packageName
            android.content.pm.PackageInfo r8 = r1.zze
            int r8 = r8.versionCode
            java.lang.String r9 = android.os.Build.MODEL
            int r10 = android.os.Build.VERSION.SDK_INT
            r4.zzi(r7, r8, r9, r10)
        L_0x014a:
            com.google.android.gms.internal.ads.zzdre r4 = com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_VALIDATION_END
            zzf(r2, r4)
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzv.zzC()
            long r7 = r4.currentTimeMillis()
            long r9 = r1.zzc
            long r7 = r7 - r9
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzhr
            com.google.android.gms.internal.ads.zzbcj r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r9.zza(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r9 = r4.longValue()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0173
            r0 = 2
            zzg(r2, r0)
            return r5
        L_0x0173:
            com.google.android.gms.internal.ads.zzdre r4 = com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_CACHE_KEY_START
            zzf(r2, r4)
            java.lang.String r4 = r0.zza
            java.lang.String r7 = r0.zzb
            com.google.android.gms.ads.internal.client.zzm r8 = r0.zzd
            android.os.Bundle r8 = r8.zzn
            java.lang.String r8 = r8.toString()
            com.google.android.gms.ads.internal.client.zzm r9 = r0.zzd
            android.os.Bundle r9 = r9.zzc
            java.lang.String r9 = r9.toString()
            com.google.android.gms.ads.internal.client.zzm r10 = r0.zzd
            java.lang.String r11 = r10.zzi
            java.lang.String r12 = r10.zzp
            java.util.List r10 = r10.zzo
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            r13.append(r7)
            r13.append(r8)
            r13.append(r9)
            r13.append(r11)
            r13.append(r12)
            r13.append(r10)
            java.lang.String r4 = r13.toString()
            java.lang.String r4 = com.google.android.gms.ads.internal.util.client.zzf.zzg(r4)
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 == 0) goto L_0x01c5
            r0 = 3
            zzg(r2, r0)
            return r5
        L_0x01c5:
            com.google.android.gms.internal.ads.zzdre r7 = com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_CACHE_KEY_END
            zzf(r2, r7)
            com.google.android.gms.internal.ads.zzdre r7 = com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_START
            zzf(r2, r7)
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r7 = r1.zzb
            java.lang.String r14 = r7.zzc(r4)
            com.google.android.gms.internal.ads.zzdre r7 = com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_END
            zzf(r2, r7)
            boolean r7 = r17.zze()
            if (r7 != 0) goto L_0x020e
            java.lang.String r8 = r0.zza
            java.lang.String r9 = r0.zzb
            com.google.android.gms.ads.internal.client.zzs r10 = r0.zzc
            com.google.android.gms.ads.internal.client.zzm r11 = r0.zzd
            com.google.android.gms.internal.ads.zzbyy r0 = new com.google.android.gms.internal.ads.zzbyy
            r12 = 2
            r7 = r0
            r13 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.concurrent.ScheduledExecutorService r7 = r1.zzd
            com.google.android.gms.ads.nonagon.signalgeneration.zza r8 = new com.google.android.gms.ads.nonagon.signalgeneration.zza
            r9 = r19
            r8.<init>(r1, r4, r9, r0)
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzht
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r4.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r9 = r0.longValue()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r7.schedule(r8, r9, r0)
        L_0x020e:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L_0x0219
            r0 = 4
            zzg(r2, r0)
            return r5
        L_0x0219:
            com.google.android.gms.internal.ads.zzdre r0 = com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_DECODE_START
            zzf(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0282 }
            r0.<init>(r14)     // Catch:{ JSONException -> 0x0282 }
            java.lang.String r4 = "sr"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x0282 }
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0282 }
            if (r7 == 0) goto L_0x0235
            r0 = 8
            zzg(r2, r0)     // Catch:{ JSONException -> 0x0282 }
            return r5
        L_0x0235:
            java.lang.String r7 = "rs"
            java.lang.String r0 = r0.getString(r7)     // Catch:{ JSONException -> 0x0282 }
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0282 }
            if (r7 == 0) goto L_0x0247
            r0 = 9
            zzg(r2, r0)     // Catch:{ JSONException -> 0x0282 }
            return r5
        L_0x0247:
            java.lang.String r7 = new java.lang.String     // Catch:{ JSONException -> 0x0282 }
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch:{ JSONException -> 0x0282 }
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ JSONException -> 0x0282 }
            r7.<init>(r0, r6)     // Catch:{ JSONException -> 0x0282 }
            java.lang.String r0 = zzb(r7)     // Catch:{ JSONException -> 0x0282 }
            com.google.android.gms.internal.ads.zzdre r6 = com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_DECODE_END     // Catch:{ JSONException -> 0x0282 }
            zzf(r2, r6)     // Catch:{ JSONException -> 0x0282 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzbk r6 = new com.google.android.gms.ads.nonagon.signalgeneration.zzbk     // Catch:{ IOException -> 0x0275 }
            android.util.JsonReader r7 = new android.util.JsonReader     // Catch:{ IOException -> 0x0275 }
            java.io.StringReader r8 = new java.io.StringReader     // Catch:{ IOException -> 0x0275 }
            r8.<init>(r4)     // Catch:{ IOException -> 0x0275 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0275 }
            r6.<init>(r7, r5)     // Catch:{ IOException -> 0x0275 }
            r6.zzc = r0     // Catch:{ IOException -> 0x0275 }
            r6.zze = r2     // Catch:{ IOException -> 0x0275 }
            java.lang.String r0 = "sod_h"
            r4 = 1
            r2.putBoolean(r0, r4)     // Catch:{ IOException -> 0x0275 }
            return r6
        L_0x0275:
            r0 = move-exception
            r4 = 6
            zzg(r2, r4)
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r3)
            return r5
        L_0x0282:
            r0 = move-exception
            r4 = 5
            zzg(r2, r4)
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zza(com.google.android.gms.internal.ads.zzbyy, com.google.android.gms.ads.nonagon.signalgeneration.zzau, android.os.Bundle):com.google.android.gms.ads.nonagon.signalgeneration.zzbk");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(String str, zzau zzau, zzbyy zzbyy) {
        if (!this.zzb.zzj(str) && !zze()) {
            zzau.zzf(ObjectWrapper.wrap(this.zza), zzbyy, (zzbyr) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(java.lang.String r6, com.google.android.gms.ads.nonagon.signalgeneration.zzbk r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0079
            boolean r0 = r5.zze()
            if (r0 == 0) goto L_0x000d
            goto L_0x0079
        L_0x000d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0060 }
            r1.<init>()     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.zza     // Catch:{ JSONException -> 0x0060 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r2 = "signal_dictionary"
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch:{ JSONException -> 0x0060 }
            android.os.Bundle r4 = r7.zzf     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONObject r3 = r3.zzi(r4)     // Catch:{ JSONException -> 0x0060 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r7 = r7.zzc     // Catch:{ JSONException -> 0x0060 }
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0060 }
            if (r1 == 0) goto L_0x003d
            java.lang.String r7 = ""
            goto L_0x006e
        L_0x003d:
            java.lang.String r7 = zzb(r7)     // Catch:{ JSONException -> 0x0060 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ JSONException -> 0x0060 }
            byte[] r7 = r7.getBytes(r1)     // Catch:{ JSONException -> 0x0060 }
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r7 = "ts_ms"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ JSONException -> 0x0060 }
            long r1 = r1.currentTimeMillis()     // Catch:{ JSONException -> 0x0060 }
            r0.put(r7, r1)     // Catch:{ JSONException -> 0x0060 }
            goto L_0x006a
        L_0x0060:
            r7 = move-exception
            java.lang.String r1 = "DiskCachingManager.createStringToWrite"
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r7, r1)
        L_0x006a:
            java.lang.String r7 = r0.toString()
        L_0x006e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0079
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r5.zzb
            r0.zzh(r6, r7)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zzd(java.lang.String, com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }
}
