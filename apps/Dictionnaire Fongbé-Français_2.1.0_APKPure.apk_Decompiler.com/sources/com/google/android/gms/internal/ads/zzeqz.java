package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeqz implements zzetr {
    private final zzgcs zza;
    private final zzfcj zzb;

    zzeqz(zzgcs zzgcs, zzfcj zzfcj) {
        this.zza = zzgcs;
        this.zzb = zzfcj;
    }

    public final int zza() {
        return 21;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeqy(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzera zzc() throws Exception {
        return new zzera("requester_type_2".equals(zzaa.zzc(this.zzb.zzd)));
    }
}
