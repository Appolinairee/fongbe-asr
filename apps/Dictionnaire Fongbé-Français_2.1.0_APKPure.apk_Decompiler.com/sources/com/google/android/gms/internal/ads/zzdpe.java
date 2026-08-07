package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdpe implements zzcwo {
    private final zzcex zza;

    zzdpe(zzcex zzcex) {
        this.zza = zzcex;
    }

    public final void zzdh(Context context) {
        zzcex zzcex = this.zza;
        if (zzcex != null) {
            zzcex.destroy();
        }
    }

    public final void zzdj(Context context) {
        zzcex zzcex = this.zza;
        if (zzcex != null) {
            zzcex.onPause();
        }
    }

    public final void zzdk(Context context) {
        zzcex zzcex = this.zza;
        if (zzcex != null) {
            zzcex.onResume();
        }
    }
}
