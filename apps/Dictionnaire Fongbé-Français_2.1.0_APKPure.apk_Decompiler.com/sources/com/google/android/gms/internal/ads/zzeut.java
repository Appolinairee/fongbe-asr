package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeut implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzeut(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
        this.zzc = zzhfj5;
        this.zzd = zzhfj6;
        this.zze = zzhfj7;
    }

    public static zzeur zza(zzbzd zzbzd, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new zzeur(zzbzd, context, scheduledExecutorService, executor, i, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzd zza2 = zzckt.zza();
        zzbzd zzbzd = zza2;
        Context zza3 = ((zzche) this.zza).zza();
        Context context = zza3;
        Integer zza4 = ((zzevz) this.zzc).zzb();
        Integer num = zza4;
        int intValue = zza4.intValue();
        Boolean zza5 = ((zzewa) this.zzd).zzb();
        Boolean bool = zza5;
        boolean booleanValue = zza5.booleanValue();
        Boolean zza6 = ((zzewc) this.zze).zzb();
        Boolean bool2 = zza6;
        return new zzeur(zza2, zza3, (ScheduledExecutorService) this.zzb.zzb(), zzffh.zzc(), intValue, booleanValue, zza6.booleanValue());
    }
}
