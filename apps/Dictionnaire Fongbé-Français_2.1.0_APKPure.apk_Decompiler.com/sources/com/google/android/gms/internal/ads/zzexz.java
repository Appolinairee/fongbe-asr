package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzexz implements zzgcd {
    final /* synthetic */ zzfhh zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzcpq zzc;
    final /* synthetic */ zzeya zzd;

    zzexz(zzeya zzeya, zzfhh zzfhh, zzfgw zzfgw, zzcpq zzcpq) {
        this.zza = zzfhh;
        this.zzb = zzfgw;
        this.zzc = zzcpq;
        this.zzd = zzeya;
    }

    public final void zza(Throwable th) {
        zzfhh zzfhh;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            zze.zzb("Banner ad failed to load", th);
        }
        synchronized (this.zzd) {
            com.google.android.gms.ads.internal.client.zze zza2 = this.zzc.zzd().zza(th);
            this.zzd.zzn = zza2;
            this.zzc.zzf().zzdz(zza2);
            zzfdg.zzb(zza2.zza, th, "BannerAdLoader.onFailure");
            zzeya zzeya = this.zzd;
            if (zzeya.zzm) {
                zzeya.zzt();
                zzeya zzeya2 = this.zzd;
                zzeya2.zzh.zzd(zzeya2.zzj.zzc());
            }
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zza) == null) {
                zzfhk zzg = this.zzd.zzi;
                zzfgw zzfgw = this.zzb;
                zzfgw.zza(zza2);
                zzfgw.zzh(th);
                zzfgw.zzg(false);
                zzg.zzb(zzfgw.zzm());
            } else {
                zzfhh.zzc(zza2);
                zzfgw zzfgw2 = this.zzb;
                zzfgw2.zzh(th);
                zzfgw2.zzg(false);
                zzfhh.zza(zzfgw2);
                zzfhh.zzh();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhh zzfhh;
        zzcom zzcom = (zzcom) obj;
        synchronized (this.zzd) {
            zzeya zzeya = this.zzd;
            if (zzeya.zzm) {
                zzeya.zzq();
            }
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zza) == null) {
                zzfhk zzg = this.zzd.zzi;
                zzfgw zzfgw = this.zzb;
                zzfgw.zzb(zzcom.zzq().zzb);
                zzfgw.zzd(zzcom.zzm().zzg());
                zzfgw.zzg(true);
                zzg.zzb(zzfgw.zzm());
            } else {
                zzfhh.zzg(zzcom.zzq().zzb);
                zzfhh.zze(zzcom.zzm().zzg());
                zzfgw zzfgw2 = this.zzb;
                zzfgw2.zzg(true);
                zzfhh.zza(zzfgw2);
                zzfhh.zzh();
            }
        }
    }
}
