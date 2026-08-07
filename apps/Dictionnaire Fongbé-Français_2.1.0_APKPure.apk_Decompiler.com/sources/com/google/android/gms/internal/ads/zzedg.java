package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzedg implements zzfuc {
    public final /* synthetic */ zzcex zza;
    public final /* synthetic */ zzfbo zzb;
    public final /* synthetic */ zzcnx zzc;

    public /* synthetic */ zzedg(zzedh zzedh, zzcex zzcex, zzfbo zzfbo, zzcnx zzcnx) {
        this.zza = zzcex;
        this.zzb = zzfbo;
        this.zzc = zzcnx;
    }

    public final Object apply(Object obj) {
        zzcex zzcex = this.zza;
        if (this.zzb.zzM) {
            zzcex.zzah();
        }
        zzcnx zzcnx = this.zzc;
        zzcex.zzab();
        zzcex.onPause();
        return zzcnx.zza();
    }
}
