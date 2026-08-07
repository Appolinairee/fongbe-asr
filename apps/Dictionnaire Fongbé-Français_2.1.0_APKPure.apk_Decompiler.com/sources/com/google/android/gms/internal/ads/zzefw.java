package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzefw implements zzedc {
    private final Context zza;
    private final zzdgq zzb;
    /* access modifiers changed from: private */
    public zzbpt zzc;
    private final VersionInfoParcel zzd;

    public zzefw(Context context, zzdgq zzdgq, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdgq;
        this.zzd = versionInfoParcel;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        if (zzfca.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdif zzt = zzdif.zzt(this.zzc);
            zzfcj zzfcj = zzfca.zza.zza;
            if (zzfcj.zzg.contains(Integer.toString(zzt.zzc()))) {
                zzdih zze = this.zzb.zze(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzdir(zzt), new zzdkk((zzbpq) null, (zzbpp) null, this.zzc));
                ((zzees) zzecz.zzc).zzc(zze.zzj());
                return zze.zza();
            }
            throw new zzegu(1, "No corresponding native ad listener");
        }
        throw new zzegu(2, "Unified must be used for RTB.");
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        try {
            ((zzbrd) zzecz.zzb).zzq(zzfbo.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) zzbe.zzc().zza(zzbcl.zzbP)).intValue()) {
                ((zzbrd) zzecz.zzb).zzm(zzfbo.zzU, zzfbo.zzv.toString(), zzfca.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefu(this, zzecz, (zzefv) null), (zzbpk) zzecz.zzc);
            } else {
                ((zzbrd) zzecz.zzb).zzn(zzfbo.zzU, zzfbo.zzv.toString(), zzfca.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefu(this, zzecz, (zzefv) null), (zzbpk) zzecz.zzc, zzfca.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfcq(e);
        }
    }
}
