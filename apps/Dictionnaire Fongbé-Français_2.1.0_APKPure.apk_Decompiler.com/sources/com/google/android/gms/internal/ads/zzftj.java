package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzftj implements Runnable {
    public final /* synthetic */ zzftl zza;
    public final /* synthetic */ IBinder zzb;

    public /* synthetic */ zzftj(zzftl zzftl, IBinder iBinder) {
        this.zza = zzftl;
        this.zzb = iBinder;
    }

    public final void run() {
        zzftl zzftl = this.zza;
        zzftl.zza.zzj = zzfrm.zzb(this.zzb);
        zzftl.zza.zzc.zzc("linkToDeath", new Object[0]);
        try {
            IInterface zzb2 = zzftl.zza.zzj;
            if (zzb2 != null) {
                IInterface iInterface = zzb2;
                zzb2.asBinder().linkToDeath(zzftl.zza.zzh, 0);
                zzftl.zza.zzf = false;
                synchronized (zzftl.zza.zze) {
                    for (Runnable run : zzftl.zza.zze) {
                        run.run();
                    }
                    zzftl.zza.zze.clear();
                }
                return;
            }
            throw null;
        } catch (RemoteException e) {
            zzftl.zza.zzc.zzb(e, "linkToDeath failed", new Object[0]);
        }
    }
}
