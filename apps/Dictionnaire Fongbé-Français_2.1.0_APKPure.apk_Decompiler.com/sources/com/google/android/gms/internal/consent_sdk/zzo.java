package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzo implements zzdk {
    private final zzdp zza;
    private final zzdp zzb;

    public zzo(zzdp zzdp, zzdp zzdp2) {
        this.zza = zzdp;
        this.zzb = zzdp2;
    }

    /* renamed from: zzb */
    public final zzl zza() {
        return new zzl((Application) this.zza.zza(), (zzam) this.zzb.zza());
    }
}
