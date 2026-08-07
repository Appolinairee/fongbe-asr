package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaoy extends Thread {
    private static final boolean zza = zzapy.zzb;
    private final BlockingQueue zzb;
    /* access modifiers changed from: private */
    public final BlockingQueue zzc;
    private final zzaow zzd;
    private volatile boolean zze = false;
    private final zzapz zzf;
    private final zzapd zzg;

    public zzaoy(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaow zzaow, zzapd zzapd) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaow;
        this.zzg = zzapd;
        this.zzf = new zzapz(this, blockingQueue2, zzapd);
    }

    private void zzc() throws InterruptedException {
        zzapm zzapm = (zzapm) this.zzb.take();
        zzapm.zzm("cache-queue-take");
        zzapm.zzt(1);
        try {
            zzapm.zzw();
            zzaov zza2 = this.zzd.zza(zzapm.zzj());
            if (zza2 == null) {
                zzapm.zzm("cache-miss");
                if (!this.zzf.zzc(zzapm)) {
                    this.zzc.put(zzapm);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzapm.zzm("cache-hit-expired");
                    zzapm.zze(zza2);
                    if (!this.zzf.zzc(zzapm)) {
                        this.zzc.put(zzapm);
                    }
                } else {
                    zzapm.zzm("cache-hit");
                    zzaps zzh = zzapm.zzh(new zzapi(zza2.zza, zza2.zzg));
                    zzapm.zzm("cache-hit-parsed");
                    if (!zzh.zzc()) {
                        zzapm.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzapm.zzj(), true);
                        zzapm.zze((zzaov) null);
                        if (!this.zzf.zzc(zzapm)) {
                            this.zzc.put(zzapm);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzapm.zzm("cache-hit-refresh-needed");
                        zzapm.zze(zza2);
                        zzh.zzd = true;
                        if (!this.zzf.zzc(zzapm)) {
                            this.zzg.zzb(zzapm, zzh, new zzaox(this, zzapm));
                        } else {
                            this.zzg.zzb(zzapm, zzh, (Runnable) null);
                        }
                    } else {
                        this.zzg.zzb(zzapm, zzh, (Runnable) null);
                    }
                }
            }
        } finally {
            zzapm.zzt(2);
        }
    }

    public final void run() {
        if (zza) {
            zzapy.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapy.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
