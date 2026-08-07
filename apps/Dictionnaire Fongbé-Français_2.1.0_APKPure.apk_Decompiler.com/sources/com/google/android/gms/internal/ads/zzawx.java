package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzawx extends zzaxr {
    private final zzawe zzh;

    public zzawx(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, zzawe zzawe) {
        super(zzawd, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", zzasc, i, 85);
        this.zzh = zzawe;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zze.invoke((Object) null, new Object[]{Long.valueOf(this.zzh.zzd()), Long.valueOf(this.zzh.zzh()), Long.valueOf(this.zzh.zzb()), Long.valueOf(this.zzh.zzf())});
        synchronized (this.zzd) {
            this.zzd.zzv(jArr[0]);
            this.zzd.zzu(jArr[1]);
        }
    }
}
