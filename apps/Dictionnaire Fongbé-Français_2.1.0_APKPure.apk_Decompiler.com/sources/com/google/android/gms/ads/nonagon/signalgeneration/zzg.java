package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzcki;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzg implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzg(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        zzbbu zza3 = zzcki.zza();
        zzbbu zzbbu = zza3;
        List zzc = zzepc.zzc();
        List list = zzc;
        VersionInfoParcel zza4 = ((zzchs) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza4;
        return new zzf(zza2, zza3, zzc, zza4);
    }
}
