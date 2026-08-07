package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzedj implements zzdgc {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfbo zzc;
    private final zzcex zzd;
    private final zzfcj zze;
    private final zzbjs zzf;
    private final boolean zzg;
    private final zzebv zzh;
    private final zzdrw zzi;

    zzedj(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfbo zzfbo, zzcex zzcex, zzfcj zzfcj, boolean z, zzbjs zzbjs, zzebv zzebv, zzdrw zzdrw) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfbo;
        this.zzd = zzcex;
        this.zze = zzfcj;
        this.zzg = z;
        this.zzf = zzbjs;
        this.zzh = zzebv;
        this.zzi = zzdrw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r20, android.content.Context r21, com.google.android.gms.internal.ads.zzcwg r22) {
        /*
            r19 = this;
            r0 = r19
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgch.zzq(r1)
            com.google.android.gms.internal.ads.zzcnx r1 = (com.google.android.gms.internal.ads.zzcnx) r1
            com.google.android.gms.internal.ads.zzcex r2 = r0.zzd
            r3 = 1
            r2.zzaq(r3)
            com.google.android.gms.ads.internal.zzl r2 = new com.google.android.gms.ads.internal.zzl
            boolean r4 = r0.zzg
            if (r4 == 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzbjs r4 = r0.zzf
            boolean r4 = r4.zze(r3)
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = 1
        L_0x001f:
            boolean r4 = r0.zzg
            if (r4 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzbjs r6 = r0.zzf
            boolean r6 = r6.zzd()
            r7 = r6
            goto L_0x002d
        L_0x002b:
            r6 = 0
            r7 = 0
        L_0x002d:
            if (r4 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbjs r4 = r0.zzf
            float r4 = r4.zza()
            r8 = r4
            goto L_0x0039
        L_0x0037:
            r4 = 0
            r8 = 0
        L_0x0039:
            com.google.android.gms.internal.ads.zzfbo r4 = r0.zzc
            boolean r11 = r4.zzO
            r12 = 0
            r6 = 1
            r9 = -1
            r4 = r2
            r10 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r22 == 0) goto L_0x004b
            r22.zzf()
        L_0x004b:
            com.google.android.gms.ads.internal.zzv.zzj()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdfr r6 = r1.zzg()
            com.google.android.gms.internal.ads.zzcex r8 = r0.zzd
            com.google.android.gms.internal.ads.zzfbo r1 = r0.zzc
            int r1 = r1.zzQ
            r4 = -1
            if (r1 == r4) goto L_0x005f
        L_0x005d:
            r9 = r1
            goto L_0x007c
        L_0x005f:
            com.google.android.gms.internal.ads.zzfcj r1 = r0.zze
            com.google.android.gms.ads.internal.client.zzy r1 = r1.zzj
            if (r1 == 0) goto L_0x0072
            int r1 = r1.zza
            if (r1 != r3) goto L_0x006c
            r1 = 7
            r9 = 7
            goto L_0x007c
        L_0x006c:
            r4 = 2
            if (r1 != r4) goto L_0x0072
            r1 = 6
            r9 = 6
            goto L_0x007c
        L_0x0072:
            java.lang.String r1 = "Error setting app open orientation; no targeting orientation available."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r1)
            com.google.android.gms.internal.ads.zzfbo r1 = r0.zzc
            int r1 = r1.zzQ
            goto L_0x005d
        L_0x007c:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r10 = r0.zza
            com.google.android.gms.internal.ads.zzfbo r1 = r0.zzc
            java.lang.String r11 = r1.zzB
            com.google.android.gms.internal.ads.zzfbt r4 = r1.zzs
            java.lang.String r13 = r4.zzb
            java.lang.String r14 = r4.zza
            com.google.android.gms.internal.ads.zzfcj r4 = r0.zze
            boolean r1 = r1.zzb()
            if (r1 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.zzebv r1 = r0.zzh
            goto L_0x0094
        L_0x0093:
            r1 = 0
        L_0x0094:
            r17 = r1
            java.lang.String r1 = r4.zzf
            com.google.android.gms.internal.ads.zzcex r4 = r0.zzd
            java.lang.String r18 = r4.zzr()
            r5 = 0
            r7 = 0
            r4 = r15
            r12 = r2
            r2 = r15
            r15 = r1
            r16 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.google.android.gms.internal.ads.zzdrw r1 = r0.zzi
            r4 = r21
            com.google.android.gms.ads.internal.overlay.zzn.zza(r4, r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedj.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzcwg):void");
    }
}
