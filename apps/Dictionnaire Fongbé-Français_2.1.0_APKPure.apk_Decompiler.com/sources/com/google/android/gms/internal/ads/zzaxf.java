package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxf extends zzaxr {
    public zzaxf(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2) {
        super(zzawd, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", zzasc, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) zzbe.zzc().zza(zzbcl.zzcV);
        bool.booleanValue();
        zzavj zzavj = new zzavj((String) this.zze.invoke((Object) null, new Object[]{this.zza.zzb(), bool}));
        synchronized (this.zzd) {
            this.zzd.zzj(zzavj.zza);
            this.zzd.zzC(zzavj.zzb);
        }
    }
}
