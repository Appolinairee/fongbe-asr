package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzbpy implements InitializationCompleteCallback {
    final /* synthetic */ zzblr zza;

    zzbpy(zzbqf zzbqf, zzblr zzblr) {
        this.zza = zzblr;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }
}
