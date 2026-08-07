package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfki {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private zzbpe zze;
    private final Clock zzf;

    zzfki(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = clock;
    }

    private static zzfjg zzc() {
        return new zzfjg(((Long) zzbe.zzc().zza(zzbcl.zzw)).longValue(), 2.0d, ((Long) zzbe.zzc().zza(zzbcl.zzx)).longValue(), 0.2d);
    }

    public final zzfkh zza(zzft zzft, zzcf zzcf) {
        AdFormat adFormat = AdFormat.getAdFormat(zzft.zzb);
        if (adFormat == null) {
            return null;
        }
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            return new zzfji(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzft, zzcf, this.zzc, zzc(), this.zzf);
        } else if (ordinal == 2) {
            return new zzfkl(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzft, zzcf, this.zzc, zzc(), this.zzf);
        } else if (ordinal != 5) {
            return null;
        } else {
            return new zzfjf(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzft, zzcf, this.zzc, zzc(), this.zzf);
        }
    }

    public final void zzb(zzbpe zzbpe) {
        this.zze = zzbpe;
    }
}
