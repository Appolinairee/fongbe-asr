package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzcg extends zzaya implements zzci {
    zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    public final zzbad zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(5, zza);
        zzbad zzb = zzbac.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzby zzf(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            r0.writeString(r4)
            r4 = 7
            android.os.Parcel r4 = r3.zzcZ(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.ads.internal.client.zzby
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.ads.internal.client.zzby r0 = (com.google.android.gms.ads.internal.client.zzby) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.ads.internal.client.zzbw r1 = new com.google.android.gms.ads.internal.client.zzbw
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzcg.zzf(java.lang.String):com.google.android.gms.ads.internal.client.zzby");
    }

    public final zzbwp zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(3, zza);
        zzbwp zzq = zzbwo.zzq(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzq;
    }

    public final void zzh(zzbpe zzbpe) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbpe);
        zzda(8, zza);
    }

    public final void zzi(List list, zzcf zzcf) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, zzcf);
        zzda(1, zza);
    }

    public final boolean zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzk(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(6, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
