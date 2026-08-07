package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdhu implements Runnable {
    public final /* synthetic */ zzdia zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdhu(zzdia zzdia, View view, boolean z, int i) {
        this.zza = zzdia;
        this.zzb = view;
        this.zzc = z;
        this.zzd = i;
    }

    public final void run() {
        this.zza.zzx(this.zzb, this.zzc, this.zzd);
    }
}
