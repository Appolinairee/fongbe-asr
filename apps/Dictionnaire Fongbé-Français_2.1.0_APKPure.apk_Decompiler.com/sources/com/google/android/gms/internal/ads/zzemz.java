package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzy;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzemz implements zzetq {
    private final zzy zza;
    private final boolean zzb;

    public zzemz(zzy zzy, boolean z) {
        this.zza = zzy;
        this.zzb = z;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfp)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        zzy zzy = this.zza;
        if (zzy != null) {
            int i = zzy.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
