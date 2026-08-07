package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzevb implements zzetr {
    private final zzbzm zza;
    private final ScheduledExecutorService zzb;
    private final zzgcs zzc;

    zzevb(String str, zzbam zzbam, zzbzm zzbzm, ScheduledExecutorService scheduledExecutorService, zzgcs zzgcs) {
        this.zza = zzbzm;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgcs;
    }

    public final int zza() {
        return 43;
    }

    public final ListenableFuture zzb() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcX)).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdc)).booleanValue()) {
                ListenableFuture zzn = zzgch.zzn(zzfrj.zza(Tasks.forResult(null), (CancellationTokenSource) null), new zzeuz(), this.zzc);
                if (((Boolean) zzbdy.zza.zze()).booleanValue()) {
                    zzn = zzgch.zzo(zzn, ((Long) zzbdy.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgch.zze(zzn, Exception.class, new zzeva(this), this.zzc);
            }
        }
        return zzgch.zzh(new zzevc((String) null, -1));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzevc zzc(Exception exc) {
        this.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzevc((String) null, -1);
    }
}
