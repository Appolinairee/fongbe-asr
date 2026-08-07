package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbku;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzal extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpe zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    zzal(zzba zzba, Context context, zzbpe zzbpe, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbpe;
        this.zzc = onH5AdsEventListener;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza() {
        return new zzbky();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        return zzcp.zzl(ObjectWrapper.wrap(this.zza), this.zzb, 244410000, new zzbkl(this.zzc));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbku) zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzak())).zze(ObjectWrapper.wrap(this.zza), this.zzb, 244410000, new zzbkl(this.zzc));
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
