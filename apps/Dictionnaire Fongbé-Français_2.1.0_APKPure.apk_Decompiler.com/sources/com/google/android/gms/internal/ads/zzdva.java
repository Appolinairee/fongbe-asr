package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdva implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzdva(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        WeakReference zza3 = ((zzchf) this.zzb).zza();
        WeakReference weakReference = zza3;
        zzdvt zzdvt = new zzdvt();
        zzdvt zzdvt2 = zzdvt;
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        zzdvs zzdvs = new zzdvs(zza2, zza3, (zzdvg) this.zzc.zzb(), zzdvt, zzc2);
        zzdvs zzdvs2 = zzdvs;
        return zzdvs;
    }
}
