package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcmu implements zzgcd {
    final /* synthetic */ zzcmw zza;

    zzcmu(zzcmw zzcmw) {
        this.zza = zzcmw;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcmw zzcmw = this.zza;
        zzfcv zzj = zzcmw.zzh;
        List zzd = zzcmw.zzg.zzd(zzcmw.zze, zzcmw.zzf, false, "", (String) obj, zzcmw.zzf.zzc);
        int i = 1;
        if (true == zzv.zzp().zzA(this.zza.zza)) {
            i = 2;
        }
        zzj.zzc(zzd, i);
    }
}
