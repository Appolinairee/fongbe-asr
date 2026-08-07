package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeiu implements zzecw {
    private final zzbdg zza;
    private final zzgcs zzb;
    private final zzfgn zzc;
    /* access modifiers changed from: private */
    public final zzejd zzd;

    public zzeiu(zzfgn zzfgn, zzgcs zzgcs, zzbdg zzbdg, zzejd zzejd) {
        this.zzc = zzfgn;
        this.zzb = zzgcs;
        this.zza = zzbdg;
        this.zzd = zzejd;
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        zzcab zzcab = new zzcab();
        zzeiz zzeiz = new zzeiz();
        zzeiz.zzd(new zzeit(this, zzcab, zzfca, zzfbo, zzeiz));
        zzfbt zzfbt = zzfbo.zzs;
        zzbdb zzbdb = new zzbdb(zzeiz, zzfbt.zzb, zzfbt.zza);
        zzfgh zzfgh = zzfgh.CUSTOM_RENDER_SYN;
        return zzffx.zzd(new zzeis(this, zzbdb), this.zzb, zzfgh, this.zzc).zzb(zzfgh.CUSTOM_RENDER_ACK).zzd(zzcab).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzs;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca r1, com.google.android.gms.internal.ads.zzfbo r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbdg r1 = r0.zza
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzfbt r1 = r2.zzs
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiu.zzb(com.google.android.gms.internal.ads.zzfca, com.google.android.gms.internal.ads.zzfbo):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbdb zzbdb) throws Exception {
        this.zza.zze(zzbdb);
    }
}
