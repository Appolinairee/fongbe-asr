package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcir implements zzeyd {
    private final Context zza;
    private final zzs zzb;
    private final String zzc;
    private final zzcih zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;

    /* synthetic */ zzcir(zzcih zzcih, Context context, String str, zzs zzs, zzcjm zzcjm) {
        this.zzd = zzcih;
        this.zza = context;
        this.zzb = zzs;
        this.zzc = str;
        zzher zza2 = zzhes.zza(context);
        this.zze = zza2;
        zzher zza3 = zzhes.zza(zzs);
        this.zzf = zza3;
        zzhfa zzc2 = zzheq.zzc(new zzeko(zzcih.zzM));
        this.zzg = zzc2;
        zzhfa zzc3 = zzheq.zzc(zzekt.zza());
        this.zzh = zzc3;
        zzhfa zzc4 = zzheq.zzc(zzdat.zza());
        this.zzi = zzc4;
        this.zzj = zzheq.zzc(new zzeyb(zza2, zzcih.zzc, zza3, zzcih.zzS, zzc2, zzc3, zzfcl.zza(), zzc4));
    }

    public final zzejt zza() {
        return new zzejt(this.zza, this.zzb, this.zzc, (zzeya) this.zzj.zzb(), (zzekn) this.zzg.zzb(), zzchs.zzc(this.zzd.zza), (zzdrw) this.zzd.zzM.zzb());
    }
}
