package com.google.android.gms.internal.ads;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbea {
    public static final zzbdv zza = zzbdv.zzb("gads:app_permissions_caching_expiry_ms:expiry", 60000);
    public static final zzbdv zzb = zzbdv.zzb("gads:audio_caching_expiry_ms:expiry", CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    public static final zzbdv zzc = zzbdv.zzb("gads:battery_caching_expiry_ms:expiry", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbdv zzd = zzbdv.zzb("gads:device_info_caching_expiry_ms:expiry", PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    public static final zzbdv zze = zzbdv.zzb("gads:hsdp_caching_expiry_ms:expiry", 600000);
    public static final zzbdv zzf = zzbdv.zzb("gads:memory_caching_expiry_ms:expiry", CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    public static final zzbdv zzg = zzbdv.zzb("gads:sdk_environment_caching_expiry_ms:expiry", 600000);
    public static final zzbdv zzh = zzbdv.zzb("gads:telephony_caching_expiry_ms:expiry", CoroutineLiveDataKt.DEFAULT_TIMEOUT);
}
