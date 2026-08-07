package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbxb {
    public static final zzbwp zza(Context context, String str, zzbpe zzbpe) {
        try {
            IBinder zze = ((zzbwt) zzs.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzbxa())).zze(ObjectWrapper.wrap(context), str, zzbpe, 244410000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbwp ? (zzbwp) queryLocalInterface : new zzbwn(zze);
        } catch (RemoteException | zzr e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
