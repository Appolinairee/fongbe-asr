package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzezq implements zzgcd {
    final /* synthetic */ zzelc zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfgw zzc;
    final /* synthetic */ zzdfu zzd;
    final /* synthetic */ zzezr zze;

    zzezq(zzezr zzezr, zzelc zzelc, zzfhh zzfhh, zzfgw zzfgw, zzdfu zzdfu) {
        this.zza = zzelc;
        this.zzb = zzfhh;
        this.zzc = zzfgw;
        this.zzd = zzdfu;
        this.zze = zzezr;
    }

    public final void zza(Throwable th) {
        zzfhh zzfhh;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            zze.zzb("Interstitial ad failed to load", th);
        }
        com.google.android.gms.ads.internal.client.zze zza2 = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzdz(zza2);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzib)).booleanValue()) {
                this.zze.zzb.execute(new zzezm(this, zza2));
                this.zze.zzb.execute(new zzezn(this, zza2));
            }
            zzfdg.zzb(zza2.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zzb) == null) {
                zzfhk zze2 = this.zze.zzg;
                zzfgw zzfgw = this.zzc;
                zzfgw.zza(zza2);
                zzfgw.zzh(th);
                zzfgw.zzg(false);
                zze2.zzb(zzfgw.zzm());
            } else {
                zzfhh.zzc(zza2);
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
        zzdeq zzdeq = (zzdeq) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzib)).booleanValue()) {
                zzczz zzo = zzdeq.zzo();
                zzo.zza(this.zze.zzd);
                zzo.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdeq);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzib)).booleanValue()) {
                this.zze.zzb.execute(new zzezo(this));
                this.zze.zzb.execute(new zzezp(this));
            }
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zzb) == null) {
                zzfhk zze2 = this.zze.zzg;
                zzfgw zzfgw = this.zzc;
                zzfgw.zzb(zzdeq.zzq().zzb);
                zzfgw.zzd(zzdeq.zzm().zzg());
                zzfgw.zzg(true);
                zze2.zzb(zzfgw.zzm());
            } else {
                zzfhh.zzg(zzdeq.zzq().zzb);
                zzfhh.zze(zzdeq.zzm().zzg());
                zzfgw zzfgw2 = this.zzc;
                zzfgw2.zzg(true);
                zzfhh.zza(zzfgw2);
                zzfhh.zzh();
            }
        }
    }
}
