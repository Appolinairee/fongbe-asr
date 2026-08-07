package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzalf implements zzakf {
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzald zzh = new zzald(30.0f, 1, 1);
    private final XmlPullParserFactory zzi;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        if (r13.equals("s") != false) goto L_0x0105;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzald r14) throws com.google.android.gms.internal.ads.zzakb {
        /*
            java.util.regex.Pattern r0 = zzc
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.String r13 = r0.group(r8)
            r13.getClass()
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            long r8 = java.lang.Long.parseLong(r13)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            double r7 = (double) r8
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            java.lang.String r13 = r0.group(r6)
            r13.getClass()
            double r9 = (double) r9
            double r7 = r7 + r9
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            long r9 = java.lang.Long.parseLong(r13)
            double r9 = (double) r9
            java.lang.String r13 = r0.group(r5)
            r5 = 0
            if (r13 == 0) goto L_0x0059
            double r11 = java.lang.Double.parseDouble(r13)
            goto L_0x005a
        L_0x0059:
            r11 = r5
        L_0x005a:
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r4)
            if (r13 == 0) goto L_0x006b
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.zza
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x006c
        L_0x006b:
            r9 = r5
        L_0x006c:
            double r7 = r7 + r11
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0082
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.zzb
            double r4 = (double) r13
            float r13 = r14.zza
            double r13 = (double) r13
            double r0 = r0 / r4
            double r5 = r0 / r13
        L_0x0082:
            double r7 = r7 + r9
            double r7 = r7 + r5
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x0088:
            java.util.regex.Pattern r0 = zzd
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x012d
            java.lang.String r13 = r0.group(r8)
            r13.getClass()
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            double r9 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r7)
            r13.getClass()
            r0 = r13
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r13.hashCode()
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x00fa
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto L_0x00f0
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto L_0x00e6
            r1 = 3494(0xda6, float:4.896E-42)
            if (r0 == r1) goto L_0x00dc
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L_0x00d3
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x00c9
            goto L_0x0104
        L_0x00c9:
            java.lang.String r0 = "t"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0104
            r7 = 5
            goto L_0x0105
        L_0x00d3:
            java.lang.String r0 = "s"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0104
            goto L_0x0105
        L_0x00dc:
            java.lang.String r0 = "ms"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0104
            r7 = 3
            goto L_0x0105
        L_0x00e6:
            java.lang.String r0 = "m"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0104
            r7 = 1
            goto L_0x0105
        L_0x00f0:
            java.lang.String r0 = "h"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0104
            r7 = 0
            goto L_0x0105
        L_0x00fa:
            java.lang.String r0 = "f"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0104
            r7 = 4
            goto L_0x0105
        L_0x0104:
            r7 = -1
        L_0x0105:
            if (r7 == 0) goto L_0x0122
            if (r7 == r8) goto L_0x011f
            if (r7 == r6) goto L_0x0118
            if (r7 == r5) goto L_0x0114
            if (r7 == r4) goto L_0x0110
            goto L_0x0129
        L_0x0110:
            int r13 = r14.zzc
            double r13 = (double) r13
            goto L_0x011d
        L_0x0114:
            float r13 = r14.zza
            double r13 = (double) r13
            goto L_0x011d
        L_0x0118:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x011d:
            double r9 = r9 / r13
            goto L_0x0129
        L_0x011f:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0127
        L_0x0122:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0127:
            double r9 = r9 * r13
        L_0x0129:
            double r9 = r9 * r2
            long r13 = (long) r9
            return r13
        L_0x012d:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            com.google.android.gms.internal.ads.zzakb r14 = new com.google.android.gms.internal.ads.zzakb
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = r0.concat(r13)
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalf.zzc(java.lang.String, com.google.android.gms.internal.ads.zzald):long");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Layout.Alignment zzd(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.zzftt.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x0038;
                case 100571: goto L_0x002e;
                case 3317767: goto L_0x0024;
                case 108511772: goto L_0x001a;
                case 109757538: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0042
        L_0x0010:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 0
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 3
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 4
            goto L_0x0043
        L_0x0042:
            r5 = -1
        L_0x0043:
            if (r5 == 0) goto L_0x0055
            if (r5 == r4) goto L_0x0055
            if (r5 == r3) goto L_0x0052
            if (r5 == r2) goto L_0x0052
            if (r5 == r1) goto L_0x004f
            r5 = 0
            return r5
        L_0x004f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L_0x0052:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L_0x0055:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalf.zzd(java.lang.String):android.text.Layout$Alignment");
    }

    private static zzali zze(zzali zzali) {
        return zzali == null ? new zzali() : zzali;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzali zzf(org.xmlpull.v1.XmlPullParser r16, com.google.android.gms.internal.ads.zzali r17) {
        /*
            r1 = r16
            int r2 = r16.getAttributeCount()
            r3 = 0
            r0 = r17
            r4 = 0
        L_0x000a:
            if (r4 >= r2) goto L_0x03f4
            java.lang.String r5 = r1.getAttributeValue(r4)
            java.lang.String r6 = r1.getAttributeName(r4)
            int r7 = r6.hashCode()
            r8 = 5
            r9 = 4
            r10 = -1
            r11 = 3
            r12 = 2
            r13 = 1
            switch(r7) {
                case -1550943582: goto L_0x00bb;
                case -1224696685: goto L_0x00b1;
                case -1065511464: goto L_0x00a7;
                case -879295043: goto L_0x009c;
                case -734428249: goto L_0x0092;
                case 3355: goto L_0x0088;
                case 3511770: goto L_0x007d;
                case 94842723: goto L_0x0073;
                case 109403361: goto L_0x0068;
                case 110138194: goto L_0x005d;
                case 365601008: goto L_0x0052;
                case 921125321: goto L_0x0046;
                case 1115953443: goto L_0x003a;
                case 1287124693: goto L_0x002f;
                case 1754920356: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x00c5
        L_0x0023:
            java.lang.String r7 = "multiRowAlign"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 8
            goto L_0x00c6
        L_0x002f:
            java.lang.String r7 = "backgroundColor"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 1
            goto L_0x00c6
        L_0x003a:
            java.lang.String r7 = "rubyPosition"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 11
            goto L_0x00c6
        L_0x0046:
            java.lang.String r7 = "textEmphasis"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 13
            goto L_0x00c6
        L_0x0052:
            java.lang.String r7 = "fontSize"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 4
            goto L_0x00c6
        L_0x005d:
            java.lang.String r7 = "textCombine"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 9
            goto L_0x00c6
        L_0x0068:
            java.lang.String r7 = "shear"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 14
            goto L_0x00c6
        L_0x0073:
            java.lang.String r7 = "color"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 2
            goto L_0x00c6
        L_0x007d:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 10
            goto L_0x00c6
        L_0x0088:
            java.lang.String r7 = "id"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 0
            goto L_0x00c6
        L_0x0092:
            java.lang.String r7 = "fontWeight"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 5
            goto L_0x00c6
        L_0x009c:
            java.lang.String r7 = "textDecoration"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 12
            goto L_0x00c6
        L_0x00a7:
            java.lang.String r7 = "textAlign"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 7
            goto L_0x00c6
        L_0x00b1:
            java.lang.String r7 = "fontFamily"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 3
            goto L_0x00c6
        L_0x00bb:
            java.lang.String r7 = "fontStyle"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00c5
            r6 = 6
            goto L_0x00c6
        L_0x00c5:
            r6 = -1
        L_0x00c6:
            r7 = 0
            java.lang.String r14 = "TtmlParser"
            switch(r6) {
                case 0: goto L_0x03dc;
                case 1: goto L_0x03c2;
                case 2: goto L_0x03a8;
                case 3: goto L_0x03a0;
                case 4: goto L_0x02b9;
                case 5: goto L_0x02aa;
                case 6: goto L_0x029b;
                case 7: goto L_0x028e;
                case 8: goto L_0x0281;
                case 9: goto L_0x0243;
                case 10: goto L_0x01ca;
                case 11: goto L_0x018c;
                case 12: goto L_0x012b;
                case 13: goto L_0x011e;
                case 14: goto L_0x00ce;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            goto L_0x03ef
        L_0x00ce:
            com.google.android.gms.internal.ads.zzali r6 = zze(r0)
            java.util.regex.Pattern r0 = zza
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r8 = r0.matches()
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r8 != 0) goto L_0x00ef
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Invalid value for shear: "
            java.lang.String r0 = r5.concat(r0)
            com.google.android.gms.internal.ads.zzdo.zzf(r14, r0)
            goto L_0x0118
        L_0x00ef:
            java.lang.String r0 = r0.group(r13)     // Catch:{ NumberFormatException -> 0x010a }
            if (r0 == 0) goto L_0x0109
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x010a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x010a }
            r7 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = java.lang.Math.max(r7, r0)     // Catch:{ NumberFormatException -> 0x010a }
            r7 = 1120403456(0x42c80000, float:100.0)
            float r9 = java.lang.Math.min(r7, r0)     // Catch:{ NumberFormatException -> 0x010a }
            goto L_0x0118
        L_0x0109:
            throw r7     // Catch:{ NumberFormatException -> 0x010a }
        L_0x010a:
            r0 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "Failed to parse shear: "
            java.lang.String r5 = r7.concat(r5)
            com.google.android.gms.internal.ads.zzdo.zzg(r14, r5, r0)
        L_0x0118:
            r6.zzy(r9)
            r0 = r6
            goto L_0x03ef
        L_0x011e:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            com.google.android.gms.internal.ads.zzalb r5 = com.google.android.gms.internal.ads.zzalb.zza(r5)
            r0.zzB(r5)
            goto L_0x03ef
        L_0x012b:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzftt.zza(r5)
            int r6 = r5.hashCode()
            switch(r6) {
                case -1461280213: goto L_0x0155;
                case -1026963764: goto L_0x014b;
                case 913457136: goto L_0x0141;
                case 1679736913: goto L_0x0137;
                default: goto L_0x0136;
            }
        L_0x0136:
            goto L_0x015e
        L_0x0137:
            java.lang.String r6 = "linethrough"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x015e
            r10 = 0
            goto L_0x015e
        L_0x0141:
            java.lang.String r6 = "nolinethrough"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x015e
            r10 = 1
            goto L_0x015e
        L_0x014b:
            java.lang.String r6 = "underline"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x015e
            r10 = 2
            goto L_0x015e
        L_0x0155:
            java.lang.String r6 = "nounderline"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x015e
            r10 = 3
        L_0x015e:
            if (r10 == 0) goto L_0x0183
            if (r10 == r13) goto L_0x017a
            if (r10 == r12) goto L_0x0171
            if (r10 == r11) goto L_0x0168
            goto L_0x03ef
        L_0x0168:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzC(r3)
            goto L_0x03ef
        L_0x0171:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzC(r13)
            goto L_0x03ef
        L_0x017a:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzu(r3)
            goto L_0x03ef
        L_0x0183:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzu(r13)
            goto L_0x03ef
        L_0x018c:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzftt.zza(r5)
            int r6 = r5.hashCode()
            r7 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r6 == r7) goto L_0x01a9
            r7 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r6 == r7) goto L_0x019f
            goto L_0x01b2
        L_0x019f:
            java.lang.String r6 = "after"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01b2
            r10 = 1
            goto L_0x01b2
        L_0x01a9:
            java.lang.String r6 = "before"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01b2
            r10 = 0
        L_0x01b2:
            if (r10 == 0) goto L_0x01c1
            if (r10 == r13) goto L_0x01b8
            goto L_0x03ef
        L_0x01b8:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzw(r12)
            goto L_0x03ef
        L_0x01c1:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzw(r13)
            goto L_0x03ef
        L_0x01ca:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzftt.zza(r5)
            int r6 = r5.hashCode()
            switch(r6) {
                case -618561360: goto L_0x0208;
                case -410956671: goto L_0x01fe;
                case -250518009: goto L_0x01f4;
                case -136074796: goto L_0x01ea;
                case 3016401: goto L_0x01e0;
                case 3556653: goto L_0x01d6;
                default: goto L_0x01d5;
            }
        L_0x01d5:
            goto L_0x0211
        L_0x01d6:
            java.lang.String r6 = "text"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0211
            r10 = 3
            goto L_0x0211
        L_0x01e0:
            java.lang.String r6 = "base"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0211
            r10 = 1
            goto L_0x0211
        L_0x01ea:
            java.lang.String r6 = "textContainer"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0211
            r10 = 4
            goto L_0x0211
        L_0x01f4:
            java.lang.String r6 = "delimiter"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0211
            r10 = 5
            goto L_0x0211
        L_0x01fe:
            java.lang.String r6 = "container"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0211
            r10 = 0
            goto L_0x0211
        L_0x0208:
            java.lang.String r6 = "baseContainer"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0211
            r10 = 2
        L_0x0211:
            if (r10 == 0) goto L_0x023a
            if (r10 == r13) goto L_0x0231
            if (r10 == r12) goto L_0x0231
            if (r10 == r11) goto L_0x0228
            if (r10 == r9) goto L_0x0228
            if (r10 == r8) goto L_0x021f
            goto L_0x03ef
        L_0x021f:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzx(r9)
            goto L_0x03ef
        L_0x0228:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzx(r11)
            goto L_0x03ef
        L_0x0231:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzx(r12)
            goto L_0x03ef
        L_0x023a:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzx(r13)
            goto L_0x03ef
        L_0x0243:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzftt.zza(r5)
            int r6 = r5.hashCode()
            r7 = 96673(0x179a1, float:1.35468E-40)
            if (r6 == r7) goto L_0x0260
            r7 = 3387192(0x33af38, float:4.746467E-39)
            if (r6 == r7) goto L_0x0256
            goto L_0x0269
        L_0x0256:
            java.lang.String r6 = "none"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0269
            r10 = 0
            goto L_0x0269
        L_0x0260:
            java.lang.String r6 = "all"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0269
            r10 = 1
        L_0x0269:
            if (r10 == 0) goto L_0x0278
            if (r10 == r13) goto L_0x026f
            goto L_0x03ef
        L_0x026f:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzA(r13)
            goto L_0x03ef
        L_0x0278:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzA(r3)
            goto L_0x03ef
        L_0x0281:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            android.text.Layout$Alignment r5 = zzd(r5)
            r0.zzv(r5)
            goto L_0x03ef
        L_0x028e:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            android.text.Layout$Alignment r5 = zzd(r5)
            r0.zzz(r5)
            goto L_0x03ef
        L_0x029b:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            java.lang.String r6 = "italic"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.zzt(r5)
            goto L_0x03ef
        L_0x02aa:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            java.lang.String r6 = "bold"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.zzn(r5)
            goto L_0x03ef
        L_0x02b9:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r6 = "\\s+"
            int r8 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ zzakb -> 0x0392 }
            java.lang.String[] r6 = r5.split(r6, r10)     // Catch:{ zzakb -> 0x0392 }
            int r8 = r6.length     // Catch:{ zzakb -> 0x0392 }
            if (r8 != r13) goto L_0x02cf
            java.util.regex.Pattern r6 = zze     // Catch:{ zzakb -> 0x0392 }
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch:{ zzakb -> 0x0392 }
            goto L_0x02de
        L_0x02cf:
            if (r8 != r12) goto L_0x0376
            java.util.regex.Pattern r8 = zze     // Catch:{ zzakb -> 0x0392 }
            r6 = r6[r13]     // Catch:{ zzakb -> 0x0392 }
            java.util.regex.Matcher r6 = r8.matcher(r6)     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r8 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            com.google.android.gms.internal.ads.zzdo.zzf(r14, r8)     // Catch:{ zzakb -> 0x0392 }
        L_0x02de:
            boolean r8 = r6.matches()     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r9 = "'."
            if (r8 == 0) goto L_0x035c
            java.lang.String r8 = r6.group(r11)     // Catch:{ zzakb -> 0x0392 }
            if (r8 == 0) goto L_0x035b
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ zzakb -> 0x0392 }
            int r15 = r8.hashCode()     // Catch:{ zzakb -> 0x0392 }
            r3 = 37
            if (r15 == r3) goto L_0x0314
            r3 = 3240(0xca8, float:4.54E-42)
            if (r15 == r3) goto L_0x030a
            r3 = 3592(0xe08, float:5.033E-42)
            if (r15 == r3) goto L_0x0300
            goto L_0x031d
        L_0x0300:
            java.lang.String r3 = "px"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x031d
            r10 = 0
            goto L_0x031d
        L_0x030a:
            java.lang.String r3 = "em"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x031d
            r10 = 1
            goto L_0x031d
        L_0x0314:
            java.lang.String r3 = "%"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x031d
            r10 = 2
        L_0x031d:
            if (r10 == 0) goto L_0x0345
            if (r10 == r13) goto L_0x0341
            if (r10 != r12) goto L_0x0327
            r0.zzr(r11)     // Catch:{ zzakb -> 0x0392 }
            goto L_0x0348
        L_0x0327:
            com.google.android.gms.internal.ads.zzakb r3 = new com.google.android.gms.internal.ads.zzakb     // Catch:{ zzakb -> 0x0392 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ zzakb -> 0x0392 }
            r6.<init>()     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r7 = "Invalid unit for fontSize: '"
            r6.append(r7)     // Catch:{ zzakb -> 0x0392 }
            r6.append(r8)     // Catch:{ zzakb -> 0x0392 }
            r6.append(r9)     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r6 = r6.toString()     // Catch:{ zzakb -> 0x0392 }
            r3.<init>(r6)     // Catch:{ zzakb -> 0x0392 }
            throw r3     // Catch:{ zzakb -> 0x0392 }
        L_0x0341:
            r0.zzr(r12)     // Catch:{ zzakb -> 0x0392 }
            goto L_0x0348
        L_0x0345:
            r0.zzr(r13)     // Catch:{ zzakb -> 0x0392 }
        L_0x0348:
            java.lang.String r3 = r6.group(r13)     // Catch:{ zzakb -> 0x0392 }
            if (r3 == 0) goto L_0x035a
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ zzakb -> 0x0392 }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ zzakb -> 0x0392 }
            r0.zzq(r3)     // Catch:{ zzakb -> 0x0392 }
            goto L_0x03ef
        L_0x035a:
            throw r7     // Catch:{ zzakb -> 0x0392 }
        L_0x035b:
            throw r7     // Catch:{ zzakb -> 0x0392 }
        L_0x035c:
            com.google.android.gms.internal.ads.zzakb r3 = new com.google.android.gms.internal.ads.zzakb     // Catch:{ zzakb -> 0x0392 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ zzakb -> 0x0392 }
            r6.<init>()     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r7 = "Invalid expression for fontSize: '"
            r6.append(r7)     // Catch:{ zzakb -> 0x0392 }
            r6.append(r5)     // Catch:{ zzakb -> 0x0392 }
            r6.append(r9)     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r6 = r6.toString()     // Catch:{ zzakb -> 0x0392 }
            r3.<init>(r6)     // Catch:{ zzakb -> 0x0392 }
            throw r3     // Catch:{ zzakb -> 0x0392 }
        L_0x0376:
            com.google.android.gms.internal.ads.zzakb r3 = new com.google.android.gms.internal.ads.zzakb     // Catch:{ zzakb -> 0x0392 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ zzakb -> 0x0392 }
            r6.<init>()     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r7 = "Invalid number of entries for fontSize: "
            r6.append(r7)     // Catch:{ zzakb -> 0x0392 }
            r6.append(r8)     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r7 = "."
            r6.append(r7)     // Catch:{ zzakb -> 0x0392 }
            java.lang.String r6 = r6.toString()     // Catch:{ zzakb -> 0x0392 }
            r3.<init>(r6)     // Catch:{ zzakb -> 0x0392 }
            throw r3     // Catch:{ zzakb -> 0x0392 }
        L_0x0392:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Failed parsing fontSize value: "
            java.lang.String r3 = r5.concat(r3)
            com.google.android.gms.internal.ads.zzdo.zzf(r14, r3)
            goto L_0x03ef
        L_0x03a0:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzp(r5)
            goto L_0x03ef
        L_0x03a8:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            int r3 = com.google.android.gms.internal.ads.zzcz.zzb(r5)     // Catch:{ IllegalArgumentException -> 0x03b4 }
            r0.zzo(r3)     // Catch:{ IllegalArgumentException -> 0x03b4 }
            goto L_0x03ef
        L_0x03b4:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Failed parsing color value: "
            java.lang.String r3 = r5.concat(r3)
            com.google.android.gms.internal.ads.zzdo.zzf(r14, r3)
            goto L_0x03ef
        L_0x03c2:
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            int r3 = com.google.android.gms.internal.ads.zzcz.zzb(r5)     // Catch:{ IllegalArgumentException -> 0x03ce }
            r0.zzm(r3)     // Catch:{ IllegalArgumentException -> 0x03ce }
            goto L_0x03ef
        L_0x03ce:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Failed parsing background value: "
            java.lang.String r3 = r5.concat(r3)
            com.google.android.gms.internal.ads.zzdo.zzf(r14, r3)
            goto L_0x03ef
        L_0x03dc:
            java.lang.String r3 = r16.getName()
            java.lang.String r6 = "style"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x03ef
            com.google.android.gms.internal.ads.zzali r0 = zze(r0)
            r0.zzs(r5)
        L_0x03ef:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x000a
        L_0x03f4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalf.zzf(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzali):com.google.android.gms.internal.ads.zzali");
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i = zzei.zza;
        return trim.split("\\s+", -1);
    }

    public final void zza(byte[] bArr, int i, int i2, zzake zzake, zzdb zzdb) {
        zzajz.zza(zzb(bArr, i, i2), zzake, zzdb);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f5 A[SYNTHETIC, Splitter:B:100:0x01f5] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0287 A[Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }, LOOP:1: B:133:0x0287->B:308:0x0521, LOOP_START, PHI: r2 r5 r11 
      PHI: (r2v26 java.lang.String) = (r2v10 java.lang.String), (r2v28 java.lang.String) binds: [B:132:0x0285, B:308:0x0521] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v31 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v32 java.util.HashMap) binds: [B:132:0x0285, B:308:0x0521] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v34 com.google.android.gms.internal.ads.zzald) = (r11v5 com.google.android.gms.internal.ads.zzald), (r11v35 com.google.android.gms.internal.ads.zzald) binds: [B:132:0x0285, B:308:0x0521] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0473 A[Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0510 A[Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0521 A[LOOP:1: B:133:0x0287->B:308:0x0521, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x051d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0192 A[Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaka zzb(byte[] r42, int r43, int r44) {
        /*
            r41 = this;
            java.lang.String r1 = ""
            java.lang.String r2 = "http://www.w3.org/ns/ttml#parameter"
            r3 = r41
            org.xmlpull.v1.XmlPullParserFactory r4 = r3.zzi     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            org.xmlpull.v1.XmlPullParser r4 = r4.newPullParser()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzalg r15 = new com.google.android.gms.internal.ads.zzalg     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.String r9 = ""
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r15
            r10 = r17
            r11 = r17
            r12 = r18
            r13 = r18
            r14 = r17
            r19 = r15
            r15 = r17
            r16 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r8 = r19
            r6.put(r1, r8)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r9 = r42
            r10 = r43
            r11 = r44
            r8.<init>(r9, r10, r11)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r9 = 0
            r4.setInput(r8, r9)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.util.ArrayDeque r8 = new java.util.ArrayDeque     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r10 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzald r11 = zzh     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r14 = r9
            r16 = r14
            r15 = 0
            r17 = 15
        L_0x005d:
            r12 = 1
            if (r10 == r12) goto L_0x06f3
            java.lang.Object r18 = r8.peek()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r9 = r18
            com.google.android.gms.internal.ads.zzalc r9 = (com.google.android.gms.internal.ads.zzalc) r9     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r12 = 2
            if (r15 != 0) goto L_0x06c5
            java.lang.String r13 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r20 = r1
            java.lang.String r1 = "tt"
            if (r10 != r12) goto L_0x0679
            boolean r10 = r1.equals(r13)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r21 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r12 = "TtmlParser"
            if (r10 == 0) goto L_0x01db
            java.lang.String r10 = "frameRate"
            java.lang.String r10 = r4.getAttributeValue(r2, r10)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r10 == 0) goto L_0x008c
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x008e
        L_0x008c:
            r10 = 30
        L_0x008e:
            java.lang.String r11 = "frameRateMultiplier"
            java.lang.String r11 = r4.getAttributeValue(r2, r11)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.String r3 = " "
            if (r11 == 0) goto L_0x00c2
            int r16 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r23 = r14
            r14 = -1
            java.lang.String[] r11 = r11.split(r3, r14)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r14 = r11.length     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r24 = r15
            r15 = 2
            if (r14 != r15) goto L_0x00a9
            r14 = 1
            goto L_0x00aa
        L_0x00a9:
            r14 = 0
        L_0x00aa:
            java.lang.String r15 = "frameRateMultiplier doesn't have 2 parts"
            com.google.android.gms.internal.ads.zzcw.zze(r14, r15)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r14 = 0
            r15 = r11[r14]     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r15 = java.lang.Integer.parseInt(r15)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            float r15 = (float) r15     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r16 = 1
            r11 = r11[r16]     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            float r11 = (float) r11     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            float r15 = r15 / r11
            goto L_0x00c9
        L_0x00c2:
            r23 = r14
            r24 = r15
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x00c9:
            com.google.android.gms.internal.ads.zzald r11 = zzh     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r14 = r11.zzb     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r16 = r14
            java.lang.String r14 = "subFrameRate"
            java.lang.String r14 = r4.getAttributeValue(r2, r14)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r14 == 0) goto L_0x00dc
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x00de
        L_0x00dc:
            r14 = r16
        L_0x00de:
            int r11 = r11.zzc     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r16 = r11
            java.lang.String r11 = "tickRate"
            java.lang.String r11 = r4.getAttributeValue(r2, r11)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r11 == 0) goto L_0x00f1
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r25 = r8
            goto L_0x00f5
        L_0x00f1:
            r25 = r8
            r11 = r16
        L_0x00f5:
            com.google.android.gms.internal.ads.zzald r8 = new com.google.android.gms.internal.ads.zzald     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            float r10 = (float) r10     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            float r10 = r10 * r15
            r8.<init>(r10, r14, r11)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.String r10 = "cellResolution"
            java.lang.String r10 = r4.getAttributeValue(r2, r10)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r10 != 0) goto L_0x010d
        L_0x0105:
            r26 = r2
            r16 = r8
        L_0x0109:
            r15 = 15
            goto L_0x0188
        L_0x010d:
            java.util.regex.Pattern r11 = zzg     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.util.regex.Matcher r11 = r11.matcher(r10)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            boolean r14 = r11.matches()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r14 != 0) goto L_0x0123
            java.lang.String r3 = "Ignoring malformed cell resolution: "
            java.lang.String r3 = r3.concat(r10)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r3)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0105
        L_0x0123:
            r14 = 1
            java.lang.String r15 = r11.group(r14)     // Catch:{ NumberFormatException -> 0x017a }
            if (r15 == 0) goto L_0x0174
            r14 = r15
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ NumberFormatException -> 0x017a }
            int r14 = java.lang.Integer.parseInt(r15)     // Catch:{ NumberFormatException -> 0x017a }
            r15 = 2
            java.lang.String r11 = r11.group(r15)     // Catch:{ NumberFormatException -> 0x017a }
            if (r11 == 0) goto L_0x016e
            r15 = r11
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ NumberFormatException -> 0x017a }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x017a }
            if (r14 == 0) goto L_0x014d
            if (r11 == 0) goto L_0x0148
            r26 = r2
            r15 = r11
            r11 = 1
            goto L_0x0151
        L_0x0148:
            r26 = r2
            r11 = 0
            r15 = 0
            goto L_0x0151
        L_0x014d:
            r26 = r2
            r15 = r11
            r11 = 0
        L_0x0151:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x017c }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x017c }
            r16 = r8
            java.lang.String r8 = "Invalid cell resolution "
            r2.append(r8)     // Catch:{ NumberFormatException -> 0x017e }
            r2.append(r14)     // Catch:{ NumberFormatException -> 0x017e }
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x017e }
            r2.append(r15)     // Catch:{ NumberFormatException -> 0x017e }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x017e }
            com.google.android.gms.internal.ads.zzcw.zze(r11, r2)     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x0188
        L_0x016e:
            r26 = r2
            r16 = r8
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x017e }
        L_0x0174:
            r26 = r2
            r16 = r8
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x017e }
        L_0x017a:
            r26 = r2
        L_0x017c:
            r16 = r8
        L_0x017e:
            java.lang.String r2 = "Ignoring malformed cell resolution: "
            java.lang.String r2 = r2.concat(r10)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0109
        L_0x0188:
            java.lang.String r2 = "extent"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzej.zza(r4, r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r2 != 0) goto L_0x0192
        L_0x0190:
            r10 = 0
            goto L_0x01d8
        L_0x0192:
            java.util.regex.Pattern r3 = zzf     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            boolean r8 = r3.matches()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r8 != 0) goto L_0x01a8
            java.lang.String r3 = "Ignoring non-pixel tts extent: "
            java.lang.String r2 = r3.concat(r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0190
        L_0x01a8:
            r8 = 1
            java.lang.String r10 = r3.group(r8)     // Catch:{ NumberFormatException -> 0x01ce }
            if (r10 == 0) goto L_0x01cc
            r8 = r10
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01ce }
            int r8 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x01ce }
            r10 = 2
            java.lang.String r3 = r3.group(r10)     // Catch:{ NumberFormatException -> 0x01ce }
            if (r3 == 0) goto L_0x01ca
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x01ce }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01ce }
            com.google.android.gms.internal.ads.zzale r10 = new com.google.android.gms.internal.ads.zzale     // Catch:{ NumberFormatException -> 0x01ce }
            r10.<init>(r8, r3)     // Catch:{ NumberFormatException -> 0x01ce }
            goto L_0x01d8
        L_0x01ca:
            r3 = 0
            throw r3     // Catch:{ NumberFormatException -> 0x01ce }
        L_0x01cc:
            r3 = 0
            throw r3     // Catch:{ NumberFormatException -> 0x01ce }
        L_0x01ce:
            java.lang.String r3 = "Ignoring malformed tts extent: "
            java.lang.String r2 = r3.concat(r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0190
        L_0x01d8:
            r11 = r16
            goto L_0x01e7
        L_0x01db:
            r26 = r2
            r25 = r8
            r23 = r14
            r24 = r15
            r10 = r16
            r15 = r17
        L_0x01e7:
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.String r2 = "metadata"
            java.lang.String r3 = "region"
            java.lang.String r8 = "head"
            java.lang.String r14 = "style"
            if (r1 != 0) goto L_0x0281
            boolean r1 = r13.equals(r8)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "body"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "div"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "p"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "span"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "br"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            boolean r1 = r13.equals(r14)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "styling"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "layout"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            boolean r1 = r13.equals(r3)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            boolean r1 = r13.equals(r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "image"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "data"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 != 0) goto L_0x0281
            java.lang.String r1 = "information"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x025e
            goto L_0x0281
        L_0x025e:
            java.lang.String r1 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.String r3 = "Ignoring unsupported tag: "
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.String r1 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zze(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r3 = r5
            r16 = r10
            r17 = r15
            r14 = r23
            r2 = r25
            goto L_0x0676
        L_0x0281:
            boolean r1 = r8.equals(r13)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x0527
        L_0x0287:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            boolean r1 = com.google.android.gms.internal.ads.zzej.zzc(r4, r14)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x02c7
            java.lang.String r1 = com.google.android.gms.internal.ads.zzej.zza(r4, r14)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzali r9 = new com.google.android.gms.internal.ads.zzali     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzali r9 = zzf(r4, r9)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x02bb
            java.lang.String[] r1 = zzg(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r13 = r1.length     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r16 = r11
            r11 = 0
        L_0x02a7:
            if (r11 >= r13) goto L_0x02bd
            r17 = r13
            r13 = r1[r11]     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.Object r13 = r5.get(r13)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzali r13 = (com.google.android.gms.internal.ads.zzali) r13     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r9.zzl(r13)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r11 = r11 + 1
            r13 = r17
            goto L_0x02a7
        L_0x02bb:
            r16 = r11
        L_0x02bd:
            java.lang.String r1 = r9.zzE()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x02f5
            r5.put(r1, r9)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x02f5
        L_0x02c7:
            r16 = r11
            boolean r1 = com.google.android.gms.internal.ads.zzej.zzc(r4, r3)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.String r9 = "id"
            if (r1 != 0) goto L_0x02fb
            boolean r1 = com.google.android.gms.internal.ads.zzej.zzc(r4, r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x02f5
        L_0x02d7:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.String r1 = "image"
            boolean r1 = com.google.android.gms.internal.ads.zzej.zzc(r4, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x02ef
            java.lang.String r1 = com.google.android.gms.internal.ads.zzej.zza(r4, r9)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x02ef
            java.lang.String r11 = r4.nextText()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r7.put(r1, r11)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
        L_0x02ef:
            boolean r1 = com.google.android.gms.internal.ads.zzej.zzb(r4, r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x02d7
        L_0x02f5:
            r17 = r2
            r38 = r5
            goto L_0x0515
        L_0x02fb:
            java.lang.String r28 = com.google.android.gms.internal.ads.zzej.zza(r4, r9)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r28 != 0) goto L_0x0308
            r17 = r2
            r38 = r5
        L_0x0305:
            r1 = 0
            goto L_0x050e
        L_0x0308:
            java.lang.String r1 = "origin"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzej.zza(r4, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x0503
            java.util.regex.Pattern r9 = zzb     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.util.regex.Matcher r11 = r9.matcher(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.util.regex.Pattern r13 = zzf     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r17 = r2
            java.util.regex.Matcher r2 = r13.matcher(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            boolean r18 = r11.matches()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r22 = 1120403456(0x42c80000, float:100.0)
            if (r18 == 0) goto L_0x0359
            r38 = r5
            r5 = 1
            java.lang.String r2 = r11.group(r5)     // Catch:{ NumberFormatException -> 0x034f }
            if (r2 == 0) goto L_0x034d
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x034f }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x034f }
            float r2 = r2 / r22
            r5 = 2
            java.lang.String r11 = r11.group(r5)     // Catch:{ NumberFormatException -> 0x034f }
            if (r11 == 0) goto L_0x034b
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x034f }
            float r5 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x034f }
            float r5 = r5 / r22
            r29 = r2
            goto L_0x0396
        L_0x034b:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x034f }
        L_0x034d:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x034f }
        L_0x034f:
            java.lang.String r2 = "Ignoring region with malformed origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x0359:
            r38 = r5
            boolean r5 = r2.matches()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r5 == 0) goto L_0x04f8
            if (r10 != 0) goto L_0x036d
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x036d:
            r5 = 1
            java.lang.String r11 = r2.group(r5)     // Catch:{ NumberFormatException -> 0x04ed }
            if (r11 == 0) goto L_0x04eb
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x04ed }
            int r5 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x04ed }
            r11 = 2
            java.lang.String r2 = r2.group(r11)     // Catch:{ NumberFormatException -> 0x04ed }
            if (r2 == 0) goto L_0x04e9
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x04ed }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x04ed }
            float r5 = (float) r5     // Catch:{ NumberFormatException -> 0x04ed }
            int r11 = r10.zza     // Catch:{ NumberFormatException -> 0x04ed }
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x04ed }
            float r5 = r5 / r11
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x04ed }
            int r11 = r10.zzb     // Catch:{ NumberFormatException -> 0x04ed }
            float r11 = (float) r11
            float r2 = r2 / r11
            r29 = r5
            r5 = r2
        L_0x0396:
            java.lang.String r2 = "extent"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzej.zza(r4, r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r2 == 0) goto L_0x04e2
            java.util.regex.Matcher r9 = r9.matcher(r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.util.regex.Matcher r2 = r13.matcher(r2)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            boolean r11 = r9.matches()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r11 == 0) goto L_0x03e0
            r11 = 1
            java.lang.String r2 = r9.group(r11)     // Catch:{ NumberFormatException -> 0x03d5 }
            if (r2 == 0) goto L_0x03d3
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x03d5 }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x03d5 }
            float r2 = r2 / r22
            r11 = 2
            java.lang.String r9 = r9.group(r11)     // Catch:{ NumberFormatException -> 0x03d5 }
            if (r9 == 0) goto L_0x03d1
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x03d5 }
            float r1 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x03d5 }
            float r1 = r1 / r22
            r34 = r1
            r33 = r2
            goto L_0x041d
        L_0x03d1:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x03d5 }
        L_0x03d3:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x03d5 }
        L_0x03d5:
            java.lang.String r2 = "Ignoring region with malformed extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x03e0:
            boolean r9 = r2.matches()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r9 == 0) goto L_0x04d7
            if (r10 != 0) goto L_0x03f3
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x03f3:
            r9 = 1
            java.lang.String r11 = r2.group(r9)     // Catch:{ NumberFormatException -> 0x04cc }
            if (r11 == 0) goto L_0x04ca
            r9 = r11
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x04cc }
            int r9 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x04cc }
            r11 = 2
            java.lang.String r2 = r2.group(r11)     // Catch:{ NumberFormatException -> 0x04cc }
            if (r2 == 0) goto L_0x04c8
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x04cc }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x04cc }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x04cc }
            int r11 = r10.zza     // Catch:{ NumberFormatException -> 0x04cc }
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x04cc }
            float r9 = r9 / r11
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x04cc }
            int r1 = r10.zzb     // Catch:{ NumberFormatException -> 0x04cc }
            float r1 = (float) r1
            float r2 = r2 / r1
            r34 = r2
            r33 = r9
        L_0x041d:
            java.lang.String r1 = "displayAlign"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzej.zza(r4, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x0464
            java.lang.String r1 = com.google.android.gms.internal.ads.zzftt.zza(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r2 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r9 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r2 == r9) goto L_0x0442
            r9 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r9) goto L_0x0438
            goto L_0x044c
        L_0x0438:
            java.lang.String r2 = "after"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x044c
            r1 = 1
            goto L_0x044d
        L_0x0442:
            java.lang.String r2 = "center"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x044c
            r1 = 0
            goto L_0x044d
        L_0x044c:
            r1 = -1
        L_0x044d:
            if (r1 == 0) goto L_0x045a
            r2 = 1
            if (r1 == r2) goto L_0x0453
            goto L_0x0464
        L_0x0453:
            float r5 = r5 + r34
            r30 = r5
            r32 = 2
            goto L_0x0468
        L_0x045a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r34 / r1
            float r5 = r5 + r1
            r30 = r5
            r32 = 1
            goto L_0x0468
        L_0x0464:
            r30 = r5
            r32 = 0
        L_0x0468:
            float r1 = (float) r15
            float r36 = r21 / r1
            java.lang.String r1 = "writingMode"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzej.zza(r4, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x04b8
            java.lang.String r1 = com.google.android.gms.internal.ads.zzftt.zza(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r2 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r5 = 3694(0xe6e, float:5.176E-42)
            if (r2 == r5) goto L_0x049e
            r5 = 3553396(0x363874, float:4.979368E-39)
            if (r2 == r5) goto L_0x0494
            r5 = 3553576(0x363928, float:4.97962E-39)
            if (r2 == r5) goto L_0x048a
            goto L_0x04a8
        L_0x048a:
            java.lang.String r2 = "tbrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04a8
            r1 = 2
            goto L_0x04a9
        L_0x0494:
            java.lang.String r2 = "tblr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04a8
            r1 = 1
            goto L_0x04a9
        L_0x049e:
            java.lang.String r2 = "tb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04a8
            r1 = 0
            goto L_0x04a9
        L_0x04a8:
            r1 = -1
        L_0x04a9:
            if (r1 == 0) goto L_0x04b5
            r2 = 1
            if (r1 == r2) goto L_0x04b5
            r2 = 2
            if (r1 == r2) goto L_0x04b2
            goto L_0x04b8
        L_0x04b2:
            r37 = 1
            goto L_0x04bc
        L_0x04b5:
            r37 = 2
            goto L_0x04bc
        L_0x04b8:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r37 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x04bc:
            com.google.android.gms.internal.ads.zzalg r1 = new com.google.android.gms.internal.ads.zzalg     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r31 = 0
            r35 = 1
            r27 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x050e
        L_0x04c8:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x04cc }
        L_0x04ca:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x04cc }
        L_0x04cc:
            java.lang.String r2 = "Ignoring region with malformed extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x04d7:
            java.lang.String r2 = "Ignoring region with unsupported extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x04e2:
            java.lang.String r1 = "Ignoring region without an extent"
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x04e9:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x04ed }
        L_0x04eb:
            r2 = 0
            throw r2     // Catch:{ NumberFormatException -> 0x04ed }
        L_0x04ed:
            java.lang.String r2 = "Ignoring region with malformed origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x04f8:
            java.lang.String r2 = "Ignoring region with unsupported origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x0503:
            r17 = r2
            r38 = r5
            java.lang.String r1 = "Ignoring region without an origin"
            com.google.android.gms.internal.ads.zzdo.zzf(r12, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x0305
        L_0x050e:
            if (r1 == 0) goto L_0x0515
            java.lang.String r2 = r1.zza     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r6.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
        L_0x0515:
            boolean r1 = com.google.android.gms.internal.ads.zzej.zzb(r4, r8)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r11 = r16
            if (r1 == 0) goto L_0x0521
            r2 = r25
            goto L_0x0650
        L_0x0521:
            r2 = r17
            r5 = r38
            goto L_0x0287
        L_0x0527:
            r38 = r5
            r16 = r11
            int r1 = r4.getAttributeCount()     // Catch:{ zzakb -> 0x0662 }
            r2 = 0
            com.google.android.gms.internal.ads.zzali r32 = zzf(r4, r2)     // Catch:{ zzakb -> 0x0662 }
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r34 = r20
            r29 = r27
            r36 = r29
            r39 = r36
            r2 = 0
            r33 = 0
            r35 = 0
        L_0x0546:
            if (r2 >= r1) goto L_0x05f9
            java.lang.String r5 = r4.getAttributeName(r2)     // Catch:{ zzakb -> 0x05f0 }
            java.lang.String r8 = r4.getAttributeValue(r2)     // Catch:{ zzakb -> 0x05f0 }
            int r11 = r5.hashCode()     // Catch:{ zzakb -> 0x05f0 }
            r13 = 5
            switch(r11) {
                case -934795532: goto L_0x0589;
                case 99841: goto L_0x057f;
                case 100571: goto L_0x0575;
                case 93616297: goto L_0x056b;
                case 109780401: goto L_0x0563;
                case 1292595405: goto L_0x0559;
                default: goto L_0x0558;
            }
        L_0x0558:
            goto L_0x0591
        L_0x0559:
            java.lang.String r11 = "backgroundImage"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x0591
            r5 = 5
            goto L_0x0592
        L_0x0563:
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto L_0x0591
            r5 = 3
            goto L_0x0592
        L_0x056b:
            java.lang.String r11 = "begin"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x0591
            r5 = 0
            goto L_0x0592
        L_0x0575:
            java.lang.String r11 = "end"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x0591
            r5 = 1
            goto L_0x0592
        L_0x057f:
            java.lang.String r11 = "dur"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x0591
            r5 = 2
            goto L_0x0592
        L_0x0589:
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0591
            r5 = 4
            goto L_0x0592
        L_0x0591:
            r5 = -1
        L_0x0592:
            if (r5 == 0) goto L_0x05e3
            r11 = 1
            if (r5 == r11) goto L_0x05db
            r11 = 2
            if (r5 == r11) goto L_0x05d3
            r11 = 3
            if (r5 == r11) goto L_0x05c1
            r11 = 4
            if (r5 == r11) goto L_0x05b7
            if (r5 == r13) goto L_0x05a4
        L_0x05a2:
            r5 = 1
            goto L_0x05cb
        L_0x05a4:
            java.lang.String r5 = "#"
            boolean r5 = r8.startsWith(r5)     // Catch:{ zzakb -> 0x05b4 }
            if (r5 == 0) goto L_0x05a2
            r5 = 1
            java.lang.String r8 = r8.substring(r5)     // Catch:{ zzakb -> 0x05ce }
            r35 = r8
            goto L_0x05cb
        L_0x05b4:
            r0 = move-exception
            r5 = 1
            goto L_0x05cf
        L_0x05b7:
            r5 = 1
            boolean r11 = r6.containsKey(r8)     // Catch:{ zzakb -> 0x05ce }
            if (r11 == 0) goto L_0x05cb
            r34 = r8
            goto L_0x05cb
        L_0x05c1:
            r5 = 1
            java.lang.String[] r8 = zzg(r8)     // Catch:{ zzakb -> 0x05ce }
            int r11 = r8.length     // Catch:{ zzakb -> 0x05ce }
            if (r11 <= 0) goto L_0x05cb
            r33 = r8
        L_0x05cb:
            r11 = r16
            goto L_0x05ea
        L_0x05ce:
            r0 = move-exception
        L_0x05cf:
            r1 = r0
            r11 = r16
            goto L_0x05f5
        L_0x05d3:
            r11 = r16
            r5 = 1
            long r39 = zzc(r8, r11)     // Catch:{ zzakb -> 0x061a }
            goto L_0x05ea
        L_0x05db:
            r11 = r16
            r5 = 1
            long r29 = zzc(r8, r11)     // Catch:{ zzakb -> 0x061a }
            goto L_0x05ea
        L_0x05e3:
            r11 = r16
            r5 = 1
            long r36 = zzc(r8, r11)     // Catch:{ zzakb -> 0x061a }
        L_0x05ea:
            int r2 = r2 + 1
            r16 = r11
            goto L_0x0546
        L_0x05f0:
            r0 = move-exception
            r11 = r16
            r5 = 1
        L_0x05f4:
            r1 = r0
        L_0x05f5:
            r2 = r25
            goto L_0x0669
        L_0x05f9:
            r11 = r16
            r5 = 1
            if (r9 == 0) goto L_0x061c
            long r1 = r9.zzd     // Catch:{ zzakb -> 0x061a }
            int r3 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r3 == 0) goto L_0x0618
            int r3 = (r36 > r27 ? 1 : (r36 == r27 ? 0 : -1))
            if (r3 == 0) goto L_0x060b
            long r36 = r36 + r1
            goto L_0x060d
        L_0x060b:
            r36 = r27
        L_0x060d:
            int r3 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r3 == 0) goto L_0x0614
            long r29 = r29 + r1
            goto L_0x0618
        L_0x0614:
            r1 = r9
            r29 = r27
            goto L_0x061d
        L_0x0618:
            r1 = r9
            goto L_0x061d
        L_0x061a:
            r0 = move-exception
            goto L_0x05f4
        L_0x061c:
            r1 = 0
        L_0x061d:
            int r2 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r2 != 0) goto L_0x0638
            int r2 = (r39 > r27 ? 1 : (r39 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x062a
            long r39 = r36 + r39
            r30 = r39
            goto L_0x063a
        L_0x062a:
            if (r1 == 0) goto L_0x0635
            long r2 = r1.zze     // Catch:{ zzakb -> 0x061a }
            int r8 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r8 == 0) goto L_0x0635
            r30 = r2
            goto L_0x063a
        L_0x0635:
            r30 = r27
            goto L_0x063a
        L_0x0638:
            r30 = r29
        L_0x063a:
            java.lang.String r27 = r4.getName()     // Catch:{ zzakb -> 0x065e }
            r28 = r36
            r36 = r1
            com.google.android.gms.internal.ads.zzalc r1 = com.google.android.gms.internal.ads.zzalc.zzb(r27, r28, r30, r32, r33, r34, r35, r36)     // Catch:{ zzakb -> 0x065e }
            r2 = r25
            r2.push(r1)     // Catch:{ zzakb -> 0x065c }
            if (r9 == 0) goto L_0x0650
            r9.zzf(r1)     // Catch:{ zzakb -> 0x065c }
        L_0x0650:
            r16 = r10
            r17 = r15
            r14 = r23
            r15 = r24
            r3 = r38
            goto L_0x06e1
        L_0x065c:
            r0 = move-exception
            goto L_0x0668
        L_0x065e:
            r0 = move-exception
            r2 = r25
            goto L_0x0668
        L_0x0662:
            r0 = move-exception
            r11 = r16
            r2 = r25
            r5 = 1
        L_0x0668:
            r1 = r0
        L_0x0669:
            java.lang.String r3 = "Suppressing parser error"
            com.google.android.gms.internal.ads.zzdo.zzg(r12, r3, r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r16 = r10
            r17 = r15
            r14 = r23
            r3 = r38
        L_0x0676:
            r15 = 1
            goto L_0x06e1
        L_0x0679:
            r26 = r2
            r38 = r5
            r2 = r8
            r23 = r14
            r24 = r15
            r3 = 4
            if (r10 != r3) goto L_0x0698
            if (r9 == 0) goto L_0x0696
            r1 = r9
            com.google.android.gms.internal.ads.zzalc r1 = (com.google.android.gms.internal.ads.zzalc) r1     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.String r1 = r4.getText()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzalc r1 = com.google.android.gms.internal.ads.zzalc.zzc(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r9.zzf(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x06c2
        L_0x0696:
            r1 = 0
            throw r1     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
        L_0x0698:
            r3 = 3
            if (r10 != r3) goto L_0x06c2
            java.lang.String r3 = r4.getName()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            boolean r1 = r3.equals(r1)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x06ba
            com.google.android.gms.internal.ads.zzalj r14 = new com.google.android.gms.internal.ads.zzalj     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            java.lang.Object r1 = r2.peek()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            com.google.android.gms.internal.ads.zzalc r1 = (com.google.android.gms.internal.ads.zzalc) r1     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            if (r1 == 0) goto L_0x06b8
            r3 = r1
            com.google.android.gms.internal.ads.zzalc r3 = (com.google.android.gms.internal.ads.zzalc) r3     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r3 = r38
            r14.<init>(r1, r3, r6, r7)     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x06be
        L_0x06b8:
            r1 = 0
            throw r1     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
        L_0x06ba:
            r3 = r38
            r14 = r23
        L_0x06be:
            r2.pop()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            goto L_0x06df
        L_0x06c2:
            r3 = r38
            goto L_0x06dd
        L_0x06c5:
            r20 = r1
            r26 = r2
            r3 = r5
            r2 = r8
            r23 = r14
            r24 = r15
            r1 = 2
            if (r10 != r1) goto L_0x06d7
            int r15 = r24 + 1
        L_0x06d4:
            r14 = r23
            goto L_0x06e1
        L_0x06d7:
            r1 = 3
            if (r10 != r1) goto L_0x06dd
            int r15 = r24 + -1
            goto L_0x06d4
        L_0x06dd:
            r14 = r23
        L_0x06df:
            r15 = r24
        L_0x06e1:
            r4.next()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            int r10 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            r8 = r2
            r5 = r3
            r1 = r20
            r2 = r26
            r9 = 0
            r3 = r41
            goto L_0x005d
        L_0x06f3:
            r23 = r14
            if (r23 == 0) goto L_0x06fc
            r14 = r23
            com.google.android.gms.internal.ads.zzaka r14 = (com.google.android.gms.internal.ads.zzaka) r14     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
            return r14
        L_0x06fc:
            r1 = 0
            throw r1     // Catch:{ XmlPullParserException -> 0x0708, IOException -> 0x06fe }
        L_0x06fe:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unexpected error when reading input."
            r2.<init>(r3, r1)
            throw r2
        L_0x0708:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unable to decode source"
            r2.<init>(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalf.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzaka");
    }

    public zzalf() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
