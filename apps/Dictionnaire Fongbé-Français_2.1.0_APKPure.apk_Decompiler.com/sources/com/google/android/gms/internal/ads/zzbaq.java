package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbaq implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbar zza;

    zzbaq(zzbar zzbar) {
        this.zza = zzbar;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            zzbar zzbar = this.zza;
            if (zzbar.zzd != null) {
                zzbar.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
