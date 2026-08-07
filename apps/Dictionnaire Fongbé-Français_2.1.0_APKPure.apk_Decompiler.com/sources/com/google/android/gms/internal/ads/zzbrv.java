package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbrv implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbrw zzb;

    zzbrv(zzbrw zzbrw, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbrw;
    }

    public final void run() {
        zzv.zzj();
        zzn.zza(this.zzb.zza, this.zza, true, (zzdrw) null);
    }
}
