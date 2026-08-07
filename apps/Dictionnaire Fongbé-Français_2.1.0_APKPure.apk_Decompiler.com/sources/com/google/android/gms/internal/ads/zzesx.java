package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesx implements zzetr {
    public static final /* synthetic */ int zzb = 0;
    private static final zzesy zzc = new zzesy(new JSONArray().toString(), new Bundle());
    final String zza;
    private final zzgcs zzd;
    private final ScheduledExecutorService zze;
    private final zzejj zzf;
    private final Context zzg;
    private final zzfcj zzh;
    private final zzejf zzi;
    private final zzdpm zzj;
    private final zzduc zzk;
    private final int zzl;

    zzesx(zzgcs zzgcs, ScheduledExecutorService scheduledExecutorService, String str, zzejj zzejj, Context context, zzfcj zzfcj, zzejf zzejf, zzdpm zzdpm, zzduc zzduc, int i) {
        this.zzd = zzgcs;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzejj;
        this.zzg = context;
        this.zzh = zzfcj;
        this.zzi = zzejf;
        this.zzj = zzdpm;
        this.zzk = zzduc;
        this.zzl = i;
    }

    public static /* synthetic */ ListenableFuture zzc(zzesx zzesx) {
        String str;
        Bundle bundle;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkM)).booleanValue()) {
            str = zzesx.zzh.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzesx.zzh.zzf;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbL)).booleanValue()) {
            bundle = zzesx.zzk.zzg();
        } else {
            bundle = new Bundle();
        }
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzbU)).booleanValue()) {
            for (Map.Entry entry : ((zzfxq) zzesx.zzf.zzb(zzesx.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzesx.zzg(str2, (List) entry.getValue(), zzesx.zzf(str2), true, true));
            }
            zzesx.zzi(arrayList, zzesx.zzf.zzc());
        } else {
            zzesx.zzi(arrayList, zzesx.zzf.zza(zzesx.zza, str));
        }
        return zzgch.zzb(arrayList).zza(new zzess(arrayList, bundle), zzesx.zzd);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgby zzg(String str, List list, Bundle bundle, boolean z, boolean z2) {
        zzgby zzu = zzgby.zzu(zzgch.zzk(new zzesu(this, str, list, bundle, z, z2), this.zzd));
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzbH)).booleanValue()) {
            zzu = (zzgby) zzgch.zzo(zzu, ((Long) zzbe.zzc().zza(zzbcl.zzbA)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgby) zzgch.zze(zzu, Throwable.class, new zzesv(str), this.zzd);
    }

    private final void zzh(zzbrd zzbrd, Bundle bundle, List list, zzejm zzejm) throws RemoteException {
        zzbrd zzbrd2 = zzbrd;
        zzbrd2.zzh(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zze, zzejm);
    }

    private final void zzi(List list, Map map) {
        for (Map.Entry value : map.entrySet()) {
            zzejn zzejn = (zzejn) value.getValue();
            String str = zzejn.zza;
            list.add(zzg(str, Collections.singletonList(zzejn.zze), zzf(str), zzejn.zzb, zzejn.zzc));
        }
    }

    public final int zza() {
        return 32;
    }

    public final ListenableFuture zzb() {
        if (this.zzl == 2) {
            return zzgch.zzh(zzc);
        }
        zzfcj zzfcj = this.zzh;
        if (zzfcj.zzr) {
            if (!Arrays.asList(((String) zzbe.zzc().zza(zzbcl.zzbN)).split(",")).contains(zzaa.zzb(zzaa.zzc(zzfcj.zzd)))) {
                return zzgch.zzh(zzc);
            }
        }
        return zzgch.zzk(new zzesr(this), this.zzd);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String r9, java.util.List r10, android.os.Bundle r11, boolean r12, boolean r13) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzcab r7 = new com.google.android.gms.internal.ads.zzcab
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzbcc r13 = com.google.android.gms.internal.ads.zzbcl.zzbM
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzejf r13 = r8.zzi
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzejf r13 = r8.zzi
            com.google.android.gms.internal.ads.zzbrd r13 = r13.zza(r9)
            goto L_0x0034
        L_0x0026:
            com.google.android.gms.internal.ads.zzdpm r13 = r8.zzj     // Catch:{ RemoteException -> 0x002d }
            com.google.android.gms.internal.ads.zzbrd r13 = r13.zzb(r9)     // Catch:{ RemoteException -> 0x002d }
            goto L_0x0034
        L_0x002d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r13)
            r13 = r0
        L_0x0034:
            if (r13 != 0) goto L_0x004e
            com.google.android.gms.internal.ads.zzbcc r10 = com.google.android.gms.internal.ads.zzbcl.zzbC
            com.google.android.gms.internal.ads.zzbcj r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r10 = r11.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzejm.zzb(r9, r7)
            goto L_0x00ba
        L_0x004d:
            throw r0
        L_0x004e:
            com.google.android.gms.internal.ads.zzejm r6 = new com.google.android.gms.internal.ads.zzejm
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zzbH
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x008d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zze
            com.google.android.gms.internal.ads.zzesw r0 = new com.google.android.gms.internal.ads.zzesw
            r0.<init>(r6)
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzbA
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L_0x008d:
            if (r12 == 0) goto L_0x00b7
            com.google.android.gms.internal.ads.zzbcc r9 = com.google.android.gms.internal.ads.zzbcl.zzbO
            com.google.android.gms.internal.ads.zzbcj r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r12.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.zzgcs r9 = r8.zzd
            com.google.android.gms.internal.ads.zzest r12 = new com.google.android.gms.internal.ads.zzest
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.zza(r12)
            goto L_0x00ba
        L_0x00b3:
            r8.zzh(r13, r11, r10, r6)
            goto L_0x00ba
        L_0x00b7:
            r6.zzd()
        L_0x00ba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesx.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbrd zzbrd, Bundle bundle, List list, zzejm zzejm, zzcab zzcab) {
        try {
            zzh(zzbrd, bundle, list, zzejm);
        } catch (RemoteException e) {
            zzcab.zzd(e);
        }
    }
}
