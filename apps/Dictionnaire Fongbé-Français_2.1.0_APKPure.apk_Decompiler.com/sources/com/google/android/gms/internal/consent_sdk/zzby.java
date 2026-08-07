package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzby implements zzdk {
    private final zzdp zza;
    private final zzdp zzb;
    private final zzdp zzc;
    private final zzdp zzd;
    private final zzdp zze;
    private final zzdp zzf;

    public zzby(zzdp zzdp, zzdp zzdp2, zzdp zzdp3, zzdp zzdp4, zzdp zzdp5, zzdp zzdp6, zzdp zzdp7, zzdp zzdp8) {
        this.zza = zzdp;
        this.zzb = zzdp2;
        this.zzc = zzdp5;
        this.zzd = zzdp6;
        this.zze = zzdp7;
        this.zzf = zzdp8;
    }

    /* renamed from: zzb */
    public final zzbx zza() {
        Handler zzb2 = zzap.zzb();
        Handler handler = zzb2;
        Executor zzb3 = zzar.zzb();
        Executor executor = zzb3;
        zzak zzb4 = ((zzal) this.zzd).zza();
        zzak zzak = zzb4;
        return new zzbx((Application) this.zza.zza(), (zzbt) this.zzb.zza(), zzb2, zzb3, (zze) this.zzc.zza(), zzb4, (zzay) this.zze.zza(), (zzam) this.zzf.zza());
    }
}
