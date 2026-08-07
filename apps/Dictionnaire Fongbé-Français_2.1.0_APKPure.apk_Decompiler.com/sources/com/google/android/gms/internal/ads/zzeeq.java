package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeeq implements zzecw {
    /* access modifiers changed from: private */
    public final zzcpq zza;
    private final zzedx zzb;
    private final zzgcs zzc;
    /* access modifiers changed from: private */
    public final zzcvv zzd;
    private final ScheduledExecutorService zze;
    private final zzdrq zzf;

    public zzeeq(zzcpq zzcpq, zzedx zzedx, zzcvv zzcvv, ScheduledExecutorService scheduledExecutorService, zzgcs zzgcs, zzdrq zzdrq) {
        this.zza = zzcpq;
        this.zzb = zzedx;
        this.zzd = zzcvv;
        this.zze = scheduledExecutorService;
        this.zzc = zzgcs;
        this.zzf = zzdrq;
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        return this.zzc.zzb(new zzeen(this, zzfca, zzfbo));
    }

    public final boolean zzb(zzfca zzfca, zzfbo zzfbo) {
        zzbhn zza2 = zzfca.zza.zza.zza();
        boolean zzb2 = this.zzb.zzb(zzfca, zzfbo);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlQ)).booleanValue()) {
            String str = "1";
            this.zzf.zzb().put("has_dbl", zza2 != null ? str : "0");
            zzdrq zzdrq = this.zzf;
            if (true != zzb2) {
                str = "0";
            }
            zzdrq.zzb().put("crdb", str);
        }
        if (zza2 == null || !zzb2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcom zzc(zzfca zzfca, zzfbo zzfbo) throws Exception {
        return this.zza.zzb(new zzcrp(zzfca, zzfbo, (String) null), new zzcqh(zzfca.zza.zza.zza(), new zzeeo(this, zzfca, zzfbo))).zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzfca zzfca, zzfbo zzfbo) {
        zzgch.zzr(zzgch.zzo(this.zzb.zza(zzfca, zzfbo), (long) zzfbo.zzR, TimeUnit.SECONDS, this.zze), new zzeep(this), this.zzc);
    }
}
