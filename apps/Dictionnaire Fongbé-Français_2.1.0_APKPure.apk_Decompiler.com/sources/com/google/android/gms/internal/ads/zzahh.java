package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzahh {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaho zzc = new zzaho();
    private zzahi zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzaco zzaco, int i) throws IOException {
        zzaco.zzi(this.zza, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.zza[i2] & 255));
        }
        return j;
    }

    public final void zza(zzahi zzahi) {
        this.zzd = zzahi;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        if (r0 == 1) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzc(com.google.android.gms.internal.ads.zzaco r14) throws java.io.IOException {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.zzahi r0 = r13.zzd
            com.google.android.gms.internal.ads.zzcw.zzb(r0)
        L_0x0005:
            java.util.ArrayDeque r0 = r13.zzb
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzahf r0 = (com.google.android.gms.internal.ads.zzahf) r0
            r1 = 1
            if (r0 == 0) goto L_0x0033
            long r2 = r14.zzf()
            long r4 = r0.zzb
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            com.google.android.gms.internal.ads.zzahi r14 = r13.zzd
            java.util.ArrayDeque r0 = r13.zzb
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzahf r0 = (com.google.android.gms.internal.ads.zzahf) r0
            int r0 = r0.zza
            com.google.android.gms.internal.ads.zzahj r14 = (com.google.android.gms.internal.ads.zzahj) r14
            com.google.android.gms.internal.ads.zzahm r14 = r14.zza
            r14.zzj(r0)
            return r1
        L_0x0033:
            int r0 = r13.zze
            r2 = 4
            r3 = 0
            if (r0 != 0) goto L_0x0094
            com.google.android.gms.internal.ads.zzaho r0 = r13.zzc
            long r4 = r0.zzd(r14, r1, r3, r2)
            r6 = -2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0087
            r14.zzj()
        L_0x0048:
            byte[] r0 = r13.zza
            r14.zzh(r0, r3, r2)
            byte[] r0 = r13.zza
            byte r0 = r0[r3]
            int r0 = com.google.android.gms.internal.ads.zzaho.zzb(r0)
            r4 = -1
            if (r0 == r4) goto L_0x0083
            if (r0 > r2) goto L_0x0083
            byte[] r4 = r13.zza
            long r4 = com.google.android.gms.internal.ads.zzaho.zzc(r4, r0, r3)
            int r5 = (int) r4
            com.google.android.gms.internal.ads.zzahi r4 = r13.zzd
            com.google.android.gms.internal.ads.zzahj r4 = (com.google.android.gms.internal.ads.zzahj) r4
            com.google.android.gms.internal.ads.zzahm r4 = r4.zza
            r4 = 357149030(0x1549a966, float:4.072526E-26)
            if (r5 == r4) goto L_0x007e
            r4 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r5 == r4) goto L_0x007e
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r5 == r4) goto L_0x007e
            r4 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r5 != r4) goto L_0x0083
            r5 = 374648427(0x1654ae6b, float:1.718026E-25)
        L_0x007e:
            r14.zzk(r0)
            long r4 = (long) r5
            goto L_0x0087
        L_0x0083:
            r14.zzk(r1)
            goto L_0x0048
        L_0x0087:
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x008e
            return r3
        L_0x008e:
            int r0 = (int) r4
            r13.zzf = r0
            r13.zze = r1
            goto L_0x0096
        L_0x0094:
            if (r0 != r1) goto L_0x00a3
        L_0x0096:
            com.google.android.gms.internal.ads.zzaho r0 = r13.zzc
            r4 = 8
            long r4 = r0.zzd(r14, r3, r1, r4)
            r13.zzg = r4
            r0 = 2
            r13.zze = r0
        L_0x00a3:
            com.google.android.gms.internal.ads.zzahi r0 = r13.zzd
            int r4 = r13.zzf
            com.google.android.gms.internal.ads.zzahj r0 = (com.google.android.gms.internal.ads.zzahj) r0
            com.google.android.gms.internal.ads.zzahm r5 = r0.zza
            r6 = 8
            r8 = 0
            switch(r4) {
                case 131: goto L_0x015f;
                case 134: goto L_0x0121;
                case 136: goto L_0x015f;
                case 155: goto L_0x015f;
                case 159: goto L_0x015f;
                case 160: goto L_0x00fe;
                case 161: goto L_0x00f5;
                case 163: goto L_0x00f5;
                case 165: goto L_0x00f5;
                case 166: goto L_0x00fe;
                case 174: goto L_0x00fe;
                case 176: goto L_0x015f;
                case 179: goto L_0x015f;
                case 181: goto L_0x00bb;
                case 183: goto L_0x00fe;
                case 186: goto L_0x015f;
                case 187: goto L_0x00fe;
                case 215: goto L_0x015f;
                case 224: goto L_0x00fe;
                case 225: goto L_0x00fe;
                case 231: goto L_0x015f;
                case 238: goto L_0x015f;
                case 241: goto L_0x015f;
                case 251: goto L_0x015f;
                case 16868: goto L_0x00fe;
                case 16871: goto L_0x015f;
                case 16877: goto L_0x00f5;
                case 16980: goto L_0x015f;
                case 16981: goto L_0x00f5;
                case 17026: goto L_0x0121;
                case 17029: goto L_0x015f;
                case 17143: goto L_0x015f;
                case 17545: goto L_0x00bb;
                case 18401: goto L_0x015f;
                case 18402: goto L_0x00f5;
                case 18407: goto L_0x00fe;
                case 18408: goto L_0x015f;
                case 19899: goto L_0x00fe;
                case 20529: goto L_0x015f;
                case 20530: goto L_0x015f;
                case 20532: goto L_0x00fe;
                case 20533: goto L_0x00fe;
                case 21358: goto L_0x0121;
                case 21419: goto L_0x00f5;
                case 21420: goto L_0x015f;
                case 21432: goto L_0x015f;
                case 21680: goto L_0x015f;
                case 21682: goto L_0x015f;
                case 21690: goto L_0x015f;
                case 21930: goto L_0x015f;
                case 21936: goto L_0x00fe;
                case 21938: goto L_0x015f;
                case 21945: goto L_0x015f;
                case 21946: goto L_0x015f;
                case 21947: goto L_0x015f;
                case 21948: goto L_0x015f;
                case 21949: goto L_0x015f;
                case 21968: goto L_0x00fe;
                case 21969: goto L_0x00bb;
                case 21970: goto L_0x00bb;
                case 21971: goto L_0x00bb;
                case 21972: goto L_0x00bb;
                case 21973: goto L_0x00bb;
                case 21974: goto L_0x00bb;
                case 21975: goto L_0x00bb;
                case 21976: goto L_0x00bb;
                case 21977: goto L_0x00bb;
                case 21978: goto L_0x00bb;
                case 21998: goto L_0x015f;
                case 22186: goto L_0x015f;
                case 22203: goto L_0x015f;
                case 25152: goto L_0x00fe;
                case 25188: goto L_0x015f;
                case 25506: goto L_0x00f5;
                case 28032: goto L_0x00fe;
                case 30113: goto L_0x00fe;
                case 30114: goto L_0x015f;
                case 30320: goto L_0x00fe;
                case 30321: goto L_0x015f;
                case 30322: goto L_0x00f5;
                case 30323: goto L_0x00bb;
                case 30324: goto L_0x00bb;
                case 30325: goto L_0x00bb;
                case 2274716: goto L_0x0121;
                case 2352003: goto L_0x015f;
                case 2807729: goto L_0x015f;
                case 290298740: goto L_0x00fe;
                case 357149030: goto L_0x00fe;
                case 374648427: goto L_0x00fe;
                case 408125543: goto L_0x00fe;
                case 440786851: goto L_0x00fe;
                case 475249515: goto L_0x00fe;
                case 524531317: goto L_0x00fe;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            long r0 = r13.zzg
            int r1 = (int) r0
            r14.zzk(r1)
            r13.zze = r3
            goto L_0x0005
        L_0x00bb:
            long r9 = r13.zzg
            r11 = 4
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x00db
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00c8
            goto L_0x00db
        L_0x00c8:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid float size: "
            r14.<init>(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzbc r14 = com.google.android.gms.internal.ads.zzbc.zza(r14, r8)
            throw r14
        L_0x00db:
            int r5 = (int) r9
            long r6 = r13.zzd(r14, r5)
            if (r5 != r2) goto L_0x00e9
            int r14 = (int) r6
            float r14 = java.lang.Float.intBitsToFloat(r14)
            double r5 = (double) r14
            goto L_0x00ed
        L_0x00e9:
            double r5 = java.lang.Double.longBitsToDouble(r6)
        L_0x00ed:
            com.google.android.gms.internal.ads.zzahm r14 = r0.zza
            r14.zzk(r4, r5)
            r13.zze = r3
            return r1
        L_0x00f5:
            long r6 = r13.zzg
            int r0 = (int) r6
            r5.zzh(r4, r0, r14)
            r13.zze = r3
            return r1
        L_0x00fe:
            long r9 = r14.zzf()
            long r5 = r13.zzg
            long r5 = r5 + r9
            java.util.ArrayDeque r14 = r13.zzb
            com.google.android.gms.internal.ads.zzahf r0 = new com.google.android.gms.internal.ads.zzahf
            r0.<init>(r4, r5, r8)
            r14.push(r0)
            com.google.android.gms.internal.ads.zzahi r14 = r13.zzd
            int r7 = r13.zzf
            long r4 = r13.zzg
            com.google.android.gms.internal.ads.zzahj r14 = (com.google.android.gms.internal.ads.zzahj) r14
            com.google.android.gms.internal.ads.zzahm r6 = r14.zza
            r8 = r9
            r10 = r4
            r6.zzm(r7, r8, r10)
            r13.zze = r3
            return r1
        L_0x0121:
            long r5 = r13.zzg
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x014c
            int r2 = (int) r5
            if (r2 != 0) goto L_0x0130
            java.lang.String r14 = ""
            goto L_0x0144
        L_0x0130:
            byte[] r5 = new byte[r2]
            r14.zzi(r5, r3, r2)
        L_0x0135:
            if (r2 <= 0) goto L_0x013f
            int r14 = r2 + -1
            byte r6 = r5[r14]
            if (r6 != 0) goto L_0x013f
            r2 = r14
            goto L_0x0135
        L_0x013f:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r5, r3, r2)
        L_0x0144:
            com.google.android.gms.internal.ads.zzahm r0 = r0.zza
            r0.zzn(r4, r14)
            r13.zze = r3
            return r1
        L_0x014c:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "String element size: "
            r14.<init>(r0)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzbc r14 = com.google.android.gms.internal.ads.zzbc.zza(r14, r8)
            throw r14
        L_0x015f:
            long r9 = r13.zzg
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0172
            int r2 = (int) r9
            long r5 = r13.zzd(r14, r2)
            com.google.android.gms.internal.ads.zzahm r14 = r0.zza
            r14.zzl(r4, r5)
            r13.zze = r3
            return r1
        L_0x0172:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid integer size: "
            r14.<init>(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzbc r14 = com.google.android.gms.internal.ads.zzbc.zza(r14, r8)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahh.zzc(com.google.android.gms.internal.ads.zzaco):boolean");
    }
}
