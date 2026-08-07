package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzecp {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfbo zzc;
    private final zzcex zzd;
    private final zzdrw zze;
    private zzfla zzf;

    zzecp(Context context, VersionInfoParcel versionInfoParcel, zzfbo zzfbo, zzcex zzcex, zzdrw zzdrw) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfbo;
        this.zzd = zzcex;
        this.zze = zzdrw;
    }

    public final synchronized void zza(View view) {
        zzfla zzfla = this.zzf;
        if (zzfla != null) {
            zzv.zzB().zzh(zzfla, view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzfla r0 = r3.zzf     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzcex r0 = r3.zzd     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = "onSdkImpression"
            com.google.android.gms.internal.ads.zzfxq r2 = com.google.android.gms.internal.ads.zzfxq.zzd()     // Catch:{ all -> 0x0016 }
            r0.zzd(r1, r2)     // Catch:{ all -> 0x0016 }
            monitor-exit(r3)
            return
        L_0x0014:
            monitor-exit(r3)
            return
        L_0x0016:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0016 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecp.zzb():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzc() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzfla r0 = r4.zzf     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzcex r1 = r4.zzd     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0032
            java.util.List r1 = r1.zzV()     // Catch:{ all -> 0x0034 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0011:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0034 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0034 }
            com.google.android.gms.internal.ads.zzecm r3 = com.google.android.gms.ads.internal.zzv.zzB()     // Catch:{ all -> 0x0034 }
            r3.zzh(r0, r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0011
        L_0x0025:
            com.google.android.gms.internal.ads.zzcex r0 = r4.zzd     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "onSdkLoaded"
            com.google.android.gms.internal.ads.zzfxq r2 = com.google.android.gms.internal.ads.zzfxq.zzd()     // Catch:{ all -> 0x0034 }
            r0.zzd(r1, r2)     // Catch:{ all -> 0x0034 }
            monitor-exit(r4)
            return
        L_0x0032:
            monitor-exit(r4)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0034 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecp.zzc():void");
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zze(boolean r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzfbo r6 = r5.zzc     // Catch:{ all -> 0x00ab }
            boolean r6 = r6.zzT     // Catch:{ all -> 0x00ab }
            r0 = 0
            if (r6 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzfc     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00ab }
            java.lang.Object r6 = r1.zza(r6)     // Catch:{ all -> 0x00ab }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x00ab }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzff     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00ab }
            java.lang.Object r6 = r1.zza(r6)     // Catch:{ all -> 0x00ab }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x00ab }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzcex r6 = r5.zzd     // Catch:{ all -> 0x00ab }
            if (r6 != 0) goto L_0x0032
            goto L_0x00a9
        L_0x0032:
            com.google.android.gms.internal.ads.zzfla r6 = r5.zzf     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x003d
            java.lang.String r6 = "Omid javascript session service already started for ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r6)     // Catch:{ all -> 0x00ab }
            monitor-exit(r5)
            return r0
        L_0x003d:
            android.content.Context r6 = r5.zza     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zzecm r1 = com.google.android.gms.ads.internal.zzv.zzB()     // Catch:{ all -> 0x00ab }
            boolean r6 = r1.zzl(r6)     // Catch:{ all -> 0x00ab }
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = "Unable to initialize omid."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r6)     // Catch:{ all -> 0x00ab }
            monitor-exit(r5)
            return r0
        L_0x0050:
            com.google.android.gms.internal.ads.zzfbo r6 = r5.zzc     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zzfcm r6 = r6.zzV     // Catch:{ all -> 0x00ab }
            boolean r6 = r6.zzb()     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x00a9
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = r5.zzb     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zzcex r1 = r5.zzd     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zzecm r2 = com.google.android.gms.ads.internal.zzv.zzB()     // Catch:{ all -> 0x00ab }
            android.webkit.WebView r1 = r1.zzG()     // Catch:{ all -> 0x00ab }
            r3 = 1
            com.google.android.gms.internal.ads.zzfla r6 = r2.zze(r6, r1, r3)     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzfg     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r2.zza(r1)     // Catch:{ all -> 0x00ab }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00ab }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x0092
            com.google.android.gms.internal.ads.zzdrw r1 = r5.zze     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x0084
            java.lang.String r2 = "1"
            goto L_0x0086
        L_0x0084:
            java.lang.String r2 = "0"
        L_0x0086:
            com.google.android.gms.internal.ads.zzdrv r1 = r1.zza()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "omid_js_session_success"
            r1.zzb(r4, r2)     // Catch:{ all -> 0x00ab }
            r1.zzg()     // Catch:{ all -> 0x00ab }
        L_0x0092:
            if (r6 != 0) goto L_0x009b
            java.lang.String r6 = "Unable to create javascript session service."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r6)     // Catch:{ all -> 0x00ab }
            monitor-exit(r5)
            return r0
        L_0x009b:
            java.lang.String r0 = "Created omid javascript session service."
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r0)     // Catch:{ all -> 0x00ab }
            r5.zzf = r6     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zzcex r6 = r5.zzd     // Catch:{ all -> 0x00ab }
            r6.zzas(r5)     // Catch:{ all -> 0x00ab }
            monitor-exit(r5)
            return r3
        L_0x00a9:
            monitor-exit(r5)
            return r0
        L_0x00ab:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ab }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecp.zze(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzf(com.google.android.gms.internal.ads.zzcfo r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfla r0 = r2.zzf     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzcex r1 = r2.zzd     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzecm r1 = com.google.android.gms.ads.internal.zzv.zzB()     // Catch:{ all -> 0x001c }
            r1.zzm(r0, r3)     // Catch:{ all -> 0x001c }
            r3 = 0
            r2.zzf = r3     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.ads.zzcex r0 = r2.zzd     // Catch:{ all -> 0x001c }
            r0.zzas(r3)     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001a:
            monitor-exit(r2)
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecp.zzf(com.google.android.gms.internal.ads.zzcfo):void");
    }
}
