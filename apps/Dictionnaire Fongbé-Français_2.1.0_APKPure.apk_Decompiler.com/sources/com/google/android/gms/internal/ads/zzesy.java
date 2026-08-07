package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesy implements zzetq {
    private final String zza;
    private final Bundle zzb;

    public zzesy(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuv = (zzcuv) obj;
        zzcuv.zza.putString("rtb", this.zza);
        if (!this.zzb.isEmpty()) {
            zzcuv.zza.putBundle("adapter_initialization_status", this.zzb);
        }
    }
}
