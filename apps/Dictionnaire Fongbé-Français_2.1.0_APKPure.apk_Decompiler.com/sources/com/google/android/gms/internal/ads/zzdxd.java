package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdxd implements zzgcd {
    final /* synthetic */ zzdxe zza;

    zzdxd(zzdxe zzdxe) {
        this.zza = zzdxe;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            Matcher matcher = zzdxe.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfca zzfca = (zzfca) obj;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            this.zza.zzf.zzi(zzfca.zzb.zzb.zzf);
            this.zza.zzf.zzj(zzfca.zzb.zzb.zzg);
        }
    }
}
