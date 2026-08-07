package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzr implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzr(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        return new zzo(zza2, (zzdsb) this.zzb.zzb(), zzffh.zzc());
    }
}
