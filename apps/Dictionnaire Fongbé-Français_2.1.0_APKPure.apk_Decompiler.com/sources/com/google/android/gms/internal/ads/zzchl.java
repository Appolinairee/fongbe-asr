package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzchl implements zzher {
    private final zzhfj zza;

    public zzchl(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzduc zzduc = (zzduc) this.zza.zzb();
        Executor zzc = zzffh.zzc();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbL)).booleanValue()) {
            set = Collections.singleton(new zzddk(zzduc, zzc));
        } else {
            set = Collections.emptySet();
        }
        zzhez.zzb(set);
        Set set2 = set;
        return set;
    }
}
