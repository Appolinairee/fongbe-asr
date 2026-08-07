package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzab r19) {
        /*
            r0 = r19
            java.lang.String r1 = r0.zzk
            if (r1 != 0) goto L_0x0009
        L_0x0006:
            r2 = 0
            goto L_0x05dc
        L_0x0009:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r0.zzo
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r5 = 1024(0x400, float:1.435E-42)
            r6 = 512(0x200, float:7.175E-43)
            r7 = 256(0x100, float:3.59E-43)
            r8 = 128(0x80, float:1.794E-43)
            r9 = 64
            r10 = 32
            r12 = 8
            r13 = 16
            r14 = 3
            r15 = 4
            r2 = 2
            java.lang.String r4 = "CodecSpecificDataUtil"
            r11 = 1
            if (r3 == 0) goto L_0x01f0
            java.lang.String r0 = r0.zzk
            int r3 = r1.length
            if (r3 >= r14) goto L_0x0042
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x0042:
            java.util.regex.Pattern r3 = zzd
            r14 = r1[r11]
            java.util.regex.Matcher r3 = r3.matcher(r14)
            boolean r14 = r3.matches()
            if (r14 != 0) goto L_0x005e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x005e:
            java.lang.String r0 = r3.group(r11)
            if (r0 != 0) goto L_0x0067
        L_0x0064:
            r3 = 0
            goto L_0x0104
        L_0x0067:
            int r3 = r0.hashCode()
            r14 = 1567(0x61f, float:2.196E-42)
            if (r3 == r14) goto L_0x00f8
            switch(r3) {
                case 1536: goto L_0x00eb;
                case 1537: goto L_0x00de;
                case 1538: goto L_0x00d1;
                case 1539: goto L_0x00c4;
                case 1540: goto L_0x00b7;
                case 1541: goto L_0x00aa;
                case 1542: goto L_0x009d;
                case 1543: goto L_0x008f;
                case 1544: goto L_0x0081;
                case 1545: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0064
        L_0x0073:
            java.lang.String r3 = "09"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            goto L_0x0104
        L_0x0081:
            java.lang.String r3 = "08"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            goto L_0x0104
        L_0x008f:
            java.lang.String r3 = "07"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0104
        L_0x009d:
            java.lang.String r3 = "06"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            goto L_0x0104
        L_0x00aa:
            java.lang.String r3 = "05"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            goto L_0x0104
        L_0x00b7:
            java.lang.String r3 = "04"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            goto L_0x0104
        L_0x00c4:
            java.lang.String r3 = "03"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            goto L_0x0104
        L_0x00d1:
            java.lang.String r3 = "02"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            goto L_0x0104
        L_0x00de:
            java.lang.String r3 = "01"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L_0x0104
        L_0x00eb:
            java.lang.String r3 = "00"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            goto L_0x0104
        L_0x00f8:
            java.lang.String r3 = "10"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
        L_0x0104:
            if (r3 != 0) goto L_0x0115
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x0115:
            r0 = r1[r2]
            if (r0 != 0) goto L_0x011c
        L_0x0119:
            r1 = 0
            goto L_0x01d8
        L_0x011c:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L_0x01cc;
                case 1538: goto L_0x01bf;
                case 1539: goto L_0x01b2;
                case 1540: goto L_0x01a5;
                case 1541: goto L_0x0198;
                case 1542: goto L_0x018b;
                case 1543: goto L_0x017e;
                case 1544: goto L_0x0171;
                case 1545: goto L_0x0163;
                default: goto L_0x0123;
            }
        L_0x0123:
            switch(r1) {
                case 1567: goto L_0x0155;
                case 1568: goto L_0x0147;
                case 1569: goto L_0x0137;
                case 1570: goto L_0x0127;
                default: goto L_0x0126;
            }
        L_0x0126:
            goto L_0x0119
        L_0x0127:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            goto L_0x01d8
        L_0x0137:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            r17 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            goto L_0x01d8
        L_0x0147:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x01d8
        L_0x0155:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L_0x01d8
        L_0x0163:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x01d8
        L_0x0171:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x01d8
        L_0x017e:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x01d8
        L_0x018b:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x01d8
        L_0x0198:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x01d8
        L_0x01a5:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            goto L_0x01d8
        L_0x01b2:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            goto L_0x01d8
        L_0x01bf:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x01d8
        L_0x01cc:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
        L_0x01d8:
            if (r1 != 0) goto L_0x01e9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x01e9:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r3, r1)
            goto L_0x05dc
        L_0x01f0:
            r16 = 4096(0x1000, float:5.74E-42)
            r17 = 2048(0x800, float:2.87E-42)
            r3 = 0
            r5 = r1[r3]
            int r18 = r5.hashCode()
            r6 = 6
            r7 = -1
            switch(r18) {
                case 3004662: goto L_0x0247;
                case 3006243: goto L_0x023d;
                case 3006244: goto L_0x0233;
                case 3199032: goto L_0x0229;
                case 3214780: goto L_0x021f;
                case 3356560: goto L_0x0215;
                case 3475740: goto L_0x020b;
                case 3624515: goto L_0x0201;
                default: goto L_0x0200;
            }
        L_0x0200:
            goto L_0x0251
        L_0x0201:
            java.lang.String r8 = "vp09"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0251
            r5 = 3
            goto L_0x0252
        L_0x020b:
            java.lang.String r8 = "s263"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0251
            r5 = 0
            goto L_0x0252
        L_0x0215:
            java.lang.String r8 = "mp4a"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0251
            r5 = 7
            goto L_0x0252
        L_0x021f:
            java.lang.String r8 = "hvc1"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0251
            r5 = 5
            goto L_0x0252
        L_0x0229:
            java.lang.String r8 = "hev1"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0251
            r5 = 4
            goto L_0x0252
        L_0x0233:
            java.lang.String r8 = "avc2"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0251
            r5 = 2
            goto L_0x0252
        L_0x023d:
            java.lang.String r8 = "avc1"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0251
            r5 = 1
            goto L_0x0252
        L_0x0247:
            java.lang.String r8 = "av01"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0251
            r5 = 6
            goto L_0x0252
        L_0x0251:
            r5 = -1
        L_0x0252:
            r8 = 20
            switch(r5) {
                case 0: goto L_0x0598;
                case 1: goto L_0x0496;
                case 2: goto L_0x0496;
                case 3: goto L_0x03cf;
                case 4: goto L_0x03c6;
                case 5: goto L_0x03c6;
                case 6: goto L_0x02dc;
                case 7: goto L_0x0259;
                default: goto L_0x0257;
            }
        L_0x0257:
            goto L_0x0006
        L_0x0259:
            java.lang.String r0 = r0.zzk
            int r5 = r1.length
            if (r5 == r14) goto L_0x026d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x026d:
            r5 = r1[r11]     // Catch:{ NumberFormatException -> 0x02cd }
            int r5 = java.lang.Integer.parseInt(r5, r13)     // Catch:{ NumberFormatException -> 0x02cd }
            java.lang.String r5 = com.google.android.gms.internal.ads.zzbb.zzd(r5)     // Catch:{ NumberFormatException -> 0x02cd }
            java.lang.String r9 = "audio/mp4a-latm"
            boolean r5 = r9.equals(r5)     // Catch:{ NumberFormatException -> 0x02cd }
            if (r5 == 0) goto L_0x0006
            r1 = r1[r2]     // Catch:{ NumberFormatException -> 0x02cd }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02cd }
            r5 = 17
            if (r1 == r5) goto L_0x02b9
            if (r1 == r8) goto L_0x02b6
            r5 = 23
            if (r1 == r5) goto L_0x02b3
            r5 = 29
            if (r1 == r5) goto L_0x02b0
            r5 = 39
            if (r1 == r5) goto L_0x02ad
            r5 = 42
            if (r1 == r5) goto L_0x02aa
            switch(r1) {
                case 1: goto L_0x02a8;
                case 2: goto L_0x02a6;
                case 3: goto L_0x02bb;
                case 4: goto L_0x02a4;
                case 5: goto L_0x02a2;
                case 6: goto L_0x02a0;
                default: goto L_0x029e;
            }     // Catch:{ NumberFormatException -> 0x02cd }
        L_0x029e:
            r14 = -1
            goto L_0x02bb
        L_0x02a0:
            r14 = 6
            goto L_0x02bb
        L_0x02a2:
            r14 = 5
            goto L_0x02bb
        L_0x02a4:
            r14 = 4
            goto L_0x02bb
        L_0x02a6:
            r14 = 2
            goto L_0x02bb
        L_0x02a8:
            r14 = 1
            goto L_0x02bb
        L_0x02aa:
            r14 = 42
            goto L_0x02bb
        L_0x02ad:
            r14 = 39
            goto L_0x02bb
        L_0x02b0:
            r14 = 29
            goto L_0x02bb
        L_0x02b3:
            r14 = 23
            goto L_0x02bb
        L_0x02b6:
            r14 = 20
            goto L_0x02bb
        L_0x02b9:
            r14 = 17
        L_0x02bb:
            if (r14 == r7) goto L_0x0006
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x02cd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch:{ NumberFormatException -> 0x02cd }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x02cd }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x02cd }
            r2 = r1
            goto L_0x05dc
        L_0x02cd:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x02dc:
            java.lang.String r5 = r0.zzk
            com.google.android.gms.internal.ads.zzk r0 = r0.zzC
            int r8 = r1.length
            if (r8 >= r15) goto L_0x02f2
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x02f2:
            r8 = r1[r11]     // Catch:{ NumberFormatException -> 0x03b7 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x03b7 }
            r9 = r1[r2]     // Catch:{ NumberFormatException -> 0x03b7 }
            java.lang.String r3 = r9.substring(r3, r2)     // Catch:{ NumberFormatException -> 0x03b7 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x03b7 }
            r1 = r1[r14]     // Catch:{ NumberFormatException -> 0x03b7 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x03b7 }
            if (r8 == 0) goto L_0x031d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown AV1 profile: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x031d:
            if (r1 == r12) goto L_0x0348
            r5 = 10
            if (r1 == r5) goto L_0x0336
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x0336:
            if (r0 == 0) goto L_0x0346
            byte[] r1 = r0.zze
            if (r1 != 0) goto L_0x0343
            int r0 = r0.zzd
            r1 = 7
            if (r0 == r1) goto L_0x0343
            if (r0 != r6) goto L_0x0346
        L_0x0343:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x0349
        L_0x0346:
            r0 = 2
            goto L_0x0349
        L_0x0348:
            r0 = 1
        L_0x0349:
            switch(r3) {
                case 0: goto L_0x0392;
                case 1: goto L_0x0390;
                case 2: goto L_0x038e;
                case 3: goto L_0x038b;
                case 4: goto L_0x0388;
                case 5: goto L_0x0385;
                case 6: goto L_0x0382;
                case 7: goto L_0x037f;
                case 8: goto L_0x037c;
                case 9: goto L_0x0379;
                case 10: goto L_0x0376;
                case 11: goto L_0x0373;
                case 12: goto L_0x0370;
                case 13: goto L_0x036d;
                case 14: goto L_0x036a;
                case 15: goto L_0x0366;
                case 16: goto L_0x0363;
                case 17: goto L_0x0360;
                case 18: goto L_0x035d;
                case 19: goto L_0x035a;
                case 20: goto L_0x0357;
                case 21: goto L_0x0354;
                case 22: goto L_0x0351;
                case 23: goto L_0x034e;
                default: goto L_0x034c;
            }
        L_0x034c:
            r1 = -1
            goto L_0x0393
        L_0x034e:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0393
        L_0x0351:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0393
        L_0x0354:
            r1 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0393
        L_0x0357:
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0393
        L_0x035a:
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0393
        L_0x035d:
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0393
        L_0x0360:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0393
        L_0x0363:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0393
        L_0x0366:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0393
        L_0x036a:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0393
        L_0x036d:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0393
        L_0x0370:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x0393
        L_0x0373:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0393
        L_0x0376:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x0393
        L_0x0379:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x0393
        L_0x037c:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0393
        L_0x037f:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0393
        L_0x0382:
            r1 = 64
            goto L_0x0393
        L_0x0385:
            r1 = 32
            goto L_0x0393
        L_0x0388:
            r1 = 16
            goto L_0x0393
        L_0x038b:
            r1 = 8
            goto L_0x0393
        L_0x038e:
            r1 = 4
            goto L_0x0393
        L_0x0390:
            r1 = 2
            goto L_0x0393
        L_0x0392:
            r1 = 1
        L_0x0393:
            if (r1 != r7) goto L_0x03a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown AV1 level: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x03a8:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x05dc
        L_0x03b7:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x03c6:
            java.lang.String r2 = r0.zzk
            com.google.android.gms.internal.ads.zzk r0 = r0.zzC
            android.util.Pair r0 = zzb(r2, r1, r0)
            return r0
        L_0x03cf:
            java.lang.String r0 = r0.zzk
            int r3 = r1.length
            if (r3 >= r14) goto L_0x03e3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x03e3:
            r3 = r1[r11]     // Catch:{ NumberFormatException -> 0x0487 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0487 }
            r1 = r1[r2]     // Catch:{ NumberFormatException -> 0x0487 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0487 }
            if (r3 == 0) goto L_0x0400
            if (r3 == r11) goto L_0x03fe
            if (r3 == r2) goto L_0x03fc
            if (r3 == r14) goto L_0x03f9
            r1 = -1
            goto L_0x0401
        L_0x03f9:
            r1 = 8
            goto L_0x0401
        L_0x03fc:
            r1 = 4
            goto L_0x0401
        L_0x03fe:
            r1 = 2
            goto L_0x0401
        L_0x0400:
            r1 = 1
        L_0x0401:
            if (r1 != r7) goto L_0x0416
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown VP9 profile: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x0416:
            r3 = 10
            if (r0 == r3) goto L_0x0461
            r3 = 11
            if (r0 == r3) goto L_0x0462
            if (r0 == r8) goto L_0x045f
            r2 = 21
            if (r0 == r2) goto L_0x045c
            r2 = 30
            if (r0 == r2) goto L_0x0459
            r2 = 31
            if (r0 == r2) goto L_0x0456
            r2 = 40
            if (r0 == r2) goto L_0x0453
            r2 = 41
            if (r0 == r2) goto L_0x0450
            r2 = 50
            if (r0 == r2) goto L_0x044d
            r2 = 51
            if (r0 == r2) goto L_0x044a
            switch(r0) {
                case 60: goto L_0x0447;
                case 61: goto L_0x0444;
                case 62: goto L_0x0441;
                default: goto L_0x043f;
            }
        L_0x043f:
            r2 = -1
            goto L_0x0462
        L_0x0441:
            r2 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0462
        L_0x0444:
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x0462
        L_0x0447:
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0462
        L_0x044a:
            r2 = 512(0x200, float:7.175E-43)
            goto L_0x0462
        L_0x044d:
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0462
        L_0x0450:
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x0462
        L_0x0453:
            r2 = 64
            goto L_0x0462
        L_0x0456:
            r2 = 32
            goto L_0x0462
        L_0x0459:
            r2 = 16
            goto L_0x0462
        L_0x045c:
            r2 = 8
            goto L_0x0462
        L_0x045f:
            r2 = 4
            goto L_0x0462
        L_0x0461:
            r2 = 1
        L_0x0462:
            if (r2 != r7) goto L_0x0477
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown VP9 level: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x0477:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r2)
        L_0x0484:
            r2 = r0
            goto L_0x05dc
        L_0x0487:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x0496:
            java.lang.String r0 = r0.zzk
            int r5 = r1.length
            java.lang.String r8 = "Ignoring malformed AVC codec string: "
            if (r5 >= r2) goto L_0x04aa
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r8.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x04aa:
            r9 = r1[r11]     // Catch:{ NumberFormatException -> 0x058b }
            int r9 = r9.length()     // Catch:{ NumberFormatException -> 0x058b }
            if (r9 != r6) goto L_0x04c7
            r5 = r1[r11]     // Catch:{ NumberFormatException -> 0x058b }
            java.lang.String r3 = r5.substring(r3, r2)     // Catch:{ NumberFormatException -> 0x058b }
            int r3 = java.lang.Integer.parseInt(r3, r13)     // Catch:{ NumberFormatException -> 0x058b }
            r1 = r1[r11]     // Catch:{ NumberFormatException -> 0x058b }
            java.lang.String r1 = r1.substring(r15)     // Catch:{ NumberFormatException -> 0x058b }
            int r0 = java.lang.Integer.parseInt(r1, r13)     // Catch:{ NumberFormatException -> 0x058b }
            goto L_0x04d5
        L_0x04c7:
            if (r5 < r14) goto L_0x057a
            r3 = r1[r11]     // Catch:{ NumberFormatException -> 0x058b }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x058b }
            r1 = r1[r2]     // Catch:{ NumberFormatException -> 0x058b }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x058b }
        L_0x04d5:
            r1 = 66
            if (r3 == r1) goto L_0x0501
            r1 = 77
            if (r3 == r1) goto L_0x0502
            r1 = 88
            if (r3 == r1) goto L_0x04ff
            r1 = 100
            if (r3 == r1) goto L_0x04fc
            r1 = 110(0x6e, float:1.54E-43)
            if (r3 == r1) goto L_0x04f9
            r1 = 122(0x7a, float:1.71E-43)
            if (r3 == r1) goto L_0x04f6
            r1 = 244(0xf4, float:3.42E-43)
            if (r3 == r1) goto L_0x04f3
            r2 = -1
            goto L_0x0502
        L_0x04f3:
            r2 = 64
            goto L_0x0502
        L_0x04f6:
            r2 = 32
            goto L_0x0502
        L_0x04f9:
            r2 = 16
            goto L_0x0502
        L_0x04fc:
            r2 = 8
            goto L_0x0502
        L_0x04ff:
            r2 = 4
            goto L_0x0502
        L_0x0501:
            r2 = 1
        L_0x0502:
            if (r2 != r7) goto L_0x0517
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown AVC profile: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x0517:
            switch(r0) {
                case 10: goto L_0x0555;
                case 11: goto L_0x0553;
                case 12: goto L_0x0550;
                case 13: goto L_0x054d;
                default: goto L_0x051a;
            }
        L_0x051a:
            switch(r0) {
                case 20: goto L_0x054a;
                case 21: goto L_0x0547;
                case 22: goto L_0x0544;
                default: goto L_0x051d;
            }
        L_0x051d:
            switch(r0) {
                case 30: goto L_0x0541;
                case 31: goto L_0x053e;
                case 32: goto L_0x053b;
                default: goto L_0x0520;
            }
        L_0x0520:
            switch(r0) {
                case 40: goto L_0x0538;
                case 41: goto L_0x0535;
                case 42: goto L_0x0532;
                default: goto L_0x0523;
            }
        L_0x0523:
            switch(r0) {
                case 50: goto L_0x052f;
                case 51: goto L_0x052b;
                case 52: goto L_0x0528;
                default: goto L_0x0526;
            }
        L_0x0526:
            r1 = -1
            goto L_0x0556
        L_0x0528:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0556
        L_0x052b:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0556
        L_0x052f:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0556
        L_0x0532:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0556
        L_0x0535:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x0556
        L_0x0538:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0556
        L_0x053b:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x0556
        L_0x053e:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x0556
        L_0x0541:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0556
        L_0x0544:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0556
        L_0x0547:
            r1 = 64
            goto L_0x0556
        L_0x054a:
            r1 = 32
            goto L_0x0556
        L_0x054d:
            r1 = 16
            goto L_0x0556
        L_0x0550:
            r1 = 8
            goto L_0x0556
        L_0x0553:
            r1 = 4
            goto L_0x0556
        L_0x0555:
            r1 = 1
        L_0x0556:
            if (r1 != r7) goto L_0x056b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AVC level: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x056b:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r2, r1)
            goto L_0x0484
        L_0x057a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x058b }
            r1.<init>(r8)     // Catch:{ NumberFormatException -> 0x058b }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x058b }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x058b }
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r1)     // Catch:{ NumberFormatException -> 0x058b }
            goto L_0x0006
        L_0x058b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r8.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x0006
        L_0x0598:
            java.lang.String r0 = r0.zzk
            android.util.Pair r3 = new android.util.Pair
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r3.<init>(r5, r5)
            int r5 = r1.length
            if (r5 >= r14) goto L_0x05b4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed H263 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
            goto L_0x05db
        L_0x05b4:
            r5 = r1[r11]     // Catch:{ NumberFormatException -> 0x05ce }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x05ce }
            r1 = r1[r2]     // Catch:{ NumberFormatException -> 0x05ce }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x05ce }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x05ce }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x05ce }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x05ce }
            r2.<init>(r5, r1)     // Catch:{ NumberFormatException -> 0x05ce }
            goto L_0x05dc
        L_0x05ce:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed H263 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r0)
        L_0x05db:
            r2 = r3
        L_0x05dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcy.zza(com.google.android.gms.internal.ads.zzab):android.util.Pair");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        if (r11.equals("L123") != false) goto L_0x0199;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zzb(java.lang.String r10, java.lang.String[] r11, com.google.android.gms.internal.ads.zzk r12) {
        /*
            int r0 = r11.length
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r2 = "CodecSpecificDataUtil"
            r3 = 0
            r4 = 4
            if (r0 >= r4) goto L_0x0015
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r1.concat(r10)
            com.google.android.gms.internal.ads.zzdo.zzf(r2, r10)
            return r3
        L_0x0015:
            java.util.regex.Pattern r0 = zzd
            r5 = 1
            r6 = r11[r5]
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r6 = r0.matches()
            if (r6 != 0) goto L_0x0030
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r1.concat(r10)
            com.google.android.gms.internal.ads.zzdo.zzf(r2, r10)
            return r3
        L_0x0030:
            java.lang.String r10 = r0.group(r5)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)
            r1 = 4096(0x1000, float:5.74E-42)
            r6 = 6
            r7 = 2
            if (r0 == 0) goto L_0x0042
            r10 = 1
            goto L_0x005e
        L_0x0042:
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0055
            if (r12 == 0) goto L_0x0053
            int r10 = r12.zzd
            if (r10 != r6) goto L_0x0053
            r10 = 4096(0x1000, float:5.74E-42)
            goto L_0x005e
        L_0x0053:
            r10 = 2
            goto L_0x005e
        L_0x0055:
            java.lang.String r12 = "6"
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x026c
            r10 = 6
        L_0x005e:
            r12 = 3
            r11 = r11[r12]
            if (r11 != 0) goto L_0x0066
        L_0x0063:
            r12 = r3
            goto L_0x0252
        L_0x0066:
            int r0 = r11.hashCode()
            r8 = 8
            r9 = 16
            switch(r0) {
                case 70821: goto L_0x018d;
                case 70914: goto L_0x0182;
                case 70917: goto L_0x0177;
                case 71007: goto L_0x016c;
                case 71010: goto L_0x0161;
                case 74665: goto L_0x0157;
                case 74758: goto L_0x014d;
                case 74761: goto L_0x0143;
                case 74851: goto L_0x0139;
                case 74854: goto L_0x012f;
                case 2193639: goto L_0x0123;
                case 2193642: goto L_0x0117;
                case 2193732: goto L_0x010b;
                case 2193735: goto L_0x00ff;
                case 2193738: goto L_0x00f3;
                case 2193825: goto L_0x00e7;
                case 2193828: goto L_0x00db;
                case 2193831: goto L_0x00cf;
                case 2312803: goto L_0x00c4;
                case 2312806: goto L_0x00ba;
                case 2312896: goto L_0x00af;
                case 2312899: goto L_0x00a3;
                case 2312902: goto L_0x0097;
                case 2312989: goto L_0x008b;
                case 2312992: goto L_0x007f;
                case 2312995: goto L_0x0073;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0198
        L_0x0073:
            java.lang.String r12 = "L186"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 12
            goto L_0x0199
        L_0x007f:
            java.lang.String r12 = "L183"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 11
            goto L_0x0199
        L_0x008b:
            java.lang.String r12 = "L180"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 10
            goto L_0x0199
        L_0x0097:
            java.lang.String r12 = "L156"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 9
            goto L_0x0199
        L_0x00a3:
            java.lang.String r12 = "L153"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 8
            goto L_0x0199
        L_0x00af:
            java.lang.String r12 = "L150"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 7
            goto L_0x0199
        L_0x00ba:
            java.lang.String r12 = "L123"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            goto L_0x0199
        L_0x00c4:
            java.lang.String r12 = "L120"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 5
            goto L_0x0199
        L_0x00cf:
            java.lang.String r12 = "H186"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 25
            goto L_0x0199
        L_0x00db:
            java.lang.String r12 = "H183"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 24
            goto L_0x0199
        L_0x00e7:
            java.lang.String r12 = "H180"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 23
            goto L_0x0199
        L_0x00f3:
            java.lang.String r12 = "H156"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 22
            goto L_0x0199
        L_0x00ff:
            java.lang.String r12 = "H153"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 21
            goto L_0x0199
        L_0x010b:
            java.lang.String r12 = "H150"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 20
            goto L_0x0199
        L_0x0117:
            java.lang.String r12 = "H123"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 19
            goto L_0x0199
        L_0x0123:
            java.lang.String r12 = "H120"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 18
            goto L_0x0199
        L_0x012f:
            java.lang.String r12 = "L93"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 4
            goto L_0x0199
        L_0x0139:
            java.lang.String r0 = "L90"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0198
            r6 = 3
            goto L_0x0199
        L_0x0143:
            java.lang.String r12 = "L63"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 2
            goto L_0x0199
        L_0x014d:
            java.lang.String r12 = "L60"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 1
            goto L_0x0199
        L_0x0157:
            java.lang.String r12 = "L30"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 0
            goto L_0x0199
        L_0x0161:
            java.lang.String r12 = "H93"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 17
            goto L_0x0199
        L_0x016c:
            java.lang.String r12 = "H90"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 16
            goto L_0x0199
        L_0x0177:
            java.lang.String r12 = "H63"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 15
            goto L_0x0199
        L_0x0182:
            java.lang.String r12 = "H60"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 14
            goto L_0x0199
        L_0x018d:
            java.lang.String r12 = "H30"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0198
            r6 = 13
            goto L_0x0199
        L_0x0198:
            r6 = -1
        L_0x0199:
            switch(r6) {
                case 0: goto L_0x024e;
                case 1: goto L_0x0249;
                case 2: goto L_0x0244;
                case 3: goto L_0x023d;
                case 4: goto L_0x0236;
                case 5: goto L_0x022f;
                case 6: goto L_0x022a;
                case 7: goto L_0x0223;
                case 8: goto L_0x021c;
                case 9: goto L_0x0215;
                case 10: goto L_0x020e;
                case 11: goto L_0x0207;
                case 12: goto L_0x0200;
                case 13: goto L_0x01fb;
                case 14: goto L_0x01f6;
                case 15: goto L_0x01ef;
                case 16: goto L_0x01e7;
                case 17: goto L_0x01df;
                case 18: goto L_0x01d7;
                case 19: goto L_0x01cf;
                case 20: goto L_0x01c6;
                case 21: goto L_0x01be;
                case 22: goto L_0x01b6;
                case 23: goto L_0x01ae;
                case 24: goto L_0x01a6;
                case 25: goto L_0x019e;
                default: goto L_0x019c;
            }
        L_0x019c:
            goto L_0x0063
        L_0x019e:
            r12 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01a6:
            r12 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01ae:
            r12 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01b6:
            r12 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01be:
            r12 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01c6:
            r12 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01cf:
            r12 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01d7:
            r12 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01df:
            r12 = 512(0x200, float:7.175E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01e7:
            r12 = 128(0x80, float:1.794E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01ef:
            r12 = 32
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x01f6:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            goto L_0x0252
        L_0x01fb:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            goto L_0x0252
        L_0x0200:
            r12 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x0207:
            r12 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x020e:
            r12 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x0215:
            r12 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x021c:
            r12 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x0223:
            r12 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x022a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            goto L_0x0252
        L_0x022f:
            r12 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x0236:
            r12 = 256(0x100, float:3.59E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x023d:
            r12 = 64
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0252
        L_0x0244:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            goto L_0x0252
        L_0x0249:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            goto L_0x0252
        L_0x024e:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
        L_0x0252:
            if (r12 != 0) goto L_0x0262
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = "Unknown HEVC level string: "
            java.lang.String r10 = r11.concat(r10)
            com.google.android.gms.internal.ads.zzdo.zzf(r2, r10)
            return r3
        L_0x0262:
            android.util.Pair r11 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.<init>(r10, r12)
            return r11
        L_0x026c:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Unknown HEVC profile string: "
            java.lang.String r10 = r11.concat(r10)
            com.google.android.gms.internal.ads.zzdo.zzf(r2, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcy.zzb(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzk):android.util.Pair");
    }

    public static String zzc(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public static String zzd(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", new Object[]{zzc[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)}));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i7])}));
        }
        return sb.toString();
    }

    public static byte[] zze(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
