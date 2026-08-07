package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbll implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcab zza;

    zzbll(zzblm zzblm, zzcab zzcab) {
        this.zza = zzcab;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
