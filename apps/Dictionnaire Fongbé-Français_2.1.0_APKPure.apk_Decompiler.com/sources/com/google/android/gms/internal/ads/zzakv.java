package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzakv implements zzakf {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzaku zzc;
    private final zzdy zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzakv() {
        this((List) null);
    }

    private static float zzb(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) list.get(size)).longValue() != j) {
                    if (((Long) list.get(size)).longValue() < j) {
                        i = size + 1;
                        break;
                    }
                } else {
                    return size;
                }
            } else {
                i = 0;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = zzei.zza;
        String str2 = group;
        String group2 = matcher.group(2);
        String str3 = group2;
        String group3 = matcher.group(3);
        String str4 = group3;
        String group4 = matcher.group(4);
        String str5 = group4;
        return (Long.parseLong(group) * 3600000000L) + (Long.parseLong(group2) * 60000000) + (Long.parseLong(group3) * 1000000) + (Long.parseLong(group4) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r3.equals("playresx") != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zze(com.google.android.gms.internal.ads.zzdy r7, java.nio.charset.Charset r8) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.String r0 = r7.zzz(r8)
            if (r0 == 0) goto L_0x00df
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 91
            if (r1 == 0) goto L_0x0075
        L_0x0010:
            java.lang.String r0 = r7.zzz(r8)
            if (r0 == 0) goto L_0x0000
            int r1 = r7.zzb()
            if (r1 == 0) goto L_0x0022
            char r1 = r7.zza(r8)
            if (r1 == r2) goto L_0x0000
        L_0x0022:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L_0x0010
            r1 = 0
            r3 = r0[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.zzftt.zza(r3)
            int r4 = r3.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L_0x004a;
                case 1879649549: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0053
        L_0x0040:
            java.lang.String r1 = "playresy"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0053
            r1 = 1
            goto L_0x0054
        L_0x004a:
            java.lang.String r4 = "playresx"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = -1
        L_0x0054:
            if (r1 == 0) goto L_0x0068
            if (r1 == r5) goto L_0x0059
            goto L_0x0010
        L_0x0059:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0066 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0066 }
            r6.zzg = r0     // Catch:{ NumberFormatException -> 0x0066 }
            goto L_0x0010
        L_0x0066:
            goto L_0x0010
        L_0x0068:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0066 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0066 }
            r6.zzf = r0     // Catch:{ NumberFormatException -> 0x0066 }
            goto L_0x0010
        L_0x0075:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r3 = "SsaParser"
            if (r1 == 0) goto L_0x00c8
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L_0x0085:
            java.lang.String r4 = r7.zzz(r8)
            if (r4 == 0) goto L_0x00c4
            int r5 = r7.zzb()
            if (r5 == 0) goto L_0x0097
            char r5 = r7.zza(r8)
            if (r5 == r2) goto L_0x00c4
        L_0x0097:
            java.lang.String r5 = "Format:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.zzakw r1 = com.google.android.gms.internal.ads.zzakw.zza(r4)
            goto L_0x0085
        L_0x00a4:
            java.lang.String r5 = "Style:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0085
            if (r1 != 0) goto L_0x00b8
            java.lang.String r5 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.internal.ads.zzdo.zzf(r3, r4)
            goto L_0x0085
        L_0x00b8:
            com.google.android.gms.internal.ads.zzaky r4 = com.google.android.gms.internal.ads.zzaky.zzb(r4, r1)
            if (r4 == 0) goto L_0x0085
            java.lang.String r5 = r4.zza
            r0.put(r5, r4)
            goto L_0x0085
        L_0x00c4:
            r6.zze = r0
            goto L_0x0000
        L_0x00c8:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = "[V4 Styles] are not supported"
            com.google.android.gms.internal.ads.zzdo.zze(r3, r0)
            goto L_0x0000
        L_0x00d7:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0000
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakv.zze(com.google.android.gms.internal.ads.zzdy, java.nio.charset.Charset):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0243, code lost:
        r7.zzh(zzb(r7.zzb()));
        r7.zze(zzb(r7.zza()), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025a, code lost:
        r0 = r7.zzp();
        r1 = zzc(r13, r3, r2);
        r4 = zzc(r21, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0268, code lost:
        if (r1 >= r4) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026a, code lost:
        ((java.util.List) r2.get(r1)).add(r0);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e8, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e9, code lost:
        r7.zzm(r5);
        r9 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ee, code lost:
        switch(r0) {
            case -1: goto L_0x0207;
            case 0: goto L_0x01f1;
            case 1: goto L_0x0205;
            case 2: goto L_0x0203;
            case 3: goto L_0x0201;
            case 4: goto L_0x0205;
            case 5: goto L_0x0203;
            case 6: goto L_0x0201;
            case 7: goto L_0x0205;
            case 8: goto L_0x0203;
            case 9: goto L_0x0201;
            default: goto L_0x01f1;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f1, code lost:
        com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Unknown alignment: " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0201, code lost:
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0203, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0205, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0207, code lost:
        r5 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0209, code lost:
        r7.zzi(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020c, code lost:
        switch(r0) {
            case -1: goto L_0x0224;
            case 0: goto L_0x020f;
            case 1: goto L_0x0223;
            case 2: goto L_0x0223;
            case 3: goto L_0x0223;
            case 4: goto L_0x0221;
            case 5: goto L_0x0221;
            case 6: goto L_0x0221;
            case 7: goto L_0x021f;
            case 8: goto L_0x021f;
            case 9: goto L_0x021f;
            default: goto L_0x020f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020f, code lost:
        com.google.android.gms.internal.ads.zzdo.zzf("SsaParser", "Unknown alignment: " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021f, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0221, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0223, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
        r7.zzf(r9);
        r0 = r11.zzb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0229, code lost:
        if (r0 == null) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022d, code lost:
        if (r15 == -3.4028235E38f) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0231, code lost:
        if (r8 == -3.4028235E38f) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0233, code lost:
        r7.zzh(r0.x / r8);
        r7.zze(r11.zzb.y / r15, 0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(byte[] r24, int r25, int r26, com.google.android.gms.internal.ads.zzake r27, com.google.android.gms.internal.ads.zzdb r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1 + r26
            com.google.android.gms.internal.ads.zzdy r5 = r0.zzd
            r6 = r24
            r5.zzJ(r6, r4)
            com.google.android.gms.internal.ads.zzdy r4 = r0.zzd
            r4.zzL(r1)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zzd
            java.nio.charset.Charset r1 = r1.zzC()
            if (r1 != 0) goto L_0x0026
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
        L_0x0026:
            boolean r4 = r0.zzb
            if (r4 != 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzdy r4 = r0.zzd
            r0.zze(r4, r1)
        L_0x002f:
            com.google.android.gms.internal.ads.zzdy r4 = r0.zzd
            boolean r5 = r0.zzb
            if (r5 == 0) goto L_0x0038
            com.google.android.gms.internal.ads.zzaku r5 = r0.zzc
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            java.lang.String r7 = r4.zzz(r1)
            r8 = -1
            if (r7 == 0) goto L_0x0286
            java.lang.String r11 = "Format:"
            boolean r11 = r7.startsWith(r11)
            if (r11 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzaku r5 = com.google.android.gms.internal.ads.zzaku.zza(r7)
            goto L_0x0039
        L_0x004d:
            java.lang.String r11 = "Dialogue:"
            boolean r12 = r7.startsWith(r11)
            if (r12 == 0) goto L_0x0276
            java.lang.String r12 = "SsaParser"
            if (r5 != 0) goto L_0x0064
            java.lang.String r8 = "Skipping dialogue line before complete format: "
            java.lang.String r7 = r8.concat(r7)
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r7)
            goto L_0x0276
        L_0x0064:
            boolean r11 = r7.startsWith(r11)
            com.google.android.gms.internal.ads.zzcw.zzd(r11)
            r11 = 9
            java.lang.String r11 = r7.substring(r11)
            java.lang.String r13 = ","
            int r14 = r5.zze
            java.lang.String[] r11 = r11.split(r13, r14)
            int r13 = r11.length
            int r14 = r5.zze
            if (r13 == r14) goto L_0x0089
            java.lang.String r8 = "Skipping dialogue line with fewer columns than format: "
            java.lang.String r7 = r8.concat(r7)
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r7)
            goto L_0x0276
        L_0x0089:
            int r13 = r5.zza
            r13 = r11[r13]
            long r13 = zzd(r13)
            java.lang.String r15 = "Skipping invalid timing: "
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x00a5
            java.lang.String r7 = r15.concat(r7)
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r7)
            goto L_0x0276
        L_0x00a5:
            int r6 = r5.zzb
            r6 = r11[r6]
            long r9 = zzd(r6)
            int r6 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x00ba
            java.lang.String r6 = r15.concat(r7)
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r6)
            goto L_0x0276
        L_0x00ba:
            java.util.Map r6 = r0.zze
            if (r6 == 0) goto L_0x00cf
            int r7 = r5.zzc
            if (r7 == r8) goto L_0x00cf
            r7 = r11[r7]
            java.lang.String r7 = r7.trim()
            java.lang.Object r6 = r6.get(r7)
            com.google.android.gms.internal.ads.zzaky r6 = (com.google.android.gms.internal.ads.zzaky) r6
            goto L_0x00d0
        L_0x00cf:
            r6 = 0
        L_0x00d0:
            int r7 = r5.zzd
            r7 = r11[r7]
            com.google.android.gms.internal.ads.zzakx r11 = com.google.android.gms.internal.ads.zzakx.zza(r7)
            java.lang.String r7 = com.google.android.gms.internal.ads.zzakx.zzb(r7)
            java.lang.String r15 = "\\N"
            java.lang.String r8 = "\n"
            java.lang.String r7 = r7.replace(r15, r8)
            java.lang.String r15 = "\\n"
            java.lang.String r7 = r7.replace(r15, r8)
            java.lang.String r8 = "\\h"
            java.lang.String r15 = " "
            java.lang.String r7 = r7.replace(r8, r15)
            float r8 = r0.zzf
            float r15 = r0.zzg
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r7)
            com.google.android.gms.internal.ads.zzcm r7 = new com.google.android.gms.internal.ads.zzcm
            r7.<init>()
            r7.zzl(r0)
            r16 = r1
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r6 == 0) goto L_0x01b7
            java.lang.Integer r1 = r6.zzc
            r19 = r4
            if (r1 == 0) goto L_0x0128
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            int r1 = r1.intValue()
            r4.<init>(r1)
            int r1 = r0.length()
            r20 = r5
            r21 = r9
            r5 = 33
            r9 = 0
            r0.setSpan(r4, r9, r1, r5)
            goto L_0x012c
        L_0x0128:
            r20 = r5
            r21 = r9
        L_0x012c:
            int r1 = r6.zzj
            r4 = 3
            if (r1 != r4) goto L_0x0148
            java.lang.Integer r1 = r6.zzd
            if (r1 == 0) goto L_0x0148
            android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
            int r1 = r1.intValue()
            r5.<init>(r1)
            int r1 = r0.length()
            r9 = 33
            r10 = 0
            r0.setSpan(r5, r10, r1, r9)
        L_0x0148:
            float r1 = r6.zze
            int r5 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x0157
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x0157
            float r1 = r1 / r15
            r5 = 1
            r7.zzn(r1, r5)
        L_0x0157:
            boolean r1 = r6.zzf
            if (r1 == 0) goto L_0x0180
            boolean r1 = r6.zzg
            if (r1 == 0) goto L_0x016f
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r4)
            int r4 = r0.length()
            r5 = 33
            r9 = 0
            r0.setSpan(r1, r9, r4, r5)
            goto L_0x0195
        L_0x016f:
            r5 = 33
            r9 = 0
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r4 = 1
            r1.<init>(r4)
            int r4 = r0.length()
            r0.setSpan(r1, r9, r4, r5)
            goto L_0x0195
        L_0x0180:
            r5 = 33
            r9 = 0
            boolean r1 = r6.zzg
            if (r1 == 0) goto L_0x0195
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r4 = 2
            r1.<init>(r4)
            int r10 = r0.length()
            r0.setSpan(r1, r9, r10, r5)
            goto L_0x0196
        L_0x0195:
            r4 = 2
        L_0x0196:
            boolean r1 = r6.zzh
            if (r1 == 0) goto L_0x01a6
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            int r10 = r0.length()
            r0.setSpan(r1, r9, r10, r5)
        L_0x01a6:
            boolean r1 = r6.zzi
            if (r1 == 0) goto L_0x01be
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
            int r10 = r0.length()
            r0.setSpan(r1, r9, r10, r5)
            goto L_0x01be
        L_0x01b7:
            r19 = r4
            r20 = r5
            r21 = r9
            r4 = 2
        L_0x01be:
            int r0 = r11.zza
            r1 = -1
            if (r0 == r1) goto L_0x01c4
            goto L_0x01ca
        L_0x01c4:
            if (r6 == 0) goto L_0x01c9
            int r0 = r6.zzb
            goto L_0x01ca
        L_0x01c9:
            r0 = -1
        L_0x01ca:
            java.lang.String r1 = "Unknown alignment: "
            switch(r0) {
                case -1: goto L_0x01e8;
                case 0: goto L_0x01cf;
                case 1: goto L_0x01e5;
                case 2: goto L_0x01e2;
                case 3: goto L_0x01df;
                case 4: goto L_0x01e5;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01df;
                case 7: goto L_0x01e5;
                case 8: goto L_0x01e2;
                case 9: goto L_0x01df;
                default: goto L_0x01cf;
            }
        L_0x01cf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r5)
            goto L_0x01e8
        L_0x01df:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x01e9
        L_0x01e2:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01e9
        L_0x01e5:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x01e9
        L_0x01e8:
            r5 = 0
        L_0x01e9:
            r7.zzm(r5)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case -1: goto L_0x0207;
                case 0: goto L_0x01f1;
                case 1: goto L_0x0205;
                case 2: goto L_0x0203;
                case 3: goto L_0x0201;
                case 4: goto L_0x0205;
                case 5: goto L_0x0203;
                case 6: goto L_0x0201;
                case 7: goto L_0x0205;
                case 8: goto L_0x0203;
                case 9: goto L_0x0201;
                default: goto L_0x01f1;
            }
        L_0x01f1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r5)
            goto L_0x0207
        L_0x0201:
            r5 = 2
            goto L_0x0209
        L_0x0203:
            r5 = 1
            goto L_0x0209
        L_0x0205:
            r5 = 0
            goto L_0x0209
        L_0x0207:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0209:
            r7.zzi(r5)
            switch(r0) {
                case -1: goto L_0x0224;
                case 0: goto L_0x020f;
                case 1: goto L_0x0223;
                case 2: goto L_0x0223;
                case 3: goto L_0x0223;
                case 4: goto L_0x0221;
                case 5: goto L_0x0221;
                case 6: goto L_0x0221;
                case 7: goto L_0x021f;
                case 8: goto L_0x021f;
                case 9: goto L_0x021f;
                default: goto L_0x020f;
            }
        L_0x020f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r0)
            goto L_0x0224
        L_0x021f:
            r9 = 0
            goto L_0x0224
        L_0x0221:
            r9 = 1
            goto L_0x0224
        L_0x0223:
            r9 = 2
        L_0x0224:
            r7.zzf(r9)
            android.graphics.PointF r0 = r11.zzb
            if (r0 == 0) goto L_0x0243
            int r1 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0243
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0243
            float r0 = r0.x
            float r0 = r0 / r8
            r7.zzh(r0)
            android.graphics.PointF r0 = r11.zzb
            float r0 = r0.y
            float r0 = r0 / r15
            r9 = 0
            r7.zze(r0, r9)
            goto L_0x025a
        L_0x0243:
            r9 = 0
            int r0 = r7.zzb()
            float r0 = zzb(r0)
            r7.zzh(r0)
            int r0 = r7.zza()
            float r0 = zzb(r0)
            r7.zze(r0, r9)
        L_0x025a:
            com.google.android.gms.internal.ads.zzco r0 = r7.zzp()
            int r1 = zzc(r13, r3, r2)
            r4 = r21
            int r4 = zzc(r4, r3, r2)
        L_0x0268:
            if (r1 >= r4) goto L_0x027c
            java.lang.Object r5 = r2.get(r1)
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            int r1 = r1 + 1
            goto L_0x0268
        L_0x0276:
            r16 = r1
            r19 = r4
            r20 = r5
        L_0x027c:
            r0 = r23
            r1 = r16
            r4 = r19
            r5 = r20
            goto L_0x0039
        L_0x0286:
            r9 = 0
            r0 = 0
        L_0x0288:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x02e1
            java.lang.Object r1 = r2.get(r0)
            r11 = r1
            java.util.List r11 = (java.util.List) r11
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x02a3
            if (r0 == 0) goto L_0x02a2
            r5 = r28
            r1 = 1
            r4 = -1
            goto L_0x02d9
        L_0x02a2:
            r0 = 0
        L_0x02a3:
            int r1 = r2.size()
            r4 = -1
            int r1 = r1 + r4
            if (r0 == r1) goto L_0x02db
            java.lang.Object r1 = r3.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r12 = r1.longValue()
            int r1 = r0 + 1
            java.lang.Object r1 = r3.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            java.lang.Object r1 = r3.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            long r14 = r5 - r7
            com.google.android.gms.internal.ads.zzajx r1 = new com.google.android.gms.internal.ads.zzajx
            r10 = r1
            r10.<init>(r11, r12, r14)
            r5 = r28
            r5.zza(r1)
            r1 = 1
        L_0x02d9:
            int r0 = r0 + r1
            goto L_0x0288
        L_0x02db:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakv.zza(byte[], int, int, com.google.android.gms.internal.ads.zzake, com.google.android.gms.internal.ads.zzdb):void");
    }

    public zzakv(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzdy();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzB = zzei.zzB((byte[]) list.get(0));
        zzcw.zzd(zzB.startsWith("Format:"));
        zzaku zza2 = zzaku.zza(zzB);
        zza2.getClass();
        zzaku zzaku = zza2;
        this.zzc = zza2;
        zze(new zzdy((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
