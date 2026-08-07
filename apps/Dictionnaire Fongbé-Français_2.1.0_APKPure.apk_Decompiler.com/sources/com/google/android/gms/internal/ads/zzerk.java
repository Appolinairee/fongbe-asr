package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzerk implements zzetr {
    private final zzgcs zza;
    private final zzduv zzb;

    zzerk(zzgcs zzgcs, zzduv zzduv) {
        this.zza = zzgcs;
        this.zzb = zzduv;
    }

    public final int zza() {
        return 23;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzerj(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzerl zzc() throws Exception {
        zzduv zzduv = this.zzb;
        String zzc = zzduv.zzc();
        boolean zzr = zzduv.zzr();
        boolean zzl = zzv.zzt().zzl();
        zzduv zzduv2 = this.zzb;
        return new zzerl(zzc, zzr, zzl, zzduv2.zzp(), zzduv2.zzs());
    }
}
