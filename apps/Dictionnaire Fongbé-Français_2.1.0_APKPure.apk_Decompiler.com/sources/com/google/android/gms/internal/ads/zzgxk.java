package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgxk implements zzgza {
    private static final zzgxk zza = new zzgxk();

    private zzgxk() {
    }

    public static zzgxk zza() {
        return zza;
    }

    public final zzgyz zzb(Class cls) {
        if (zzgxr.class.isAssignableFrom(cls)) {
            try {
                return (zzgyz) zzgxr.zzbh(cls.asSubclass(zzgxr.class)).zzbO();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    public final boolean zzc(Class cls) {
        return zzgxr.class.isAssignableFrom(cls);
    }
}
