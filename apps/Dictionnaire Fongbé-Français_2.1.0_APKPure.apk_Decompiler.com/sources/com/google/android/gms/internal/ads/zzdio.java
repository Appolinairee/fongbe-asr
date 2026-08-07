package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdio {
    zzbgx zza;
    zzbgu zzb;
    zzbhk zzc;
    zzbhh zzd;
    zzbmi zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdio zza(zzbgu zzbgu) {
        this.zzb = zzbgu;
        return this;
    }

    public final zzdio zzb(zzbgx zzbgx) {
        this.zza = zzbgx;
        return this;
    }

    public final zzdio zzc(String str, zzbhd zzbhd, zzbha zzbha) {
        this.zzf.put(str, zzbhd);
        if (zzbha != null) {
            this.zzg.put(str, zzbha);
        }
        return this;
    }

    public final zzdio zzd(zzbmi zzbmi) {
        this.zze = zzbmi;
        return this;
    }

    public final zzdio zze(zzbhh zzbhh) {
        this.zzd = zzbhh;
        return this;
    }

    public final zzdio zzf(zzbhk zzbhk) {
        this.zzc = zzbhk;
        return this;
    }

    public final zzdiq zzg() {
        return new zzdiq(this);
    }
}
