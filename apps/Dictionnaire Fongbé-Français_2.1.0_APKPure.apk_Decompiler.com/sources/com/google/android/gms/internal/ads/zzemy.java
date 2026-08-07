package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzemy implements zzetr {
    private final zzgcs zza;
    private final zzfcj zzb;
    private final zzbzq zzc;

    public zzemy(zzgcs zzgcs, zzfcj zzfcj, zzbzq zzbzq) {
        this.zza = zzgcs;
        this.zzb = zzfcj;
        this.zzc = zzbzq;
    }

    public final int zza() {
        return 9;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzemx(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzemz zzc() throws Exception {
        return new zzemz(this.zzb.zzj, this.zzc.zzm());
    }
}
