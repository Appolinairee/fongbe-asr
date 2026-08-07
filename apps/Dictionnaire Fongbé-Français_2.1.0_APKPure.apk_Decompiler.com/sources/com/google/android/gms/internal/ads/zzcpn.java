package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzac;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcpn implements zzcwn {
    private final zzcex zza;
    private final zzdrw zzb;
    private final zzfbo zzc;

    zzcpn(zzcex zzcex, zzdrw zzdrw, zzfbo zzfbo) {
        this.zza = zzcex;
        this.zzb = zzdrw;
        this.zzc = zzfbo;
    }

    public final void zzr() {
        zzcex zzcex;
        String str;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmK)).booleanValue() && (zzcex = this.zza) != null) {
            if (true != zzac.zza(zzcex.zzF())) {
                str = "0";
            } else {
                str = "1";
            }
            zzdrv zza2 = this.zzb.zza();
            zza2.zzb("action", "hcp");
            zza2.zzb("hcp", str);
            zza2.zzc(this.zzc);
            zza2.zzg();
        }
    }
}
