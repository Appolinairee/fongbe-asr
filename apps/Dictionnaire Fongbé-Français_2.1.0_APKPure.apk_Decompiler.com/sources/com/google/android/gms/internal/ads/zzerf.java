package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzerf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzerf(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
    }

    /* renamed from: zza */
    public final zzerd zzb() {
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        ViewGroup zza2 = ((zzcok) this.zza).zza();
        ViewGroup viewGroup = zza2;
        Set zzc3 = ((zzhff) this.zzc).zzb();
        Set set = zzc3;
        return new zzerd(zzc2, zza2, (Context) this.zzb.zzb(), zzc3);
    }
}
