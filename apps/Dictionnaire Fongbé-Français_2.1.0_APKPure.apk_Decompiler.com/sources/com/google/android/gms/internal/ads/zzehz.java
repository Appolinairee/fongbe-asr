package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzehz implements zzedc {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzdof zzc;

    public zzehz(Context context, Executor executor, zzdof zzdof) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdof;
    }

    /* access modifiers changed from: private */
    public static final void zze(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) {
        try {
            ((zzfdh) zzecz.zzb).zzk(zzfca.zza.zza.zzd, zzfbo.zzv.toString());
        } catch (Exception e) {
            zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzecz.zza)), e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        zzdob zze = this.zzc.zze(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzdoc(new zzehv(zzecz)));
        zze.zzd().zzo(new zzcma((zzfdh) zzecz.zzb), this.zzb);
        zzcxa zze2 = zze.zze();
        zzcvr zzb2 = zze.zzb();
        ((zzeet) zzecz.zzc).zzc(new zzehy(this, zze.zza(), zzb2, zze2, zze.zzg()));
        return zze.zzi();
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        if (!((zzfdh) zzecz.zzb).zzC()) {
            ((zzeet) zzecz.zzc).zzd(new zzehx(this, zzfca, zzfbo, zzecz));
            Object obj = zzecz.zzb;
            Context context = this.zza;
            zzfcj zzfcj = zzfca.zza.zza;
            String jSONObject = zzfbo.zzv.toString();
            ((zzfdh) obj).zzh(context, zzfcj.zzd, (String) null, (zzbwh) zzecz.zzc, jSONObject);
            return;
        }
        zze(zzfca, zzfbo, zzecz);
    }
}
