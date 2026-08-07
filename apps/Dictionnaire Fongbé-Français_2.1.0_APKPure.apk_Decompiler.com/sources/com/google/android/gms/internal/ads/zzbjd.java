package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbjd implements zzgcd {
    final /* synthetic */ zzcex zza;

    zzbjd(zzcex zzcex) {
        this.zza = zzcex;
    }

    public final void zza(Throwable th) {
        zzv.zzp().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        com.google.android.gms.ads.internal.util.client.zzv zzv = this.zza.zzD() != null ? this.zza.zzD().zzax : null;
        zzcex zzcex = this.zza;
        new zzbw(zzcex.getContext(), zzcex.zzn().afmaVersion, str, (zzfir) null, zzv).zzb();
    }
}
