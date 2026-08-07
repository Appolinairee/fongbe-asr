package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzat extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpe zzb;
    final /* synthetic */ zzba zzc;

    zzat(zzba zzba, Context context, zzbpe zzbpe) {
        this.zza = context;
        this.zzb = zzbpe;
        this.zzc = zzba;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "ads_preloader");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        zzci zzg = zzcp.zzg(ObjectWrapper.wrap(this.zza), this.zzb, 244410000);
        zzg.zzh(this.zzb);
        return zzg;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzci zzci;
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbcl.zza(context);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IBinder zze = ((zzcj) zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new zzas())).zze(wrap, this.zzb, 244410000);
                if (zze == null) {
                    zzci = null;
                } else {
                    IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    zzci = queryLocalInterface instanceof zzci ? (zzci) queryLocalInterface : new zzcg(zze);
                }
                zzci.zzh(this.zzb);
                return zzci;
            } catch (RemoteException | zzr | NullPointerException e) {
                this.zzc.zzg = zzbuh.zza(this.zza);
                this.zzc.zzg.zzh(e, "ClientApiBroker.getAdPreloader");
                return null;
            }
        } else {
            return this.zzc.zzh.zza(this.zza, this.zzb);
        }
    }
}
