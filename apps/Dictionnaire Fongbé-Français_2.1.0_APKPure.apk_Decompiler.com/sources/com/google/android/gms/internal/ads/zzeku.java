package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeku implements zzelc {
    final /* synthetic */ zzekv zza;

    zzeku(zzekv zzekv) {
        this.zza = zzekv;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdeq zzdeq = (zzdeq) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdeq;
            this.zza.zzj.zzk();
        }
    }
}
