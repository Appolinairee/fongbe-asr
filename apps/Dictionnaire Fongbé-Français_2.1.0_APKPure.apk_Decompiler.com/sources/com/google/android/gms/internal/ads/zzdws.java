package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdws implements zzher {
    private final zzhfj zza;

    public zzdws(zzhfj zzhfj) {
        this.zza = zzhfj;
    }

    /* renamed from: zza */
    public final String zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        String packageName = zza2.getPackageName();
        zzhez.zzb(packageName);
        String str = packageName;
        return packageName;
    }
}
