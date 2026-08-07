package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgdc implements Runnable {
    @CheckForNull
    zzgdf zza;

    zzgdc(zzgdf zzgdf) {
        this.zza = zzgdf;
    }

    public final void run() {
        ListenableFuture zze;
        String str;
        zzgdf zzgdf = this.zza;
        if (zzgdf != null && (zze = zzgdf.zza) != null) {
            this.zza = null;
            if (zze.isDone()) {
                zzgdf.zzs(zze);
                return;
            }
            try {
                ScheduledFuture zzv = zzgdf.zzb;
                zzgdf.zzb = null;
                str = "Timed out";
                if (zzv != null) {
                    long abs = Math.abs(zzv.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                zzgdf.zzd(new zzgdd(str + ": " + zze.toString(), (zzgde) null));
                zze.cancel(true);
            } catch (Throwable th) {
                zze.cancel(true);
                throw th;
            }
        }
    }
}
