package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzgag {
    static {
        Math.log(2.0d);
    }

    public static int zza(double d, RoundingMode roundingMode) {
        boolean z;
        boolean z2 = false;
        zzfun.zzf(d > 0.0d && zzgah.zzb(d), "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return zza(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (zzgaf.zza[roundingMode.ordinal()]) {
            case 1:
                zzgam.zzb(zzd(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z2 = !zzd(d);
                break;
            case 4:
                if (exponent < 0) {
                    z2 = true;
                }
                z = zzd(d);
                break;
            case 5:
                if (exponent >= 0) {
                    z2 = true;
                }
                z = zzd(d);
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    z2 = true;
                    break;
                }
                break;
            default:
                throw new AssertionError();
        }
        z2 &= !z;
        return z2 ? exponent + 1 : exponent;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        r4 = (double) (r2 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if ((-9.223372036854776E18d - r4) >= 1.0d) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (r4 >= 9.223372036854776E18d) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        if ((r2 & r1) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        return (long) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0099, code lost:
        r11 = java.lang.String.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        throw new java.lang.ArithmeticException("rounded value is out of range for input " + r9 + " and rounding mode " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (java.lang.Math.abs(r9 - r4) == 0.5d) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long zzb(double r9, java.math.RoundingMode r11) {
        /*
            boolean r0 = com.google.android.gms.internal.ads.zzgah.zzb(r9)
            if (r0 == 0) goto L_0x00b9
            int[] r0 = com.google.android.gms.internal.ads.zzgaf.zza
            int r1 = r11.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r4 = 0
            switch(r0) {
                case 1: goto L_0x0076;
                case 2: goto L_0x0065;
                case 3: goto L_0x0056;
                case 4: goto L_0x007d;
                case 5: goto L_0x0045;
                case 6: goto L_0x0040;
                case 7: goto L_0x002b;
                case 8: goto L_0x001c;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x001c:
            double r4 = java.lang.Math.rint(r9)
            double r6 = r9 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            goto L_0x007d
        L_0x002b:
            double r4 = java.lang.Math.rint(r9)
            double r6 = r9 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            double r2 = java.lang.Math.copySign(r2, r9)
            double r4 = r9 + r2
            goto L_0x007e
        L_0x0040:
            double r4 = java.lang.Math.rint(r9)
            goto L_0x007e
        L_0x0045:
            boolean r0 = zzc(r9)
            if (r0 == 0) goto L_0x004c
            goto L_0x007d
        L_0x004c:
            long r2 = (long) r9
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = -1
        L_0x0054:
            long r4 = (long) r0
            goto L_0x0073
        L_0x0056:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x007d
            boolean r0 = zzc(r9)
            if (r0 == 0) goto L_0x0061
            goto L_0x007d
        L_0x0061:
            long r2 = (long) r9
            r4 = 1
            goto L_0x0073
        L_0x0065:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x007d
            boolean r0 = zzc(r9)
            if (r0 == 0) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            long r2 = (long) r9
            r4 = -1
        L_0x0073:
            long r2 = r2 + r4
            double r4 = (double) r2
            goto L_0x007e
        L_0x0076:
            boolean r0 = zzc(r9)
            com.google.android.gms.internal.ads.zzgam.zzb(r0)
        L_0x007d:
            r4 = r9
        L_0x007e:
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r2 = r2 - r4
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x008a
            r2 = 1
            goto L_0x008b
        L_0x008a:
            r2 = 0
        L_0x008b:
            r6 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r1 = 0
        L_0x0093:
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0099
            long r9 = (long) r4
            return r9
        L_0x0099:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "rounded value is out of range for input "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " and rounding mode "
            r1.append(r9)
            r1.append(r11)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x00b9:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "input is infinite or NaN"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgag.zzb(double, java.math.RoundingMode):long");
    }

    public static boolean zzc(double d) {
        if (zzgah.zzb(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(zzgah.zza(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean zzd(double d) {
        if (d > 0.0d && zzgah.zzb(d)) {
            long zza = zzgah.zza(d);
            if ((zza & (-1 + zza)) == 0) {
                return true;
            }
        }
        return false;
    }
}
