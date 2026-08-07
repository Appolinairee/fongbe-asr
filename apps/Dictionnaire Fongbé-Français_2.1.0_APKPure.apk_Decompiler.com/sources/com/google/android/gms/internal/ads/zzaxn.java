package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxn extends zzaxr {
    public zzaxn(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2) {
        super(zzawd, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", zzasc, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzag(3);
        boolean booleanValue = ((Boolean) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()})).booleanValue();
        synchronized (this.zzd) {
            if (booleanValue) {
                this.zzd.zzag(2);
            } else {
                this.zzd.zzag(1);
            }
        }
    }
}
