package com.google.android.gms.internal.ads;

import androidx.core.os.EnvironmentCompat;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfjp {
    private final zzdrw zza;

    zzfjp(zzdrw zzdrw) {
        this.zza = zzdrw;
    }

    private final void zzg(AdFormat adFormat, Optional optional, String str, long j, Optional optional2) {
        String str2;
        zzdrv zza2 = this.zza.zza();
        zza2.zzb(str, Long.toString(j));
        if (adFormat == null) {
            str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        } else {
            str2 = adFormat.name();
        }
        zza2.zzb("ad_format", str2);
        optional.ifPresent(new zzfjn(zza2));
        optional2.ifPresent(new zzfjo(zza2));
        zza2.zzg();
    }

    public final void zza(AdFormat adFormat, long j, Optional optional, Optional optional2) {
        zzdrv zza2 = this.zza.zza();
        zza2.zzb("plaac_ts", Long.toString(j));
        zza2.zzb("ad_format", adFormat.name());
        zza2.zzb("action", "is_ad_available");
        optional.ifPresent(new zzfjl(zza2));
        optional2.ifPresent(new zzfjm(zza2));
        zza2.zzg();
    }

    public final void zzb(AdFormat adFormat, long j, Optional optional) {
        zzg(adFormat, ProcessUtils$$ExternalSyntheticApiModelOutline0.m(), "pano_ts", j, optional);
    }

    public final void zzc(AdFormat adFormat, long j) {
        zzg(adFormat, ProcessUtils$$ExternalSyntheticApiModelOutline0.m(), "paeo_ts", j, ProcessUtils$$ExternalSyntheticApiModelOutline0.m());
    }

    public final void zzd(AdFormat adFormat, long j) {
        zzg(adFormat, Optional.of("poll_ad"), "ppac_ts", j, ProcessUtils$$ExternalSyntheticApiModelOutline0.m());
    }

    public final void zze(AdFormat adFormat, long j, Optional optional) {
        zzg(adFormat, Optional.of("poll_ad"), "ppla_ts", j, optional);
    }

    public final void zzf(Map map, long j) {
        zzdrv zza2 = this.zza.zza();
        zza2.zzb("action", "start_preload");
        zza2.zzb("sp_ts", Long.toString(j));
        for (AdFormat adFormat : map.keySet()) {
            String valueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zza2.zzb(valueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zza2.zzg();
    }
}
