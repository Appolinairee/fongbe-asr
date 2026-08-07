package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaan implements DisplayManager.DisplayListener {
    final /* synthetic */ zzaap zza;
    private final DisplayManager zzb;

    public zzaan(zzaap zzaap, DisplayManager displayManager) {
        this.zza = zzaap;
        this.zzb = displayManager;
    }

    private final Display zzc() {
        return this.zzb.getDisplay(0);
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            zzaap.zzb(this.zza, zzc());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.zzb.registerDisplayListener(this, zzei.zzy((Handler.Callback) null));
        zzaap.zzb(this.zza, zzc());
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }
}
