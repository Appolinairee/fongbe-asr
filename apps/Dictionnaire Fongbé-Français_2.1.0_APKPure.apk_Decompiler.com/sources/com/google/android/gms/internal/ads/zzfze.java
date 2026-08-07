package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfze extends zzfxq {
    static final zzfxq zza = new zzfze((Object) null, new Object[0], 0);
    final transient Object[] zzb;
    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzfze(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.ads.zzfze zzj(int r16, java.lang.Object[] r17, com.google.android.gms.internal.ads.zzfxp r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            if (r0 != 0) goto L_0x000d
            com.google.android.gms.internal.ads.zzfxq r0 = zza
            com.google.android.gms.internal.ads.zzfze r0 = (com.google.android.gms.internal.ads.zzfze) r0
            return r0
        L_0x000d:
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L_0x0027
            r0 = r1[r4]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r2 = r1[r5]
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzfwk.zzb(r0, r2)
            com.google.android.gms.internal.ads.zzfze r0 = new com.google.android.gms.internal.ads.zzfze
            r0.<init>(r3, r1, r5)
            return r0
        L_0x0027:
            int r6 = r1.length
            int r6 = r6 >> r5
            java.lang.String r7 = "index"
            com.google.android.gms.internal.ads.zzfun.zzb(r0, r6, r7)
            int r6 = com.google.android.gms.internal.ads.zzfxs.zzh(r16)
            if (r0 != r5) goto L_0x0048
            r0 = r1[r4]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r6 = r1[r5]
            java.lang.Object r6 = java.util.Objects.requireNonNull(r6)
            com.google.android.gms.internal.ads.zzfwk.zzb(r0, r6)
            r0 = 1
        L_0x0044:
            r5 = 2
            r7 = 1
            goto L_0x019d
        L_0x0048:
            int r8 = r6 + -1
            r9 = 128(0x80, float:1.794E-43)
            r10 = 3
            r11 = -1
            if (r6 > r9) goto L_0x00bf
            byte[] r6 = new byte[r6]
            java.util.Arrays.fill(r6, r11)
            r9 = 0
            r11 = 0
        L_0x0057:
            if (r9 >= r0) goto L_0x00ab
            int r12 = r11 + r11
            int r13 = r9 + r9
            r14 = r1[r13]
            java.lang.Object r14 = java.util.Objects.requireNonNull(r14)
            r13 = r13 ^ r5
            r13 = r1[r13]
            java.lang.Object r13 = java.util.Objects.requireNonNull(r13)
            com.google.android.gms.internal.ads.zzfwk.zzb(r14, r13)
            int r15 = r14.hashCode()
            int r15 = com.google.android.gms.internal.ads.zzfxf.zza(r15)
        L_0x0075:
            r15 = r15 & r8
            byte r7 = r6[r15]
            r5 = 255(0xff, float:3.57E-43)
            r7 = r7 & r5
            if (r7 != r5) goto L_0x008b
            byte r5 = (byte) r12
            r6[r15] = r5
            if (r11 >= r9) goto L_0x0088
            r1[r12] = r14
            r5 = r12 ^ 1
            r1[r5] = r13
        L_0x0088:
            int r11 = r11 + 1
            goto L_0x00a3
        L_0x008b:
            r5 = r1[r7]
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x00a7
            r3 = r7 ^ 1
            com.google.android.gms.internal.ads.zzfxo r5 = new com.google.android.gms.internal.ads.zzfxo
            r7 = r1[r3]
            java.lang.Object r7 = java.util.Objects.requireNonNull(r7)
            r5.<init>(r14, r13, r7)
            r1[r3] = r13
            r3 = r5
        L_0x00a3:
            int r9 = r9 + 1
            r5 = 1
            goto L_0x0057
        L_0x00a7:
            int r15 = r15 + 1
            r5 = 1
            goto L_0x0075
        L_0x00ab:
            if (r11 != r0) goto L_0x00af
            r3 = r6
            goto L_0x0044
        L_0x00af:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r4] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r3
        L_0x00bd:
            r3 = r5
            goto L_0x0044
        L_0x00bf:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r6 > r5) goto L_0x0131
            short[] r5 = new short[r6]
            java.util.Arrays.fill(r5, r11)
            r6 = 0
            r7 = 0
        L_0x00cb:
            if (r6 >= r0) goto L_0x011f
            int r9 = r7 + r7
            int r11 = r6 + r6
            r12 = r1[r11]
            java.lang.Object r12 = java.util.Objects.requireNonNull(r12)
            r13 = 1
            r11 = r11 ^ r13
            r11 = r1[r11]
            java.lang.Object r11 = java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.ads.zzfwk.zzb(r12, r11)
            int r13 = r12.hashCode()
            int r13 = com.google.android.gms.internal.ads.zzfxf.zza(r13)
        L_0x00ea:
            r13 = r13 & r8
            short r14 = r5[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x0101
            short r14 = (short) r9
            r5[r13] = r14
            if (r7 >= r6) goto L_0x00fe
            r1[r9] = r12
            r9 = r9 ^ 1
            r1[r9] = r11
        L_0x00fe:
            int r7 = r7 + 1
            goto L_0x0119
        L_0x0101:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x011c
            r3 = r14 ^ 1
            com.google.android.gms.internal.ads.zzfxo r9 = new com.google.android.gms.internal.ads.zzfxo
            r13 = r1[r3]
            java.lang.Object r13 = java.util.Objects.requireNonNull(r13)
            r9.<init>(r12, r11, r13)
            r1[r3] = r11
            r3 = r9
        L_0x0119:
            int r6 = r6 + 1
            goto L_0x00cb
        L_0x011c:
            int r13 = r13 + 1
            goto L_0x00ea
        L_0x011f:
            if (r7 != r0) goto L_0x0122
            goto L_0x018c
        L_0x0122:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r3
            goto L_0x019c
        L_0x0131:
            r7 = 1
            int[] r5 = new int[r6]
            java.util.Arrays.fill(r5, r11)
            r6 = 0
            r9 = 0
        L_0x0139:
            if (r6 >= r0) goto L_0x018a
            int r12 = r9 + r9
            int r13 = r6 + r6
            r14 = r1[r13]
            java.lang.Object r14 = java.util.Objects.requireNonNull(r14)
            r13 = r13 ^ r7
            r7 = r1[r13]
            java.lang.Object r7 = java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.zzfwk.zzb(r14, r7)
            int r13 = r14.hashCode()
            int r13 = com.google.android.gms.internal.ads.zzfxf.zza(r13)
        L_0x0157:
            r13 = r13 & r8
            r15 = r5[r13]
            if (r15 != r11) goto L_0x0169
            r5[r13] = r12
            if (r9 >= r6) goto L_0x0166
            r1[r12] = r14
            r12 = r12 ^ 1
            r1[r12] = r7
        L_0x0166:
            int r9 = r9 + 1
            goto L_0x0181
        L_0x0169:
            r11 = r1[r15]
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x0186
            r3 = r15 ^ 1
            com.google.android.gms.internal.ads.zzfxo r11 = new com.google.android.gms.internal.ads.zzfxo
            r12 = r1[r3]
            java.lang.Object r12 = java.util.Objects.requireNonNull(r12)
            r11.<init>(r14, r7, r12)
            r1[r3] = r7
            r3 = r11
        L_0x0181:
            int r6 = r6 + 1
            r7 = 1
            r11 = -1
            goto L_0x0139
        L_0x0186:
            int r13 = r13 + 1
            r11 = -1
            goto L_0x0157
        L_0x018a:
            if (r9 != r0) goto L_0x018e
        L_0x018c:
            goto L_0x00bd
        L_0x018e:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r3
        L_0x019c:
            r3 = r6
        L_0x019d:
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L_0x01c4
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r5]
            com.google.android.gms.internal.ads.zzfxo r0 = (com.google.android.gms.internal.ads.zzfxo) r0
            if (r2 == 0) goto L_0x01bf
            r2.zzc = r0
            r0 = r3[r4]
            r2 = r3[r7]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r3 = r0
            r0 = r2
            goto L_0x01c4
        L_0x01bf:
            java.lang.IllegalArgumentException r0 = r0.zza()
            throw r0
        L_0x01c4:
            com.google.android.gms.internal.ads.zzfze r2 = new com.google.android.gms.internal.ads.zzfze
            r2.<init>(r3, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfze.zzj(int, java.lang.Object[], com.google.android.gms.internal.ads.zzfxp):com.google.android.gms.internal.ads.zzfze");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1 A[RETURN] */
    @javax.annotation.CheckForNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0006
        L_0x0003:
            r10 = r0
            goto L_0x009e
        L_0x0006:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L_0x0022
            r1 = 0
            r1 = r2[r1]
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x0003
            r10 = r2[r3]
            java.lang.Object r10 = java.util.Objects.requireNonNull(r10)
            goto L_0x009e
        L_0x0022:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L_0x0027
            goto L_0x0003
        L_0x0027:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L_0x0053
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + -1
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfxf.zza(r1)
        L_0x003a:
            r1 = r1 & r6
            byte r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L_0x0043
            goto L_0x0003
        L_0x0043:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x0050
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L_0x009e
        L_0x0050:
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0053:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L_0x007f
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + -1
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfxf.zza(r1)
        L_0x0065:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L_0x006f
            goto L_0x0003
        L_0x006f:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x007c
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L_0x009e
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x007f:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzfxf.zza(r6)
        L_0x008b:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L_0x0092
            goto L_0x0003
        L_0x0092:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x00a2
            r10 = r7 ^ 1
            r10 = r2[r10]
        L_0x009e:
            if (r10 != 0) goto L_0x00a1
            return r0
        L_0x00a1:
            return r10
        L_0x00a2:
            int r6 = r6 + 1
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfze.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final zzfxi zza() {
        return new zzfzd(this.zzb, 1, this.zzd);
    }

    /* access modifiers changed from: package-private */
    public final zzfxs zzf() {
        return new zzfzb(this, this.zzb, 0, this.zzd);
    }

    /* access modifiers changed from: package-private */
    public final zzfxs zzg() {
        return new zzfzc(this, new zzfzd(this.zzb, 0, this.zzd));
    }
}
