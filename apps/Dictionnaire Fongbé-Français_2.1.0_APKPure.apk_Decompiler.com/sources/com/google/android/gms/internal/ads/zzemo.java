package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzemo implements zzetq {
    private final Bundle zza;

    zzemo(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuv = (zzcuv) obj;
        if (!this.zza.isEmpty()) {
            zzcuv.zza.putBundle("installed_adapter_data", this.zza);
        }
    }
}
