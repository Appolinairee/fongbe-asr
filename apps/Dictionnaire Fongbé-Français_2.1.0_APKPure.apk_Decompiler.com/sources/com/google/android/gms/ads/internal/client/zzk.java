package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzk extends RemoteCreator {
    private zzbuj zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbz ? (zzbz) queryLocalInterface : new zzbz(iBinder);
    }

    public final zzby zza(Context context, zzs zzs, String str, zzbpe zzbpe, int i) {
        zzby zzbw;
        zzbcl.zza(context);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IBinder zze = ((zzbz) zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzj())).zze(ObjectWrapper.wrap(context), zzs, str, zzbpe, 244410000, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzbw(zze);
            } catch (RemoteException | zzr | NullPointerException e) {
                zzbuj zza2 = zzbuh.zza(context);
                this.zza = zza2;
                zza2.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzo.zzl("#007 Could not call remote method.", e);
                return null;
            }
        } else {
            try {
                IBinder zze2 = ((zzbz) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzs, str, zzbpe, 244410000, i);
                if (zze2 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface2 instanceof zzby) {
                    zzbw = (zzby) queryLocalInterface2;
                } else {
                    zzbw = new zzbw(zze2);
                }
                return zzbw;
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
                zzo.zzf("Could not create remote AdManager.", e2);
                return null;
            }
        }
    }
}
