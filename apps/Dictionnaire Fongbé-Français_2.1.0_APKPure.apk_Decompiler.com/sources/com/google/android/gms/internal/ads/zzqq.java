package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzqq implements zzpj {
    final /* synthetic */ zzqs zza;

    /* synthetic */ zzqq(zzqs zzqs, zzqr zzqr) {
        this.zza = zzqs;
    }

    public final void zza(Exception exc) {
        zzdo.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }
}
