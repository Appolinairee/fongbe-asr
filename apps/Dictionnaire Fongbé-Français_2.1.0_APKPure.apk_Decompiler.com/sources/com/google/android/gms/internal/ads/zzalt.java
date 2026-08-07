package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzalt {
    public long zza = 0;
    public long zzb = 0;
    public CharSequence zzc;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        if (r4 == 0) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzcm zza() {
        /*
            r13 = this;
            float r0 = r13.zzh
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x0011
            goto L_0x001e
        L_0x0011:
            int r0 = r13.zzd
            if (r0 == r4) goto L_0x001d
            if (r0 == r3) goto L_0x001a
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x001e
        L_0x001a:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            int r7 = r13.zzi
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r7 == r8) goto L_0x0028
            goto L_0x0037
        L_0x0028:
            int r7 = r13.zzd
            if (r7 == r11) goto L_0x0036
            if (r7 == r9) goto L_0x0034
            if (r7 == r4) goto L_0x0036
            if (r7 == r3) goto L_0x0034
            r7 = 1
            goto L_0x0037
        L_0x0034:
            r7 = 2
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            com.google.android.gms.internal.ads.zzcm r8 = new com.google.android.gms.internal.ads.zzcm
            r8.<init>()
            int r12 = r13.zzd
            if (r12 == r11) goto L_0x0063
            if (r12 == r10) goto L_0x0060
            if (r12 == r9) goto L_0x005d
            if (r12 == r4) goto L_0x0063
            if (r12 == r3) goto L_0x005d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown textAlignment: "
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "WebvttCueParser"
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r3)
            r3 = 0
            goto L_0x0065
        L_0x005d:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0065
        L_0x0060:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0065
        L_0x0063:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x0065:
            r8.zzm(r3)
            float r3 = r13.zze
            int r4 = r13.zzf
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x007b
            if (r4 != 0) goto L_0x007b
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x007f
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x007b
            goto L_0x007f
        L_0x007b:
            if (r9 != 0) goto L_0x0082
            if (r4 != 0) goto L_0x0083
        L_0x007f:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0083
        L_0x0082:
            r6 = r3
        L_0x0083:
            r8.zze(r6, r4)
            int r2 = r13.zzg
            r8.zzf(r2)
            r8.zzh(r0)
            r8.zzi(r7)
            float r2 = r13.zzj
            if (r7 == 0) goto L_0x00ae
            if (r7 == r11) goto L_0x00a4
            if (r7 != r10) goto L_0x009a
            goto L_0x00b0
        L_0x009a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0.<init>(r1)
            throw r0
        L_0x00a4:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x00aa
            float r0 = r0 + r0
            goto L_0x00b0
        L_0x00aa:
            float r5 = r5 - r0
            float r0 = r5 + r5
            goto L_0x00b0
        L_0x00ae:
            float r0 = r5 - r0
        L_0x00b0:
            float r0 = java.lang.Math.min(r2, r0)
            r8.zzk(r0)
            int r0 = r13.zzk
            r8.zzo(r0)
            java.lang.CharSequence r0 = r13.zzc
            if (r0 == 0) goto L_0x00c3
            r8.zzl(r0)
        L_0x00c3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zza():com.google.android.gms.internal.ads.zzcm");
    }
}
