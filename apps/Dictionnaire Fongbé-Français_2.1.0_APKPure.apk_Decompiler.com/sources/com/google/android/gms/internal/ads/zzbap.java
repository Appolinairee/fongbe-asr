package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbap implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbar zza;

    zzbap(zzbar zzbar) {
        this.zza = zzbar;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                zzbar zzbar = this.zza;
                if (zzbar.zzd != null) {
                    zzbar.zzf = zzbar.zzd.zzq();
                }
            } catch (DeadObjectException e) {
                zzo.zzh("Unable to obtain a cache service instance.", e);
                zzbar.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
