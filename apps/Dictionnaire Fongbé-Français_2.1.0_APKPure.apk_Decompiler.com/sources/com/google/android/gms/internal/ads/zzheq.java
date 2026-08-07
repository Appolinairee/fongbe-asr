package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzheq implements zzhfa, zzhel {
    private static final Object zza = new Object();
    private volatile zzhfa zzb;
    private volatile Object zzc = zza;

    private zzheq(zzhfa zzhfa) {
        this.zzb = zzhfa;
    }

    public static zzhel zza(zzhfa zzhfa) {
        if (zzhfa instanceof zzhel) {
            return (zzhel) zzhfa;
        }
        zzhfa zzhfa2 = zzhfa;
        return new zzheq(zzhfa);
    }

    public static zzhfa zzc(zzhfa zzhfa) {
        return zzhfa instanceof zzheq ? zzhfa : new zzheq(zzhfa);
    }

    private final synchronized Object zzd() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        Object zzb2 = this.zzb.zzb();
        Object obj3 = this.zzc;
        if (obj3 != obj2) {
            if (obj3 != zzb2) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb2 + ". This is likely due to a circular dependency.");
            }
        }
        this.zzc = zzb2;
        this.zzb = null;
        return zzb2;
    }

    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
