package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcno implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcno(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj;
        this.zzb = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzcnh zzcnh = (zzcnh) this.zza.zzb();
        Executor zzc = zzffh.zzc();
        if (((JSONObject) this.zzb.zzb()) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzddk(zzcnh, zzc));
        }
        zzhez.zzb(set);
        Set set2 = set;
        return set;
    }
}
