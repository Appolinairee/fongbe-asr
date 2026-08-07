package com.google.android.gms.internal.ads;

import android.media.AudioRouting;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzqe implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ zzqf zza;

    public /* synthetic */ zzqe(zzqf zzqf) {
        this.zza = zzqf;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        zzqf.zza(this.zza, audioRouting);
    }
}
