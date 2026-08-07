package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxj extends zzaxr {
    private final StackTraceElement[] zzh;

    public zzaxj(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzawd, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", zzasc, i, 45);
        this.zzh = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.zzh;
        if (obj != null) {
            int i = 1;
            zzavu zzavu = new zzavu((String) this.zze.invoke((Object) null, new Object[]{obj}));
            synchronized (this.zzd) {
                this.zzd.zzF(zzavu.zza.longValue());
                if (zzavu.zzb.booleanValue()) {
                    zzasc zzasc = this.zzd;
                    if (true != zzavu.zzc.booleanValue()) {
                        i = 2;
                    }
                    zzasc.zzac(i);
                } else {
                    this.zzd.zzac(3);
                }
            }
        }
    }
}
