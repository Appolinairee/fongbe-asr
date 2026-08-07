package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcoq implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;
    private final zzhfj zzj;

    public zzcoq(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9, zzhfj zzhfj10) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj6;
        this.zzg = zzhfj7;
        this.zzh = zzhfj8;
        this.zzi = zzhfj9;
        this.zzj = zzhfj10;
    }

    public static zzcop zzc(zzcqy zzcqy, Context context, zzfbp zzfbp, View view, zzcex zzcex, zzcqx zzcqx, zzdiq zzdiq, zzddu zzddu, zzhel zzhel, Executor executor) {
        return new zzcop(zzcqy, context, zzfbp, view, zzcex, zzcqx, zzdiq, zzddu, zzhel, executor);
    }

    /* renamed from: zza */
    public final zzcop zzb() {
        zzcqy zza2 = ((zzctf) this.zza).zzb();
        zzcqy zzcqy = zza2;
        zzfbp zza3 = ((zzcow) this.zzc).zza();
        zzfbp zzfbp = zza3;
        View zza4 = ((zzcov) this.zzd).zza();
        View view = zza4;
        zzcex zza5 = ((zzcpj) this.zze).zza();
        zzcex zzcex = zza5;
        zzcqx zza6 = ((zzcox) this.zzf).zza();
        zzcqx zzcqx = zza6;
        zzdiq zza7 = ((zzdgo) this.zzg).zza();
        zzdiq zzdiq = zza7;
        return new zzcop(zza2, (Context) this.zzb.zzb(), zza3, zza4, zza5, zza6, zza7, (zzddu) this.zzh.zzb(), zzheq.zza(zzhfc.zza(this.zzi)), (Executor) this.zzj.zzb());
    }
}
