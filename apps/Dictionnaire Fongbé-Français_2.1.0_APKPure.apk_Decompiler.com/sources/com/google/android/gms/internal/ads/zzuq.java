package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzuq {
    public final int zza;
    public final zzug zzb;
    private final CopyOnWriteArrayList zzc;

    public zzuq() {
        this(new CopyOnWriteArrayList(), 0, (zzug) null);
    }

    private zzuq(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzug zzug) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzug;
    }

    public final zzuq zza(int i, zzug zzug) {
        return new zzuq(this.zzc, 0, zzug);
    }

    public final void zzb(Handler handler, zzur zzur) {
        this.zzc.add(new zzup(handler, zzur));
    }

    public final void zzc(zzdb zzdb) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzup zzup = (zzup) it.next();
            zzur zzur = zzup.zzb;
            Handler handler = zzup.zza;
            zzuo zzuo = new zzuo(zzdb, zzur);
            int i = zzei.zza;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    zzuo.run();
                } else {
                    handler.post(zzuo);
                }
            }
        }
    }

    public final void zzd(zzuc zzuc) {
        zzc(new zzuj(this, zzuc));
    }

    public final void zze(zztx zztx, zzuc zzuc) {
        zzc(new zzun(this, zztx, zzuc));
    }

    public final void zzf(zztx zztx, zzuc zzuc) {
        zzc(new zzul(this, zztx, zzuc));
    }

    public final void zzg(zztx zztx, zzuc zzuc, IOException iOException, boolean z) {
        zzc(new zzum(this, zztx, zzuc, iOException, z));
    }

    public final void zzh(zztx zztx, zzuc zzuc) {
        zzc(new zzuk(this, zztx, zzuc));
    }

    public final void zzi(zzur zzur) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzup zzup = (zzup) it.next();
            if (zzup.zzb == zzur) {
                this.zzc.remove(zzup);
            }
        }
    }
}
