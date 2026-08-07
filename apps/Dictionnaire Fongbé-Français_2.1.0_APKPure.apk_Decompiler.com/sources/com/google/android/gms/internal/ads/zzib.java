package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzib extends zzbd {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzab zzf;
    public final int zzg;
    public final zzug zzh;
    final boolean zzi;

    static {
        Integer.toString(1001, 36);
        Integer.toString(PointerIconCompat.TYPE_HAND, 36);
        Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
        Integer.toString(1005, 36);
        Integer.toString(PointerIconCompat.TYPE_CELL, 36);
    }

    private zzib(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (zzab) null, 4, false);
    }

    public static zzib zzb(Throwable th, String str, int i, zzab zzab, int i2, boolean z, int i3) {
        return new zzib(1, th, (String) null, i3, str, i, zzab, zzab == null ? 4 : i2, z);
    }

    public static zzib zzc(IOException iOException, int i) {
        return new zzib(0, iOException, i);
    }

    public static zzib zzd(RuntimeException runtimeException, int i) {
        return new zzib(2, runtimeException, i);
    }

    /* access modifiers changed from: package-private */
    public final zzib zza(zzug zzug) {
        String message = getMessage();
        int i = zzei.zza;
        String str = message;
        return new zzib(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzug, this.zzb, this.zzi);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzib(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.zzab r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L_0x005f
            r0 = 1
            if (r4 == r0) goto L_0x000f
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L_0x0065
        L_0x000f:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = com.google.android.gms.internal.ads.zzei.zza
            if (r8 == 0) goto L_0x0034
            if (r8 == r0) goto L_0x0031
            r0 = 2
            if (r8 == r0) goto L_0x002e
            r0 = 3
            if (r8 == r0) goto L_0x002b
            r0 = 4
            if (r8 != r0) goto L_0x0025
            java.lang.String r0 = "YES"
            goto L_0x0036
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x002b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x0036
        L_0x002e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L_0x0036
        L_0x0031:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L_0x0036
        L_0x0034:
            java.lang.String r0 = "NO"
        L_0x0036:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0065
        L_0x005f:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L_0x0065:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0072
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L_0x0072:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzib.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzab, int, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzib(java.lang.String r10, java.lang.Throwable r11, int r12, int r13, java.lang.String r14, int r15, com.google.android.gms.internal.ads.zzab r16, int r17, com.google.android.gms.internal.ads.zzug r18, long r19, boolean r21) {
        /*
            r9 = this;
            r7 = r9
            r8 = r21
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x0019
            r2 = r13
            if (r2 != r1) goto L_0x0017
            r2 = 1
            goto L_0x001a
        L_0x0017:
            r3 = 0
            goto L_0x001b
        L_0x0019:
            r2 = r13
        L_0x001a:
            r3 = 1
        L_0x001b:
            com.google.android.gms.internal.ads.zzcw.zzd(r3)
            if (r11 != 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            com.google.android.gms.internal.ads.zzcw.zzd(r0)
            r7.zzc = r2
            r0 = r14
            r7.zzd = r0
            r0 = r15
            r7.zze = r0
            r0 = r16
            r7.zzf = r0
            r0 = r17
            r7.zzg = r0
            r0 = r18
            r7.zzh = r0
            r7.zzi = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzib.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, com.google.android.gms.internal.ads.zzab, int, com.google.android.gms.internal.ads.zzug, long, boolean):void");
    }
}
