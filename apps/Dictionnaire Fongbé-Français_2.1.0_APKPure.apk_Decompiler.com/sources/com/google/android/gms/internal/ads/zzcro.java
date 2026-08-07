package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcro {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcro(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    static /* bridge */ /* synthetic */ void zzb(zzcro zzcro, List list, zzgcd zzgcd) {
        if (list == null || list.isEmpty()) {
            zzcro.zza.execute(new zzcrj(zzgcd));
            return;
        }
        ListenableFuture zzh = zzgch.zzh((Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzh = zzgch.zzn(zzgch.zzf(zzh, Throwable.class, new zzcrk(zzgcd), zzcro.zza), new zzcrl(zzcro, zzgcd, (ListenableFuture) it.next()), zzcro.zza);
        }
        zzgch.zzr(zzh, new zzcrn(zzcro, zzgcd), zzcro.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zza(zzgcd zzgcd, ListenableFuture listenableFuture, zzcqz zzcqz) throws Exception {
        if (zzcqz != null) {
            zzgcd.zzb(zzcqz);
        }
        return zzgch.zzo(listenableFuture, ((Long) zzbey.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgcd zzgcd) {
        zzgch.zzr(this.zzc, new zzcrm(this, zzgcd), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
