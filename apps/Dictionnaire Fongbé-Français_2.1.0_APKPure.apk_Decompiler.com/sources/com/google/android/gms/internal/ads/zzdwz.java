package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdwz {
    private final ScheduledExecutorService zza;
    private final zzgcs zzb;
    private final zzgcs zzc;
    private final zzdxu zzd;
    private final zzhel zze;

    public zzdwz(ScheduledExecutorService scheduledExecutorService, zzgcs zzgcs, zzgcs zzgcs2, zzdxu zzdxu, zzhel zzhel) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgcs;
        this.zzc = zzgcs2;
        this.zzd = zzdxu;
        this.zze = zzhel;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdyi zza(zzbvk zzbvk) throws Exception {
        return (zzdyi) this.zzd.zza(zzbvk).get((long) ((Integer) zzbe.zzc().zza(zzbcl.zzfy)).intValue(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(zzbvk zzbvk, int i, Throwable th) throws Exception {
        Bundle bundle;
        if (!(zzbvk == null || (bundle = zzbvk.zzm) == null)) {
            bundle.putBoolean("ls", true);
        }
        return zzgch.zzn(((zzdzl) this.zze.zzb()).zzd(zzbvk, i), new zzdww(zzbvk), this.zzb);
    }

    public final ListenableFuture zzc(zzbvk zzbvk) {
        ListenableFuture listenableFuture;
        String str = zzbvk.zzd;
        zzv.zzq();
        if (zzs.zzD(str)) {
            listenableFuture = zzgch.zzg(new zzdyh(1));
        } else {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzhn)).booleanValue()) {
                listenableFuture = this.zzc.zzb(new zzdwx(this, zzbvk));
            } else {
                listenableFuture = this.zzd.zza(zzbvk);
            }
        }
        int callingUid = Binder.getCallingUid();
        zzgby zzu = zzgby.zzu(listenableFuture);
        zzbcc zzbcc = zzbcl.zzfy;
        return (zzgby) zzgch.zzf((zzgby) zzgch.zzo(zzu, (long) ((Integer) zzbe.zzc().zza(zzbcc)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzdwy(this, zzbvk, callingUid), this.zzb);
    }
}
