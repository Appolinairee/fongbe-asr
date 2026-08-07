package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfrg {
    private static zzfrg zzb;
    final zzfrc zza;

    private zzfrg(Context context) {
        this.zza = zzfrc.zzb(context);
        zzfrb.zza(context);
    }

    public static final zzfrg zza(Context context) {
        zzfrg zzfrg;
        synchronized (zzfrg.class) {
            if (zzb == null) {
                zzb = new zzfrg(context);
            }
            zzfrg = zzb;
        }
        return zzfrg;
    }

    public final void zzb(zzfra zzfra) throws IOException {
        synchronized (zzfrg.class) {
            this.zza.zze("vendor_scoped_gpid_v2_id");
            this.zza.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
