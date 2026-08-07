package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzhc {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = ProcessUtils$$ExternalSyntheticApiModelOutline0.m(0, 0);

    /* synthetic */ zzhc(MediaCodec.CryptoInfo cryptoInfo, zzhd zzhd) {
        this.zza = cryptoInfo;
    }

    static /* bridge */ /* synthetic */ void zza(zzhc zzhc, int i, int i2) {
        zzhc.zzb.set(i, i2);
        zzhc.zza.setPattern(zzhc.zzb);
    }
}
