package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzww implements zzxn {
    public final /* synthetic */ zzxh zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int[] zzc;

    public /* synthetic */ zzww(zzxh zzxh, String str, int[] iArr) {
        this.zza = zzxh;
        this.zzb = str;
        this.zzc = iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zza(int r20, com.google.android.gms.internal.ads.zzbr r21, int[] r22) {
        /*
            r19 = this;
            r0 = r19
            r10 = r21
            int r1 = com.google.android.gms.internal.ads.zzxt.zzb
            com.google.android.gms.internal.ads.zzxh r11 = r0.zza
            int[] r1 = r0.zzc
            r12 = r1[r20]
            int r1 = r11.zzi
            int r2 = r11.zzj
            boolean r3 = r11.zzk
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r9) goto L_0x008a
            if (r2 != r9) goto L_0x001b
            goto L_0x008a
        L_0x001b:
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x001f:
            int r6 = r10.zza
            if (r4 >= r6) goto L_0x0088
            com.google.android.gms.internal.ads.zzab r6 = r10.zzb(r4)
            int r7 = r6.zzv
            if (r7 <= 0) goto L_0x0082
            int r8 = r6.zzw
            if (r8 <= 0) goto L_0x0082
            if (r3 == 0) goto L_0x0040
            if (r7 > r8) goto L_0x0035
            r14 = 0
            goto L_0x0036
        L_0x0035:
            r14 = 1
        L_0x0036:
            if (r1 > r2) goto L_0x003a
            r15 = 0
            goto L_0x003b
        L_0x003a:
            r15 = 1
        L_0x003b:
            if (r14 == r15) goto L_0x0040
            r14 = r1
            r15 = r2
            goto L_0x0042
        L_0x0040:
            r15 = r1
            r14 = r2
        L_0x0042:
            int r9 = r7 * r14
            int r13 = r8 * r15
            if (r9 < r13) goto L_0x0056
            android.graphics.Point r8 = new android.graphics.Point
            int r9 = com.google.android.gms.internal.ads.zzei.zza
            int r13 = r13 + r7
            r17 = -1
            int r13 = r13 + -1
            int r13 = r13 / r7
            r8.<init>(r15, r13)
            goto L_0x0064
        L_0x0056:
            r17 = -1
            android.graphics.Point r7 = new android.graphics.Point
            int r13 = com.google.android.gms.internal.ads.zzei.zza
            int r9 = r9 + r8
            int r9 = r9 + -1
            int r9 = r9 / r8
            r7.<init>(r9, r14)
            r8 = r7
        L_0x0064:
            int r7 = r6.zzv
            int r9 = r6.zzw
            int r9 = r9 * r7
            int r13 = r8.x
            float r13 = (float) r13
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r13 = r13 * r14
            int r13 = (int) r13
            if (r7 < r13) goto L_0x0082
            int r6 = r6.zzw
            int r7 = r8.y
            float r7 = (float) r7
            float r7 = r7 * r14
            int r7 = (int) r7
            if (r6 < r7) goto L_0x0082
            if (r9 >= r5) goto L_0x0082
            r5 = r9
        L_0x0082:
            int r4 = r4 + 1
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x001f
        L_0x0088:
            r13 = r5
            goto L_0x008d
        L_0x008a:
            r13 = 2147483647(0x7fffffff, float:NaN)
        L_0x008d:
            com.google.android.gms.internal.ads.zzfxk r14 = new com.google.android.gms.internal.ads.zzfxk
            r14.<init>()
            r15 = 0
        L_0x0093:
            int r1 = r10.zza
            if (r15 >= r1) goto L_0x00d3
            com.google.android.gms.internal.ads.zzab r1 = r10.zzb(r15)
            int r1 = r1.zza()
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r9) goto L_0x00ad
            r8 = -1
            if (r1 == r8) goto L_0x00aa
            if (r1 > r13) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            r16 = 0
            goto L_0x00b0
        L_0x00ad:
            r8 = -1
        L_0x00ae:
            r16 = 1
        L_0x00b0:
            java.lang.String r7 = r0.zzb
            com.google.android.gms.internal.ads.zzxr r6 = new com.google.android.gms.internal.ads.zzxr
            r17 = r22[r15]
            r1 = r6
            r2 = r20
            r3 = r21
            r4 = r15
            r5 = r11
            r0 = r6
            r6 = r17
            r17 = -1
            r8 = r12
            r18 = 2147483647(0x7fffffff, float:NaN)
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r14.zzf(r0)
            int r15 = r15 + 1
            r0 = r19
            goto L_0x0093
        L_0x00d3:
            com.google.android.gms.internal.ads.zzfxn r0 = r14.zzi()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzww.zza(int, com.google.android.gms.internal.ads.zzbr, int[]):java.util.List");
    }
}
