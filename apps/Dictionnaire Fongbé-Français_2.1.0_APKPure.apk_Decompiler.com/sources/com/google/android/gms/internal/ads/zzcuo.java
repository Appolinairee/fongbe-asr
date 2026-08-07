package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcuo implements zzcvt, zzdcx, zzdan, zzcwj, zzayk {
    /* access modifiers changed from: private */
    public final zzcwl zza;
    private final zzfbo zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzgdb zze = zzgdb.zze();
    private ScheduledFuture zzf;
    private final AtomicBoolean zzg = new AtomicBoolean();
    private final String zzh;

    zzcuo(zzcwl zzcwl, zzfbo zzfbo, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcwl;
        this.zzb = zzfbo;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    public final void zza() {
    }

    public final void zzb() {
    }

    public final void zzc() {
        zzfbo zzfbo = this.zzb;
        if (zzfbo.zze != 3) {
            int i = zzfbo.zzY;
            if (i == 0 || i == 1) {
                if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlp)).booleanValue() || !zzm()) {
                    this.zza.zza();
                }
            }
        }
    }

    public final void zzdn(zzayj zzayj) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlp)).booleanValue() && zzm() && zzayj.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    public final void zzdq(zzbvw zzbvw, String str, String str2) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        synchronized (this) {
            if (!this.zze.isDone()) {
                this.zze.zzc(true);
            }
        }
    }

    public final void zzi() {
    }

    public final synchronized void zzj() {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzc(true);
        }
    }

    public final void zzk() {
        if (this.zzb.zze != 3) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzbE)).booleanValue()) {
                zzfbo zzfbo = this.zzb;
                if (zzfbo.zzY != 2) {
                    return;
                }
                if (zzfbo.zzq == 0) {
                    this.zza.zza();
                    return;
                }
                zzgch.zzr(this.zze, new zzcun(this), this.zzd);
                this.zzf = this.zzc.schedule(new zzcum(this), (long) this.zzb.zzq, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void zzl() {
    }

    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze zze2) {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzd(new Exception());
        }
    }
}
