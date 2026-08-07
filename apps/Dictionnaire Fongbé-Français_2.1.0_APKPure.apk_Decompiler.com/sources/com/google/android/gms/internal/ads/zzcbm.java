package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcbm {
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) zzbe.zzc().zza(zzbcl.zzQ)).longValue());
    private long zzb;
    private boolean zzc = true;

    zzcbm() {
    }

    public final void zza(SurfaceTexture surfaceTexture, zzcax zzcax) {
        if (zzcax != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (!this.zzc) {
                if (Math.abs(timestamp - this.zzb) < this.zza) {
                    return;
                }
            }
            this.zzc = false;
            this.zzb = timestamp;
            zzfqw zzfqw = zzs.zza;
            Objects.requireNonNull(zzcax);
            zzfqw.post(new zzcbl(zzcax));
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
