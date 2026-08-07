package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzqj extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzqk zza;

    zzqj(zzqk zzqk) {
        this.zza = zzqk;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        audioTrack.equals(this.zza.zza.zzt);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zza.zza.zzt)) {
            this.zza.zza.zzQ = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.zza.zza.zzt);
    }
}
