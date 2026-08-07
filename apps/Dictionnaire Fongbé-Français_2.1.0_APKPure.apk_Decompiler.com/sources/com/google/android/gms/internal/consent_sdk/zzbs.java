package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzbs implements zzdk {
    private final zzdp zza;
    private final zzdp zzb;

    public zzbs(zzdp zzdp, zzdp zzdp2, zzdp zzdp3) {
        this.zza = zzdp;
        this.zzb = zzdp3;
    }

    /* renamed from: zzb */
    public final zzbr zza() {
        Handler zzb2 = zzap.zzb();
        Handler handler = zzb2;
        zzbx zzb3 = ((zzby) this.zzb).zza();
        zzbx zzbx = zzb3;
        return new zzbr((zzbt) this.zza.zza(), zzb2, zzb3);
    }
}
