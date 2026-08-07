package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcfc implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbxu zza;
    final /* synthetic */ zzcff zzb;

    zzcfc(zzcff zzcff, zzbxu zzbxu) {
        this.zza = zzbxu;
        this.zzb = zzcff;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzaa(view, this.zza, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
