package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzehn implements zzfuc {
    public final /* synthetic */ zzcex zza;
    public final /* synthetic */ zzfbo zzb;
    public final /* synthetic */ zzdob zzc;

    public /* synthetic */ zzehn(zzeht zzeht, zzcex zzcex, zzfbo zzfbo, zzdob zzdob) {
        this.zza = zzcex;
        this.zzb = zzfbo;
        this.zzc = zzdob;
    }

    public final Object apply(Object obj) {
        zzcex zzcex = this.zza;
        if (this.zzb.zzM) {
            zzcex.zzah();
        }
        zzdob zzdob = this.zzc;
        zzcex.zzab();
        zzcex.onPause();
        return zzdob.zzi();
    }
}
