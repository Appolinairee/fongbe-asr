package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzegx implements zzgbo {
    private final zzfgn zza;
    private final zzcvv zzb;
    private final zzfiv zzc;
    private final zzfja zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcrc zzg;
    private final zzegq zzh;
    private final zzedb zzi;
    private final Context zzj;
    private final zzfhh zzk;
    private final zzega zzl;
    private final zzdrq zzm;

    zzegx(Context context, zzfgn zzfgn, zzegq zzegq, zzcvv zzcvv, zzfiv zzfiv, zzfja zzfja, zzcrc zzcrc, Executor executor, ScheduledExecutorService scheduledExecutorService, zzedb zzedb, zzfhh zzfhh, zzega zzega, zzdrq zzdrq) {
        this.zzj = context;
        this.zza = zzfgn;
        this.zzh = zzegq;
        this.zzb = zzcvv;
        this.zzc = zzfiv;
        this.zzd = zzfja;
        this.zzg = zzcrc;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzedb;
        this.zzk = zzfhh;
        this.zzl = zzega;
        this.zzm = zzdrq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfv)).booleanValue() == false) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String zzc(com.google.android.gms.internal.ads.zzfca r5) {
        /*
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzfw
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L_0x0018
            java.lang.String r0 = "No ad config."
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            com.google.android.gms.internal.ads.zzfbz r2 = r5.zzb
            com.google.android.gms.internal.ads.zzfbr r2 = r2.zzb
            int r2 = r2.zzf
            if (r2 == 0) goto L_0x0054
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L_0x003c
            if (r2 >= r4) goto L_0x003c
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzfv
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0054
            goto L_0x0055
        L_0x003c:
            if (r2 < r4) goto L_0x0045
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L_0x0045
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L_0x0055
        L_0x0045:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Received error HTTP response code: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L_0x0055
        L_0x0054:
            r1 = r0
        L_0x0055:
            com.google.android.gms.internal.ads.zzfbz r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfbr r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfbq r5 = r5.zzj
            if (r5 == 0) goto L_0x0062
            java.lang.String r5 = r5.zza()
            return r5
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegx.zzc(com.google.android.gms.internal.ads.zzfca):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfca r9 = (com.google.android.gms.internal.ads.zzfca) r9
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzck
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.zzfbz r0 = r9.zzb
            com.google.android.gms.internal.ads.zzbvk r0 = r0.zzd
            if (r0 == 0) goto L_0x0027
            android.os.Bundle r0 = r0.zzm
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.zzdrq r1 = r8.zzm
            android.os.Bundle r1 = r1.zza()
            r1.putAll(r0)
        L_0x0027:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzcl
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.zzdrq r0 = r8.zzm
            android.os.Bundle r0 = r0.zza()
            com.google.android.gms.internal.ads.zzdre r1 = com.google.android.gms.internal.ads.zzdre.RENDERING_START
            java.lang.String r1 = r1.zza()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzv.zzC()
            long r2 = r2.currentTimeMillis()
            r0.putLong(r1, r2)
        L_0x0050:
            java.lang.String r0 = zzc(r9)
            com.google.android.gms.internal.ads.zzedb r1 = r8.zzi
            com.google.android.gms.internal.ads.zzfbz r2 = r9.zzb
            com.google.android.gms.internal.ads.zzfbr r2 = r2.zzb
            r1.zzi(r2)
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzih
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 3
            if (r1 == 0) goto L_0x008b
            com.google.android.gms.internal.ads.zzfbz r1 = r9.zzb
            com.google.android.gms.internal.ads.zzfbr r1 = r1.zzb
            int r1 = r1.zzf
            if (r1 == 0) goto L_0x008b
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 < r3) goto L_0x0080
            r3 = 300(0x12c, float:4.2E-43)
            if (r1 < r3) goto L_0x008b
        L_0x0080:
            com.google.android.gms.internal.ads.zzegu r9 = new com.google.android.gms.internal.ads.zzegu
            r9.<init>(r2, r0)
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgch.zzg(r9)
            goto L_0x01b6
        L_0x008b:
            com.google.android.gms.internal.ads.zzfbz r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfbr r0 = r0.zzb
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzdH
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 1
            if (r1 == 0) goto L_0x00b4
            java.lang.String r0 = r0.zzq
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00b4
            com.google.android.gms.internal.ads.zzedb r1 = r8.zzi
            com.google.android.gms.internal.ads.zzfbz r4 = r9.zzb
            java.util.List r4 = r4.zza
            r1.zzh(r0, r4)
            goto L_0x00fd
        L_0x00b4:
            com.google.android.gms.internal.ads.zzfbz r0 = r9.zzb
            java.util.List r0 = r0.zza
            java.util.Iterator r0 = r0.iterator()
        L_0x00bc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fd
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfbo r1 = (com.google.android.gms.internal.ads.zzfbo) r1
            com.google.android.gms.internal.ads.zzedb r4 = r8.zzi
            r4.zzd(r1)
            java.util.List r4 = r1.zza
            java.util.Iterator r4 = r4.iterator()
        L_0x00d3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00f0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcrc r6 = r8.zzg
            int r7 = r1.zzb
            com.google.android.gms.internal.ads.zzecw r5 = r6.zza(r7, r5)
            if (r5 == 0) goto L_0x00d3
            boolean r5 = r5.zzb(r9, r1)
            if (r5 == 0) goto L_0x00d3
            goto L_0x00bc
        L_0x00f0:
            com.google.android.gms.internal.ads.zzedb r4 = r8.zzi
            r5 = 0
            r7 = 0
            com.google.android.gms.ads.internal.client.zze r7 = com.google.android.gms.internal.ads.zzfdk.zzd(r3, r7, r7)
            r4.zzf(r1, r5, r7)
            goto L_0x00bc
        L_0x00fd:
            com.google.android.gms.internal.ads.zzcvv r0 = r8.zzb
            com.google.android.gms.internal.ads.zzfja r1 = r8.zzd
            com.google.android.gms.internal.ads.zzfiv r4 = r8.zzc
            com.google.android.gms.internal.ads.zzcmo r5 = new com.google.android.gms.internal.ads.zzcmo
            r5.<init>(r9, r1, r4)
            java.util.concurrent.Executor r1 = r8.zze
            r0.zzo(r5, r1)
            com.google.android.gms.internal.ads.zzfbz r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfbr r0 = r0.zzb
            int r0 = r0.zzr
            if (r0 <= r3) goto L_0x011d
            com.google.android.gms.internal.ads.zzega r0 = r8.zzl
            com.google.common.util.concurrent.ListenableFuture r9 = r0.zzb(r9)
            goto L_0x01b6
        L_0x011d:
            java.lang.String r0 = zzc(r9)
            com.google.android.gms.internal.ads.zzfgn r1 = r8.zza
            com.google.android.gms.internal.ads.zzfgh r3 = com.google.android.gms.internal.ads.zzfgh.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.zzegu r4 = new com.google.android.gms.internal.ads.zzegu
            r4.<init>(r2, r0)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgch.zzg(r4)
            com.google.android.gms.internal.ads.zzfgd r0 = com.google.android.gms.internal.ads.zzffx.zzc(r0, r3, r1)
            com.google.android.gms.internal.ads.zzfft r0 = r0.zza()
            com.google.android.gms.internal.ads.zzegq r1 = r8.zzh
            r1.zzl()
            com.google.android.gms.internal.ads.zzfbz r1 = r9.zzb
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x0144:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01a6
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.zzfbo r3 = (com.google.android.gms.internal.ads.zzfbo) r3
            java.util.List r4 = r3.zza
            java.util.Iterator r4 = r4.iterator()
        L_0x0156:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a3
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcrc r6 = r8.zzg
            int r7 = r3.zzb
            com.google.android.gms.internal.ads.zzecw r6 = r6.zza(r7, r5)
            if (r6 == 0) goto L_0x0156
            boolean r7 = r6.zzb(r9, r3)
            if (r7 == 0) goto L_0x0156
            com.google.android.gms.internal.ads.zzfgn r4 = r8.zza
            com.google.android.gms.internal.ads.zzfgh r7 = com.google.android.gms.internal.ads.zzfgh.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.zzfgd r0 = r4.zzb(r7, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "render-config-"
            r4.<init>(r7)
            r4.append(r2)
            java.lang.String r7 = "-"
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzfgd r0 = r0.zzh(r4)
            com.google.android.gms.internal.ads.zzegv r4 = new com.google.android.gms.internal.ads.zzegv
            r4.<init>(r8, r3, r9, r6)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.zzfgd r0 = r0.zzc(r3, r4)
            com.google.android.gms.internal.ads.zzfft r0 = r0.zza()
        L_0x01a3:
            int r2 = r2 + 1
            goto L_0x0144
        L_0x01a6:
            com.google.android.gms.internal.ads.zzegq r9 = r8.zzh
            java.util.Objects.requireNonNull(r9)
            com.google.android.gms.internal.ads.zzegw r1 = new com.google.android.gms.internal.ads.zzegw
            r1.<init>(r9)
            java.util.concurrent.Executor r9 = r8.zze
            r0.addListener(r1, r9)
            r9 = r0
        L_0x01b6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegx.zza(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(zzfbo zzfbo, zzfca zzfca, zzecw zzecw, Throwable th) throws Exception {
        zzfgw zza2 = zzfgv.zza(this.zzj, 12);
        zza2.zzd(zzfbo.zzE);
        zza2.zzi();
        ListenableFuture zzo = zzgch.zzo(zzecw.zza(zzfca, zzfbo), (long) zzfbo.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfca, zzfbo, zzo, this.zzc);
        zzfhg.zza(zzo, this.zzk, zza2);
        return zzo;
    }
}
