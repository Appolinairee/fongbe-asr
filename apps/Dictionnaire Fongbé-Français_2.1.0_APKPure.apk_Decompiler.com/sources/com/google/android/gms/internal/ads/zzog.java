package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzog {
    public final String zza;
    private final zzof zzb;
    private final Object zzc;

    static {
        if (zzei.zza < 31) {
            new zzog("");
        } else {
            int i = zzof.zzb;
        }
    }

    public zzog(LogSessionId logSessionId, String str) {
        this.zzb = new zzof(logSessionId);
        this.zza = str;
        this.zzc = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzog)) {
            return false;
        }
        zzog zzog = (zzog) obj;
        return Objects.equals(this.zza, zzog.zza) && Objects.equals(this.zzb, zzog.zzb) && Objects.equals(this.zzc, zzog.zzc);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public zzog(String str) {
        zzcw.zzf(zzei.zza < 31);
        this.zza = str;
        this.zzb = null;
        this.zzc = new Object();
    }

    public final LogSessionId zza() {
        zzof zzof = this.zzb;
        zzof.getClass();
        zzof zzof2 = zzof;
        return zzof.zza;
    }
}
