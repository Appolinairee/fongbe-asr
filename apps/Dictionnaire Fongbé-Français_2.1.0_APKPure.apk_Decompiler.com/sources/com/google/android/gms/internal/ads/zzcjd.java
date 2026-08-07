package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcjd implements zzezu {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;

    /* synthetic */ zzcjd(zzcih zzcih, Context context, String str, zzs zzs, zzcjm zzcjm) {
        this.zza = zzcih;
        zzher zza2 = zzhes.zza(context);
        this.zzb = zza2;
        zzher zza3 = zzhes.zza(zzs);
        this.zzc = zza3;
        zzher zza4 = zzhes.zza(str);
        this.zzd = zza4;
        zzhfa zzc2 = zzheq.zzc(new zzeko(zzcih.zzM));
        this.zze = zzc2;
        zzhfa zzc3 = zzheq.zzc(new zzfas(zzcih.zzbh));
        this.zzf = zzc3;
        zzhfa zzhfa = zzc2;
        zzhfa zzhfa2 = zzc3;
        zzhfa zzc4 = zzheq.zzc(new zzezs(zza2, zzcih.zzc, zzcih.zzS, zzhfa, zzhfa2, zzfcl.zza()));
        this.zzg = zzc4;
        this.zzh = zzheq.zzc(new zzekw(zza2, zza3, zza4, zzc4, zzhfa, zzhfa2, zzcih.zzl, zzcih.zzU, zzcih.zzM));
    }

    public final zzekv zza() {
        return (zzekv) this.zzh.zzb();
    }
}
