package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzewt implements zzgcd {
    final /* synthetic */ zzelc zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfgw zzc;
    final /* synthetic */ zzewu zzd;
    final /* synthetic */ zzeww zze;

    zzewt(zzeww zzeww, zzelc zzelc, zzfhh zzfhh, zzfgw zzfgw, zzewu zzewu) {
        this.zza = zzelc;
        this.zzb = zzfhh;
        this.zzc = zzfgw;
        this.zzd = zzewu;
        this.zze = zzeww;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfhh zzfhh;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzcnw zzcnw = (zzcnw) this.zze.zze.zzd();
        if (zzcnw == null) {
            zze2 = zzfdk.zzb(th, (zzedb) null);
        } else {
            zze2 = zzcnw.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcnw != null) {
                zzcnw.zzc().zzdz(zze2);
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzia)).booleanValue()) {
                    this.zze.zzc.execute(new zzews(this, zze2));
                }
            } else {
                this.zze.zzd.zzdz(zze2);
                ((zzcnw) this.zze.zzm(this.zzd).zzh()).zzb().zzc().zzh();
            }
            zzfdg.zzb(zze2.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zzb) == null) {
                zzfhk zzh = this.zze.zzh;
                zzfgw zzfgw = this.zzc;
                zzfgw.zza(zze2);
                zzfgw.zzh(th);
                zzfgw.zzg(false);
                zzh.zzb(zzfgw.zzm());
            } else {
                zzfhh.zzc(zze2);
                zzfgw zzfgw2 = this.zzc;
                zzfgw2.zzh(th);
                zzfgw2.zzg(false);
                zzfhh.zza(zzfgw2);
                zzfhh.zzh();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhh zzfhh;
        zzcqz zzcqz = (zzcqz) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzia)).booleanValue()) {
                zzcqz.zzo().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcqz);
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zzb) == null) {
                zzfhk zzh = this.zze.zzh;
                zzfgw zzfgw = this.zzc;
                zzfgw.zzb(zzcqz.zzq().zzb);
                zzfgw.zzd(zzcqz.zzm().zzg());
                zzfgw.zzg(true);
                zzh.zzb(zzfgw.zzm());
            } else {
                zzfhh.zzg(zzcqz.zzq().zzb);
                zzfhh.zze(zzcqz.zzm().zzg());
                zzfgw zzfgw2 = this.zzc;
                zzfgw2.zzg(true);
                zzfhh.zza(zzfgw2);
                zzfhh.zzh();
            }
        }
    }
}
