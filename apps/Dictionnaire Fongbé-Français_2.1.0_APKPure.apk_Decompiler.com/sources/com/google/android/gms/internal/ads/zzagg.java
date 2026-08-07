package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzagg {
    public static final zzage zza = new zzage();

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.gms.internal.ads.zzay zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzage r13, com.google.android.gms.internal.ads.zzafi r14) {
        /*
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.google.android.gms.internal.ads.zzdy r0 = new com.google.android.gms.internal.ads.zzdy
            r0.<init>(r11, r12)
            int r11 = r0.zzb()
            r12 = 2
            r1 = 4
            r2 = 0
            r3 = 1
            java.lang.String r4 = "Id3Decoder"
            r5 = 0
            r6 = 10
            if (r11 >= r6) goto L_0x0021
            java.lang.String r11 = "Data too short to be an ID3 tag"
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r11)
        L_0x001e:
            r9 = r5
            goto L_0x00aa
        L_0x0021:
            int r11 = r0.zzo()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r11 == r7) goto L_0x0046
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r11
            java.lang.String r11 = "%06X"
            java.lang.String r11 = java.lang.String.format(r11, r7)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.String r11 = r7.concat(r11)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r11)
            goto L_0x001e
        L_0x0046:
            int r11 = r0.zzm()
            r0.zzM(r3)
            int r7 = r0.zzm()
            int r8 = r0.zzl()
            if (r11 != r12) goto L_0x0061
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0088
            java.lang.String r11 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r11)
            goto L_0x001e
        L_0x0061:
            r9 = 3
            if (r11 != r9) goto L_0x0072
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0088
            int r9 = r0.zzg()
            r0.zzM(r9)
            int r9 = r9 + r1
            int r8 = r8 - r9
            goto L_0x0088
        L_0x0072:
            if (r11 != r1) goto L_0x0097
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0082
            int r9 = r0.zzl()
            int r10 = r9 + -4
            r0.zzM(r10)
            int r8 = r8 - r9
        L_0x0082:
            r9 = r7 & 16
            if (r9 == 0) goto L_0x0088
            int r8 = r8 + -10
        L_0x0088:
            if (r11 >= r1) goto L_0x0090
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0090
            r7 = 1
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            com.google.android.gms.internal.ads.zzagf r9 = new com.google.android.gms.internal.ads.zzagf
            r9.<init>(r11, r7, r8)
            goto L_0x00aa
        L_0x0097:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Skipped ID3 tag with unsupported majorVersion="
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r11)
            goto L_0x001e
        L_0x00aa:
            if (r9 != 0) goto L_0x00ad
            return r5
        L_0x00ad:
            int r11 = r0.zzd()
            int r7 = r9.zza
            if (r7 != r12) goto L_0x00b8
            r6 = 6
        L_0x00b8:
            int r12 = r9.zzc
            boolean r7 = r9.zzb
            if (r7 == 0) goto L_0x00ca
            int r12 = r9.zzc
            int r12 = zze(r0, r12)
        L_0x00ca:
            int r11 = r11 + r12
            r0.zzK(r11)
            int r11 = r9.zza
            boolean r11 = zzj(r0, r11, r6, r2)
            if (r11 != 0) goto L_0x00fc
            int r11 = r9.zza
            if (r11 != r1) goto L_0x00e6
            boolean r11 = zzj(r0, r1, r6, r3)
            if (r11 == 0) goto L_0x00e6
            r2 = 1
            goto L_0x00fc
        L_0x00e6:
            int r11 = r9.zza
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Failed to validate ID3 tag with majorVersion="
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r11)
            return r5
        L_0x00fc:
            int r11 = r0.zzb()
            if (r11 < r6) goto L_0x0110
            int r11 = r9.zza
            com.google.android.gms.internal.ads.zzagh r11 = zzl(r11, r0, r2, r6, r13)
            if (r11 == 0) goto L_0x00fc
            r14.add(r11)
            goto L_0x00fc
        L_0x0110:
            com.google.android.gms.internal.ads.zzay r11 = new com.google.android.gms.internal.ads.zzay
            r11.<init>((java.util.List) r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagg.zza(byte[], int, com.google.android.gms.internal.ads.zzage, com.google.android.gms.internal.ads.zzafi):com.google.android.gms.internal.ads.zzay");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            int i3 = zzd + 1;
            if ((zzd - i) % 2 == 0 && bArr[i3] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, i3);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzdy zzdy, int i) {
        byte[] zzN = zzdy.zzN();
        int zzd = zzdy.zzd();
        int i2 = zzd;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzd + i) {
                return i;
            }
            if ((zzN[i2] & 255) == 255 && zzN[i3] == 0) {
                System.arraycopy(zzN, i2 + 2, zzN, i3, (i - (i2 - zzd)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static zzfxn zzf(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfxn.zzo("");
        }
        zzfxk zzfxk = new zzfxk();
        int zzc = zzc(bArr, i2, i);
        while (i2 < zzc) {
            zzfxk.zzf(new String(bArr, i2, zzc - i2, zzi(i)));
            i2 = zzb(i) + zzc;
            zzc = zzc(bArr, i2, i);
        }
        zzfxn zzi = zzfxk.zzi();
        return zzi.isEmpty() ? zzfxn.zzo("") : zzi;
    }

    private static String zzg(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzh(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zzj(com.google.android.gms.internal.ads.zzdy r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.zzd()
        L_0x0008:
            int r3 = r21.zzb()     // Catch:{ all -> 0x00a5 }
            r4 = 1
            r5 = r23
            if (r3 < r5) goto L_0x00a1
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r21.zzg()     // Catch:{ all -> 0x00a5 }
            long r8 = r21.zzu()     // Catch:{ all -> 0x00a5 }
            int r10 = r21.zzq()     // Catch:{ all -> 0x00a5 }
            goto L_0x002c
        L_0x0022:
            int r7 = r21.zzo()     // Catch:{ all -> 0x00a5 }
            int r8 = r21.zzo()     // Catch:{ all -> 0x00a5 }
            long r8 = (long) r8     // Catch:{ all -> 0x00a5 }
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x0038
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0038
            if (r10 != 0) goto L_0x0038
            goto L_0x00a1
        L_0x0038:
            r7 = 4
            if (r0 != r7) goto L_0x0067
            if (r24 != 0) goto L_0x0067
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0047
        L_0x0045:
            r4 = 0
            goto L_0x00a1
        L_0x0047:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L_0x0067:
            if (r0 != r7) goto L_0x0077
            r3 = r10 & 64
            if (r3 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L_0x0087
        L_0x0077:
            if (r0 != r3) goto L_0x0085
            r3 = r10 & 32
            if (r3 == 0) goto L_0x007f
            r3 = 1
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0085:
            r3 = 0
        L_0x0086:
            r4 = 0
        L_0x0087:
            if (r4 == 0) goto L_0x008b
            int r3 = r3 + 4
        L_0x008b:
            long r3 = (long) r3     // Catch:{ all -> 0x00a5 }
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0091
            goto L_0x0045
        L_0x0091:
            int r3 = r21.zzb()     // Catch:{ all -> 0x00a5 }
            long r3 = (long) r3     // Catch:{ all -> 0x00a5 }
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            goto L_0x0045
        L_0x009b:
            int r3 = (int) r8     // Catch:{ all -> 0x00a5 }
            r1.zzM(r3)     // Catch:{ all -> 0x00a5 }
            goto L_0x0008
        L_0x00a1:
            r1.zzL(r2)
            return r4
        L_0x00a5:
            r0 = move-exception
            r1.zzL(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagg.zzj(com.google.android.gms.internal.ads.zzdy, int, int, boolean):boolean");
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzei.zzf;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: com.google.android.gms.internal.ads.zzdy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: com.google.android.gms.internal.ads.zzdy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.ads.zzafx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.gms.internal.ads.zzafx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.android.gms.internal.ads.zzafv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: com.google.android.gms.internal.ads.zzagm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: com.google.android.gms.internal.ads.zzafz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: com.google.android.gms.internal.ads.zzagm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: com.google.android.gms.internal.ads.zzagm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v72, resolved type: com.google.android.gms.internal.ads.zzdy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v75, resolved type: com.google.android.gms.internal.ads.zzdy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v78, resolved type: com.google.android.gms.internal.ads.zzdy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v79, resolved type: com.google.android.gms.internal.ads.zzdy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v80, resolved type: com.google.android.gms.internal.ads.zzdy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v81, resolved type: com.google.android.gms.internal.ads.zzdy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: com.google.android.gms.internal.ads.zzagm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: com.google.android.gms.internal.ads.zzafx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v84, resolved type: com.google.android.gms.internal.ads.zzdy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v87, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v88, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v21, types: [com.google.android.gms.internal.ads.zzagb] */
    /* JADX WARNING: type inference failed for: r3v25, types: [com.google.android.gms.internal.ads.zzaft] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0276, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0279, code lost:
        r23 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x027c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x027f, code lost:
        r23 = r5;
        r22 = "Id3Decoder";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0283, code lost:
        r8 = r2;
        r3 = r6;
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02e4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x042e, code lost:
        r0 = th;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04b6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04b8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04b9, code lost:
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04bc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04be, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04bf, code lost:
        r21 = r6;
        r20 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x050a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x050d, code lost:
        r2 = r0;
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0511, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0514, code lost:
        r21 = r6;
        r20 = r7;
        r18 = r10;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x051b, code lost:
        r4 = r20;
        r3 = r21;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0580, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0583, code lost:
        r2 = r0;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016d, code lost:
        r1 = r0;
        r8 = r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:197:0x0370, B:238:0x044a] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:197:0x0370, B:247:0x048f] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:197:0x0370, B:250:0x0493] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:197:0x0370, B:253:0x049d] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:197:0x0370, B:288:0x053b] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:79:0x010c, B:126:0x0229] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:79:0x010c, B:129:0x0241] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:79:0x010c, B:132:0x0246] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x042e A[ExcHandler: all (th java.lang.Throwable), PHI: r8 r24 
      PHI: (r8v16 com.google.android.gms.internal.ads.zzdy) = (r8v72 com.google.android.gms.internal.ads.zzdy), (r8v75 com.google.android.gms.internal.ads.zzdy), (r8v78 com.google.android.gms.internal.ads.zzdy), (r8v79 com.google.android.gms.internal.ads.zzdy), (r8v80 com.google.android.gms.internal.ads.zzdy), (r8v81 com.google.android.gms.internal.ads.zzdy), (r8v84 com.google.android.gms.internal.ads.zzdy), (r8v88 java.lang.String) binds: [B:288:0x053b, B:238:0x044a, B:247:0x048f, B:248:?, B:250:0x0493, B:253:0x049d, B:197:0x0370, B:175:0x0319] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v5 int) = (r24v8 int), (r24v8 int), (r24v8 int), (r24v8 int), (r24v8 int), (r24v8 int), (r24v8 int), (r24v15 int) binds: [B:288:0x053b, B:238:0x044a, B:247:0x048f, B:248:?, B:250:0x0493, B:253:0x049d, B:197:0x0370, B:175:0x0319] A[DONT_GENERATE, DONT_INLINE], Splitter:B:197:0x0370] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x016c A[Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }, ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }]), Splitter:B:79:0x010c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzagh zzl(int r35, com.google.android.gms.internal.ads.zzdy r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzage r39) {
        /*
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            int r5 = r36.zzm()
            int r6 = r36.zzm()
            int r7 = r36.zzm()
            r9 = 3
            if (r1 < r9) goto L_0x001c
            int r10 = r36.zzm()
            goto L_0x001d
        L_0x001c:
            r10 = 0
        L_0x001d:
            r11 = 4
            if (r1 != r11) goto L_0x003c
            int r12 = r36.zzp()
            if (r3 != 0) goto L_0x0047
            r13 = r12 & 255(0xff, float:3.57E-43)
            int r14 = r12 >> 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r12 >> 16
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r12 = r12 >> 24
            int r14 = r14 << 7
            r13 = r13 | r14
            int r14 = r15 << 14
            r13 = r13 | r14
            int r12 = r12 << 21
            r12 = r12 | r13
            goto L_0x0047
        L_0x003c:
            if (r1 != r9) goto L_0x0043
            int r12 = r36.zzp()
            goto L_0x0047
        L_0x0043:
            int r12 = r36.zzo()
        L_0x0047:
            if (r1 < r9) goto L_0x004e
            int r13 = r36.zzq()
            goto L_0x004f
        L_0x004e:
            r13 = 0
        L_0x004f:
            r14 = 0
            if (r5 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            if (r7 != 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            if (r12 != 0) goto L_0x0065
            if (r13 == 0) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            int r1 = r36.zze()
            r2.zzL(r1)
            return r14
        L_0x0065:
            int r15 = r36.zzd()
            int r15 = r15 + r12
            int r8 = r36.zze()
            java.lang.String r11 = "Id3Decoder"
            if (r15 <= r8) goto L_0x007f
            java.lang.String r1 = "Frame size exceeds remaining tag data"
            com.google.android.gms.internal.ads.zzdo.zzf(r11, r1)
            int r1 = r36.zze()
            r2.zzL(r1)
            return r14
        L_0x007f:
            if (r39 != 0) goto L_0x05ed
            r8 = 1
            if (r1 != r9) goto L_0x00a2
            r17 = r13 & 64
            r9 = r13 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x008c
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            if (r17 == 0) goto L_0x0092
            r17 = 1
            goto L_0x0094
        L_0x0092:
            r17 = 0
        L_0x0094:
            r13 = r13 & 32
            if (r13 == 0) goto L_0x009a
            r13 = 1
            goto L_0x009b
        L_0x009a:
            r13 = 0
        L_0x009b:
            r19 = r17
            r20 = 0
            r17 = r9
            goto L_0x00d6
        L_0x00a2:
            r9 = 4
            if (r1 != r9) goto L_0x00ce
            r9 = r13 & 64
            if (r9 == 0) goto L_0x00ab
            r9 = 1
            goto L_0x00ac
        L_0x00ab:
            r9 = 0
        L_0x00ac:
            r17 = r13 & 8
            if (r17 == 0) goto L_0x00b3
            r17 = 1
            goto L_0x00b5
        L_0x00b3:
            r17 = 0
        L_0x00b5:
            r19 = r13 & 4
            if (r19 == 0) goto L_0x00bc
            r19 = 1
            goto L_0x00be
        L_0x00bc:
            r19 = 0
        L_0x00be:
            r20 = r13 & 2
            if (r20 == 0) goto L_0x00c5
            r20 = 1
            goto L_0x00c7
        L_0x00c5:
            r20 = 0
        L_0x00c7:
            r13 = r13 & r8
            r34 = r13
            r13 = r9
            r9 = r34
            goto L_0x00d6
        L_0x00ce:
            r9 = 0
            r13 = 0
            r17 = 0
            r19 = 0
            r20 = 0
        L_0x00d6:
            if (r17 != 0) goto L_0x05e1
            if (r19 == 0) goto L_0x00dc
            goto L_0x05e1
        L_0x00dc:
            if (r13 == 0) goto L_0x00e3
            r2.zzM(r8)
            int r12 = r12 + -1
        L_0x00e3:
            if (r9 == 0) goto L_0x00eb
            r9 = 4
            r2.zzM(r9)
            int r12 = r12 + -4
        L_0x00eb:
            if (r20 == 0) goto L_0x00f1
            int r12 = zze(r2, r12)
        L_0x00f1:
            r9 = 84
            r13 = 88
            r8 = 2
            if (r5 != r9) goto L_0x0137
            if (r6 != r13) goto L_0x0137
            if (r7 != r13) goto L_0x0137
            if (r1 == r8) goto L_0x0100
            if (r10 != r13) goto L_0x0137
        L_0x0100:
            if (r12 > 0) goto L_0x010c
            r8 = r2
            r23 = r5
            r3 = r6
            r4 = r7
            r22 = r11
            r2 = r14
            goto L_0x05a3
        L_0x010c:
            int r3 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r4 = r12 + -1
            byte[] r8 = new byte[r4]     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r9 = 0
            r2.zzH(r8, r9, r4)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r4 = zzc(r8, r9, r3)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.lang.String r13 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.nio.charset.Charset r14 = zzi(r3)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r13.<init>(r8, r9, r4, r14)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r9 = zzb(r3)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r4 = r4 + r9
            com.google.android.gms.internal.ads.zzfxn r3 = zzf(r8, r3, r4)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            com.google.android.gms.internal.ads.zzagq r4 = new com.google.android.gms.internal.ads.zzagq     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.lang.String r8 = "TXXX"
            r4.<init>(r8, r13, r3)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            goto L_0x01de
        L_0x0137:
            if (r5 != r9) goto L_0x017e
            java.lang.String r3 = zzh(r1, r9, r6, r7, r10)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            if (r12 > 0) goto L_0x0149
        L_0x013f:
            r8 = r2
            r23 = r5
            r3 = r6
            r4 = r7
            r22 = r11
        L_0x0146:
            r2 = 0
            goto L_0x05a3
        L_0x0149:
            int r4 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r8 = r12 + -1
            byte[] r9 = new byte[r8]     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r13 = 0
            r2.zzH(r9, r13, r8)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            com.google.android.gms.internal.ads.zzfxn r4 = zzf(r9, r4, r13)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            com.google.android.gms.internal.ads.zzagq r8 = new com.google.android.gms.internal.ads.zzagq     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r9 = 0
            r8.<init>(r3, r9, r4)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r23 = r5
            r3 = r6
            r4 = r7
            r22 = r11
        L_0x0165:
            r34 = r8
            r8 = r2
            r2 = r34
            goto L_0x05a3
        L_0x016c:
            r0 = move-exception
            r1 = r0
            r8 = r2
            goto L_0x05ae
        L_0x0171:
            r0 = move-exception
            goto L_0x0174
        L_0x0173:
            r0 = move-exception
        L_0x0174:
            r8 = r2
            r23 = r5
            r3 = r6
            r4 = r7
            r22 = r11
        L_0x017b:
            r2 = r0
            goto L_0x05b9
        L_0x017e:
            r14 = 87
            if (r5 != r14) goto L_0x01c0
            if (r6 != r13) goto L_0x01bd
            if (r7 != r13) goto L_0x01bd
            if (r1 == r8) goto L_0x018a
            if (r10 != r13) goto L_0x01bd
        L_0x018a:
            if (r12 > 0) goto L_0x018d
            goto L_0x013f
        L_0x018d:
            int r3 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r4 = r12 + -1
            byte[] r8 = new byte[r4]     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r9 = 0
            r2.zzH(r8, r9, r4)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r4 = zzc(r8, r9, r3)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.lang.String r13 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.nio.charset.Charset r14 = zzi(r3)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r13.<init>(r8, r9, r4, r14)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r3 = zzb(r3)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r4 = r4 + r3
            int r3 = zzd(r8, r4)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.lang.String r3 = zzg(r8, r4, r3, r9)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            com.google.android.gms.internal.ads.zzags r4 = new com.google.android.gms.internal.ads.zzags     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.lang.String r8 = "WXXX"
            r4.<init>(r8, r13, r3)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            goto L_0x01de
        L_0x01bd:
            r13 = 87
            goto L_0x01c1
        L_0x01c0:
            r13 = r5
        L_0x01c1:
            if (r13 != r14) goto L_0x01e8
            java.lang.String r3 = zzh(r1, r14, r6, r7, r10)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            byte[] r4 = new byte[r12]     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r8 = 0
            r2.zzH(r4, r8, r12)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r9 = zzd(r4, r8)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.lang.String r13 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r13.<init>(r4, r8, r9, r14)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            com.google.android.gms.internal.ads.zzags r4 = new com.google.android.gms.internal.ads.zzags     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r8 = 0
            r4.<init>(r3, r8, r13)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
        L_0x01de:
            r8 = r2
            r2 = r4
            r23 = r5
            r3 = r6
            r4 = r7
            r22 = r11
            goto L_0x05a3
        L_0x01e8:
            r14 = 73
            r9 = 80
            if (r13 != r9) goto L_0x0217
            r13 = 82
            if (r6 != r13) goto L_0x0215
            if (r7 != r14) goto L_0x0215
            r13 = 86
            if (r10 != r13) goto L_0x0215
            byte[] r3 = new byte[r12]     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r4 = 0
            r2.zzH(r3, r4, r12)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            int r8 = zzd(r3, r4)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.lang.String r9 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r9.<init>(r3, r4, r8, r13)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r4 = 1
            int r8 = r8 + r4
            byte[] r3 = zzk(r3, r8, r12)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            com.google.android.gms.internal.ads.zzago r4 = new com.google.android.gms.internal.ads.zzago     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            r4.<init>(r9, r3)     // Catch:{ OutOfMemoryError -> 0x0173, Exception -> 0x0171, all -> 0x016c }
            goto L_0x01de
        L_0x0215:
            r13 = 80
        L_0x0217:
            r14 = 79
            r9 = 71
            if (r13 != r9) goto L_0x028f
            r13 = 69
            if (r6 != r13) goto L_0x0288
            if (r7 != r14) goto L_0x0288
            r13 = 66
            if (r10 == r13) goto L_0x0229
            if (r1 != r8) goto L_0x0288
        L_0x0229:
            int r3 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x027e, Exception -> 0x027c, all -> 0x016c }
            java.nio.charset.Charset r4 = zzi(r3)     // Catch:{ OutOfMemoryError -> 0x027e, Exception -> 0x027c, all -> 0x016c }
            int r8 = r12 + -1
            byte[] r9 = new byte[r8]     // Catch:{ OutOfMemoryError -> 0x027e, Exception -> 0x027c, all -> 0x016c }
            r13 = 0
            r2.zzH(r9, r13, r8)     // Catch:{ OutOfMemoryError -> 0x027e, Exception -> 0x027c, all -> 0x016c }
            int r14 = zzd(r9, r13)     // Catch:{ OutOfMemoryError -> 0x027e, Exception -> 0x027c, all -> 0x016c }
            java.lang.String r13 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x027e, Exception -> 0x027c, all -> 0x016c }
            r22 = r11
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ OutOfMemoryError -> 0x0278, Exception -> 0x0276, all -> 0x016c }
            r23 = r5
            r5 = 0
            r13.<init>(r9, r5, r14, r11)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            java.lang.String r5 = com.google.android.gms.internal.ads.zzbb.zze(r13)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            r11 = 1
            int r14 = r14 + r11
            int r11 = zzc(r9, r14, r3)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            java.lang.String r13 = zzg(r9, r14, r11, r4)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            int r14 = zzb(r3)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            int r11 = r11 + r14
            int r14 = zzc(r9, r11, r3)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            java.lang.String r4 = zzg(r9, r11, r14, r4)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            int r3 = zzb(r3)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            int r14 = r14 + r3
            byte[] r3 = zzk(r9, r14, r8)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            com.google.android.gms.internal.ads.zzagd r8 = new com.google.android.gms.internal.ads.zzagd     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            r8.<init>(r5, r13, r4, r3)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            r3 = r6
            r4 = r7
            goto L_0x0165
        L_0x0276:
            r0 = move-exception
            goto L_0x0279
        L_0x0278:
            r0 = move-exception
        L_0x0279:
            r23 = r5
            goto L_0x0283
        L_0x027c:
            r0 = move-exception
            goto L_0x027f
        L_0x027e:
            r0 = move-exception
        L_0x027f:
            r23 = r5
            r22 = r11
        L_0x0283:
            r8 = r2
            r3 = r6
            r4 = r7
            goto L_0x017b
        L_0x0288:
            r23 = r5
            r22 = r11
            r13 = 71
            goto L_0x0293
        L_0x028f:
            r23 = r5
            r22 = r11
        L_0x0293:
            r5 = 65
            r9 = 67
            if (r1 != r8) goto L_0x02a4
            r11 = 80
            if (r13 != r11) goto L_0x0346
            r14 = 73
            if (r6 != r14) goto L_0x0346
            if (r7 != r9) goto L_0x0346
            goto L_0x02b0
        L_0x02a4:
            r11 = 80
            r14 = 73
            if (r13 != r5) goto L_0x0346
            if (r6 != r11) goto L_0x0346
            if (r7 != r14) goto L_0x0346
            if (r10 != r9) goto L_0x0346
        L_0x02b0:
            int r3 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            java.nio.charset.Charset r4 = zzi(r3)     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            int r5 = r12 + -1
            byte[] r9 = new byte[r5]     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            r11 = 0
            r2.zzH(r9, r11, r5)     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            if (r1 != r8) goto L_0x02e8
            java.lang.String r13 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            r8 = 3
            r13.<init>(r9, r11, r8, r14)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            java.lang.String r8 = com.google.android.gms.internal.ads.zzftt.zza(r13)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            java.lang.String r11 = "image/"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            java.lang.String r8 = r11.concat(r8)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            java.lang.String r11 = "image/jpg"
            boolean r11 = r11.equals(r8)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            if (r11 == 0) goto L_0x02e2
            java.lang.String r8 = "image/jpeg"
        L_0x02e2:
            r11 = 2
            goto L_0x030b
        L_0x02e4:
            r0 = move-exception
            goto L_0x0283
        L_0x02e6:
            r0 = move-exception
            goto L_0x0283
        L_0x02e8:
            r8 = 0
            int r11 = zzd(r9, r8)     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            java.lang.String r13 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            r13.<init>(r9, r8, r11, r14)     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            java.lang.String r8 = com.google.android.gms.internal.ads.zzftt.zza(r13)     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            r13 = 47
            int r13 = r8.indexOf(r13)     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            r14 = -1
            if (r13 != r14) goto L_0x030b
            java.lang.String r13 = "image/"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
            java.lang.String r8 = r13.concat(r8)     // Catch:{ OutOfMemoryError -> 0x02e6, Exception -> 0x02e4, all -> 0x016c }
        L_0x030b:
            int r13 = r11 + 1
            byte r13 = r9[r13]     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            r13 = r13 & 255(0xff, float:3.57E-43)
            r14 = 2
            int r11 = r11 + r14
            int r14 = zzc(r9, r11, r3)     // Catch:{ OutOfMemoryError -> 0x033c, Exception -> 0x033a, all -> 0x0332 }
            r24 = r15
            java.lang.String r15 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x03a6, Exception -> 0x03a4, all -> 0x039f }
            int r2 = r14 - r11
            r15.<init>(r9, r11, r2, r4)     // Catch:{ OutOfMemoryError -> 0x03a6, Exception -> 0x03a4, all -> 0x039f }
            int r2 = zzb(r3)     // Catch:{ OutOfMemoryError -> 0x03a6, Exception -> 0x03a4, all -> 0x039f }
            int r14 = r14 + r2
            byte[] r2 = zzk(r9, r14, r5)     // Catch:{ OutOfMemoryError -> 0x03a6, Exception -> 0x03a4, all -> 0x039f }
            com.google.android.gms.internal.ads.zzaft r3 = new com.google.android.gms.internal.ads.zzaft     // Catch:{ OutOfMemoryError -> 0x03a6, Exception -> 0x03a4, all -> 0x039f }
            r3.<init>(r8, r15, r13, r2)     // Catch:{ OutOfMemoryError -> 0x03a6, Exception -> 0x03a4, all -> 0x039f }
            r8 = r36
            goto L_0x039a
        L_0x0332:
            r0 = move-exception
            r24 = r15
            r8 = r36
        L_0x0337:
            r1 = r0
            goto L_0x05ae
        L_0x033a:
            r0 = move-exception
            goto L_0x033d
        L_0x033c:
            r0 = move-exception
        L_0x033d:
            r24 = r15
            r8 = r36
            r2 = r0
            r3 = r6
            r4 = r7
            goto L_0x05b9
        L_0x0346:
            r24 = r15
            r2 = 77
            if (r13 != r9) goto L_0x03ab
            r8 = 79
            if (r6 != r8) goto L_0x03ab
            if (r7 != r2) goto L_0x03ab
            if (r10 == r2) goto L_0x0357
            r8 = 2
            if (r1 != r8) goto L_0x03ab
        L_0x0357:
            r2 = 4
            if (r12 >= r2) goto L_0x0362
            r8 = r36
            r3 = r6
            r4 = r7
            r15 = r24
            goto L_0x0146
        L_0x0362:
            int r2 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x03a6, Exception -> 0x03a4, all -> 0x039f }
            java.nio.charset.Charset r3 = zzi(r2)     // Catch:{ OutOfMemoryError -> 0x03a6, Exception -> 0x03a4, all -> 0x039f }
            r4 = 3
            byte[] r5 = new byte[r4]     // Catch:{ OutOfMemoryError -> 0x03a6, Exception -> 0x03a4, all -> 0x039f }
            r8 = r36
            r9 = 0
            r8.zzH(r5, r9, r4)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            java.lang.String r11 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r11.<init>(r5, r9, r4)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            int r4 = r12 + -4
            byte[] r5 = new byte[r4]     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r8.zzH(r5, r9, r4)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            int r4 = zzc(r5, r9, r2)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            java.lang.String r13 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r13.<init>(r5, r9, r4, r3)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            int r9 = zzb(r2)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            int r4 = r4 + r9
            int r2 = zzc(r5, r4, r2)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            java.lang.String r2 = zzg(r5, r4, r2, r3)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            com.google.android.gms.internal.ads.zzagb r3 = new com.google.android.gms.internal.ads.zzagb     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r3.<init>(r11, r13, r2)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
        L_0x039a:
            r2 = r3
        L_0x039b:
            r3 = r6
            r4 = r7
            goto L_0x05a1
        L_0x039f:
            r0 = move-exception
            r8 = r36
            goto L_0x042f
        L_0x03a4:
            r0 = move-exception
            goto L_0x03a7
        L_0x03a6:
            r0 = move-exception
        L_0x03a7:
            r8 = r36
            goto L_0x0437
        L_0x03ab:
            r8 = r36
            if (r13 != r9) goto L_0x043e
            r11 = 72
            if (r6 != r11) goto L_0x043e
            if (r7 != r5) goto L_0x043e
            r5 = 80
            if (r10 != r5) goto L_0x043e
            int r2 = r36.zzd()     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            byte[] r5 = r36.zzN()     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            int r5 = zzd(r5, r2)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            java.lang.String r9 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            byte[] r11 = r36.zzN()     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            int r13 = r5 - r2
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r9.<init>(r11, r2, r13, r14)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r11 = 1
            int r5 = r5 + r11
            r8.zzL(r5)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            int r27 = r36.zzg()     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            int r28 = r36.zzg()     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            long r13 = r36.zzu()     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x03ee
            r13 = -1
        L_0x03ee:
            r29 = r13
            long r13 = r36.zzu()     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x03ff
            r13 = -1
        L_0x03ff:
            r31 = r13
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            int r2 = r2 + r12
        L_0x0407:
            int r11 = r36.zzd()     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            if (r11 >= r2) goto L_0x0418
            r11 = 0
            com.google.android.gms.internal.ads.zzagh r13 = zzl(r1, r8, r3, r4, r11)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            if (r13 == 0) goto L_0x0407
            r5.add(r13)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            goto L_0x0407
        L_0x0418:
            r2 = 0
            com.google.android.gms.internal.ads.zzagh[] r2 = new com.google.android.gms.internal.ads.zzagh[r2]     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            java.lang.Object[] r2 = r5.toArray(r2)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r33 = r2
            com.google.android.gms.internal.ads.zzagh[] r33 = (com.google.android.gms.internal.ads.zzagh[]) r33     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            com.google.android.gms.internal.ads.zzafx r2 = new com.google.android.gms.internal.ads.zzafx     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            r25 = r2
            r26 = r9
            r25.<init>(r26, r27, r28, r29, r31, r33)     // Catch:{ OutOfMemoryError -> 0x0436, Exception -> 0x0434, all -> 0x042e }
            goto L_0x039b
        L_0x042e:
            r0 = move-exception
        L_0x042f:
            r1 = r0
            r15 = r24
            goto L_0x05ae
        L_0x0434:
            r0 = move-exception
            goto L_0x0437
        L_0x0436:
            r0 = move-exception
        L_0x0437:
            r2 = r0
            r3 = r6
            r4 = r7
        L_0x043a:
            r15 = r24
            goto L_0x05b9
        L_0x043e:
            if (r13 != r9) goto L_0x0521
            r5 = 84
            if (r6 != r5) goto L_0x0521
            r5 = 79
            if (r7 != r5) goto L_0x0521
            if (r10 != r9) goto L_0x0521
            int r2 = r36.zzd()     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            byte[] r5 = r36.zzN()     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            int r5 = zzd(r5, r2)     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            java.lang.String r9 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            byte[] r11 = r36.zzN()     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            int r13 = r5 - r2
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            r9.<init>(r11, r2, r13, r14)     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            r11 = 1
            int r5 = r5 + r11
            r8.zzL(r5)     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            int r5 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            r13 = r5 & 2
            if (r13 == 0) goto L_0x0473
            r27 = 1
            goto L_0x0475
        L_0x0473:
            r27 = 0
        L_0x0475:
            r5 = r5 & r11
            int r11 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            r14 = 0
        L_0x047d:
            if (r14 >= r11) goto L_0x04c4
            int r15 = r36.zzd()     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            r16 = r11
            byte[] r11 = r36.zzN()     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            int r11 = zzd(r11, r15)     // Catch:{ OutOfMemoryError -> 0x0513, Exception -> 0x0511, all -> 0x042e }
            r18 = r10
            java.lang.String r10 = new java.lang.String     // Catch:{ OutOfMemoryError -> 0x04be, Exception -> 0x04bc, all -> 0x042e }
            r20 = r7
            byte[] r7 = r36.zzN()     // Catch:{ OutOfMemoryError -> 0x04b8, Exception -> 0x04b6, all -> 0x042e }
            r21 = r6
            int r6 = r11 - r15
            r19 = r9
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            r10.<init>(r7, r15, r6, r9)     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            r13[r14] = r10     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            int r11 = r11 + 1
            r8.zzL(r11)     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            int r14 = r14 + 1
            r11 = r16
            r10 = r18
            r9 = r19
            r7 = r20
            r6 = r21
            goto L_0x047d
        L_0x04b6:
            r0 = move-exception
            goto L_0x04b9
        L_0x04b8:
            r0 = move-exception
        L_0x04b9:
            r21 = r6
            goto L_0x050d
        L_0x04bc:
            r0 = move-exception
            goto L_0x04bf
        L_0x04be:
            r0 = move-exception
        L_0x04bf:
            r21 = r6
            r20 = r7
            goto L_0x050d
        L_0x04c4:
            r21 = r6
            r20 = r7
            r19 = r9
            r18 = r10
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            int r2 = r2 + r12
        L_0x04d2:
            int r7 = r36.zzd()     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            if (r7 >= r2) goto L_0x04e3
            r7 = 0
            com.google.android.gms.internal.ads.zzagh r9 = zzl(r1, r8, r3, r4, r7)     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            if (r9 == 0) goto L_0x04d2
            r6.add(r9)     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            goto L_0x04d2
        L_0x04e3:
            r2 = 0
            com.google.android.gms.internal.ads.zzagh[] r3 = new com.google.android.gms.internal.ads.zzagh[r2]     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            java.lang.Object[] r2 = r6.toArray(r3)     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            r30 = r2
            com.google.android.gms.internal.ads.zzagh[] r30 = (com.google.android.gms.internal.ads.zzagh[]) r30     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            com.google.android.gms.internal.ads.zzafz r4 = new com.google.android.gms.internal.ads.zzafz     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            r2 = 1
            if (r2 == r5) goto L_0x04f6
            r28 = 0
            goto L_0x04f8
        L_0x04f6:
            r28 = 1
        L_0x04f8:
            r25 = r4
            r26 = r19
            r29 = r13
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ OutOfMemoryError -> 0x050c, Exception -> 0x050a, all -> 0x042e }
            r2 = r4
            r10 = r18
            r4 = r20
            r3 = r21
            goto L_0x05a1
        L_0x050a:
            r0 = move-exception
            goto L_0x050d
        L_0x050c:
            r0 = move-exception
        L_0x050d:
            r2 = r0
            r10 = r18
            goto L_0x051b
        L_0x0511:
            r0 = move-exception
            goto L_0x0514
        L_0x0513:
            r0 = move-exception
        L_0x0514:
            r21 = r6
            r20 = r7
            r18 = r10
            r2 = r0
        L_0x051b:
            r4 = r20
            r3 = r21
            goto L_0x043a
        L_0x0521:
            r21 = r6
            r20 = r7
            r18 = r10
            if (r13 != r2) goto L_0x058b
            r2 = 76
            r3 = r21
            if (r3 != r2) goto L_0x0586
            r2 = 76
            r4 = r20
            r10 = r18
            if (r4 != r2) goto L_0x0591
            r2 = 84
            if (r10 != r2) goto L_0x0591
            int r26 = r36.zzq()     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            int r27 = r36.zzo()     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            int r28 = r36.zzo()     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            int r2 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            int r5 = r36.zzm()     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            com.google.android.gms.internal.ads.zzdx r6 = new com.google.android.gms.internal.ads.zzdx     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            r6.zzj(r8)     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            int r7 = r12 + -10
            int r7 = r7 * 8
            int r9 = r2 + r5
            int r7 = r7 / r9
            int[] r9 = new int[r7]     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            int[] r11 = new int[r7]     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            r13 = 0
        L_0x0563:
            if (r13 >= r7) goto L_0x0574
            int r14 = r6.zzd(r2)     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            int r15 = r6.zzd(r5)     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            r9[r13] = r14     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            r11[r13] = r15     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            int r13 = r13 + 1
            goto L_0x0563
        L_0x0574:
            com.google.android.gms.internal.ads.zzagm r2 = new com.google.android.gms.internal.ads.zzagm     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            r25 = r2
            r29 = r9
            r30 = r11
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ OutOfMemoryError -> 0x0582, Exception -> 0x0580, all -> 0x042e }
            goto L_0x05a1
        L_0x0580:
            r0 = move-exception
            goto L_0x0583
        L_0x0582:
            r0 = move-exception
        L_0x0583:
            r2 = r0
            goto L_0x043a
        L_0x0586:
            r10 = r18
            r4 = r20
            goto L_0x0591
        L_0x058b:
            r10 = r18
            r4 = r20
            r3 = r21
        L_0x0591:
            java.lang.String r2 = zzh(r1, r13, r3, r4, r10)     // Catch:{ OutOfMemoryError -> 0x05b4, Exception -> 0x05b2, all -> 0x05a9 }
            byte[] r5 = new byte[r12]     // Catch:{ OutOfMemoryError -> 0x05b4, Exception -> 0x05b2, all -> 0x05a9 }
            r6 = 0
            r8.zzH(r5, r6, r12)     // Catch:{ OutOfMemoryError -> 0x05b4, Exception -> 0x05b2, all -> 0x05a9 }
            com.google.android.gms.internal.ads.zzafv r6 = new com.google.android.gms.internal.ads.zzafv     // Catch:{ OutOfMemoryError -> 0x05b4, Exception -> 0x05b2, all -> 0x05a9 }
            r6.<init>(r2, r5)     // Catch:{ OutOfMemoryError -> 0x05b4, Exception -> 0x05b2, all -> 0x05a9 }
            r2 = r6
        L_0x05a1:
            r15 = r24
        L_0x05a3:
            r8.zzL(r15)
            r14 = r2
            r2 = 0
            goto L_0x05bd
        L_0x05a9:
            r0 = move-exception
            r15 = r24
            goto L_0x0337
        L_0x05ae:
            r8.zzL(r15)
            throw r1
        L_0x05b2:
            r0 = move-exception
            goto L_0x05b5
        L_0x05b4:
            r0 = move-exception
        L_0x05b5:
            r15 = r24
            goto L_0x017b
        L_0x05b9:
            r8.zzL(r15)
            r14 = 0
        L_0x05bd:
            if (r14 != 0) goto L_0x05e0
            r5 = r23
            java.lang.String r1 = zzh(r1, r5, r3, r4, r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to decode frame: id="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ", frameSize="
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = r3.toString()
            r3 = r22
            com.google.android.gms.internal.ads.zzdo.zzg(r3, r1, r2)
        L_0x05e0:
            return r14
        L_0x05e1:
            r8 = r2
            r3 = r11
            java.lang.String r1 = "Skipping unsupported compressed or encrypted frame"
            com.google.android.gms.internal.ads.zzdo.zzf(r3, r1)
            r8.zzL(r15)
            r1 = 0
            return r1
        L_0x05ed:
            r8 = r2
            r1 = r14
            r8.zzL(r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagg.zzl(int, com.google.android.gms.internal.ads.zzdy, boolean, int, com.google.android.gms.internal.ads.zzage):com.google.android.gms.internal.ads.zzagh");
    }

    private static Charset zzi(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i == 2) {
            return StandardCharsets.UTF_16BE;
        }
        if (i != 3) {
            return StandardCharsets.ISO_8859_1;
        }
        return StandardCharsets.UTF_8;
    }
}
