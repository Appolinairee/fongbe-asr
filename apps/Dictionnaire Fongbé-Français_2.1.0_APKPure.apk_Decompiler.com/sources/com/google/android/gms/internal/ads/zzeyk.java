package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeyk implements zzfer {
    public final zzeze zza;
    public final zzezg zzb;
    public final zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final zzy zzf;
    public final zzfeg zzg;

    public zzeyk(zzeze zzeze, zzezg zzezg, zzm zzm, String str, Executor executor, zzy zzy, zzfeg zzfeg) {
        this.zza = zzeze;
        this.zzb = zzezg;
        this.zzc = zzm;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzy;
        this.zzg = zzfeg;
    }

    public final zzfeg zza() {
        return this.zzg;
    }

    public final Executor zzb() {
        return this.zze;
    }
}
