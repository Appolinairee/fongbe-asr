package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdhm implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzdhm(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcnr zzcnr = new zzcnr((Executor) this.zzb.zzb(), new zzcnd((Context) this.zzc.zzb(), (zzayg) this.zza.zzb()), (Clock) this.zzd.zzb());
        zzcnr zzcnr2 = zzcnr;
        return zzcnr;
    }
}
