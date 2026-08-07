package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzedl implements zzedc {
    private final Context zza;
    private final zzcoa zzb;
    private final Executor zzc;

    zzedl(Context context, zzcoa zzcoa, Executor executor) {
        this.zza = context;
        this.zzb = zzcoa;
        this.zzc = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        zzcnx zza2 = this.zzb.zza(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzdeu(new zzedk(zzecz), (zzcex) null), new zzcny(zzfbo.zzaa));
        zza2.zzd().zzo(new zzcma((zzfdh) zzecz.zzb), this.zzc);
        ((zzees) zzecz.zzc).zzc(zza2.zzk());
        return zza2.zza();
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        zzfcj zzfcj = zzfca.zza.zza;
        String jSONObject = zzfbo.zzv.toString();
        ((zzfdh) zzecz.zzb).zzl(this.zza, zzfcj.zzd, jSONObject, (zzbpk) zzecz.zzc);
    }
}
