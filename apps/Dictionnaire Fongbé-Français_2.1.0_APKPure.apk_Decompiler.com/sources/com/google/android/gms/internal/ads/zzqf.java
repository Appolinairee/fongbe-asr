package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzqf {
    private final AudioTrack zza;
    private final zzon zzb;
    private AudioRouting.OnRoutingChangedListener zzc = new zzqe(this);

    public zzqf(AudioTrack audioTrack, zzon zzon) {
        this.zza = audioTrack;
        this.zzb = zzon;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void zza(zzqf zzqf, AudioRouting audioRouting) {
        if (zzqf.zzc != null && audioRouting.getRoutedDevice() != null) {
            zzqf.zzb.zzh(audioRouting.getRoutedDevice());
        }
    }

    public final void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(zzoc$$ExternalSyntheticApiModelOutline2.m((Object) onRoutingChangedListener));
        this.zzc = null;
    }
}
