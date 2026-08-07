package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcim implements zzewp {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;

    /* synthetic */ zzcim(zzcih zzcih, Context context, String str, zzcjm zzcjm) {
        this.zza = zzcih;
        zzher zza2 = zzhes.zza(context);
        this.zzb = zza2;
        zzher zza3 = zzhes.zza(str);
        this.zzc = zza3;
        zzezh zzezh = new zzezh(zza2, zzcih.zzbh, zzcih.zzbi);
        this.zzd = zzezh;
        zzhfa zzc2 = zzheq.zzc(new zzexn(zzcih.zzbh));
        this.zze = zzc2;
        zzhfa zzhfa = zzc2;
        zzhfa zzc3 = zzheq.zzc(new zzexp(zza2, zzcih.zzc, zzcih.zzS, zzezh, zzhfa, zzfcl.zza(), zzcih.zzl));
        this.zzf = zzc3;
        this.zzg = zzheq.zzc(new zzexv(zzcih.zzS, zza2, zza3, zzc3, zzhfa, zzcih.zzl, zzcih.zzM));
    }

    public final zzexu zza() {
        return (zzexu) this.zzg.zzb();
    }
}
