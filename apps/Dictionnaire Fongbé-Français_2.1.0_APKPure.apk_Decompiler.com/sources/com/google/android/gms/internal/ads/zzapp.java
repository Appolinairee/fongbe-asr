package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzapp {
    private final AtomicInteger zza = new AtomicInteger();
    private final Set zzb = new HashSet();
    private final PriorityBlockingQueue zzc = new PriorityBlockingQueue();
    private final PriorityBlockingQueue zzd = new PriorityBlockingQueue();
    private final zzaow zze;
    private final zzapf zzf;
    private final zzapg[] zzg;
    private zzaoy zzh;
    private final List zzi = new ArrayList();
    private final List zzj = new ArrayList();
    private final zzapd zzk;

    public zzapp(zzaow zzaow, zzapf zzapf, int i) {
        zzapd zzapd = new zzapd(new Handler(Looper.getMainLooper()));
        this.zze = zzaow;
        this.zzf = zzapf;
        this.zzg = new zzapg[4];
        this.zzk = zzapd;
    }

    public final zzapm zza(zzapm zzapm) {
        zzapm.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzapm);
        }
        zzapm.zzg(this.zza.incrementAndGet());
        zzapm.zzm("add-to-queue");
        zzc(zzapm, 0);
        this.zzc.add(zzapm);
        return zzapm;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzapm zzapm) {
        synchronized (this.zzb) {
            this.zzb.remove(zzapm);
        }
        synchronized (this.zzi) {
            for (zzapo zza2 : this.zzi) {
                zza2.zza();
            }
        }
        zzc(zzapm, 5);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(zzapm zzapm, int i) {
        synchronized (this.zzj) {
            for (zzapn zza2 : this.zzj) {
                zza2.zza();
            }
        }
    }

    public final void zzd() {
        zzaoy zzaoy = this.zzh;
        if (zzaoy != null) {
            zzaoy.zzb();
        }
        zzapg[] zzapgArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzapg zzapg = zzapgArr[i];
            if (zzapg != null) {
                zzapg.zza();
            }
        }
        zzaoy zzaoy2 = new zzaoy(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaoy2;
        zzaoy2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzapg zzapg2 = new zzapg(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i2] = zzapg2;
            zzapg2.start();
        }
    }
}
