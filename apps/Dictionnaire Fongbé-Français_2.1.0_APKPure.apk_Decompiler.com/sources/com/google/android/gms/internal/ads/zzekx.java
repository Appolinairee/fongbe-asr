package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzekx implements zzelc {
    final /* synthetic */ zzeky zza;

    zzekx(zzeky zzeky) {
        this.zza = zzeky;
    }

    public final void zza() {
        synchronized (this.zza) {
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqz zzcqz = (zzcqz) obj;
        synchronized (this.zza) {
            this.zza.zzc = zzcqz.zzm();
            zzcqz.zzk();
        }
    }
}
