package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzxk implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzxt zza;

    zzxk(zzxl zzxl, zzxt zzxt) {
        this.zza = zzxt;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }
}
