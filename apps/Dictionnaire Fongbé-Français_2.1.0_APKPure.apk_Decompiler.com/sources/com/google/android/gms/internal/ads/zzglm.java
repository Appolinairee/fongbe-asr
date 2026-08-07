package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzglm {
    private HashMap zza = new HashMap();

    public final zzglo zza() {
        if (this.zza != null) {
            zzglo zzglo = new zzglo(Collections.unmodifiableMap(this.zza), (zzgln) null);
            this.zza = null;
            return zzglo;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
