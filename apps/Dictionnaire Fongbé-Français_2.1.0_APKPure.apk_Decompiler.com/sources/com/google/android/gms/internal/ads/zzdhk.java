package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdhk implements zzher {
    private final zzhfj zza;

    public zzdhk(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
    }

    public final /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchs) this.zza).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        String str = "native";
        String str2 = "native";
        zzv.zzq();
        zzayg zzayg = new zzayg(UUID.randomUUID().toString(), zza2, "native", new JSONObject(), false, true);
        zzayg zzayg2 = zzayg;
        return zzayg;
    }
}
