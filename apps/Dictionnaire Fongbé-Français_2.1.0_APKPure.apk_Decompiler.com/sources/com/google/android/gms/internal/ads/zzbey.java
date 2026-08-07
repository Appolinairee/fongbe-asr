package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbey {
    public static final zzbdv zza = zzbdv.zzb("gads:rendering:timeout_ms", 60000);

    static {
        zzbdv.zzb("gads:ad_loader:timeout_ms", 60000);
        zzbdv.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}
