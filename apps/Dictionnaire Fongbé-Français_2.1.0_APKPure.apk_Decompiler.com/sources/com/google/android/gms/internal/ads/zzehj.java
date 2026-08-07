package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzehj extends zzeik {
    private final zzdeb zza;

    public zzehj(zzcvr zzcvr, zzddq zzddq, zzcwl zzcwl, zzcxa zzcxa, zzcxf zzcxf, zzcwg zzcwg, zzdap zzdap, zzden zzden, zzcxz zzcxz, zzdeb zzdeb, zzdal zzdal) {
        super(zzcvr, zzddq, zzcwl, zzcxa, zzcxf, zzdap, zzcxz, zzden, zzdal, zzcwg);
        this.zza = zzdeb;
    }

    public final void zzs(zzbwi zzbwi) {
        this.zza.zza(zzbwi);
    }

    public final void zzt(zzbwm zzbwm) throws RemoteException {
        this.zza.zza(new zzbwi(zzbwm.zzf(), zzbwm.zze()));
    }

    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    public final void zzv() {
        this.zza.zzb();
    }

    public final void zzy() {
        this.zza.zzc();
    }
}
