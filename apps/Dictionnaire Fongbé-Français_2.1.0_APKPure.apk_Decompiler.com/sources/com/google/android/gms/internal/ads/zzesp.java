package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesp implements zzetq {
    private final String zza;
    private final int zzb;

    public zzesp(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcuv) obj).zzb.putString("request_id", this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuv = (zzcuv) obj;
        zzcuv.zza.putString("request_id", this.zza);
        if (this.zzb == 2) {
            zzcuv.zza.putInt("sod", 1);
        }
    }
}
