package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbbe implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcab zza;
    final /* synthetic */ zzbbf zzb;

    zzbbe(zzbbf zzbbf, zzcab zzcab) {
        this.zza = zzcab;
        this.zzb = zzbbf;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
