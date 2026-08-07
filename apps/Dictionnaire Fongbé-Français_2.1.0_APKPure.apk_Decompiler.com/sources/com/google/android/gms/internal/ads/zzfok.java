package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfok {
    public static boolean zza(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int zzb(android.content.Context r14, com.google.android.gms.internal.ads.zzfni r15) {
        /*
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r14.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            r1.<init>(r2)
            java.lang.String r2 = "lib"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 5017(0x1399, float:7.03E-42)
            r3 = 8
            r4 = 7
            r5 = 6
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 5
            r9 = 3
            r10 = 1
            if (r1 != 0) goto L_0x002d
            java.lang.String r0 = "No lib/"
            r15.zzb(r2, r0)
        L_0x0029:
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x00c6
        L_0x002d:
            com.google.android.gms.internal.ads.zzgae r1 = new com.google.android.gms.internal.ads.zzgae
            java.lang.String r11 = ".*\\.so$"
            r12 = 2
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11, r12)
            r1.<init>(r11)
            java.io.File[] r0 = r0.listFiles(r1)
            if (r0 == 0) goto L_0x00bf
            int r1 = r0.length
            if (r1 != 0) goto L_0x0044
            goto L_0x00bf
        L_0x0044:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b5 }
            r2 = 0
            r0 = r0[r2]     // Catch:{ IOException -> 0x00b5 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00b5 }
            r0 = 20
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x00ab }
            int r13 = r1.read(r11)     // Catch:{ all -> 0x00ab }
            if (r13 != r0) goto L_0x0063
            byte[] r0 = new byte[r12]     // Catch:{ all -> 0x00ab }
            r0[r2] = r2     // Catch:{ all -> 0x00ab }
            r0[r10] = r2     // Catch:{ all -> 0x00ab }
            byte r13 = r11[r8]     // Catch:{ all -> 0x00ab }
            if (r13 != r12) goto L_0x0067
            zzd(r11, r7, r14, r15)     // Catch:{ all -> 0x00ab }
        L_0x0063:
            r1.close()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00bd
        L_0x0067:
            r12 = 19
            byte r12 = r11[r12]     // Catch:{ all -> 0x00ab }
            r0[r2] = r12     // Catch:{ all -> 0x00ab }
            r2 = 18
            byte r2 = r11[r2]     // Catch:{ all -> 0x00ab }
            r0[r10] = r2     // Catch:{ all -> 0x00ab }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ all -> 0x00ab }
            short r0 = r0.getShort()     // Catch:{ all -> 0x00ab }
            if (r0 == r9) goto L_0x00a6
            r2 = 40
            if (r0 == r2) goto L_0x00a1
            r2 = 62
            if (r0 == r2) goto L_0x009c
            r2 = 183(0xb7, float:2.56E-43)
            if (r0 == r2) goto L_0x0097
            r2 = 243(0xf3, float:3.4E-43)
            if (r0 == r2) goto L_0x0091
            zzd(r11, r7, r14, r15)     // Catch:{ all -> 0x00ab }
            goto L_0x0063
        L_0x0091:
            r1.close()     // Catch:{ IOException -> 0x00b5 }
            r0 = 8
            goto L_0x00c6
        L_0x0097:
            r1.close()     // Catch:{ IOException -> 0x00b5 }
            r0 = 6
            goto L_0x00c6
        L_0x009c:
            r1.close()     // Catch:{ IOException -> 0x00b5 }
            r0 = 7
            goto L_0x00c6
        L_0x00a1:
            r1.close()     // Catch:{ IOException -> 0x00b5 }
            r0 = 3
            goto L_0x00c6
        L_0x00a6:
            r1.close()     // Catch:{ IOException -> 0x00b5 }
            r0 = 5
            goto L_0x00c6
        L_0x00ab:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x00b4
        L_0x00b0:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ IOException -> 0x00b5 }
        L_0x00b4:
            throw r0     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            zzd(r7, r0, r14, r15)
        L_0x00bd:
            r0 = 1
            goto L_0x00c6
        L_0x00bf:
            java.lang.String r0 = "No .so"
            r15.zzb(r2, r0)
            goto L_0x0029
        L_0x00c6:
            if (r0 != r6) goto L_0x0121
            java.lang.String r0 = zzc(r14, r15)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = "Empty dev arch"
            zzd(r7, r0, r14, r15)
        L_0x00d7:
            r0 = 1
            goto L_0x0121
        L_0x00d9:
            java.lang.String r1 = "i686"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0120
            java.lang.String r1 = "x86"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00ea
            goto L_0x0120
        L_0x00ea:
            java.lang.String r1 = "x86_64"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00f4
            r0 = 7
            goto L_0x0121
        L_0x00f4:
            java.lang.String r1 = "arm64-v8a"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00fe
            r0 = 6
            goto L_0x0121
        L_0x00fe:
            java.lang.String r1 = "armeabi-v7a"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x011e
            java.lang.String r1 = "armv71"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x010f
            goto L_0x011e
        L_0x010f:
            java.lang.String r1 = "riscv64"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x011a
            r0 = 8
            goto L_0x0121
        L_0x011a:
            zzd(r7, r0, r14, r15)
            goto L_0x00d7
        L_0x011e:
            r0 = 3
            goto L_0x0121
        L_0x0120:
            r0 = 5
        L_0x0121:
            if (r0 == r10) goto L_0x013f
            if (r0 == r9) goto L_0x013c
            if (r0 == r8) goto L_0x0139
            if (r0 == r5) goto L_0x0136
            if (r0 == r4) goto L_0x0133
            if (r0 == r3) goto L_0x0130
            java.lang.String r14 = "null"
            goto L_0x0141
        L_0x0130:
            java.lang.String r14 = "RISCV64"
            goto L_0x0141
        L_0x0133:
            java.lang.String r14 = "X86_64"
            goto L_0x0141
        L_0x0136:
            java.lang.String r14 = "ARM64"
            goto L_0x0141
        L_0x0139:
            java.lang.String r14 = "X86"
            goto L_0x0141
        L_0x013c:
            java.lang.String r14 = "ARM7"
            goto L_0x0141
        L_0x013f:
            java.lang.String r14 = "UNSUPPORTED"
        L_0x0141:
            r1 = 5018(0x139a, float:7.032E-42)
            r15.zzb(r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfok.zzb(android.content.Context, com.google.android.gms.internal.ads.zzfni):int");
    }

    private static final String zzc(Context context, zzfni zzfni) {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"i686", "armv71"}));
        String zza = zzfvd.OS_ARCH.zza();
        if (!TextUtils.isEmpty(zza) && hashSet.contains(zza)) {
            return zza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (NoSuchFieldException e) {
            zzfni.zzc(2024, 0, e);
        } catch (IllegalAccessException e2) {
            zzfni.zzc(2024, 0, e2);
        }
        return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfni zzfni) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzfvd.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfni.zzb(4007, sb.toString());
    }
}
