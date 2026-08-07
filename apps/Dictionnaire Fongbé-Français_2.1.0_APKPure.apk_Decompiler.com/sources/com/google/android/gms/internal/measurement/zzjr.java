package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
final class zzjr {
    private static final zzjp zza = new zzjq();
    private static final zzjp zzb;

    static {
        zzjp zzjp = null;
        try {
            zzjp = (zzjp) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        zzb = zzjp;
    }

    static zzjp zza() {
        zzjp zzjp = zzb;
        if (zzjp != null) {
            return zzjp;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzjp zzb() {
        return zza;
    }
}
