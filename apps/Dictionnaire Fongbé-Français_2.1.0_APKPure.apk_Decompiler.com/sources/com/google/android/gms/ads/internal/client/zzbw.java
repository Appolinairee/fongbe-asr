package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbwc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbw extends zzaya implements zzby {
    zzbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void zzA() throws RemoteException {
        zzda(11, zza());
    }

    public final void zzB() throws RemoteException {
        zzda(6, zza());
    }

    public final void zzC(zzbi zzbi) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbi);
        zzda(20, zza);
    }

    public final void zzD(zzbl zzbl) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbl);
        zzda(7, zza);
    }

    public final void zzE(zzcc zzcc) throws RemoteException {
        throw null;
    }

    public final void zzF(zzs zzs) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzs);
        zzda(13, zza);
    }

    public final void zzG(zzcm zzcm) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzcm);
        zzda(8, zza);
    }

    public final void zzH(zzbag zzbag) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbag);
        zzda(40, zza);
    }

    public final void zzI(zzy zzy) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzy);
        zzda(39, zza);
    }

    public final void zzJ(zzct zzct) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzct);
        zzda(45, zza);
    }

    public final void zzK(zzef zzef) throws RemoteException {
        throw null;
    }

    public final void zzL(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(34, zza);
    }

    public final void zzM(zzbtn zzbtn) throws RemoteException {
        throw null;
    }

    public final void zzN(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(22, zza);
    }

    public final void zzO(zzbdg zzbdg) throws RemoteException {
        throw null;
    }

    public final void zzP(zzdr zzdr) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzdr);
        zzda(42, zza);
    }

    public final void zzQ(zzbtq zzbtq, String str) throws RemoteException {
        throw null;
    }

    public final void zzR(String str) throws RemoteException {
        throw null;
    }

    public final void zzS(zzbwc zzbwc) throws RemoteException {
        throw null;
    }

    public final void zzT(String str) throws RemoteException {
        throw null;
    }

    public final void zzU(zzga zzga) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzga);
        zzda(29, zza);
    }

    public final void zzW(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(44, zza);
    }

    public final void zzX() throws RemoteException {
        throw null;
    }

    public final boolean zzY() throws RemoteException {
        Parcel zzcZ = zzcZ(46, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzZ() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzaa() throws RemoteException {
        throw null;
    }

    public final boolean zzab(zzm zzm) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzm);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final void zzac(zzcq zzcq) throws RemoteException {
        throw null;
    }

    public final Bundle zzd() throws RemoteException {
        throw null;
    }

    public final zzs zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        zzs zzs = (zzs) zzayc.zza(zzcZ, zzs.CREATOR);
        zzcZ.recycle();
        return zzs;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbl zzi() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 33
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzcZ(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbl
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbl r1 = (com.google.android.gms.ads.internal.client.zzbl) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzbj r2 = new com.google.android.gms.ads.internal.client.zzbj
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbw.zzi():com.google.android.gms.ads.internal.client.zzbl");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzcm zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 32
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzcZ(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzcm
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzcm r1 = (com.google.android.gms.ads.internal.client.zzcm) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzck r2 = new com.google.android.gms.ads.internal.client.zzck
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbw.zzj():com.google.android.gms.ads.internal.client.zzcm");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzdy zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 41
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzcZ(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzdy
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzdy r1 = (com.google.android.gms.ads.internal.client.zzdy) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdw r2 = new com.google.android.gms.ads.internal.client.zzdw
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbw.zzk():com.google.android.gms.ads.internal.client.zzdy");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzeb zzl() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 26
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzcZ(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzeb
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzeb r1 = (com.google.android.gms.ads.internal.client.zzeb) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdz r2 = new com.google.android.gms.ads.internal.client.zzdz
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbw.zzl():com.google.android.gms.ads.internal.client.zzeb");
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final String zzr() throws RemoteException {
        Parcel zzcZ = zzcZ(31, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        throw null;
    }

    public final String zzt() throws RemoteException {
        throw null;
    }

    public final void zzx() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzy(zzm zzm, zzbo zzbo) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, zzbo);
        zzda(43, zza);
    }

    public final void zzz() throws RemoteException {
        zzda(5, zza());
    }
}
