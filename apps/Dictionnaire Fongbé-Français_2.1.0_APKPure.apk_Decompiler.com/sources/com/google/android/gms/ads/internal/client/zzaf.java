package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzaf extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpe zzb;

    zzaf(zzba zzba, Context context, zzbpe zzbpe) {
        this.zza = context;
        this.zzb = zzbpe;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "out_of_context_tester");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbcl.zza(context);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjm)).booleanValue()) {
            return zzcp.zzi(wrap, this.zzb, 244410000);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbcl.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjm)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdv) zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzae())).zze(wrap, this.zzb, 244410000);
        } catch (RemoteException | zzr | NullPointerException e) {
            zzbuh.zza(this.zza).zzh(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
