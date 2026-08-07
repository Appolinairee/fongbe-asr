package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzrz {
    private final HashSet zza;
    private LoudnessCodecController zzb;

    public zzrz() {
        throw null;
    }

    public zzrz(zzry zzry) {
        this.zza = new HashSet();
    }

    public final void zza(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController == null || zzoc$$ExternalSyntheticApiModelOutline2.m(loudnessCodecController, mediaCodec)) {
            zzcw.zzf(this.zza.add(mediaCodec));
        }
    }

    public final void zzb() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.zza.remove(mediaCodec) && (loudnessCodecController = this.zzb) != null) {
            zzoc$$ExternalSyntheticApiModelOutline2.m(loudnessCodecController, mediaCodec);
        }
    }

    public final void zzd(int i) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        LoudnessCodecController m = LoudnessCodecController.create(i, zzgcz.zzc(), new zzrw(this));
        this.zzb = m;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!zzoc$$ExternalSyntheticApiModelOutline2.m(m, (MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
