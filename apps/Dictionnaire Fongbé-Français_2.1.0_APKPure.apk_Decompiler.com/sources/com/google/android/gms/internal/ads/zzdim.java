package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdim implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzdim(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfbo zza2 = ((zzcrq) this.zza).zza();
        zzfbo zzfbo = zza2;
        JSONObject zzc = ((zzdhf) this.zzb).zzc();
        JSONObject jSONObject = zzc;
        return new zzdij(zza2, zzc);
    }
}
