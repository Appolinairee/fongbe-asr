package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdqg implements zzher {
    private final zzhfj zza;

    public zzdqg(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        Executor zzc = zzffh.zzc();
        zzdqy zza2 = ((zzdqz) this.zza).zzb();
        zzdqy zzdqy = zza2;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeW)).booleanValue()) {
            set = Collections.singleton(new zzddk(zza2, zzc));
        } else {
            set = Collections.emptySet();
        }
        zzhez.zzb(set);
        Set set2 = set;
        return set;
    }
}
