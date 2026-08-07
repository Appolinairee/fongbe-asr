package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzehh implements zzedc {
    private final Context zza;
    private final zzdof zzb;

    public zzehh(Context context, zzdof zzdof) {
        this.zza = context;
        this.zzb = zzdof;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        zzefb zzefb = new zzefb(zzfbo, (zzbrd) zzecz.zzb, AdFormat.REWARDED);
        zzdob zze = this.zzb.zze(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzdoc(zzefb));
        zzefb.zzb(zze.zzc());
        ((zzees) zzecz.zzc).zzc(zze.zzo());
        return zze.zzi();
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        try {
            ((zzbrd) zzecz.zzb).zzq(zzfbo.zzZ);
            if (zzfca.zza.zza.zzo.zza == 3) {
                ((zzbrd) zzecz.zzb).zzo(zzfbo.zzU, zzfbo.zzv.toString(), zzfca.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehf(this, zzecz, (zzehg) null), (zzbpk) zzecz.zzc);
            } else {
                ((zzbrd) zzecz.zzb).zzp(zzfbo.zzU, zzfbo.zzv.toString(), zzfca.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehf(this, zzecz, (zzehg) null), (zzbpk) zzecz.zzc);
            }
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
