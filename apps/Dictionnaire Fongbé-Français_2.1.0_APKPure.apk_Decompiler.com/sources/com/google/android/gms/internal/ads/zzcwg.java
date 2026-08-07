package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcwg extends zzdbj implements zzcvx {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd = false;

    public zzcwg(zzcwf zzcwf, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzb = scheduledExecutorService;
        super.zzo(zzcwf, executor);
    }

    public final void zza(zze zze) {
        zzq(new zzcvy(zze));
    }

    public final void zzb() {
        zzq(new zzcvz());
    }

    public final void zzc(zzdgb zzdgb) {
        if (!this.zzd) {
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzq(new zzcwb(zzdgb));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            zzo.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdgb("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        int intValue = ((Integer) zzbe.zzc().zza(zzbcl.zzkB)).intValue();
        this.zzc = this.zzb.schedule(new zzcwa(this), (long) intValue, TimeUnit.MILLISECONDS);
    }
}
