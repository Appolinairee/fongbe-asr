package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzawp extends zzaxr {
    public zzawp(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2) {
        super(zzawd, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", zzasc, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzaa(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()})).booleanValue();
            zzasc zzasc = this.zzd;
            if (true == booleanValue) {
                i = 2;
            }
            zzasc.zzaa(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
