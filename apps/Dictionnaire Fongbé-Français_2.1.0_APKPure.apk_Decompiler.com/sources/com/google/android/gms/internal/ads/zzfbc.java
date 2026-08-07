package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfbc implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzfbc(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzezf zza2 = ((zzezi) this.zzd).zzb();
        zzezf zzezf = zza2;
        zzfch zzfch = new zzfch();
        zzfch zzfch2 = zzfch;
        return new zzfbb((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzcgx) this.zzc.zzb(), zza2, (zzfar) this.zze.zzb(), zzfch, (zzfcb) this.zzf.zzb());
    }
}
