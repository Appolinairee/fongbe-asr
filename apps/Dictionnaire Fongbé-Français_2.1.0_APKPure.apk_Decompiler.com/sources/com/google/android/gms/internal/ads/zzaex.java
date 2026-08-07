package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
abstract class zzaex {
    protected final zzadt zza;

    protected zzaex(zzadt zzadt) {
        this.zza = zzadt;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zza(zzdy zzdy) throws zzbc;

    /* access modifiers changed from: protected */
    public abstract boolean zzb(zzdy zzdy, long j) throws zzbc;

    public final boolean zzf(zzdy zzdy, long j) throws zzbc {
        return zza(zzdy) && zzb(zzdy, j);
    }
}
