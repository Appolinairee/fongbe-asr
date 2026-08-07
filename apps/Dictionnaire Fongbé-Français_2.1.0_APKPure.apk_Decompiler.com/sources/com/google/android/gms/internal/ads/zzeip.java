package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeip implements zzecw {
    private final Context zza;
    private final zzcpq zzb;
    private final zzbdg zzc;
    private final zzgcs zzd;
    private final zzfgn zze;

    public zzeip(Context context, zzcpq zzcpq, zzfgn zzfgn, zzgcs zzgcs, zzbdg zzbdg) {
        this.zza = context;
        this.zzb = zzcpq;
        this.zze = zzfgn;
        this.zzd = zzgcs;
        this.zzc = zzbdg;
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        zzein zzein = new zzein(this, new View(this.zza), (zzcex) null, new zzeil(), (zzfbp) zzfbo.zzu.get(0));
        zzcon zza2 = this.zzb.zza(new zzcrp(zzfca, zzfbo, (String) null), zzein);
        zzeio zzl = zza2.zzl();
        zzfbt zzfbt = zzfbo.zzs;
        zzbdb zzbdb = new zzbdb(zzl, zzfbt.zzb, zzfbt.zza);
        zzfgh zzfgh = zzfgh.CUSTOM_RENDER_SYN;
        return zzffx.zzd(new zzeim(this, zzbdb), this.zzd, zzfgh, this.zze).zzb(zzfgh.CUSTOM_RENDER_ACK).zzd(zzgch.zzh(zza2.zza())).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzs;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca r1, com.google.android.gms.internal.ads.zzfbo r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbdg r1 = r0.zzc
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeip.zzb(com.google.android.gms.internal.ads.zzfca, com.google.android.gms.internal.ads.zzfbo):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbdb zzbdb) throws Exception {
        this.zzc.zze(zzbdb);
    }
}
