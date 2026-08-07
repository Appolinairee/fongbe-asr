package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzemi implements zzetq {
    private final ArrayList zza;

    /* synthetic */ zzemi(ArrayList arrayList, zzemj zzemj) {
        this.zza = arrayList;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcuv) obj).zzb.putStringArrayList("ad_types", this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcuv) obj).zza.putStringArrayList("ad_types", this.zza);
    }
}
