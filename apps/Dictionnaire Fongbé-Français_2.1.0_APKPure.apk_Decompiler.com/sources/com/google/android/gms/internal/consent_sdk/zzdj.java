package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzdj implements zzdn {
    private static final Object zza = new Object();
    private volatile zzdn zzb;
    private volatile Object zzc = zza;

    private zzdj(zzdn zzdn) {
        this.zzb = zzdn;
    }

    public static zzdn zzb(zzdn zzdn) {
        return zzdn instanceof zzdj ? zzdn : new zzdj(zzdn);
    }

    private final synchronized Object zzc() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        Object zza2 = this.zzb.zza();
        Object obj3 = this.zzc;
        if (obj3 != obj2) {
            if (obj3 != zza2) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zza2 + ". This is likely due to a circular dependency.");
            }
        }
        this.zzc = zza2;
        this.zzb = null;
        return zza2;
    }

    public final Object zza() {
        Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }
}
