package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfbk implements OnAdMetadataChangedListener {
    final /* synthetic */ zzcc zza;
    final /* synthetic */ zzfbl zzb;

    zzfbk(zzfbl zzfbl, zzcc zzcc) {
        this.zza = zzcc;
        this.zzb = zzfbl;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
