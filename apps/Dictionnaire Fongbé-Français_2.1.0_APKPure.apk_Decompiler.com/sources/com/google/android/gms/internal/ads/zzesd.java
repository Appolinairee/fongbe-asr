package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesd implements zzetr {
    private final zzetr zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzesd(zzetr zzetr, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetr;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final ListenableFuture zzb() {
        ListenableFuture zzb2 = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcr)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            zzb2 = zzgch.zzo(zzb2, j, timeUnit, this.zzc);
        }
        return zzgch.zzf(zzb2, Throwable.class, new zzesc(this), zzbzw.zzg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcq)).booleanValue()) {
            zzetr zzetr = this.zza;
            zzbzm zzp = zzv.zzp();
            int zza2 = zzetr.zza();
            zzp.zzw(th, "OptionalSignalTimeout:" + zza2);
        }
        return zzgch.zzh((Object) null);
    }
}
