package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzekr implements zza, zzdds {
    private zzbi zza;

    public final synchronized void onAdClicked() {
        zzbi zzbi = this.zza;
        if (zzbi != null) {
            try {
                zzbi.zzb();
            } catch (RemoteException e) {
                zzo.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(zzbi zzbi) {
        this.zza = zzbi;
    }

    public final synchronized void zzdd() {
        zzbi zzbi = this.zza;
        if (zzbi != null) {
            try {
                zzbi.zzb();
            } catch (RemoteException e) {
                zzo.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    public final synchronized void zzu() {
    }
}
