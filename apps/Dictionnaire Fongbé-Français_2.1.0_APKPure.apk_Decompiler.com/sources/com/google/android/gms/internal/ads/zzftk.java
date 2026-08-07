package com.google.android.gms.internal.ads;

import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzftk implements Runnable {
    public final /* synthetic */ zzftl zza;

    public /* synthetic */ zzftk(zzftl zzftl) {
        this.zza = zzftl;
    }

    public final void run() {
        zzftl zzftl = this.zza;
        zzftl.zza.zzc.zzc("unlinkToDeath", new Object[0]);
        IInterface zzb = zzftl.zza.zzj;
        zzb.getClass();
        IInterface iInterface = zzb;
        zzb.asBinder().unlinkToDeath(zzftl.zza.zzh, 0);
        zzftl.zza.zzj = null;
        zzftl.zza.zzf = false;
    }
}
