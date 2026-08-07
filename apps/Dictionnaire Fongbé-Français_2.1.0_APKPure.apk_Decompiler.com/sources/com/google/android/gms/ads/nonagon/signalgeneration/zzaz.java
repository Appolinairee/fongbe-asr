package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbyy;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaz {
    private final String zza;
    private final String zzb;
    private final zzbyy zzc;

    /* synthetic */ zzaz(zzax zzax, zzay zzay) {
        this.zza = zzax.zza;
        this.zzb = zzax.zzb;
        this.zzc = zzax.zzc;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbbq.zza.C0000zza zza() {
        /*
            r5 = this;
            java.lang.String r0 = r5.zza
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1999289321: goto L_0x002b;
                case -1372958932: goto L_0x0021;
                case 543046670: goto L_0x0017;
                case 1951953708: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0017:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 3
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 2
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x004a
            if (r0 == r4) goto L_0x0047
            if (r0 == r3) goto L_0x0044
            if (r0 == r2) goto L_0x0041
            com.google.android.gms.internal.ads.zzbbq$zza$zza r0 = com.google.android.gms.internal.ads.zzbbq.zza.C0000zza.AD_INITIATER_UNSPECIFIED
            return r0
        L_0x0041:
            com.google.android.gms.internal.ads.zzbbq$zza$zza r0 = com.google.android.gms.internal.ads.zzbbq.zza.C0000zza.REWARD_BASED_VIDEO_AD
            return r0
        L_0x0044:
            com.google.android.gms.internal.ads.zzbbq$zza$zza r0 = com.google.android.gms.internal.ads.zzbbq.zza.C0000zza.AD_LOADER
            return r0
        L_0x0047:
            com.google.android.gms.internal.ads.zzbbq$zza$zza r0 = com.google.android.gms.internal.ads.zzbbq.zza.C0000zza.INTERSTITIAL
            return r0
        L_0x004a:
            com.google.android.gms.internal.ads.zzbbq$zza$zza r0 = com.google.android.gms.internal.ads.zzbbq.zza.C0000zza.BANNER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzaz.zza():com.google.android.gms.internal.ads.zzbbq$zza$zza");
    }

    /* access modifiers changed from: package-private */
    public final zzbyy zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    public final Set zze() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
