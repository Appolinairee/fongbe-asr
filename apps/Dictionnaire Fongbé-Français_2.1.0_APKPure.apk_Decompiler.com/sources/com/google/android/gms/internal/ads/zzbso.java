package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzbso extends zzbgz {
    final /* synthetic */ zzbsr zza;

    /* synthetic */ zzbso(zzbsr zzbsr, zzbsq zzbsq) {
        this.zza = zzbsr;
    }

    public final void zze(zzbgq zzbgq, String str) {
        zzbsr zzbsr = this.zza;
        if (zzbsr.zzb != null) {
            zzbsr.zzb.onCustomClick(zzbsr.zzf(zzbgq), str);
        }
    }
}
