package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzflj extends zzflm {
    private static final zzflj zzb = new zzflj();

    private zzflj() {
    }

    public static zzflj zza() {
        return zzb;
    }

    public final void zzb(boolean z) {
        for (zzfkt zzg : zzflk.zza().zzc()) {
            zzg.zzg().zzk(z);
        }
    }

    public final boolean zzc() {
        for (zzfkt zzf : zzflk.zza().zzb()) {
            View zzf2 = zzf.zzf();
            if (zzf2 != null && zzf2.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
