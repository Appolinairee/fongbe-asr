package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeeh implements zzedc {
    private final Context zza;
    private final zzcpq zzb;
    /* access modifiers changed from: private */
    public View zzc;
    /* access modifiers changed from: private */
    public zzbpn zzd;

    public zzeeh(Context context, zzcpq zzcpq) {
        this.zza = context;
        this.zzb = zzcpq;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq, zzegu {
        View view;
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !zzfbo.zzag) {
            view = this.zzc;
        } else {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfcq(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (zzf) {
                    try {
                        view = (View) zzgch.zzn(zzgch.zzh((Object) null), new zzeee(this, view, zzfbo), zzbzw.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfcq(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfcq(e2);
            }
        }
        zzcon zza2 = this.zzb.zza(new zzcrp(zzfca, zzfbo, zzecz.zza), new zzcot(view, (zzcex) null, new zzeed(zzecz), (zzfbp) zzfbo.zzu.get(0)));
        zza2.zzg().zza(view);
        ((zzees) zzecz.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    public final void zzb(zzfca zzfca, zzfbo zzfbo, zzecz zzecz) throws zzfcq {
        try {
            ((zzbrd) zzecz.zzb).zzq(zzfbo.zzZ);
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() || !zzfbo.zzag) {
                ((zzbrd) zzecz.zzb).zzj(zzfbo.zzU, zzfbo.zzv.toString(), zzfca.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeef(this, zzecz, (zzeeg) null), (zzbpk) zzecz.zzc, zzfca.zza.zza.zze);
            } else {
                ((zzbrd) zzecz.zzb).zzk(zzfbo.zzU, zzfbo.zzv.toString(), zzfca.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeef(this, zzecz, (zzeeg) null), (zzbpk) zzecz.zzc, zzfca.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfcq(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(View view, zzfbo zzfbo, Object obj) throws Exception {
        return zzgch.zzh(zzcql.zza(this.zza, view, zzfbo));
    }
}
