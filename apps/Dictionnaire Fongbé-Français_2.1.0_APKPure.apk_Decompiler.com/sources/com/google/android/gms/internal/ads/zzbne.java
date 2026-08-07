package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbne implements zzbjp {
    final /* synthetic */ zzbmn zza;
    final /* synthetic */ zzby zzb;
    final /* synthetic */ zzbns zzc;

    zzbne(zzbns zzbns, zzava zzava, zzbmn zzbmn, zzby zzby) {
        this.zza = zzbmn;
        this.zzb = zzby;
        this.zzc = zzbns;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzbnt zzbnt = (zzbnt) obj;
        zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.zzc.zza) {
            zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            zzo.zzi("JS Engine is requesting an update");
            if (this.zzc.zzi == 0) {
                zzo.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd((zzava) null);
            }
            this.zza.zzr("/requestReload", (zzbjp) this.zzb.zza());
        }
        zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
