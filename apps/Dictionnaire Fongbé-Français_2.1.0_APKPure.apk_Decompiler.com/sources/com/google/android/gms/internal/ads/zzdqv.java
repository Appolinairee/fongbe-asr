package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdqv implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzdqv(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        String zza2 = ((zzewd) this.zza).zza();
        String str = zza2;
        Context zza3 = ((zzche) this.zzb).zza();
        Context context = zza3;
        Executor zzc2 = zzffh.zzc();
        Map zzd = ((zzhev) this.zzc).zzb();
        Map map = zzd;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeW)).booleanValue()) {
            zzbbj zzbbj = new zzbbj(new zzbbp(zza3));
            zzbbj.zzb(new zzdqw(zza2));
            set = Collections.singleton(new zzddk(new zzdqy(zzbbj, zzd), zzc2));
        } else {
            set = Collections.emptySet();
        }
        zzhez.zzb(set);
        Set set2 = set;
        return set;
    }
}
