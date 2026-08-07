package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzfvj {
    public static zzfvf zza(zzfvf zzfvf) {
        if ((zzfvf instanceof zzfvi) || (zzfvf instanceof zzfvg)) {
            return zzfvf;
        }
        if (zzfvf instanceof Serializable) {
            return new zzfvg(zzfvf);
        }
        return new zzfvi(zzfvf);
    }
}
