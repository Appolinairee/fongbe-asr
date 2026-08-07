package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzawn extends zzaxr {
    private final Activity zzh;
    private final View zzi;

    public zzawn(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, View view, Activity activity) {
        super(zzawd, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", zzasc, i, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) zzbe.zzc().zza(zzbcl.zzcJ);
            boolean booleanValue = bool.booleanValue();
            Object[] objArr = (Object[]) this.zze.invoke((Object) null, new Object[]{this.zzi, this.zzh, bool});
            synchronized (this.zzd) {
                this.zzd.zzc(((Long) objArr[0]).longValue());
                this.zzd.zze(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.zzd.zzd((String) objArr[2]);
                }
            }
        }
    }
}
