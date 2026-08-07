package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzdi implements zzdk {
    private zzdn zza;

    public static void zzb(zzdn zzdn, zzdn zzdn2) {
        zzdi zzdi = (zzdi) zzdn;
        if (zzdi.zza == null) {
            zzdi.zza = zzdn2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zza() {
        zzdn zzdn = this.zza;
        if (zzdn != null) {
            return zzdn.zza();
        }
        throw new IllegalStateException();
    }
}
