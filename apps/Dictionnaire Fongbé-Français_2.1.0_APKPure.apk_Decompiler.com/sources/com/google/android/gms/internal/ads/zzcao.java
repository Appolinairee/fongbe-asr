package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcao implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcaw zzb;

    zzcao(zzcaw zzcaw, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcaw;
    }

    public final void run() {
        zzcaw.zzl(this.zzb, this.zza);
        zzcaw zzcaw = this.zzb;
        if (zzcaw.zzq != null) {
            zzcaw.zzq.zzf();
        }
    }
}
