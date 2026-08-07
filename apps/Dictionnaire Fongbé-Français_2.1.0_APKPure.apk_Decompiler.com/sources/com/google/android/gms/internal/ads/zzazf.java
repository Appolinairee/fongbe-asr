package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzazf implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzazj zzb;

    zzazf(zzazj zzazj, View view) {
        this.zza = view;
        this.zzb = zzazj;
    }

    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
