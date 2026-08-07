package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzean implements zzgcd {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzeao zzb;

    zzean(zzeao zzeao, boolean z) {
        this.zza = z;
        this.zzb = zzeao;
    }

    public final void zza(Throwable th) {
        zzo.zzg("Failed to get signals bundle");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzeao r0 = r7.zzb
            com.google.android.gms.internal.ads.zzcuv r8 = (com.google.android.gms.internal.ads.zzcuv) r8
            boolean r0 = r0.zzf()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            android.os.Bundle r8 = r8.zza
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x001a
            java.util.List r0 = (java.util.List) r0
            goto L_0x0024
        L_0x001a:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x004a
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x0024:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0031:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0031
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L_0x0031
        L_0x0045:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x004e
        L_0x004a:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x004e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b1
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L_0x008c;
                case -1052618729: goto L_0x0082;
                case -239580146: goto L_0x0078;
                case 604727084: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0096
        L_0x006e:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0096
            r1 = 1
            goto L_0x0097
        L_0x0078:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0096
            r1 = 3
            goto L_0x0097
        L_0x0082:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0096
            r1 = 2
            goto L_0x0097
        L_0x008c:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0096
            r1 = 0
            goto L_0x0097
        L_0x0096:
            r1 = -1
        L_0x0097:
            if (r1 == 0) goto L_0x00ab
            if (r1 == r6) goto L_0x00a8
            if (r1 == r5) goto L_0x00a5
            if (r1 == r3) goto L_0x00a2
            com.google.android.gms.internal.ads.zzbbq$zzd$zza r1 = com.google.android.gms.internal.ads.zzbbq.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x00ad
        L_0x00a2:
            com.google.android.gms.internal.ads.zzbbq$zzd$zza r1 = com.google.android.gms.internal.ads.zzbbq.zzd.zza.REWARD_BASED_VIDEO_AD
            goto L_0x00ad
        L_0x00a5:
            com.google.android.gms.internal.ads.zzbbq$zzd$zza r1 = com.google.android.gms.internal.ads.zzbbq.zzd.zza.NATIVE_APP_INSTALL
            goto L_0x00ad
        L_0x00a8:
            com.google.android.gms.internal.ads.zzbbq$zzd$zza r1 = com.google.android.gms.internal.ads.zzbbq.zzd.zza.INTERSTITIAL
            goto L_0x00ad
        L_0x00ab:
            com.google.android.gms.internal.ads.zzbbq$zzd$zza r1 = com.google.android.gms.internal.ads.zzbbq.zzd.zza.BANNER
        L_0x00ad:
            r4.add(r1)
            goto L_0x0057
        L_0x00b1:
            com.google.android.gms.internal.ads.zzeao r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbbq$zzaf$zzd r6 = com.google.android.gms.internal.ads.zzeao.zzb(r0, r8)
            com.google.android.gms.internal.ads.zzeao r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbbq$zzab r5 = com.google.android.gms.internal.ads.zzeao.zza(r0, r8)
            com.google.android.gms.internal.ads.zzeao r8 = r7.zzb
            boolean r3 = r7.zza
            com.google.android.gms.internal.ads.zzeam r0 = new com.google.android.gms.internal.ads.zzeam
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzeac r8 = r8.zza
            r8.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzean.zzb(java.lang.Object):void");
    }
}
