package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzelj implements zzgcd {
    final /* synthetic */ zzelc zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfgw zzc;
    final /* synthetic */ zzdgq zzd;
    final /* synthetic */ zzelk zze;

    zzelj(zzelk zzelk, zzelc zzelc, zzfhh zzfhh, zzfgw zzfgw, zzdgq zzdgq) {
        this.zza = zzelc;
        this.zzb = zzfhh;
        this.zzc = zzfgw;
        this.zzd = zzdgq;
        this.zze = zzelk;
    }

    public final void zza(Throwable th) {
        zzfhh zzfhh;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            zze.zzb("Native ad failed to load", th);
        }
        com.google.android.gms.ads.internal.client.zze zza2 = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdz(zza2);
        this.zze.zzb.zzC().execute(new zzeli(this, zza2));
        zzfdg.zzb(zza2.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zzb) == null) {
            zzelk zzelk = this.zze;
            zzfgw zzfgw = this.zzc;
            zzfhk zze2 = zzelk.zze;
            zzfgw.zza(zza2);
            zzfgw.zzh(th);
            zzfgw.zzg(false);
            zze2.zzb(zzfgw.zzm());
            return;
        }
        zzfhh.zzc(zza2);
        zzfgw zzfgw2 = this.zzc;
        zzfgw2.zzh(th);
        zzfgw2.zzg(false);
        zzfhh.zza(zzfgw2);
        zzfhh.zzh();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhh zzfhh;
        zzcqz zzcqz = (zzcqz) obj;
        synchronized (this.zze) {
            zzcqz.zzo().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcqz);
            this.zze.zzb.zzC().execute(new zzelh(this));
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zzb) == null) {
                zzfhk zze2 = this.zze.zze;
                zzfgw zzfgw = this.zzc;
                zzfgw.zzb(zzcqz.zzq().zzb);
                zzfgw.zzd(zzcqz.zzm().zzg());
                zzfgw.zzg(true);
                zze2.zzb(zzfgw.zzm());
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
