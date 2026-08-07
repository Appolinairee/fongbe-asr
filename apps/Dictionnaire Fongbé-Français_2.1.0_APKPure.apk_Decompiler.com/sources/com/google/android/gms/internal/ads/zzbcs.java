package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbcs {
    public static boolean zza(zzbda zzbda, zzbcx zzbcx, String... strArr) {
        if (zzbcx == null) {
            return false;
        }
        zzbda.zze(zzbcx, zzv.zzC().elapsedRealtime(), strArr);
        return true;
    }
}
