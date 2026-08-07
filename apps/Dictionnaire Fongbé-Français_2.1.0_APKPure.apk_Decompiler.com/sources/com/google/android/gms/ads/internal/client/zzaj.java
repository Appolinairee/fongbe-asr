package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbta;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzaj extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpe zzb;

    zzaj(zzba zzba, Context context, zzbpe zzbpe) {
        this.zza = context;
        this.zzb = zzbpe;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        return zzcp.zzm(ObjectWrapper.wrap(this.zza), this.zzb, 244410000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbta) zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new zzai())).zze(ObjectWrapper.wrap(this.zza), this.zzb, 244410000);
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
