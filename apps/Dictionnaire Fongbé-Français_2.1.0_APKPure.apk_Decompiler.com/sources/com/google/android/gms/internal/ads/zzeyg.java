package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeyg implements zzezf {
    private zzcuz zza;
    private final Executor zzb = zzgcz.zzc();

    public final zzcuz zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzezg zzezg, zzeze zzeze, zzcuz zzcuz) {
        zzcuy zza2 = zzeze.zza(zzezg.zzb);
        zza2.zzb(new zzezj(true));
        zzcuz zzcuz2 = (zzcuz) zza2.zzh();
        this.zza = zzcuz2;
        zzcsd zzb2 = zzcuz2.zzb();
        zzfef zzfef = new zzfef();
        return (zzgby) zzgch.zzm((zzgby) zzgch.zzn(zzgby.zzu(zzb2.zzi()), new zzeye(this, zzfef, zzb2), this.zzb), new zzeyf(zzfef), this.zzb);
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezg zzezg, zzeze zzeze, Object obj) {
        zzcuz zzcuz = null;
        return zzb(zzezg, zzeze, (zzcuz) null);
    }

    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
