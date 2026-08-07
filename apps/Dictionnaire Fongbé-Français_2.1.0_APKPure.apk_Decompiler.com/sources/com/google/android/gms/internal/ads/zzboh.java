package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzboh implements zzcaf {
    final /* synthetic */ zzbnm zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcab zzc;
    final /* synthetic */ zzbok zzd;

    zzboh(zzbok zzbok, zzbnm zzbnm, Object obj, zzcab zzcab) {
        this.zza = zzbnm;
        this.zzb = obj;
        this.zzc = zzcab;
        this.zzd = zzbok;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcab zzcab = this.zzc;
        zzbok.zzd(this.zzd, this.zza, (zzbnt) obj, obj2, zzcab);
    }
}
