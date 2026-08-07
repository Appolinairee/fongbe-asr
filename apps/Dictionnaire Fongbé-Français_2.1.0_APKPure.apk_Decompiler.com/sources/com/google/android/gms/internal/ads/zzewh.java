package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzewh implements zzetr {
    private final zzbzm zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgcs zze;

    zzewh(zzbzm zzbzm, boolean z, boolean z2, zzbzb zzbzb, zzgcs zzgcs, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzbzm;
        this.zzb = z;
        this.zzc = z2;
        this.zze = zzgcs;
        this.zzd = scheduledExecutorService;
    }

    public final int zza() {
        return 50;
    }

    public final ListenableFuture zzb() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgQ)).booleanValue() && this.zzc) {
            return zzgch.zzh(new zzewi((String) null));
        }
        if (!this.zzb) {
            return zzgch.zzh(new zzewi((String) null));
        }
        return zzgch.zze(zzgch.zzo(zzgch.zzm(zzgch.zzh((Object) null), new zzewf(), this.zze), ((Long) zzbez.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzewg(this), this.zze);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzewi zzc(Exception exc) {
        this.zza.zzw(exc, "TrustlessTokenSignal");
        return new zzewi((String) null);
    }
}
