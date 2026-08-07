package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzenc implements zzetr {
    private final Executor zza;
    private final zzbzm zzb;

    zzenc(Executor executor, zzbzm zzbzm) {
        this.zza = executor;
        this.zzb = zzbzm;
    }

    public final int zza() {
        return 10;
    }

    public final ListenableFuture zzb() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcW)).booleanValue()) {
            return zzgch.zzh(new zzend((ArrayList) null));
        }
        return zzgch.zzm(this.zzb.zzk(), new zzenb(), this.zza);
    }
}
