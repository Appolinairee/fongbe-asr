package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzpx {
    public static void zza(AudioTrack audioTrack, zzoo zzoo) {
        boolean unused = audioTrack.setPreferredDevice(zzoo == null ? null : zzoo.zza);
    }
}
