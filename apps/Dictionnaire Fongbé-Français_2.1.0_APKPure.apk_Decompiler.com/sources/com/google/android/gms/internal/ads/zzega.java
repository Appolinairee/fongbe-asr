package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzega {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcrc zzc;
    private final zzegq zzd;
    private final zzfiv zze;
    private final zzgdb zzf = zzgdb.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    /* access modifiers changed from: private */
    public zzegb zzh;
    private zzfca zzi;

    zzega(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcrc zzcrc, zzegq zzegq, zzfiv zzfiv) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcrc;
        this.zzd = zzegq;
        this.zze = zzfiv;
    }

    private final synchronized ListenableFuture zzd(zzfbo zzfbo) {
        for (String zza2 : zzfbo.zza) {
            zzecw zza3 = this.zzc.zza(zzfbo.zzb, zza2);
            if (zza3 != null && zza3.zzb(this.zzi, zzfbo)) {
                ListenableFuture zza4 = zza3.zza(this.zzi, zzfbo);
                int i = zzfbo.zzR;
                return zzgch.zzo(zza4, (long) i, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgch.zzg(new zzdvy(3));
    }

    /* access modifiers changed from: private */
    public final void zze(zzfbo zzfbo) {
        ListenableFuture zzd2 = zzd(zzfbo);
        this.zzd.zzf(this.zzi, zzfbo, zzd2, this.zze);
        zzgch.zzr(zzd2, new zzefz(this, zzfbo), this.zza);
    }

    public final synchronized ListenableFuture zzb(zzfca zzfca) {
        if (!this.zzg.getAndSet(true)) {
            if (zzfca.zzb.zza.isEmpty()) {
                this.zzf.zzd(new zzegu(3, zzegx.zzc(zzfca)));
            } else {
                this.zzi = zzfca;
                this.zzh = new zzegb(zzfca, this.zzd, this.zzf);
                this.zzd.zzk(zzfca.zzb.zza);
                zzfbo zza2 = this.zzh.zza();
                while (zza2 != null) {
                    zze(zza2);
                    zza2 = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }
}
