package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcpy implements zzher {
    private final zzhfj zza;

    public zzcpy(zzhfj zzhfj) {
        this.zza = zzhfj;
    }

    /* renamed from: zza */
    public final Boolean zzb() {
        zzfcj zza2 = ((zzcvk) this.zza).zza();
        zzfcj zzfcj = zza2;
        boolean z = true;
        if (zza2.zza() == null) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzfz)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
