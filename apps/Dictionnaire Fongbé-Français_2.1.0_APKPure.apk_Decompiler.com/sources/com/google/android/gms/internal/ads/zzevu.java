package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzevu implements zzetr {
    final ScheduledExecutorService zza;

    public zzevu(zzbti zzbti, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    public final int zza() {
        return 49;
    }

    public final ListenableFuture zzb() {
        return zzgch.zzm(zzgch.zzo(zzgch.zzh(new Bundle()), ((Long) zzbe.zzc().zza(zzbcl.zzek)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzevt(), zzbzw.zza);
    }
}
