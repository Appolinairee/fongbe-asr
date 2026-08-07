package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzehd implements zzedc {
    private final Context zza;
    private final Executor zzb;
    private final zzdof zzc;

    public zzehd(Context context, Executor executor, zzdof zzdof) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdof;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        zzdob zze = this.zzc.zze(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzdoc(new zzehc(zzecz)));
        zze.zzd().zzo(new zzcma((zzfdh) zzecz.zzb), this.zzb);
        ((zzees) zzecz.zzc).zzc(zze.zzn());
        return zze.zzi();
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        try {
            zzfcj zzfcj = zzfca.zza.zza;
            if (zzfcj.zzo.zza == 3) {
                ((zzfdh) zzecz.zzb).zzr(this.zza, zzfcj.zzd, zzfbo.zzv.toString(), (zzbpk) zzecz.zzc);
            } else {
                ((zzfdh) zzecz.zzb).zzq(this.zza, zzfcj.zzd, zzfbo.zzv.toString(), (zzbpk) zzecz.zzc);
            }
        } catch (Exception e) {
            zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzecz.zza)), e);
        }
    }
}
