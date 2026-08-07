package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbuh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzav extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzba zzb;

    zzav(zzba zzba, Context context) {
        this.zza = context;
        this.zzb = zzba;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "mobile_ads_settings");
        return new zzfm();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        return zzcp.zzh(ObjectWrapper.wrap(this.zza), 244410000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zza);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IBinder zze = ((zzda) zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzau())).zze(ObjectWrapper.wrap(this.zza), 244410000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof zzcz ? (zzcz) queryLocalInterface : new zzcx(zze);
            } catch (RemoteException | zzr | NullPointerException e) {
                this.zzb.zzg = zzbuh.zza(this.zza);
                this.zzb.zzg.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        } else {
            return this.zzb.zzc.zza(this.zza);
        }
    }
}
