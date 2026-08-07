package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzefs implements zzedc {
    private final Context zza;
    private final zzdgq zzb;
    private final Executor zzc;

    public zzefs(Context context, zzdgq zzdgq, Executor executor) {
        this.zza = context;
        this.zzb = zzdgq;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfca zzfca, int i) {
        return zzfca.zza.zza.zzg.contains(Integer.toString(i));
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        zzdif zzdif;
        zzbpp zzD = ((zzfdh) zzecz.zzb).zzD();
        zzbpq zzE = ((zzfdh) zzecz.zzb).zzE();
        zzbpt zzd = ((zzfdh) zzecz.zzb).zzd();
        if (zzd != null && zzc(zzfca, 6)) {
            zzdif = zzdif.zzt(zzd);
        } else if (zzD != null && zzc(zzfca, 6)) {
            zzdif = zzdif.zzai(zzD);
        } else if (zzD != null && zzc(zzfca, 2)) {
            zzdif = zzdif.zzag(zzD);
        } else if (zzE != null && zzc(zzfca, 6)) {
            zzdif = zzdif.zzaj(zzE);
        } else if (zzE == null || !zzc(zzfca, 1)) {
            throw new zzegu(1, "No native ad mappers");
        } else {
            zzdif = zzdif.zzah(zzE);
        }
        if (zzdif != null) {
            zzfcj zzfcj = zzfca.zza.zza;
            if (zzfcj.zzg.contains(Integer.toString(zzdif.zzc()))) {
                zzdih zze = this.zzb.zze(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzdir(zzdif), new zzdkk(zzE, zzD, zzd));
                ((zzees) zzecz.zzc).zzc(zze.zzk());
                zze.zzd().zzo(new zzcma((zzfdh) zzecz.zzb), this.zzc);
                return zze.zza();
            }
        }
        throw new zzegu(1, "No corresponding native ad listener");
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        zzfcj zzfcj = zzfca.zza.zza;
        zzfcj zzfcj2 = zzfca.zza.zza;
        Context context = this.zza;
        zzbfl zzbfl = zzfcj2.zzi;
        ArrayList arrayList = zzfcj2.zzg;
        ((zzfdh) zzecz.zzb).zzp(context, zzfcj.zzd, zzfbo.zzv.toString(), zzbs.zzm(zzfbo.zzs), (zzbpk) zzecz.zzc, zzbfl, arrayList);
    }
}
