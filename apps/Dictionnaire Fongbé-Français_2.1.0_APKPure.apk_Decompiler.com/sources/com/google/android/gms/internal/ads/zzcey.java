package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcey implements Runnable {
    public final /* synthetic */ zzcff zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzbxu zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzcey(zzcff zzcff, View view, zzbxu zzbxu, int i) {
        this.zza = zzcff;
        this.zzb = view;
        this.zzc = zzbxu;
        this.zzd = i;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd);
    }
}
