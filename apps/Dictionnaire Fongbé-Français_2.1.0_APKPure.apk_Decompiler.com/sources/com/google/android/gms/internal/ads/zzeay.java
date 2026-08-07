package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeay extends zzebc {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    zzeay(String str, String str2, Drawable drawable) {
        this.zza = str;
        if (str2 != null) {
            this.zzb = str2;
            this.zzc = drawable;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.zzc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzebc
            r2 = 0
            if (r1 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.zzebc r5 = (com.google.android.gms.internal.ads.zzebc) r5
            java.lang.String r1 = r4.zza
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.zzb()
            if (r1 != 0) goto L_0x0043
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0043
        L_0x0020:
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0043
            android.graphics.drawable.Drawable r1 = r4.zzc
            if (r1 != 0) goto L_0x0037
            android.graphics.drawable.Drawable r5 = r5.zza()
            if (r5 != 0) goto L_0x0043
            goto L_0x0042
        L_0x0037:
            android.graphics.drawable.Drawable r5 = r5.zza()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            return r0
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeay.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return "OfflineAdAssets{advertiserName=" + this.zza + ", imageUrl=" + this.zzb + ", icon=" + valueOf + "}";
    }

    /* access modifiers changed from: package-private */
    public final Drawable zza() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        return this.zzb;
    }

    public final int hashCode() {
        int i;
        String str = this.zza;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = ((i ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        if (drawable != null) {
            i2 = drawable.hashCode();
        }
        return (hashCode * 1000003) ^ i2;
    }
}
