package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeqw implements zzetq {
    private final Integer zza;

    public zzeqw(Integer num) {
        this.zza = num;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcuv zzcuv = (zzcuv) obj;
        if (num != null) {
            zzcuv.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
