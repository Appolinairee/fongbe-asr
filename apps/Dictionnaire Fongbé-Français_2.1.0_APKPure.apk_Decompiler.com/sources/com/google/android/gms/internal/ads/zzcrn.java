package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcrn implements zzgcd {
    final /* synthetic */ zzgcd zza;
    final /* synthetic */ zzcro zzb;

    zzcrn(zzcro zzcro, zzgcd zzgcd) {
        this.zza = zzgcd;
        this.zzb = zzcro;
    }

    public final void zza(Throwable th) {
        zzbzw.zzf.execute(new zzcri(this.zzb));
        this.zza.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbzw.zzf.execute(new zzcri(this.zzb));
        this.zza.zzb((zzcqz) obj);
    }
}
