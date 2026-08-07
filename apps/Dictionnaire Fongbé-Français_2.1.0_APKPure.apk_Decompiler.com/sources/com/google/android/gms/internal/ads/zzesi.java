package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesi implements zzetq {
    private final Bundle zza;

    public zzesi(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcuv zzcuv = (zzcuv) obj;
        if (bundle != null) {
            zzcuv.zzb.putAll(bundle);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcuv zzcuv = (zzcuv) obj;
        if (bundle != null) {
            zzcuv.zza.putAll(bundle);
        }
    }
}
