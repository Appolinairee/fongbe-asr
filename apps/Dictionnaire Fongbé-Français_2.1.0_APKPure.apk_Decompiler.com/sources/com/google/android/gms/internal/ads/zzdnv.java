package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdnv extends VideoController.VideoLifecycleCallbacks {
    private final zzdif zza;

    public zzdnv(zzdif zzdif) {
        this.zza = zzdif;
    }

    private static zzee zza(zzdif zzdif) {
        zzeb zzj = zzdif.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void onVideoEnd() {
        zzee zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zze();
            } catch (RemoteException e) {
                zzo.zzk("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoPause() {
        zzee zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzg();
            } catch (RemoteException e) {
                zzo.zzk("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoStart() {
        zzee zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzi();
            } catch (RemoteException e) {
                zzo.zzk("Unable to call onVideoEnd()", e);
            }
        }
    }
}
