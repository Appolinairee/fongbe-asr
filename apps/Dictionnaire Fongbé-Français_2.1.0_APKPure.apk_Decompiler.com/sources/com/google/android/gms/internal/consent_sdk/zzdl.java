package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzdl implements zzdk {
    private final Object zza;

    private zzdl(Object obj) {
        this.zza = obj;
    }

    public static zzdk zzb(Object obj) {
        if (obj != null) {
            return new zzdl(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final Object zza() {
        return this.zza;
    }
}
