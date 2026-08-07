package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzefd implements zzedc {
    private final Context zza;
    private final zzdfu zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzefd(Context context, VersionInfoParcel versionInfoParcel, zzdfu zzdfu, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdfu;
        this.zzd = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        zzder zze = this.zzb.zze(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzdeu(new zzefc(this, zzecz), (zzcex) null));
        zze.zzd().zzo(new zzcma((zzfdh) zzecz.zzb), this.zzd);
        ((zzees) zzecz.zzc).zzc(zze.zzk());
        return zze.zzg();
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        zzfcj zzfcj = zzfca.zza.zza;
        String jSONObject = zzfbo.zzv.toString();
        String zzm = zzbs.zzm(zzfbo.zzs);
        ((zzfdh) zzecz.zzb).zzo(this.zza, zzfcj.zzd, jSONObject, zzm, (zzbpk) zzecz.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzecz zzecz, boolean z, Context context, zzcwg zzcwg) throws zzdgb {
        try {
            ((zzfdh) zzecz.zzb).zzv(z);
            if (this.zzc.clientJarVersion < ((Integer) zzbe.zzc().zza(zzbcl.zzaS)).intValue()) {
                ((zzfdh) zzecz.zzb).zzx();
            } else {
                ((zzfdh) zzecz.zzb).zzy(context);
            }
        } catch (zzfcq e) {
            zzo.zzi("Cannot show interstitial.");
            throw new zzdgb(e.getCause());
        }
    }
}
