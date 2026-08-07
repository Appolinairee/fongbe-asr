package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzlf {
    private final zzle zza;
    private final zzld zzb;
    private final zzbq zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzlf(zzld zzld, zzle zzle, zzbq zzbq, int i, zzcx zzcx, Looper looper) {
        this.zzb = zzld;
        this.zza = zzle;
        this.zzc = zzbq;
        this.zzf = looper;
        this.zzg = i;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzle zzc() {
        return this.zza;
    }

    public final zzlf zzd() {
        zzcw.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzlf zze(Object obj) {
        zzcw.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzlf zzf(int i) {
        zzcw.zzf(!this.zzh);
        this.zzd = i;
        return this;
    }

    public final Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z) {
        this.zzi = z | this.zzi;
        notifyAll();
    }

    public final synchronized boolean zzi() {
        return false;
    }
}
