package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzapg extends Thread {
    private final BlockingQueue zza;
    private final zzapf zzb;
    private final zzaow zzc;
    private volatile boolean zzd = false;
    private final zzapd zze;

    public zzapg(BlockingQueue blockingQueue, zzapf zzapf, zzaow zzaow, zzapd zzapd) {
        this.zza = blockingQueue;
        this.zzb = zzapf;
        this.zzc = zzaow;
        this.zze = zzapd;
    }

    private void zzb() throws InterruptedException {
        zzapm zzapm = (zzapm) this.zza.take();
        SystemClock.elapsedRealtime();
        zzapm.zzt(3);
        try {
            zzapm.zzm("network-queue-take");
            zzapm.zzw();
            TrafficStats.setThreadStatsTag(zzapm.zzc());
            zzapi zza2 = this.zzb.zza(zzapm);
            zzapm.zzm("network-http-complete");
            if (!zza2.zze || !zzapm.zzv()) {
                zzaps zzh = zzapm.zzh(zza2);
                zzapm.zzm("network-parse-complete");
                if (zzh.zzb != null) {
                    this.zzc.zzd(zzapm.zzj(), zzh.zzb);
                    zzapm.zzm("network-cache-written");
                }
                zzapm.zzq();
                this.zze.zzb(zzapm, zzh, (Runnable) null);
                zzapm.zzs(zzh);
                zzapm.zzt(4);
            }
            zzapm.zzp("not-modified");
            zzapm.zzr();
            zzapm.zzt(4);
        } catch (zzapv e) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzapm, e);
            zzapm.zzr();
        } catch (Exception e2) {
            zzapy.zzc(e2, "Unhandled exception %s", e2.toString());
            zzapv zzapv = new zzapv((Throwable) e2);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzapm, zzapv);
            zzapm.zzr();
        } catch (Throwable th) {
            zzapm.zzt(4);
            throw th;
        }
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapy.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
