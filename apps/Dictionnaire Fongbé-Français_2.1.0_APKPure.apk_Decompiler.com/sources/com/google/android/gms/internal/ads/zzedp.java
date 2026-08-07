package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzedp implements zzedc {
    private final Context zza;
    private final zzcoa zzb;

    zzedp(Context context, zzcoa zzcoa) {
        this.zza = context;
        this.zzb = zzcoa;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        zzefb zzefb = new zzefb(zzfbo, (zzbrd) zzecz.zzb, AdFormat.APP_OPEN_AD);
        zzcnx zza2 = this.zzb.zza(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzdeu(zzefb, (zzcex) null), new zzcny(zzfbo.zzaa));
        zzefb.zzb(zza2.zzc());
        ((zzees) zzecz.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        try {
            ((zzbrd) zzecz.zzb).zzq(zzfbo.zzZ);
            ((zzbrd) zzecz.zzb).zzi(zzfbo.zzU, zzfbo.zzv.toString(), zzfca.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedn(zzecz, (zzedo) null), (zzbpk) zzecz.zzc);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfcq(e);
        }
    }
}
