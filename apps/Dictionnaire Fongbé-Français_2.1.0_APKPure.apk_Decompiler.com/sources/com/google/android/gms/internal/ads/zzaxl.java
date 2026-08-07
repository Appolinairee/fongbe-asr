package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxl extends zzaxr {
    private final zzawk zzh;
    private long zzi;

    public zzaxl(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, zzawk zzawk) {
        super(zzawd, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", zzasc, i, 53);
        this.zzh = zzawk;
        if (zzawk != null) {
            this.zzi = zzawk.zza();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzP(((Long) this.zze.invoke((Object) null, new Object[]{Long.valueOf(this.zzi)})).longValue());
        }
    }
}
