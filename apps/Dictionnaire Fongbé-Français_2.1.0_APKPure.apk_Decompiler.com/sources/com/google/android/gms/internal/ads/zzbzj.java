package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbzj extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbzm zza;

    zzbzj(zzbzm zzbzm) {
        this.zza = zzbzm;
    }

    public final void onAvailable(Network network) {
        this.zza.zzo.set(true);
    }

    public final void onLost(Network network) {
        this.zza.zzo.set(false);
    }
}
