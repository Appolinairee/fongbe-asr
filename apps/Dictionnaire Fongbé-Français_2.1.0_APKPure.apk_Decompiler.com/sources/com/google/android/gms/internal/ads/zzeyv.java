package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeyv implements zzezf {
    private final zzezf zza;
    private zzcuz zzb;

    public zzeyv(zzezf zzezf) {
        this.zza = zzezf;
    }

    /* renamed from: zza */
    public final synchronized zzcuz zzd() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezg zzezg, zzeze zzeze, Object obj) {
        zzcuz zzcuz = null;
        return zzb(zzezg, zzeze, (zzcuz) null);
    }

    public final synchronized ListenableFuture zzb(zzezg zzezg, zzeze zzeze, zzcuz zzcuz) {
        this.zzb = zzcuz;
        if (zzcuz == null || zzezg.zza == null) {
            zzcuz zzcuz2 = zzcuz;
            return ((zzeyu) this.zza).zzb(zzezg, zzeze, zzcuz);
        }
        zzbvk zzbvk = zzezg.zza;
        zzcsd zzb2 = zzcuz.zzb();
        return zzb2.zzh(zzb2.zzj(zzgch.zzh(zzbvk)));
    }
}
