package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbpf extends zzaya implements zzbph {
    zzbpf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzm);
        zza.writeString(str);
        zzayc.zzf(zza, zzbpk);
        zzda(28, zza);
    }

    public final void zzB(zzm zzm, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzC(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzm);
        zza.writeString(str);
        zzayc.zzf(zza, zzbpk);
        zzda(32, zza);
    }

    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(21, zza);
    }

    public final void zzE() throws RemoteException {
        zzda(8, zza());
    }

    public final void zzF() throws RemoteException {
        zzda(9, zza());
    }

    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(25, zza);
    }

    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(39, zza);
    }

    public final void zzI() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(37, zza);
    }

    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(30, zza);
    }

    public final void zzL() throws RemoteException {
        zzda(12, zza());
    }

    public final boolean zzM() throws RemoteException {
        Parcel zzcZ = zzcZ(22, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzN() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbpp zzO() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 15
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzcZ(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbpp
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbpp r1 = (com.google.android.gms.internal.ads.zzbpp) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbpp r2 = new com.google.android.gms.internal.ads.zzbpp
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpf.zzO():com.google.android.gms.internal.ads.zzbpp");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbpq zzP() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 16
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzcZ(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbpq
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbpq r1 = (com.google.android.gms.internal.ads.zzbpq) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbpq r2 = new com.google.android.gms.internal.ads.zzbpq
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpf.zzP():com.google.android.gms.internal.ads.zzbpq");
    }

    public final Bundle zze() throws RemoteException {
        throw null;
    }

    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    public final zzeb zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(26, zza());
        zzeb zzb = zzea.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzbgq zzi() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbpn zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 36
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzcZ(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbpn
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbpn r1 = (com.google.android.gms.internal.ads.zzbpn) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbpl r2 = new com.google.android.gms.internal.ads.zzbpl
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpf.zzj():com.google.android.gms.internal.ads.zzbpn");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbpt zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 27
            android.os.Parcel r1 = r4.zza()
            android.os.Parcel r0 = r4.zzcZ(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbpt
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbpt r1 = (com.google.android.gms.internal.ads.zzbpt) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbpr r2 = new com.google.android.gms.internal.ads.zzbpr
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpf.zzk():com.google.android.gms.internal.ads.zzbpt");
    }

    public final zzbrs zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(33, zza());
        zzbrs zzbrs = (zzbrs) zzayc.zza(zzcZ, zzbrs.CREATOR);
        zzcZ.recycle();
        return zzbrs;
    }

    public final zzbrs zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(34, zza());
        zzbrs zzbrs = (zzbrs) zzayc.zza(zzcZ, zzbrs.CREATOR);
        zzcZ.recycle();
        return zzbrs;
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final void zzo() throws RemoteException {
        zzda(5, zza());
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbwh zzbwh, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzm);
        zza.writeString((String) null);
        zzayc.zzf(zza, zzbwh);
        zza.writeString(str2);
        zzda(10, zza);
    }

    public final void zzq(IObjectWrapper iObjectWrapper, zzblr zzblr, List list) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzblr);
        zza.writeTypedList(list);
        zzda(31, zza);
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzbwh zzbwh, List list) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbwh);
        zza.writeStringList(list);
        zzda(23, zza);
    }

    public final void zzs(zzm zzm, String str) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzm);
        zza.writeString(str);
        zzda(11, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzm);
        zza.writeString(str);
        zzayc.zzf(zza, zzbpk);
        zzda(38, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzs zzs, zzm zzm, String str, zzbpk zzbpk) throws RemoteException {
        throw null;
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzs zzs, zzm zzm, String str, String str2, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzs);
        zzayc.zzd(zza, zzm);
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzf(zza, zzbpk);
        zzda(6, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzs zzs, zzm zzm, String str, String str2, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzs);
        zzayc.zzd(zza, zzm);
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzf(zza, zzbpk);
        zzda(35, zza);
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzm zzm, String str, zzbpk zzbpk) throws RemoteException {
        throw null;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzm zzm, String str, String str2, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzm);
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzf(zza, zzbpk);
        zzda(7, zza);
    }

    public final void zzz(IObjectWrapper iObjectWrapper, zzm zzm, String str, String str2, zzbpk zzbpk, zzbfl zzbfl, List list) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzm);
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzf(zza, zzbpk);
        zzayc.zzd(zza, zzbfl);
        zza.writeStringList(list);
        zzda(14, zza);
    }
}
