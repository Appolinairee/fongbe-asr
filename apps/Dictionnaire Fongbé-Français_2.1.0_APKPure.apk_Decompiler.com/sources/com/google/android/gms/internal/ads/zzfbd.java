package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfbd implements OnAdMetadataChangedListener {
    final /* synthetic */ zzdo zza;
    final /* synthetic */ zzfbf zzb;

    zzfbd(zzfbf zzfbf, zzdo zzdo) {
        this.zza = zzdo;
        this.zzb = zzfbf;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzi != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
