package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaps {
    public final Object zza;
    public final zzaov zzb;
    public final zzapv zzc;
    public boolean zzd;

    private zzaps(zzapv zzapv) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzapv;
    }

    private zzaps(Object obj, zzaov zzaov) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaov;
        this.zzc = null;
    }

    public static zzaps zza(zzapv zzapv) {
        return new zzaps(zzapv);
    }

    public static zzaps zzb(Object obj, zzaov zzaov) {
        return new zzaps(obj, zzaov);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
