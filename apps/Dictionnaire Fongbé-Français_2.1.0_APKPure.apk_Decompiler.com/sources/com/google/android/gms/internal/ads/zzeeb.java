package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.zzc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeeb implements zzedc {
    private final Context zza;
    private final zzcpq zzb;
    private final Executor zzc;

    public zzeeb(Context context, zzcpq zzcpq, Executor executor) {
        this.zza = context;
        this.zzb = zzcpq;
        this.zzc = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca r7, com.google.android.gms.internal.ads.zzfbo r8, com.google.android.gms.internal.ads.zzecz r9) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzhJ
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.zzag
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfdh r0 = (com.google.android.gms.internal.ads.zzfdh) r0
            com.google.android.gms.internal.ads.zzbpn r0 = r0.zzc()
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.dynamic.IObjectWrapper r2 = r0.zze()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.zzf()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgch.zzh(r1)
            com.google.android.gms.internal.ads.zzedz r3 = new com.google.android.gms.internal.ads.zzedz
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.zzgcs r2 = com.google.android.gms.internal.ads.zzbzw.zzf
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgch.zzn(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.zzfcq r8 = new com.google.android.gms.internal.ads.zzfcq
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.zzfcq r7 = new com.google.android.gms.internal.ads.zzfcq
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfcq r8 = new com.google.android.gms.internal.ads.zzfcq
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r7)
            com.google.android.gms.internal.ads.zzfcq r8 = new com.google.android.gms.internal.ads.zzfcq
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfdh r0 = (com.google.android.gms.internal.ads.zzfdh) r0
            android.view.View r2 = r0.zza()
        L_0x007f:
            com.google.android.gms.internal.ads.zzcpq r0 = r6.zzb
            java.lang.String r3 = r9.zza
            com.google.android.gms.internal.ads.zzcrp r4 = new com.google.android.gms.internal.ads.zzcrp
            r4.<init>(r7, r8, r3)
            java.lang.Object r7 = r9.zzb
            com.google.android.gms.internal.ads.zzcot r3 = new com.google.android.gms.internal.ads.zzcot
            com.google.android.gms.internal.ads.zzfdh r7 = (com.google.android.gms.internal.ads.zzfdh) r7
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.zzeea r5 = new com.google.android.gms.internal.ads.zzeea
            r5.<init>(r7)
            java.util.List r7 = r8.zzu
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            com.google.android.gms.internal.ads.zzfbp r7 = (com.google.android.gms.internal.ads.zzfbp) r7
            r3.<init>(r2, r1, r5, r7)
            com.google.android.gms.internal.ads.zzcon r7 = r0.zza(r4, r3)
            com.google.android.gms.internal.ads.zzddm r8 = r7.zzg()
            r8.zza(r2)
            com.google.android.gms.internal.ads.zzcws r8 = r7.zzd()
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzcma r1 = new com.google.android.gms.internal.ads.zzcma
            com.google.android.gms.internal.ads.zzfdh r0 = (com.google.android.gms.internal.ads.zzfdh) r0
            r1.<init>(r0)
            java.util.concurrent.Executor r0 = r6.zzc
            r8.zzo(r1, r0)
            com.google.android.gms.internal.ads.zzcxd r8 = r9.zzc
            com.google.android.gms.internal.ads.zzees r8 = (com.google.android.gms.internal.ads.zzees) r8
            com.google.android.gms.internal.ads.zzeik r9 = r7.zzk()
            r8.zzc(r9)
            com.google.android.gms.internal.ads.zzcom r7 = r7.zza()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeeb.zza(com.google.android.gms.internal.ads.zzfca, com.google.android.gms.internal.ads.zzfbo, com.google.android.gms.internal.ads.zzecz):java.lang.Object");
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        zzs zza2;
        zzs zzs = zzfca.zza.zza.zze;
        if (zzs.zzn) {
            zza2 = new zzs(this.zza, zzc.zzd(zzs.zze, zzs.zzb));
        } else {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !zzfbo.zzag) {
                zza2 = zzfcp.zza(this.zza, zzfbo.zzu);
            } else {
                zza2 = new zzs(this.zza, zzc.zze(zzs.zze, zzs.zzb));
            }
        }
        zzs zzs2 = zza2;
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !zzfbo.zzag) {
            Object obj = zzecz.zzb;
            ((zzfdh) obj).zzm(this.zza, zzs2, zzfca.zza.zza.zzd, zzfbo.zzv.toString(), zzbs.zzm(zzfbo.zzs), (zzbpk) zzecz.zzc);
            return;
        }
        Object obj2 = zzecz.zzb;
        ((zzfdh) obj2).zzn(this.zza, zzs2, zzfca.zza.zza.zzd, zzfbo.zzv.toString(), zzbs.zzm(zzfbo.zzs), (zzbpk) zzecz.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(View view, zzfbo zzfbo, Object obj) throws Exception {
        return zzgch.zzh(zzcql.zza(this.zza, view, zzfbo));
    }
}
