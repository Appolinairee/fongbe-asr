package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdtz extends zzblq {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfgw zzd;
    final /* synthetic */ zzcab zze;
    final /* synthetic */ zzdua zzf;

    zzdtz(zzdua zzdua, Object obj, String str, long j, zzfgw zzfgw, zzcab zzcab) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfgw;
        this.zze = zzcab;
        this.zzf = zzdua;
    }

    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (zzv.zzC().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfhk zze2 = this.zzf.zzp;
            zzfgw zzfgw = this.zzd;
            zzfgw.zzc(str);
            zzfgw.zzg(false);
            zze2.zzb(zzfgw.zzm());
            this.zze.zzc(false);
        }
    }

    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (zzv.zzC().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfhk zze2 = this.zzf.zzp;
            zzfgw zzfgw = this.zzd;
            zzfgw.zzg(true);
            zze2.zzb(zzfgw.zzm());
            this.zze.zzc(true);
        }
    }
}
