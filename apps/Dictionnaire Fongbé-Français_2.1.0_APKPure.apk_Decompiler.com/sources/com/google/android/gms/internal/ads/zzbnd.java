package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbnd implements zzbjp {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbnr zzb;
    final /* synthetic */ zzbmn zzc;
    final /* synthetic */ zzbns zzd;

    zzbnd(zzbns zzbns, long j, zzbnr zzbnr, zzbmn zzbmn) {
        this.zza = j;
        this.zzb = zzbnr;
        this.zzc = zzbmn;
        this.zzd = zzbns;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzbnt zzbnt = (zzbnt) obj;
        long currentTimeMillis = zzv.zzC().currentTimeMillis() - this.zza;
        zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + currentTimeMillis + " ms.");
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.zzd.zza) {
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1) {
                if (this.zzb.zze() != 1) {
                    this.zzd.zzi = 0;
                    zzbmn zzbmn = this.zzc;
                    zzbmn zzbmn2 = zzbmn;
                    zzbmn.zzq("/log", zzbjo.zzg);
                    zzbmn.zzq("/result", zzbjo.zzo);
                    this.zzb.zzi(this.zzc);
                    this.zzd.zzh = this.zzb;
                    zze.zza("Successfully loaded JS Engine.");
                    zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                    return;
                }
            }
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
