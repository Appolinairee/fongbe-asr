package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final /* synthetic */ class zzbbk implements Runnable {
    public final /* synthetic */ zzbbp zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbbk(zzbbp zzbbp, Context context) {
        this.zza = zzbbp;
        this.zzb = context;
    }

    public final void run() {
        boolean booleanValue = ((Boolean) zzbe.zzc().zza(zzbcl.zzeW)).booleanValue();
        zzbbp zzbbp = this.zza;
        Context context = this.zzb;
        if (booleanValue) {
            try {
                zzbbp.zza = (zzayf) zzs.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzbbl());
                zzbbp.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                zzbbp.zzb = true;
            } catch (RemoteException | zzr | NullPointerException unused) {
                zzo.zze("Cannot dynamite load clearcut");
            }
        }
    }
}
