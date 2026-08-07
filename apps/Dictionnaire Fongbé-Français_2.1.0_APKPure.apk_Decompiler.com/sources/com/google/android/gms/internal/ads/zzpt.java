package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzpt implements Runnable {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzpj zzb;
    public final /* synthetic */ Handler zzc;
    public final /* synthetic */ zzpg zzd;

    public /* synthetic */ zzpt(AudioTrack audioTrack, zzpj zzpj, Handler handler, zzpg zzpg) {
        this.zza = audioTrack;
        this.zzb = zzpj;
        this.zzc = handler;
        this.zzd = zzpg;
    }

    public final void run() {
        zzqm.zzI(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
