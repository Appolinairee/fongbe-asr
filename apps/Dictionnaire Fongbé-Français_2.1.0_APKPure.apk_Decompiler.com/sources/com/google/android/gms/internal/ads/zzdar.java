package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdar implements zzcyq {
    private int zza = ((Integer) zzbe.zzc().zza(zzbcl.zzbp)).intValue();
    private int zzb = ((Integer) zzbe.zzc().zza(zzbcl.zzmI)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    public final void zzdl(zzbvk zzbvk) {
    }

    public final synchronized void zzdm(zzfca zzfca) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbq)).booleanValue()) {
            try {
                zzfbr zzfbr = zzfca.zzb.zzb;
                this.zza = zzfbr.zzc;
                this.zzb = zzfbr.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
