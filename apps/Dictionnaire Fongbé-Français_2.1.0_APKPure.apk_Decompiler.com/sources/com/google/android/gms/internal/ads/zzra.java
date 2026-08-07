package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzra {
    public final int zza;
    public final zzug zzb;
    private final CopyOnWriteArrayList zzc;

    public zzra() {
        this(new CopyOnWriteArrayList(), 0, (zzug) null);
    }

    private zzra(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzug zzug) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzug;
    }

    public final zzra zza(int i, zzug zzug) {
        return new zzra(this.zzc, 0, zzug);
    }

    public final void zzb(Handler handler, zzrb zzrb) {
        this.zzc.add(new zzqz(handler, zzrb));
    }

    public final void zzc(zzrb zzrb) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzqz zzqz = (zzqz) it.next();
            if (zzqz.zza == zzrb) {
                this.zzc.remove(zzqz);
            }
        }
    }
}
