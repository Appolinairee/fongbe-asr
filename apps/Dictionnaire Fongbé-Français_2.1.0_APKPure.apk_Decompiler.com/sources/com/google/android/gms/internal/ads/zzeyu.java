package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeyu implements zzezf {
    private zzcuz zza;

    /* renamed from: zza */
    public final synchronized zzcuz zzd() {
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezg zzezg, zzeze zzeze, Object obj) {
        zzcuz zzcuz = null;
        return zzb(zzezg, zzeze, (zzcuz) null);
    }

    public final synchronized ListenableFuture zzb(zzezg zzezg, zzeze zzeze, zzcuz zzcuz) {
        zzcsd zzb;
        if (zzcuz != null) {
            this.zza = zzcuz;
        } else {
            this.zza = (zzcuz) zzeze.zza(zzezg.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzh(zzb.zzi());
    }
}
