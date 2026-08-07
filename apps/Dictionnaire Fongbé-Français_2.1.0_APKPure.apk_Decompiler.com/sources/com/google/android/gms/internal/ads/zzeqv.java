package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeqv implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    zzeqv(zzgcs zzgcs, Context context) {
        this.zzb = zzgcs;
        this.zza = context;
    }

    public final int zza() {
        return 57;
    }

    public final ListenableFuture zzb() {
        return this.zzb.zzb(new zzequ(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeqw zzc() throws Exception {
        zzv.zzq();
        return new zzeqw(zzs.zzt(this.zza));
    }
}
