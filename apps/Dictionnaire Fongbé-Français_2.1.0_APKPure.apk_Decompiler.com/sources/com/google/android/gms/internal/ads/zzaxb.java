package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxb extends zzaxr {
    private final zzavv zzh;

    public zzaxb(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, zzavv zzavv) {
        super(zzawd, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", zzasc, i, 94);
        this.zzh = zzavv;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zze.invoke((Object) null, new Object[]{this.zzh.zza()})).intValue();
        synchronized (this.zzd) {
            this.zzd.zzae(zzasp.zza(intValue));
        }
    }
}
