package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdhy implements zzgcd {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdia zzb;

    zzdhy(zzdia zzdia, String str, boolean z) {
        this.zzb = zzdia;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
            zzv.zzp().zzv(th, "omid native display exp");
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze.zzT((zzcex) obj);
        zzdia zzdia = this.zzb;
        zzcab zzp = zzdia.zze.zzp();
        zzecr zzf = zzdia.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
