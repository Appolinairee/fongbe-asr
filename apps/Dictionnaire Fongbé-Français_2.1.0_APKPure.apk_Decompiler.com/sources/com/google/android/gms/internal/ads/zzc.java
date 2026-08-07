package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzc {
    public final AudioAttributes zza;

    /* synthetic */ zzc(zze zze, zzd zzd) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        if (zzei.zza >= 29) {
            AudioAttributes.Builder unused = usage.setAllowedCapturePolicy(1);
        }
        if (zzei.zza >= 32) {
            AudioAttributes.Builder unused2 = usage.setSpatializationBehavior(0);
        }
        this.zza = usage.build();
    }
}
