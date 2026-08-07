package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzach implements zzacs {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzacg zzb = new zzacg(new zzacd());
    private static final zzacg zzc = new zzacg(new zzace());
    private zzfxn zzd;
    private final zzakd zze = new zzajy();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c4, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c5, code lost:
        switch(r3) {
            case 0: goto L_0x0200;
            case 1: goto L_0x0200;
            case 2: goto L_0x0200;
            case 3: goto L_0x01fe;
            case 4: goto L_0x01fc;
            case 5: goto L_0x01fc;
            case 6: goto L_0x01fc;
            case 7: goto L_0x01fa;
            case 8: goto L_0x01f8;
            case 9: goto L_0x01f5;
            case 10: goto L_0x01f3;
            case 11: goto L_0x01f3;
            case 12: goto L_0x01f3;
            case 13: goto L_0x01f3;
            case 14: goto L_0x01f3;
            case 15: goto L_0x01f1;
            case 16: goto L_0x01ee;
            case 17: goto L_0x01ee;
            case 18: goto L_0x01ee;
            case 19: goto L_0x01eb;
            case 20: goto L_0x01e8;
            case 21: goto L_0x01e5;
            case 22: goto L_0x01e2;
            case 23: goto L_0x01df;
            case 24: goto L_0x01dc;
            case 25: goto L_0x01d9;
            case 26: goto L_0x01d6;
            case 27: goto L_0x01d3;
            case 28: goto L_0x01d0;
            case 29: goto L_0x01cd;
            case 30: goto L_0x01cd;
            case 31: goto L_0x01ca;
            default: goto L_0x01c8;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ca, code lost:
        r3 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01cd, code lost:
        r3 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d0, code lost:
        r3 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d3, code lost:
        r3 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d6, code lost:
        r3 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d9, code lost:
        r3 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01dc, code lost:
        r3 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01df, code lost:
        r3 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e2, code lost:
        r3 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e5, code lost:
        r3 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01e8, code lost:
        r3 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01eb, code lost:
        r3 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ee, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f1, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f3, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f5, code lost:
        r3 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01f8, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fa, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01fc, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01fe, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0200, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzacn[] zza(android.net.Uri r25, java.util.Map r26) {
        /*
            r24 = this;
            r1 = r24
            monitor-enter(r24)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x03f0 }
            r2 = 21
            r0.<init>(r2)     // Catch:{ all -> 0x03f0 }
            java.lang.String r3 = "Content-Type"
            r4 = r26
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x03f0 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x03f0 }
            r4 = 0
            if (r3 == 0) goto L_0x0025
            boolean r5 = r3.isEmpty()     // Catch:{ all -> 0x03f0 }
            if (r5 == 0) goto L_0x001e
            goto L_0x0025
        L_0x001e:
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x03f0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x03f0 }
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            r7 = 7
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 20
            r12 = 19
            r13 = 14
            r14 = 13
            r15 = 12
            r16 = 11
            r17 = 9
            r18 = 6
            r19 = 1
            r20 = 15
            r21 = 10
            r22 = 8
            r4 = -1
            if (r3 != 0) goto L_0x0048
        L_0x0045:
            r3 = -1
            goto L_0x0201
        L_0x0048:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzbb.zze(r3)     // Catch:{ all -> 0x03f0 }
            int r23 = r3.hashCode()     // Catch:{ all -> 0x03f0 }
            switch(r23) {
                case -2123537834: goto L_0x01ba;
                case -1662384011: goto L_0x01af;
                case -1662384007: goto L_0x01a4;
                case -1662095187: goto L_0x0199;
                case -1606874997: goto L_0x018f;
                case -1487656890: goto L_0x0184;
                case -1487464693: goto L_0x0179;
                case -1487464690: goto L_0x016e;
                case -1487394660: goto L_0x0163;
                case -1487018032: goto L_0x0157;
                case -1248337486: goto L_0x014b;
                case -1079884372: goto L_0x013f;
                case -1004728940: goto L_0x0133;
                case -879272239: goto L_0x0127;
                case -879258763: goto L_0x011b;
                case -387023398: goto L_0x010f;
                case -43467528: goto L_0x0103;
                case 13915911: goto L_0x00f7;
                case 187078296: goto L_0x00ec;
                case 187078297: goto L_0x00e1;
                case 187078669: goto L_0x00d6;
                case 187090232: goto L_0x00ca;
                case 187091926: goto L_0x00be;
                case 187099443: goto L_0x00b2;
                case 1331848029: goto L_0x00a6;
                case 1503095341: goto L_0x009b;
                case 1504578661: goto L_0x0090;
                case 1504619009: goto L_0x0085;
                case 1504824762: goto L_0x0079;
                case 1504831518: goto L_0x006d;
                case 1505118770: goto L_0x0061;
                case 2039520277: goto L_0x0055;
                default: goto L_0x0053;
            }     // Catch:{ all -> 0x03f0 }
        L_0x0053:
            goto L_0x01c4
        L_0x0055:
            java.lang.String r5 = "video/x-matroska"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 10
            goto L_0x01c5
        L_0x0061:
            java.lang.String r5 = "audio/webm"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 13
            goto L_0x01c5
        L_0x006d:
            java.lang.String r5 = "audio/mpeg"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 15
            goto L_0x01c5
        L_0x0079:
            java.lang.String r5 = "audio/midi"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 9
            goto L_0x01c5
        L_0x0085:
            java.lang.String r5 = "audio/flac"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 7
            goto L_0x01c5
        L_0x0090:
            java.lang.String r5 = "audio/eac3"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 1
            goto L_0x01c5
        L_0x009b:
            java.lang.String r5 = "audio/3gpp"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 5
            goto L_0x01c5
        L_0x00a6:
            java.lang.String r5 = "video/mp4"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 16
            goto L_0x01c5
        L_0x00b2:
            java.lang.String r5 = "audio/wav"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 22
            goto L_0x01c5
        L_0x00be:
            java.lang.String r5 = "audio/ogg"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 19
            goto L_0x01c5
        L_0x00ca:
            java.lang.String r5 = "audio/mp4"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 17
            goto L_0x01c5
        L_0x00d6:
            java.lang.String r5 = "audio/amr"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 4
            goto L_0x01c5
        L_0x00e1:
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 3
            goto L_0x01c5
        L_0x00ec:
            java.lang.String r5 = "audio/ac3"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 0
            goto L_0x01c5
        L_0x00f7:
            java.lang.String r5 = "video/x-flv"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 8
            goto L_0x01c5
        L_0x0103:
            java.lang.String r5 = "application/webm"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 14
            goto L_0x01c5
        L_0x010f:
            java.lang.String r5 = "audio/x-matroska"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 11
            goto L_0x01c5
        L_0x011b:
            java.lang.String r5 = "image/png"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 26
            goto L_0x01c5
        L_0x0127:
            java.lang.String r5 = "image/bmp"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 28
            goto L_0x01c5
        L_0x0133:
            java.lang.String r5 = "text/vtt"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 23
            goto L_0x01c5
        L_0x013f:
            java.lang.String r5 = "video/x-msvideo"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 25
            goto L_0x01c5
        L_0x014b:
            java.lang.String r5 = "application/mp4"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 18
            goto L_0x01c5
        L_0x0157:
            java.lang.String r5 = "image/webp"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 27
            goto L_0x01c5
        L_0x0163:
            java.lang.String r5 = "image/jpeg"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 24
            goto L_0x01c5
        L_0x016e:
            java.lang.String r5 = "image/heif"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 29
            goto L_0x01c5
        L_0x0179:
            java.lang.String r5 = "image/heic"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 30
            goto L_0x01c5
        L_0x0184:
            java.lang.String r5 = "image/avif"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 31
            goto L_0x01c5
        L_0x018f:
            java.lang.String r5 = "audio/amr-wb"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 6
            goto L_0x01c5
        L_0x0199:
            java.lang.String r5 = "video/webm"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 12
            goto L_0x01c5
        L_0x01a4:
            java.lang.String r5 = "video/mp2t"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 21
            goto L_0x01c5
        L_0x01af:
            java.lang.String r5 = "video/mp2p"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 20
            goto L_0x01c5
        L_0x01ba:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x03f0 }
            if (r3 == 0) goto L_0x01c4
            r3 = 2
            goto L_0x01c5
        L_0x01c4:
            r3 = -1
        L_0x01c5:
            switch(r3) {
                case 0: goto L_0x0200;
                case 1: goto L_0x0200;
                case 2: goto L_0x0200;
                case 3: goto L_0x01fe;
                case 4: goto L_0x01fc;
                case 5: goto L_0x01fc;
                case 6: goto L_0x01fc;
                case 7: goto L_0x01fa;
                case 8: goto L_0x01f8;
                case 9: goto L_0x01f5;
                case 10: goto L_0x01f3;
                case 11: goto L_0x01f3;
                case 12: goto L_0x01f3;
                case 13: goto L_0x01f3;
                case 14: goto L_0x01f3;
                case 15: goto L_0x01f1;
                case 16: goto L_0x01ee;
                case 17: goto L_0x01ee;
                case 18: goto L_0x01ee;
                case 19: goto L_0x01eb;
                case 20: goto L_0x01e8;
                case 21: goto L_0x01e5;
                case 22: goto L_0x01e2;
                case 23: goto L_0x01df;
                case 24: goto L_0x01dc;
                case 25: goto L_0x01d9;
                case 26: goto L_0x01d6;
                case 27: goto L_0x01d3;
                case 28: goto L_0x01d0;
                case 29: goto L_0x01cd;
                case 30: goto L_0x01cd;
                case 31: goto L_0x01ca;
                default: goto L_0x01c8;
            }     // Catch:{ all -> 0x03f0 }
        L_0x01c8:
            goto L_0x0045
        L_0x01ca:
            r3 = 21
            goto L_0x0201
        L_0x01cd:
            r3 = 20
            goto L_0x0201
        L_0x01d0:
            r3 = 19
            goto L_0x0201
        L_0x01d3:
            r3 = 18
            goto L_0x0201
        L_0x01d6:
            r3 = 17
            goto L_0x0201
        L_0x01d9:
            r3 = 16
            goto L_0x0201
        L_0x01dc:
            r3 = 14
            goto L_0x0201
        L_0x01df:
            r3 = 13
            goto L_0x0201
        L_0x01e2:
            r3 = 12
            goto L_0x0201
        L_0x01e5:
            r3 = 11
            goto L_0x0201
        L_0x01e8:
            r3 = 10
            goto L_0x0201
        L_0x01eb:
            r3 = 9
            goto L_0x0201
        L_0x01ee:
            r3 = 8
            goto L_0x0201
        L_0x01f1:
            r3 = 7
            goto L_0x0201
        L_0x01f3:
            r3 = 6
            goto L_0x0201
        L_0x01f5:
            r3 = 15
            goto L_0x0201
        L_0x01f8:
            r3 = 5
            goto L_0x0201
        L_0x01fa:
            r3 = 4
            goto L_0x0201
        L_0x01fc:
            r3 = 3
            goto L_0x0201
        L_0x01fe:
            r3 = 1
            goto L_0x0201
        L_0x0200:
            r3 = 0
        L_0x0201:
            if (r3 == r4) goto L_0x0206
            r1.zzb(r3, r0)     // Catch:{ all -> 0x03f0 }
        L_0x0206:
            java.lang.String r5 = r25.getLastPathSegment()     // Catch:{ all -> 0x03f0 }
            if (r5 != 0) goto L_0x020f
        L_0x020c:
            r5 = -1
            goto L_0x03ca
        L_0x020f:
            java.lang.String r6 = ".ac3"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03c9
            java.lang.String r6 = ".ec3"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0221
            goto L_0x03c9
        L_0x0221:
            java.lang.String r6 = ".ac4"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x022c
            r5 = 1
            goto L_0x03ca
        L_0x022c:
            java.lang.String r6 = ".adts"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03c7
            java.lang.String r6 = ".aac"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x023e
            goto L_0x03c7
        L_0x023e:
            java.lang.String r6 = ".amr"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0249
            r5 = 3
            goto L_0x03ca
        L_0x0249:
            java.lang.String r6 = ".flac"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0254
            r5 = 4
            goto L_0x03ca
        L_0x0254:
            java.lang.String r6 = ".flv"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x025f
            r5 = 5
            goto L_0x03ca
        L_0x025f:
            java.lang.String r6 = ".mid"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03c4
            java.lang.String r6 = ".midi"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03c4
            java.lang.String r6 = ".smf"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0279
            goto L_0x03c4
        L_0x0279:
            int r6 = r5.length()     // Catch:{ all -> 0x03f0 }
            java.lang.String r8 = ".mk"
            int r6 = r6 + -4
            boolean r6 = r5.startsWith(r8, r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03c2
            java.lang.String r6 = ".webm"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0291
            goto L_0x03c2
        L_0x0291:
            java.lang.String r6 = ".mp3"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x029c
            r5 = 7
            goto L_0x03ca
        L_0x029c:
            java.lang.String r6 = ".mp4"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03bf
            int r6 = r5.length()     // Catch:{ all -> 0x03f0 }
            int r6 = r6 + -4
            java.lang.String r7 = ".m4"
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03bf
            int r6 = r5.length()     // Catch:{ all -> 0x03f0 }
            java.lang.String r7 = ".mp4"
            int r6 = r6 + -5
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03bf
            int r6 = r5.length()     // Catch:{ all -> 0x03f0 }
            int r6 = r6 + -5
            java.lang.String r7 = ".cmf"
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x02d0
            goto L_0x03bf
        L_0x02d0:
            int r6 = r5.length()     // Catch:{ all -> 0x03f0 }
            int r6 = r6 + -4
            java.lang.String r7 = ".og"
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03bc
            java.lang.String r6 = ".opus"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x02e8
            goto L_0x03bc
        L_0x02e8:
            java.lang.String r6 = ".ps"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03b9
            java.lang.String r6 = ".mpeg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03b9
            java.lang.String r6 = ".mpg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03b9
            java.lang.String r6 = ".m2p"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x030a
            goto L_0x03b9
        L_0x030a:
            java.lang.String r6 = ".ts"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03b6
            int r6 = r5.length()     // Catch:{ all -> 0x03f0 }
            int r6 = r6 + -4
            java.lang.String r7 = ".ts"
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0322
            goto L_0x03b6
        L_0x0322:
            java.lang.String r6 = ".wav"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03b3
            java.lang.String r6 = ".wave"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0334
            goto L_0x03b3
        L_0x0334:
            java.lang.String r6 = ".vtt"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03b0
            java.lang.String r6 = ".webvtt"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0346
            goto L_0x03b0
        L_0x0346:
            java.lang.String r6 = ".jpg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03ad
            java.lang.String r6 = ".jpeg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0357
            goto L_0x03ad
        L_0x0357:
            java.lang.String r6 = ".avi"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x0363
            r5 = 16
            goto L_0x03ca
        L_0x0363:
            java.lang.String r6 = ".png"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x036f
            r5 = 17
            goto L_0x03ca
        L_0x036f:
            java.lang.String r6 = ".webp"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x037a
            r5 = 18
            goto L_0x03ca
        L_0x037a:
            java.lang.String r6 = ".bmp"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03aa
            java.lang.String r6 = ".dib"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x038b
            goto L_0x03aa
        L_0x038b:
            java.lang.String r6 = ".heic"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 != 0) goto L_0x03a7
            java.lang.String r6 = ".heif"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r6 == 0) goto L_0x039c
            goto L_0x03a7
        L_0x039c:
            java.lang.String r6 = ".avif"
            boolean r5 = r5.endsWith(r6)     // Catch:{ all -> 0x03f0 }
            if (r5 == 0) goto L_0x020c
            r5 = 21
            goto L_0x03ca
        L_0x03a7:
            r5 = 20
            goto L_0x03ca
        L_0x03aa:
            r5 = 19
            goto L_0x03ca
        L_0x03ad:
            r5 = 14
            goto L_0x03ca
        L_0x03b0:
            r5 = 13
            goto L_0x03ca
        L_0x03b3:
            r5 = 12
            goto L_0x03ca
        L_0x03b6:
            r5 = 11
            goto L_0x03ca
        L_0x03b9:
            r5 = 10
            goto L_0x03ca
        L_0x03bc:
            r5 = 9
            goto L_0x03ca
        L_0x03bf:
            r5 = 8
            goto L_0x03ca
        L_0x03c2:
            r5 = 6
            goto L_0x03ca
        L_0x03c4:
            r5 = 15
            goto L_0x03ca
        L_0x03c7:
            r5 = 2
            goto L_0x03ca
        L_0x03c9:
            r5 = 0
        L_0x03ca:
            if (r5 == r4) goto L_0x03d1
            if (r5 == r3) goto L_0x03d1
            r1.zzb(r5, r0)     // Catch:{ all -> 0x03f0 }
        L_0x03d1:
            int[] r4 = zza     // Catch:{ all -> 0x03f0 }
            r6 = 0
        L_0x03d4:
            if (r6 >= r2) goto L_0x03e2
            r7 = r4[r6]     // Catch:{ all -> 0x03f0 }
            if (r7 == r3) goto L_0x03df
            if (r7 == r5) goto L_0x03df
            r1.zzb(r7, r0)     // Catch:{ all -> 0x03f0 }
        L_0x03df:
            int r6 = r6 + 1
            goto L_0x03d4
        L_0x03e2:
            int r2 = r0.size()     // Catch:{ all -> 0x03f0 }
            com.google.android.gms.internal.ads.zzacn[] r2 = new com.google.android.gms.internal.ads.zzacn[r2]     // Catch:{ all -> 0x03f0 }
            java.lang.Object[] r0 = r0.toArray(r2)     // Catch:{ all -> 0x03f0 }
            com.google.android.gms.internal.ads.zzacn[] r0 = (com.google.android.gms.internal.ads.zzacn[]) r0     // Catch:{ all -> 0x03f0 }
            monitor-exit(r24)
            return r0
        L_0x03f0:
            r0 = move-exception
            monitor-exit(r24)     // Catch:{ all -> 0x03f0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzach.zza(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzacn[]");
    }

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzama());
                return;
            case 1:
                list.add(new zzamc());
                return;
            case 2:
                list.add(new zzame(0));
                return;
            case 3:
                list.add(new zzaea(0));
                return;
            case 4:
                zzacn zza2 = zzb.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzaes(0));
                    return;
                }
            case 5:
                list.add(new zzaeu());
                return;
            case 6:
                list.add(new zzahm(this.zze, 0));
                return;
            case 7:
                list.add(new zzahs(0));
                return;
            case 8:
                list.add(new zzaiq(this.zze, 0, (zzef) null, (zzajb) null, zzfxn.zzn(), (zzadt) null));
                list.add(new zzaiv(this.zze, 0));
                return;
            case 9:
                list.add(new zzajl());
                return;
            case 10:
                list.add(new zzanj());
                return;
            case 11:
                if (this.zzd == null) {
                    this.zzd = zzfxn.zzn();
                }
                list.add(new zzant(1, 0, this.zze, new zzef(0), new zzamg(0, this.zzd), 112800));
                return;
            case 12:
                list.add(new zzaoe());
                return;
            case 14:
                list.add(new zzafa(0));
                return;
            case 15:
                zzacn zza3 = zzc.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    return;
                }
                return;
            case 16:
                list.add(new zzaef(0, this.zze));
                return;
            case 17:
                list.add(new zzajw());
                return;
            case 18:
                list.add(new zzaoj());
                return;
            case 19:
                list.add(new zzaen());
                return;
            case 20:
                list.add(new zzaez());
                return;
            case 21:
                list.add(new zzaem());
                return;
            default:
                return;
        }
    }
}
