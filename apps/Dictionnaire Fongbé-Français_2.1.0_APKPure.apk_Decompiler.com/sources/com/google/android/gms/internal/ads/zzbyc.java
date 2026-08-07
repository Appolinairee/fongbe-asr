package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbyc extends zzbyj {
    private final Clock zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;

    /* synthetic */ zzbyc(Context context, Clock clock, zzg zzg2, zzbyi zzbyi, zzbyd zzbyd) {
        this.zzb = clock;
        zzher zza = zzhes.zza(context);
        this.zzc = zza;
        zzher zza2 = zzhes.zza(zzg2);
        this.zzd = zza2;
        this.zze = zzheq.zzc(new zzbxw(zza, zza2));
        zzher zza3 = zzhes.zza(clock);
        this.zzf = zza3;
        zzher zza4 = zzhes.zza(zzbyi);
        this.zzg = zza4;
        zzhfa zzc2 = zzheq.zzc(new zzbxy(zza3, zza2, zza4));
        this.zzh = zzc2;
        zzbya zzbya = new zzbya(zza3, zzc2);
        this.zzi = zzbya;
        this.zzj = zzheq.zzc(new zzbyo(zza, zzbya));
    }

    /* access modifiers changed from: package-private */
    public final zzbxv zza() {
        return (zzbxv) this.zze.zzb();
    }

    /* access modifiers changed from: package-private */
    public final zzbxz zzb() {
        return new zzbxz(this.zzb, (zzbxx) this.zzh.zzb());
    }

    /* access modifiers changed from: package-private */
    public final zzbyn zzc() {
        return (zzbyn) this.zzj.zzb();
    }
}
