package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdgw implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzdgw(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj6;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcva zza2 = ((zzcvl) this.zzb).zza();
        zzcva zzcva = zza2;
        zzdbm zza3 = ((zzdcg) this.zzc).zza();
        zzdbm zzdbm = zza3;
        zzdgl zza4 = ((zzdgn) this.zzd).zza();
        zzdgl zzdgl = zza4;
        zzcyl zza5 = ((zzcol) this.zze).zzb();
        zzcyl zzcyl = zza5;
        zzegq zzegq = (zzegq) this.zzf.zzb();
        zzcpp zze2 = ((zzcgx) this.zza.zzb()).zze();
        zze2.zzi(zza2.zzl());
        zze2.zzf(zza3);
        zze2.zzd(zza4);
        zze2.zze(new zzeiw((zzbdg) null));
        zze2.zzg(new zzcqr(zza5, (zzdar) null));
        zze2.zzc(new zzcoj((ViewGroup) null));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdK)).booleanValue()) {
            zze2.zzj(zzegz.zzb(zzegq));
        }
        zzcrc zzc2 = zze2.zzk().zzc();
        zzhez.zzb(zzc2);
        zzcrc zzcrc = zzc2;
        return zzc2;
    }
}
