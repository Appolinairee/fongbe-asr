package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbuh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzax extends zzbb {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzba zzd;

    zzax(zzba zzba, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
        this.zzd = zzba;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zzc, "native_ad_view_delegate");
        return new zzfn();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        return zzcp.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zzc);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                return zzbfz.zzdy(((zzbgd) zzs.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzaw())).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 244410000));
            } catch (RemoteException | zzr | NullPointerException e) {
                this.zzd.zzg = zzbuh.zza(this.zzc);
                this.zzd.zzg.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        } else {
            zzba zzba = this.zzd;
            return zzba.zzd.zza(this.zzc, this.zza, this.zzb);
        }
    }
}
