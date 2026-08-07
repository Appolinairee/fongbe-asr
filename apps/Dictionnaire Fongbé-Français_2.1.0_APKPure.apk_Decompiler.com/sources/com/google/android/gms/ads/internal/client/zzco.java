package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbyu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzco extends zzayb implements zzcp {
    public zzco() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzbpe zzf = zzbpd.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzayc.zzc(parcel);
                zzby zzd = zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzs) zzayc.zza(parcel, zzs.CREATOR), readString, zzf, readInt);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzd);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbpe zzf2 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzayc.zzc(parcel);
                zzby zze = zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzs) zzayc.zza(parcel, zzs.CREATOR), readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbpe zzf3 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbu zzb = zzb(asInterface, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, (IInterface) null);
                return true;
            case 5:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzbga zzj = zzj(asInterface2, asInterface3);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzj);
                return true;
            case 6:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzf4 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbvz zzo = zzo(asInterface4, zzf4, readInt4);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzo);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, (IInterface) null);
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzbte zzn = zzn(asInterface5);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzn);
                return true;
            case 9:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzayc.zzc(parcel);
                zzcz zzh = zzh(asInterface6, readInt5);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzh);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzayc.zzc(parcel);
                zzby zzf5 = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzs) zzayc.zza(parcel, zzs.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzbgg zzk = zzk(asInterface7, asInterface8, asInterface9);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzk);
                return true;
            case 12:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbpe zzf6 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbwp zzp = zzp(asInterface10, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzp);
                return true;
            case 13:
                String readString6 = parcel.readString();
                zzbpe zzf7 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzayc.zzc(parcel);
                zzby zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzs) zzayc.zza(parcel, zzs.CREATOR), readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzf8 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbyu zzq = zzq(asInterface11, zzf8, readInt9);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzq);
                return true;
            case 15:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzf9 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbsx zzm = zzm(asInterface12, zzf9, readInt10);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzm);
                return true;
            case 16:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzf10 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbko zzc2 = zzbkn.zzc(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzbkr zzl = zzl(asInterface13, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzl);
                return true;
            case 17:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzf11 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzayc.zzc(parcel);
                zzdu zzi = zzi(asInterface14, zzf11, readInt12);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzi);
                return true;
            case 18:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzf12 = zzbpd.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzayc.zzc(parcel);
                zzci zzg = zzg(asInterface15, zzf12, readInt13);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzg);
                return true;
            default:
                return false;
        }
    }
}
