package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcrm implements zzgcd {
    final /* synthetic */ zzgcd zza;
    final /* synthetic */ zzcro zzb;

    zzcrm(zzcro zzcro, zzgcd zzgcd) {
        this.zza = zzgcd;
        this.zzb = zzcro;
    }

    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzbzw.zzf.execute(new zzcri(this.zzb));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcro.zzb(this.zzb, ((zzcrh) obj).zza, this.zza);
    }
}
