package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzety implements zzetq {
    private final int zza;
    private final int zzb;

    zzety(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        int i = this.zza;
        if (i != -1 && this.zzb != -1) {
            bundle.putInt("sessions_without_flags", i);
            bundle.putInt("crashes_without_flags", this.zzb);
            int i2 = zzbc.zza;
            if (zzbe.zzc().zze()) {
                bundle.putBoolean("did_reset", true);
            }
        }
    }
}
