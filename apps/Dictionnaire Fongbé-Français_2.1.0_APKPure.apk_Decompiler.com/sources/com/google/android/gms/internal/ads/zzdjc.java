package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdjc implements Runnable {
    public final /* synthetic */ zzdjf zza;
    public final /* synthetic */ ViewGroup zzb;

    public /* synthetic */ zzdjc(zzdjf zzdjf, ViewGroup viewGroup) {
        this.zza = zzdjf;
        this.zzb = viewGroup;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
