package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzar extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbpe zzc;
    final /* synthetic */ zzba zzd;

    zzar(zzba zzba, Context context, String str, zzbpe zzbpe) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbpe;
        this.zzd = zzba;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "native_ad");
        return new zzfi();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        return zzcp.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zza);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzaq())).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
            } catch (RemoteException | zzr | NullPointerException e) {
                this.zzd.zzg = zzbuh.zza(this.zza);
                this.zzd.zzg.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        } else {
            return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
        }
    }
}
