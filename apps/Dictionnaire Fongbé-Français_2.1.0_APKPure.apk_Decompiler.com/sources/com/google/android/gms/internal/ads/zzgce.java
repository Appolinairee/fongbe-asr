package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgce implements Runnable {
    final Future zza;
    final zzgcd zzb;

    zzgce(Future future, zzgcd zzgcd) {
        this.zza = future;
        this.zzb = zzgcd;
    }

    public final void run() {
        Throwable zza2;
        Future future = this.zza;
        if (!(future instanceof zzgdl) || (zza2 = zzgdm.zza((zzgdl) future)) == null) {
            try {
                this.zzb.zzb(zzgch.zzp(this.zza));
            } catch (ExecutionException e) {
                this.zzb.zza(e.getCause());
            } catch (Throwable th) {
                this.zzb.zza(th);
            }
        } else {
            this.zzb.zza(zza2);
        }
    }

    public final String toString() {
        zzfuh zza2 = zzfuj.zza(this);
        zza2.zza(this.zzb);
        return zza2.toString();
    }
}
