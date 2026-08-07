package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfrf extends zzfrd {
    private static zzfrf zzd;

    private zzfrf(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfrf zzi(Context context) {
        zzfrf zzfrf;
        synchronized (zzfrf.class) {
            if (zzd == null) {
                zzd = new zzfrf(context);
            }
            zzfrf = zzd;
        }
        return zzfrf;
    }

    public final zzfra zzh(long j, boolean z) throws IOException {
        synchronized (zzfrf.class) {
            if (!this.zzc.zzd()) {
                zzfra zzfra = new zzfra();
                return zzfra;
            }
            zzfra zzb = zzb((String) null, (String) null, j, z);
            return zzb;
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfrf.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }
}
