package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public final class zzv implements zzdk {
    private final zzdp zza;
    private final zzdp zzb;
    private final zzdp zzc;
    private final zzdp zzd;
    private final zzdp zze;
    private final zzdp zzf;
    private final zzdp zzg;

    public zzv(zzdp zzdp, zzdp zzdp2, zzdp zzdp3, zzdp zzdp4, zzdp zzdp5, zzdp zzdp6, zzdp zzdp7, zzdp zzdp8, zzdp zzdp9) {
        this.zza = zzdp;
        this.zzb = zzdp2;
        this.zzc = zzdp5;
        this.zzd = zzdp6;
        this.zze = zzdp7;
        this.zzf = zzdp8;
        this.zzg = zzdp9;
    }

    /* renamed from: zzb */
    public final zzu zza() {
        Handler zzb2 = zzap.zzb();
        Handler handler = zzb2;
        Executor zzb3 = zzar.zzb();
        Executor executor = zzb3;
        zzl zzb4 = ((zzo) this.zze).zza();
        zzx zzb5 = ((zzaa) this.zzf).zza();
        zzl zzl = zzb4;
        zzx zzx = zzb5;
        return new zzu((Application) this.zza.zza(), (zzab) this.zzb.zza(), zzb2, zzb3, (zzam) this.zzc.zza(), (zzbk) this.zzd.zza(), zzb4, zzb5, (zze) this.zzg.zza());
    }
}
