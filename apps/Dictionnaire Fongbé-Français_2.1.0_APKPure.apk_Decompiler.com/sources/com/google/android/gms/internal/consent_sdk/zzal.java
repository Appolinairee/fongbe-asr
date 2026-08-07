package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzal implements zzdk {
    private final zzdp zza;
    private final zzdp zzb;

    public zzal(zzdp zzdp, zzdp zzdp2, zzdp zzdp3) {
        this.zza = zzdp;
        this.zzb = zzdp2;
    }

    /* renamed from: zzb */
    public final zzak zza() {
        Executor zzb2 = zzar.zzb();
        Executor executor = zzb2;
        return new zzak((Application) this.zza.zza(), (zzam) this.zzb.zza(), zzb2);
    }
}
