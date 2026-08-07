package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzetn implements zzetq {
    private final Bundle zza;

    public zzetn(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcuv zzcuv = (zzcuv) obj;
        if (!this.zza.isEmpty()) {
            zzcuv.zzb.putBundle("shared_pref", this.zza);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuv = (zzcuv) obj;
        if (!this.zza.isEmpty()) {
            zzcuv.zza.putBundle("shared_pref", this.zza);
        }
    }
}
