package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbni implements zzcad {
    final /* synthetic */ zzbnr zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzbns zzc;

    zzbni(zzbns zzbns, zzbnr zzbnr, zzfgw zzfgw) {
        this.zza = zzbnr;
        this.zzb = zzfgw;
        this.zzc = zzbns;
    }

    public final void zza() {
        zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
                zzbns zzbns = this.zzc;
                if (zzbns.zze != null) {
                    zzfhk zze = zzbns.zze;
                    zzfgw zzfgw = this.zzb;
                    zzfgw.zzc("Failed loading new engine");
                    zzfgw.zzg(false);
                    zze.zzb(zzfgw.zzm());
                }
            }
        }
        zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
