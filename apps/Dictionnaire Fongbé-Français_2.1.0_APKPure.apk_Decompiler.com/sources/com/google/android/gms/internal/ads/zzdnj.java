package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdnj implements zzbjp {
    final /* synthetic */ zzdnl zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbjp zzd;

    /* synthetic */ zzdnj(zzdnl zzdnl, WeakReference weakReference, String str, zzbjp zzbjp, zzdnk zzdnk) {
        this.zza = zzdnl;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbjp;
    }

    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
