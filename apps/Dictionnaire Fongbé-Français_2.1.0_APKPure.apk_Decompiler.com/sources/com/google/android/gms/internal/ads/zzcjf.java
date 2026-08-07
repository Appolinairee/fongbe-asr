package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcjf implements zzfbi {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;

    /* synthetic */ zzcjf(zzcih zzcih, Context context, String str, zzcjm zzcjm) {
        this.zza = zzcih;
        zzher zza2 = zzhes.zza(context);
        this.zzb = zza2;
        zzezi zzezi = new zzezi(zza2, zzcih.zzbh, zzcih.zzbi);
        this.zzc = zzezi;
        zzhfa zzc2 = zzheq.zzc(new zzfas(zzcih.zzbh));
        this.zzd = zzc2;
        zzhfa zzc3 = zzheq.zzc(zzfcg.zza());
        this.zze = zzc3;
        zzhfa zzc4 = zzheq.zzc(new zzfbc(zza2, zzcih.zzc, zzcih.zzS, zzezi, zzc2, zzfcl.zza(), zzc3));
        this.zzf = zzc4;
        this.zzg = zzheq.zzc(new zzfbm(zzc4, zzc2, zzc3));
        zzher zzc5 = zzhes.zzc(str);
        this.zzh = zzc5;
        this.zzi = zzheq.zzc(new zzfbg(zzc5, zzc4, zza2, zzc2, zzc3, zzcih.zzl, zzcih.zzU, zzcih.zzM));
    }

    public final zzfbf zza() {
        return (zzfbf) this.zzi.zzb();
    }

    public final zzfbl zzb() {
        return (zzfbl) this.zzg.zzb();
    }
}
