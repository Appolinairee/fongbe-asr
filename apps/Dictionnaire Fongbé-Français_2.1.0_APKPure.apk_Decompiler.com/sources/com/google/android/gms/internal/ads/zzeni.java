package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeni implements zzetr {
    final zzbzm zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgcs zzd;
    private final Context zze;

    zzeni(Context context, zzbzm zzbzm, ScheduledExecutorService scheduledExecutorService, zzgcs zzgcs) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzdb)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzm;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgcs;
    }

    public final int zza() {
        return 11;
    }

    public final ListenableFuture zzb() {
        Task<AppSetIdInfo> task;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcX)).booleanValue()) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzdc)).booleanValue()) {
                if (!((Boolean) zzbe.zzc().zza(zzbcl.zzcY)).booleanValue()) {
                    return zzgch.zzm(zzfrj.zza(this.zzb.getAppSetIdInfo(), (CancellationTokenSource) null), new zzenf(), zzbzw.zzg);
                }
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzdb)).booleanValue()) {
                    task = zzfdn.zza(this.zze);
                } else {
                    task = this.zzb.getAppSetIdInfo();
                }
                if (task == null) {
                    return zzgch.zzh(new zzenj((String) null, -1));
                }
                ListenableFuture zzn = zzgch.zzn(zzfrj.zza(task, (CancellationTokenSource) null), new zzeng(), zzbzw.zzg);
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzcZ)).booleanValue()) {
                    zzn = zzgch.zzo(zzn, ((Long) zzbe.zzc().zza(zzbcl.zzda)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgch.zze(zzn, Exception.class, new zzenh(this), this.zzd);
            }
        }
        return zzgch.zzh(new zzenj((String) null, -1));
    }
}
