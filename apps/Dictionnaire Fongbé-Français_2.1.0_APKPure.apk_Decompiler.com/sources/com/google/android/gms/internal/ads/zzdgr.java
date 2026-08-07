package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdgr implements zzher {
    private final zzhfj zza;

    public zzdgr(zzhfj zzhfj) {
        this.zza = zzhfj;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzdiq zza2 = ((zzdgo) this.zza).zza();
        zzdiq zzdiq = zza2;
        if (zza2.zze() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzhez.zzb(set);
        Set set2 = set;
        return set;
    }
}
