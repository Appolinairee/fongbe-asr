package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzawu extends zzaxr {
    private final long zzh;

    public zzawu(zzawd zzawd, String str, String str2, zzasc zzasc, long j, int i, int i2) {
        super(zzawd, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", zzasc, i, 25);
        this.zzh = j;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke((Object) null, (Object[]) null)).longValue();
        synchronized (this.zzd) {
            this.zzd.zzt(longValue);
            long j = this.zzh;
            if (j != 0) {
                this.zzd.zzT(longValue - j);
                this.zzd.zzU(this.zzh);
            }
        }
    }
}
