package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgyt implements zzgza {
    private final zzgza[] zza;

    zzgyt(zzgza... zzgzaArr) {
        this.zza = zzgzaArr;
    }

    public final zzgyz zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzgza zzgza = this.zza[i];
            if (zzgza.zzc(cls)) {
                return zzgza.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
