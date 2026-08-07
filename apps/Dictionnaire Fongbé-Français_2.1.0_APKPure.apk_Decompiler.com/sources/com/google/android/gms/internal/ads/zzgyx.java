package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgyx {
    zzgyx() {
    }

    public static final boolean zza(Object obj) {
        return !((zzgyw) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzgyw zzgyw = (zzgyw) obj;
        zzgyw zzgyw2 = (zzgyw) obj2;
        if (!zzgyw2.isEmpty()) {
            if (!zzgyw.zze()) {
                zzgyw = zzgyw.zzb();
            }
            zzgyw.zzd(zzgyw2);
        }
        return zzgyw;
    }
}
