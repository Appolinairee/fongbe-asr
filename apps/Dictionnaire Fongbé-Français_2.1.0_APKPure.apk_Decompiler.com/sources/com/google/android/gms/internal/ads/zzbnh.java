package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbnh implements zzcaf {
    final /* synthetic */ zzbnr zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzbns zzc;

    zzbnh(zzbns zzbns, zzbnr zzbnr, zzfgw zzfgw) {
        this.zza = zzbnr;
        this.zzb = zzfgw;
        this.zzc = zzbns;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbmn zzbmn = (zzbmn) obj;
        zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            zzbns zzbns = this.zzc;
            if (!(zzbns.zzh == null || this.zza == zzbns.zzh)) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
                zzbns zzbns2 = this.zzc;
                if (zzbns2.zze != null) {
                    zzfhk zze = zzbns2.zze;
                    zzfgw zzfgw = this.zzb;
                    zzfgw.zzg(true);
                    zze.zzb(zzfgw.zzm());
                }
            }
        }
        zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
