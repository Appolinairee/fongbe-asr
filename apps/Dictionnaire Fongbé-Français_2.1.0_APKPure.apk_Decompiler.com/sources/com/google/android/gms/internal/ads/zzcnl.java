package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcnl implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzcnl(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchs) this.zza).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        String str = (String) this.zzc.zzb();
        boolean equals = "native".equals(str);
        zzv.zzq();
        zzayg zzayg = new zzayg(UUID.randomUUID().toString(), zza2, str, (JSONObject) this.zzb.zzb(), false, equals);
        zzayg zzayg2 = zzayg;
        return zzayg;
    }
}
