package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxi extends zzaxr {
    private final boolean zzh;

    public zzaxi(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2) {
        super(zzawd, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", zzasc, i, 61);
        this.zzh = zzawd.zzs();
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke((Object) null, new Object[]{this.zza.zzb(), Boolean.valueOf(this.zzh)})).longValue();
        synchronized (this.zzd) {
            this.zzd.zzE(longValue);
        }
    }
}
