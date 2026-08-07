package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzblk implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcab zza;
    final /* synthetic */ zzblm zzb;

    zzblk(zzblm zzblm, zzcab zzcab) {
        this.zza = zzcab;
        this.zzb = zzblm;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zza.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException("onConnectionSuspended: " + i));
    }
}
