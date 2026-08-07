package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzefh implements zzedc {
    private final Context zza;
    private final zzdfu zzb;

    public zzefh(Context context, zzdfu zzdfu) {
        this.zza = context;
        this.zzb = zzdfu;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        zzefb zzefb = new zzefb(zzfbo, (zzbrd) zzecz.zzb, AdFormat.INTERSTITIAL);
        zzder zze = this.zzb.zze(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzdeu(zzefb, (zzcex) null));
        zzefb.zzb(zze.zzc());
        ((zzees) zzecz.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        try {
            ((zzbrd) zzecz.zzb).zzq(zzfbo.zzZ);
            ((zzbrd) zzecz.zzb).zzl(zzfbo.zzU, zzfbo.zzv.toString(), zzfca.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeff(this, zzecz, (zzefg) null), (zzbpk) zzecz.zzc);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfcq(e);
        }
    }
}
