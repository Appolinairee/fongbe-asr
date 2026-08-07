package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdvz implements Runnable {
    public final /* synthetic */ zzdwa zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzdvz(zzdwa zzdwa, Context context) {
        this.zza = zzdwa;
        this.zzb = context;
    }

    public final void run() {
        this.zza.zzc(this.zzb);
    }
}
