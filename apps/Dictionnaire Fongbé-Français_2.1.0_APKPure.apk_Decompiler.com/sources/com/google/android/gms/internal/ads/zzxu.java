package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzxu {
    public final zzbr zza;
    public final int[] zzb;

    public zzxu(zzbr zzbr, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzdo.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbr;
        this.zzb = iArr;
    }
}
