package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaqi implements zzaow {
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final zzaqh zzc;
    private final int zzd;

    public zzaqi(zzaqh zzaqh, int i) {
        this.zzc = zzaqh;
        this.zzd = 5242880;
    }

    static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(InputStream inputStream) throws IOException {
        return (((long) zzn(inputStream)) & 255) | ((((long) zzn(inputStream)) & 255) << 8) | ((((long) zzn(inputStream)) & 255) << 16) | ((((long) zzn(inputStream)) & 255) << 24) | ((((long) zzn(inputStream)) & 255) << 32) | ((((long) zzn(inputStream)) & 255) << 40) | ((((long) zzn(inputStream)) & 255) << 48) | ((((long) zzn(inputStream)) & 255) << 56);
    }

    static String zzh(zzaqg zzaqg) throws IOException {
        return new String(zzm(zzaqg, zzf(zzaqg)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzaqg zzaqg, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long zza2 = zzaqg.zza();
        if (i >= 0 && j <= zza2) {
            int i2 = (int) j;
            if (((long) i2) == j) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzaqg).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + zza2);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqf zzaqf) {
        if (!this.zza.containsKey(str)) {
            this.zzb += zzaqf.zza;
        } else {
            this.zzb += zzaqf.zza - ((zzaqf) this.zza.get(str)).zza;
        }
        this.zza.put(str, zzaqf);
    }

    private final void zzp(String str) {
        zzaqf zzaqf = (zzaqf) this.zza.remove(str);
        if (zzaqf != null) {
            this.zzb -= zzaqf.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized zzaov zza(String str) {
        zzaqg zzaqg;
        zzaqf zzaqf = (zzaqf) this.zza.get(str);
        if (zzaqf == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzaqg = new zzaqg(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            zzaqf zza2 = zzaqf.zza(zzaqg);
            if (!TextUtils.equals(str, zza2.zzb)) {
                zzapy.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza2.zzb);
                zzp(str);
                zzaqg.close();
                return null;
            }
            byte[] zzm = zzm(zzaqg, zzaqg.zza());
            zzaov zzaov = new zzaov();
            zzaov.zza = zzm;
            zzaov.zzb = zzaqf.zzc;
            zzaov.zzc = zzaqf.zzd;
            zzaov.zzd = zzaqf.zze;
            zzaov.zze = zzaqf.zzf;
            zzaov.zzf = zzaqf.zzg;
            List<zzape> list = zzaqf.zzh;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzape zzape : list) {
                treeMap.put(zzape.zza(), zzape.zzb());
            }
            zzaov.zzg = treeMap;
            zzaov.zzh = Collections.unmodifiableList(zzaqf.zzh);
            zzaqg.close();
            return zzaov;
        } catch (IOException e) {
            zzapy.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        } catch (Throwable th) {
            zzaqg.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.zzaqh r0 = r8.zzc     // Catch:{ all -> 0x005e }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x005e }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x005c
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x005e }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x005e }
            r1[r2] = r0     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.google.android.gms.internal.ads.zzapy.zzb(r0, r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r8)
            return
        L_0x0024:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x005c
        L_0x002a:
            int r1 = r0.length     // Catch:{ all -> 0x005e }
            if (r2 >= r1) goto L_0x005c
            r1 = r0[r2]     // Catch:{ all -> 0x005e }
            long r3 = r1.length()     // Catch:{ IOException -> 0x0056 }
            com.google.android.gms.internal.ads.zzaqg r5 = new com.google.android.gms.internal.ads.zzaqg     // Catch:{ IOException -> 0x0056 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0056 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0056 }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0056 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0056 }
            r5.<init>(r6, r3)     // Catch:{ IOException -> 0x0056 }
            com.google.android.gms.internal.ads.zzaqf r6 = com.google.android.gms.internal.ads.zzaqf.zza(r5)     // Catch:{ all -> 0x0051 }
            r6.zza = r3     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = r6.zzb     // Catch:{ all -> 0x0051 }
            r8.zzo(r3, r6)     // Catch:{ all -> 0x0051 }
            r5.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0059
        L_0x0051:
            r3 = move-exception
            r5.close()     // Catch:{ IOException -> 0x0056 }
            throw r3     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r1.delete()     // Catch:{ all -> 0x005e }
        L_0x0059:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x005c:
            monitor-exit(r8)
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x005e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqi.zzb():void");
    }

    public final synchronized void zzc(String str, boolean z) {
        zzaov zza2 = zza(str);
        if (zza2 != null) {
            zza2.zzf = 0;
            zza2.zze = 0;
            zzd(str, zza2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x016b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzd(java.lang.String r16, com.google.android.gms.internal.ads.zzaov r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.zzb     // Catch:{ all -> 0x01a1 }
            byte[] r5 = r2.zza     // Catch:{ all -> 0x01a1 }
            int r5 = r5.length     // Catch:{ all -> 0x01a1 }
            long r6 = (long) r5     // Catch:{ all -> 0x01a1 }
            long r3 = r3 + r6
            int r6 = r1.zzd     // Catch:{ all -> 0x01a1 }
            long r7 = (long) r6     // Catch:{ all -> 0x01a1 }
            r9 = 1063675494(0x3f666666, float:0.9)
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x001f
            float r3 = (float) r5     // Catch:{ all -> 0x01a1 }
            float r4 = (float) r6     // Catch:{ all -> 0x01a1 }
            float r4 = r4 * r9
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x019f
        L_0x001f:
            java.io.File r3 = r15.zzg(r16)     // Catch:{ all -> 0x01a1 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x016b }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x016b }
            r7.<init>(r3)     // Catch:{ IOException -> 0x016b }
            r6.<init>(r7)     // Catch:{ IOException -> 0x016b }
            com.google.android.gms.internal.ads.zzaqf r7 = new com.google.android.gms.internal.ads.zzaqf     // Catch:{ IOException -> 0x016b }
            r7.<init>(r0, r2)     // Catch:{ IOException -> 0x016b }
            r8 = 538247942(0x20150306, float:1.2621791E-19)
            zzj(r6, r8)     // Catch:{ IOException -> 0x0147 }
            java.lang.String r8 = r7.zzb     // Catch:{ IOException -> 0x0147 }
            zzl(r6, r8)     // Catch:{ IOException -> 0x0147 }
            java.lang.String r8 = r7.zzc     // Catch:{ IOException -> 0x0147 }
            if (r8 != 0) goto L_0x0045
            java.lang.String r8 = ""
        L_0x0045:
            zzl(r6, r8)     // Catch:{ IOException -> 0x0147 }
            long r10 = r7.zzd     // Catch:{ IOException -> 0x0147 }
            zzk(r6, r10)     // Catch:{ IOException -> 0x0147 }
            long r10 = r7.zze     // Catch:{ IOException -> 0x0147 }
            zzk(r6, r10)     // Catch:{ IOException -> 0x0147 }
            long r10 = r7.zzf     // Catch:{ IOException -> 0x0147 }
            zzk(r6, r10)     // Catch:{ IOException -> 0x0147 }
            long r10 = r7.zzg     // Catch:{ IOException -> 0x0147 }
            zzk(r6, r10)     // Catch:{ IOException -> 0x0147 }
            java.util.List r8 = r7.zzh     // Catch:{ IOException -> 0x0147 }
            if (r8 == 0) goto L_0x0086
            int r10 = r8.size()     // Catch:{ IOException -> 0x0147 }
            zzj(r6, r10)     // Catch:{ IOException -> 0x0147 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0147 }
        L_0x006b:
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x0147 }
            if (r10 == 0) goto L_0x0089
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x0147 }
            com.google.android.gms.internal.ads.zzape r10 = (com.google.android.gms.internal.ads.zzape) r10     // Catch:{ IOException -> 0x0147 }
            java.lang.String r11 = r10.zza()     // Catch:{ IOException -> 0x0147 }
            zzl(r6, r11)     // Catch:{ IOException -> 0x0147 }
            java.lang.String r10 = r10.zzb()     // Catch:{ IOException -> 0x0147 }
            zzl(r6, r10)     // Catch:{ IOException -> 0x0147 }
            goto L_0x006b
        L_0x0086:
            zzj(r6, r5)     // Catch:{ IOException -> 0x0147 }
        L_0x0089:
            r6.flush()     // Catch:{ IOException -> 0x0147 }
            byte[] r2 = r2.zza     // Catch:{ IOException -> 0x016b }
            r6.write(r2)     // Catch:{ IOException -> 0x016b }
            r6.close()     // Catch:{ IOException -> 0x016b }
            long r10 = r3.length()     // Catch:{ IOException -> 0x016b }
            r7.zza = r10     // Catch:{ IOException -> 0x016b }
            r15.zzo(r0, r7)     // Catch:{ IOException -> 0x016b }
            long r6 = r1.zzb     // Catch:{ IOException -> 0x016b }
            int r0 = r1.zzd     // Catch:{ IOException -> 0x016b }
            long r10 = (long) r0     // Catch:{ IOException -> 0x016b }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
            goto L_0x019f
        L_0x00a8:
            boolean r0 = com.google.android.gms.internal.ads.zzapy.zzb     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x016b }
            com.google.android.gms.internal.ads.zzapy.zzd(r0, r2)     // Catch:{ IOException -> 0x016b }
        L_0x00b3:
            long r6 = r1.zzb     // Catch:{ IOException -> 0x016b }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016b }
            java.util.Map r0 = r1.zza     // Catch:{ IOException -> 0x016b }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x016b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x016b }
            r2 = 0
        L_0x00c4:
            boolean r8 = r0.hasNext()     // Catch:{ IOException -> 0x016b }
            r12 = 2
            if (r8 == 0) goto L_0x011b
            java.lang.Object r8 = r0.next()     // Catch:{ IOException -> 0x016b }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ IOException -> 0x016b }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IOException -> 0x016b }
            com.google.android.gms.internal.ads.zzaqf r8 = (com.google.android.gms.internal.ads.zzaqf) r8     // Catch:{ IOException -> 0x016b }
            java.lang.String r13 = r8.zzb     // Catch:{ IOException -> 0x016b }
            java.io.File r13 = r15.zzg(r13)     // Catch:{ IOException -> 0x016b }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x016b }
            if (r13 == 0) goto L_0x00ed
            long r13 = r1.zzb     // Catch:{ IOException -> 0x016b }
            r16 = r10
            long r9 = r8.zza     // Catch:{ IOException -> 0x016b }
            long r13 = r13 - r9
            r1.zzb = r13     // Catch:{ IOException -> 0x016b }
            goto L_0x0100
        L_0x00ed:
            r16 = r10
            java.lang.String r9 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.String r8 = r8.zzb     // Catch:{ IOException -> 0x016b }
            java.lang.String r10 = zzq(r8)     // Catch:{ IOException -> 0x016b }
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x016b }
            r11[r5] = r8     // Catch:{ IOException -> 0x016b }
            r11[r4] = r10     // Catch:{ IOException -> 0x016b }
            com.google.android.gms.internal.ads.zzapy.zza(r9, r11)     // Catch:{ IOException -> 0x016b }
        L_0x0100:
            r0.remove()     // Catch:{ IOException -> 0x016b }
            int r2 = r2 + 1
            long r8 = r1.zzb     // Catch:{ IOException -> 0x016b }
            float r8 = (float) r8     // Catch:{ IOException -> 0x016b }
            int r9 = r1.zzd     // Catch:{ IOException -> 0x016b }
            float r9 = (float) r9     // Catch:{ IOException -> 0x016b }
            r10 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r10
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0115
            goto L_0x011d
        L_0x0115:
            r10 = r16
            r9 = 1063675494(0x3f666666, float:0.9)
            goto L_0x00c4
        L_0x011b:
            r16 = r10
        L_0x011d:
            boolean r0 = com.google.android.gms.internal.ads.zzapy.zzb     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = "pruned %d files, %d bytes, %d ms"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x016b }
            long r8 = r1.zzb     // Catch:{ IOException -> 0x016b }
            long r8 = r8 - r6
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x016b }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016b }
            r9 = r16
            long r7 = r7 - r9
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x016b }
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x016b }
            r8[r5] = r2     // Catch:{ IOException -> 0x016b }
            r8[r4] = r6     // Catch:{ IOException -> 0x016b }
            r8[r12] = r7     // Catch:{ IOException -> 0x016b }
            com.google.android.gms.internal.ads.zzapy.zzd(r0, r8)     // Catch:{ IOException -> 0x016b }
            monitor-exit(r15)
            return
        L_0x0147:
            r0 = move-exception
            java.lang.String r2 = "%s"
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x016b }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016b }
            r7[r5] = r0     // Catch:{ IOException -> 0x016b }
            com.google.android.gms.internal.ads.zzapy.zza(r2, r7)     // Catch:{ IOException -> 0x016b }
            r6.close()     // Catch:{ IOException -> 0x016b }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x016b }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016b }
            r6[r5] = r2     // Catch:{ IOException -> 0x016b }
            com.google.android.gms.internal.ads.zzapy.zza(r0, r6)     // Catch:{ IOException -> 0x016b }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x016b }
            r0.<init>()     // Catch:{ IOException -> 0x016b }
            throw r0     // Catch:{ IOException -> 0x016b }
        L_0x016b:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x01a1 }
            if (r0 != 0) goto L_0x017e
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x01a1 }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x01a1 }
            r2[r5] = r0     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "Could not clean up file %s"
            com.google.android.gms.internal.ads.zzapy.zza(r0, r2)     // Catch:{ all -> 0x01a1 }
        L_0x017e:
            com.google.android.gms.internal.ads.zzaqh r0 = r1.zzc     // Catch:{ all -> 0x01a1 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x01a1 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01a1 }
            if (r0 != 0) goto L_0x019f
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "Re-initializing cache after external clearing."
            com.google.android.gms.internal.ads.zzapy.zza(r2, r0)     // Catch:{ all -> 0x01a1 }
            java.util.Map r0 = r1.zza     // Catch:{ all -> 0x01a1 }
            r0.clear()     // Catch:{ all -> 0x01a1 }
            r2 = 0
            r1.zzb = r2     // Catch:{ all -> 0x01a1 }
            r15.zzb()     // Catch:{ all -> 0x01a1 }
            monitor-exit(r15)
            return
        L_0x019f:
            monitor-exit(r15)
            return
        L_0x01a1:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01a1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqi.zzd(java.lang.String, com.google.android.gms.internal.ads.zzaov):void");
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (!delete) {
            zzapy.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
        }
    }

    public zzaqi(File file, int i) {
        this.zzc = new zzaqe(this, file);
        this.zzd = 20971520;
    }
}
