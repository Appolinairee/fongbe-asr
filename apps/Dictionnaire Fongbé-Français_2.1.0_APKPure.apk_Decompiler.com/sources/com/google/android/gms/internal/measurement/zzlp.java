package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
final class zzlp {
    private static final zzlo zza;
    private static final zzlo zzb = new zzlo();

    static {
        zzlo zzlo = null;
        try {
            zzlo = (zzlo) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        zza = zzlo;
    }

    static zzlo zza() {
        return zza;
    }

    static zzlo zzb() {
        return zzb;
    }
}
