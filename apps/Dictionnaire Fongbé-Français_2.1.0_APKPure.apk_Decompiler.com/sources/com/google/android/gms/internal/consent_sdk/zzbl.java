package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzbl implements zzdk {
    private final zzdp zza;

    public zzbl(zzdp zzdp, zzdp zzdp2) {
        this.zza = zzdp;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        Executor zzb = zzar.zzb();
        Executor executor = zzb;
        return new zzbk(this.zza, zzb);
    }
}
