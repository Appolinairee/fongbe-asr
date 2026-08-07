package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzere implements zzetq {
    private final Boolean zza;

    public zzere(Boolean bool) {
        this.zza = bool;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Boolean bool = this.zza;
        zzcuv zzcuv = (zzcuv) obj;
        if (bool != null) {
            zzcuv.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
