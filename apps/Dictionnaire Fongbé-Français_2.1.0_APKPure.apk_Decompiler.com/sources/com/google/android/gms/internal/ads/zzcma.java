package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcma implements zzcwo {
    private final zzfdh zza;

    public zzcma(zzfdh zzfdh) {
        this.zza = zzfdh;
    }

    public final void zzdh(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfcq e) {
            zzo.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    public final void zzdj(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfcq e) {
            zzo.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    public final void zzdk(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfcq e) {
            zzo.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
