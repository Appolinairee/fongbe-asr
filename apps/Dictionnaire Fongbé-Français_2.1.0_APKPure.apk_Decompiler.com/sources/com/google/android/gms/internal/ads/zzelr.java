package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzelr implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzelr(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
    }

    /* renamed from: zza */
    public final zzelp zzb() {
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        zzfcj zza3 = ((zzcvk) this.zzb).zza();
        zzfcj zzfcj = zza3;
        ViewGroup zza4 = ((zzcok) this.zzc).zza();
        ViewGroup viewGroup = zza4;
        return new zzelp(zzc2, zza2, zza3, zza4);
    }
}
