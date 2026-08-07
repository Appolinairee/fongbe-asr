package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxh extends zzaxr {
    private List zzh = null;
    private final Context zzi;

    public zzaxh(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, Context context) {
        super(zzawd, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", zzasc, i, 31);
        this.zzi = context;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzW(-1);
        this.zzd.zzS(-1);
        Context context = this.zzi;
        if (context == null) {
            context = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke((Object) null, new Object[]{context});
        }
        List list = this.zzh;
        if (list != null && list.size() == 2) {
            synchronized (this.zzd) {
                this.zzd.zzW(((Long) this.zzh.get(0)).longValue());
                this.zzd.zzS(((Long) this.zzh.get(1)).longValue());
            }
        }
    }
}
