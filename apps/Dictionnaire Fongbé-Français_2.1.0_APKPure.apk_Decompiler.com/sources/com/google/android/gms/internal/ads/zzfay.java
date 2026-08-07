package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfay implements zzgcd {
    final /* synthetic */ zzelc zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfgw zzc;
    final /* synthetic */ zzfaz zzd;
    final /* synthetic */ zzfbb zze;

    zzfay(zzfbb zzfbb, zzelc zzelc, zzfhh zzfhh, zzfgw zzfgw, zzfaz zzfaz) {
        this.zza = zzelc;
        this.zzb = zzfhh;
        this.zzc = zzfgw;
        this.zzd = zzfaz;
        this.zze = zzfbb;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfhh zzfhh;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzdof zzdof = (zzdof) this.zze.zze.zzd();
        if (zzdof == null) {
            zze2 = zzfdk.zzb(th, (zzedb) null);
        } else {
            zze2 = zzdof.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdof != null) {
                zzdof.zza().zzdz(zze2);
                this.zze.zzb.execute(new zzfaw(this, zze2));
            } else {
                this.zze.zzd.zzdz(zze2);
                this.zze.zzk(this.zzd).zze().zzb().zzc().zzh();
            }
            zzfdg.zzb(zze2.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zzb) == null) {
                zzfhk zzg = this.zze.zzg;
                zzfgw zzfgw = this.zzc;
                zzfgw.zza(zze2);
                zzfgw.zzh(th);
                zzfgw.zzg(false);
                zzg.zzb(zzfgw.zzm());
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
        zzdoa zzdoa = (zzdoa) obj;
        synchronized (this.zze) {
            zzdoa.zzo().zzd(this.zze.zzd);
            this.zza.zzb(zzdoa);
            zzfbb zzfbb = this.zze;
            Executor zzh = zzfbb.zzb;
            zzfar zzf = zzfbb.zzd;
            Objects.requireNonNull(zzf);
            zzh.execute(new zzfax(zzf));
            this.zze.zzd.onAdMetadataChanged();
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhh = this.zzb) == null) {
                zzfhk zzg = this.zze.zzg;
                zzfgw zzfgw = this.zzc;
                zzfgw.zzb(zzdoa.zzq().zzb);
                zzfgw.zzd(zzdoa.zzm().zzg());
                zzfgw.zzg(true);
                zzg.zzb(zzfgw.zzm());
            } else {
                zzfhh.zzg(zzdoa.zzq().zzb);
                zzfhh.zze(zzdoa.zzm().zzg());
                zzfgw zzfgw2 = this.zzc;
                zzfgw2.zzg(true);
                zzfhh.zza(zzfgw2);
                zzfhh.zzh();
            }
        }
    }
}
