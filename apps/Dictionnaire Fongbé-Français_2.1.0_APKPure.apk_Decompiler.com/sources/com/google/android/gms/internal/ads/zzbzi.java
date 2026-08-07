package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbzi extends zzb {
    final /* synthetic */ zzbzm zza;

    zzbzi(zzbzm zzbzm) {
        this.zza = zzbzm;
    }

    public final void zza() {
        zzbzm zzbzm = this.zza;
        zzbco zzbco = new zzbco(zzbzm.zze, zzbzm.zzf.afmaVersion);
        synchronized (this.zza.zza) {
            try {
                zzv.zze();
                zzbcr.zza(this.zza.zzh, zzbco);
            } catch (IllegalArgumentException e) {
                zzo.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
