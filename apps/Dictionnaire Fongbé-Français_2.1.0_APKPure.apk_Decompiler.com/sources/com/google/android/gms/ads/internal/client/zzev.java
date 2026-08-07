package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzblt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzev extends zzblt {
    final /* synthetic */ zzex zza;

    /* synthetic */ zzev(zzex zzex, zzew zzew) {
        this.zza = zzex;
    }

    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (this.zza.zzc) {
            this.zza.zzf = false;
            this.zza.zzg = true;
            arrayList = new ArrayList(this.zza.zze);
            this.zza.zze.clear();
        }
        InitializationStatus zzd = zzex.zzA(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzd);
        }
    }
}
