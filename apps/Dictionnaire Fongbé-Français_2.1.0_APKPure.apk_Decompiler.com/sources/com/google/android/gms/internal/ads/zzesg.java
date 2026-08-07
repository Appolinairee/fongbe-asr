package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesg implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzesg(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    /* renamed from: zza */
    public final zzese zzb() {
        Context zza2 = ((zzche) this.zzc).zza();
        Context context = zza2;
        return new zzese((ApplicationInfo) this.zza.zzb(), (PackageInfo) this.zzb.zzb(), zza2);
    }
}
