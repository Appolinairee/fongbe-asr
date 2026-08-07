package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbwn extends zzaya implements zzbwp {
    zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public final Bundle zzb() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzayc.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final zzdy zzc() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        zzdy zzb = zzdx.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbwm zzd() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 11
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzcZ(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbwm
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbwm r1 = (com.google.android.gms.internal.ads.zzbwm) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbwk r2 = new com.google.android.gms.internal.ads.zzbwk
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwn.zzd():com.google.android.gms.internal.ads.zzbwm");
    }

    public final String zze() throws RemoteException {
        throw null;
    }

    public final void zzf(zzm zzm, zzbww zzbww) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, zzbww);
        zzda(1, zza);
    }

    public final void zzg(zzm zzm, zzbww zzbww) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, zzbww);
        zzda(14, zza);
    }

    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(15, zza);
    }

    public final void zzi(zzdo zzdo) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzdo);
        zzda(8, zza);
    }

    public final void zzj(zzdr zzdr) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzdr);
        zzda(13, zza);
    }

    public final void zzk(zzbws zzbws) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbws);
        zzda(2, zza);
    }

    public final void zzl(zzbxd zzbxd) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbxd);
        zzda(7, zza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(5, zza);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    public final boolean zzo() throws RemoteException {
        throw null;
    }

    public final void zzp(zzbwx zzbwx) throws RemoteException {
        throw null;
    }
}
