package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfju extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfjv zza;

    zzfju(zzfjv zzfjv) {
        this.zza = zzfjv;
    }

    public final void onAvailable(Network network) {
        this.zza.zzs(true);
    }

    public final void onLost(Network network) {
        this.zza.zzs(false);
    }
}
