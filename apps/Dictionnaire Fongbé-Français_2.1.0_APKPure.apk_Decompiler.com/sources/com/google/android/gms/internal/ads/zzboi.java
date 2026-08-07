package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzboi implements zzcad {
    final /* synthetic */ zzcab zza;
    final /* synthetic */ zzbnm zzb;

    zzboi(zzbok zzbok, zzcab zzcab, zzbnm zzbnm) {
        this.zza = zzcab;
        this.zzb = zzbnm;
    }

    public final void zza() {
        zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbnv("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
