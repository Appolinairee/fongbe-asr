package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzdz extends zzaya implements zzeb {
    zzdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final float zze() throws RemoteException {
        throw null;
    }

    public final float zzf() throws RemoteException {
        throw null;
    }

    public final float zzg() throws RemoteException {
        throw null;
    }

    public final int zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws android.os.RemoteException {
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzee
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzee r1 = (com.google.android.gms.ads.internal.client.zzee) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzec r2 = new com.google.android.gms.ads.internal.client.zzec
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzdz.zzi():com.google.android.gms.ads.internal.client.zzee");
    }

    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(3, zza);
    }

    public final void zzk() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzl() throws RemoteException {
        zzda(1, zza());
    }

    public final void zzm(zzee zzee) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzee);
        zzda(8, zza);
    }

    public final void zzn() throws RemoteException {
        zzda(13, zza());
    }

    public final boolean zzo() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(10, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
