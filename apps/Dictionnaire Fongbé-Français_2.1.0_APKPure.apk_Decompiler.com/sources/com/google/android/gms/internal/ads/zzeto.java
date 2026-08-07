package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeto implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    zzeto(zzgcs zzgcs, Context context) {
        this.zza = zzgcs;
        this.zzb = context;
    }

    public final int zza() {
        return 37;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzetm(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetn zzc() throws Exception {
        zzbcc zzbcc = zzbcl.zzfX;
        return new zzetn(zzad.zzb(this.zzb, (String) zzbe.zzc().zza(zzbcc)));
    }
}
