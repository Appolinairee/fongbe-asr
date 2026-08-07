package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzavf extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzavg zza;

    zzavf(zzavg zzavg) {
        this.zza = zzavg;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzavg.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (zzavg.class) {
            this.zza.zza = null;
        }
    }
}
