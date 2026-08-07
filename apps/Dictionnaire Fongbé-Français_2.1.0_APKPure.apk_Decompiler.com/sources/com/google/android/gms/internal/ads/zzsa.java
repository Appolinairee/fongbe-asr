package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzsa {
    public final zzsg zza;
    public final MediaFormat zzb;
    public final zzab zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzrz zzf;

    private zzsa(zzsg zzsg, MediaFormat mediaFormat, zzab zzab, Surface surface, MediaCrypto mediaCrypto, zzrz zzrz) {
        this.zza = zzsg;
        this.zzb = mediaFormat;
        this.zzc = zzab;
        this.zzd = surface;
        this.zzf = zzrz;
    }

    public static zzsa zza(zzsg zzsg, MediaFormat mediaFormat, zzab zzab, MediaCrypto mediaCrypto, zzrz zzrz) {
        return new zzsa(zzsg, mediaFormat, zzab, (Surface) null, (MediaCrypto) null, zzrz);
    }

    public static zzsa zzb(zzsg zzsg, MediaFormat mediaFormat, zzab zzab, Surface surface, MediaCrypto mediaCrypto) {
        return new zzsa(zzsg, mediaFormat, zzab, surface, (MediaCrypto) null, (zzrz) null);
    }
}
