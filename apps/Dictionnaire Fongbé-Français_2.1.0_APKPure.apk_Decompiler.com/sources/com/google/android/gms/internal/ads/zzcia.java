package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcia implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcia(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    /* renamed from: zza */
    public final zzbve zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        zzfhk zzfhk = (zzfhk) this.zzb.zzb();
        zzv.zzg().zzb(zza2, VersionInfoParcel.forPackage(), zzfhk).zza("google.afma.request.getAdDictionary", zzbod.zza, zzbod.zza);
        zzbog zzb2 = zzv.zzg().zzb(zza2, VersionInfoParcel.forPackage(), zzfhk);
        zzboa zzboa = zzbod.zza;
        return new zzbvg(zza2, zzb2.zza("google.afma.sdkConstants.getSdkConstants", zzboa, zzboa), VersionInfoParcel.forPackage());
    }
}
