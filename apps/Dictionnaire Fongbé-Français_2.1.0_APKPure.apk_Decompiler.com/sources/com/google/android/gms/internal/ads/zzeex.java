package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeex implements zzfuc {
    public final /* synthetic */ zzcex zza;
    public final /* synthetic */ zzfbo zzb;
    public final /* synthetic */ zzder zzc;

    public /* synthetic */ zzeex(zzeez zzeez, zzcex zzcex, zzfbo zzfbo, zzder zzder) {
        this.zza = zzcex;
        this.zzb = zzfbo;
        this.zzc = zzder;
    }

    public final Object apply(Object obj) {
        zzcex zzcex = this.zza;
        if (this.zzb.zzM) {
            zzcex.zzah();
        }
        zzder zzder = this.zzc;
        zzcex.zzab();
        zzcex.onPause();
        return zzder.zzg();
    }
}
