package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbuh;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzaz extends zzbb {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzba zzd;

    zzaz(zzba zzba, View view, HashMap hashMap, HashMap hashMap2) {
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
        this.zzd = zzba;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        HashMap hashMap = this.zzc;
        return zzcp.zzk(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(hashMap));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zza.getContext());
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                return zzbgf.zze(((zzbgj) zzs.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzay())).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
            } catch (RemoteException | zzr | NullPointerException e) {
                this.zzd.zzg = zzbuh.zza(this.zza.getContext());
                this.zzd.zzg.zzh(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        } else {
            zzba zzba = this.zzd;
            return zzba.zzf.zza(this.zza, this.zzb, this.zzc);
        }
    }
}
