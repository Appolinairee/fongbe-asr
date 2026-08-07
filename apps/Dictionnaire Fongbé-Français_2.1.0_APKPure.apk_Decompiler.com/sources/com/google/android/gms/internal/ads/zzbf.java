package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbf {
    private final zzv zza = new zzv();

    public final zzbf zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzbf zzb(zzbg zzbg) {
        zzx zza2 = zzbg.zza;
        for (int i = 0; i < zza2.zzb(); i++) {
            this.zza.zza(zza2.zza(i));
        }
        return this;
    }

    public final zzbf zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final zzbf zzd(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzbg zze() {
        return new zzbg(this.zza.zzb(), (zzbj) null);
    }
}
