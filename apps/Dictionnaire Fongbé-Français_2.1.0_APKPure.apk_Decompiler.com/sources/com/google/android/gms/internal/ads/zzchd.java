package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzchd implements zzher {
    private final zzhfj zza;

    public zzchd(zzhfj zzhfj) {
        this.zza = zzhfj;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        ApplicationInfo applicationInfo = zza2.getApplicationInfo();
        zzhez.zzb(applicationInfo);
        ApplicationInfo applicationInfo2 = applicationInfo;
        return applicationInfo;
    }
}
