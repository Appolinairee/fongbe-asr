package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbmo implements Predicate {
    public final /* synthetic */ zzbjp zza;

    public /* synthetic */ zzbmo(zzbjp zzbjp) {
        this.zza = zzbjp;
    }

    public final boolean apply(Object obj) {
        zzbjp zzbjp = (zzbjp) obj;
        if (!(zzbjp instanceof zzbmu)) {
            return false;
        }
        return ((zzbmu) zzbjp).zzb.equals(this.zza);
    }
}
