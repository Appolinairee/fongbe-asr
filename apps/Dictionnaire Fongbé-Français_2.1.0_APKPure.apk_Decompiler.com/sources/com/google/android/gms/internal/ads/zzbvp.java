package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbvp implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvr zzb;

    zzbvp(zzbvr zzbvr, Context context) {
        this.zza = context;
        this.zzb = zzbvr;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbvo zzbvo;
        zzbvq zzbvq = (zzbvq) this.zzb.zza.get(this.zza);
        if (zzbvq != null) {
            if (zzbvq.zza + ((Long) zzbea.zzd.zze()).longValue() >= zzv.zzC().currentTimeMillis()) {
                zzbvo = new zzbvn(this.zza, zzbvq.zzb).zza();
                zzbvr zzbvr = this.zzb;
                zzbvr.zza.put(this.zza, new zzbvq(zzbvr, zzbvo));
                return zzbvo;
            }
        }
        zzbvo = new zzbvn(this.zza).zza();
        zzbvr zzbvr2 = this.zzb;
        zzbvr2.zza.put(this.zza, new zzbvq(zzbvr2, zzbvo));
        return zzbvo;
    }
}
