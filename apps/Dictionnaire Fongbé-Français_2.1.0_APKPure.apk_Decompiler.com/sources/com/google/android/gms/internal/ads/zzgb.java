package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgb {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzgb() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1;
    }

    /* synthetic */ zzgb(zzgd zzgd, zzgc zzgc) {
        this.zza = zzgd.zza;
        this.zzb = zzgd.zzd;
        this.zzc = zzgd.zze;
        this.zzd = zzgd.zzf;
        this.zze = zzgd.zzg;
    }

    public final zzgb zza(int i) {
        this.zze = 6;
        return this;
    }

    public final zzgb zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgb zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzgb zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgd zze() {
        if (this.zza != null) {
            return new zzgd(this.zza, 0, 1, (byte[]) null, this.zzb, this.zzc, this.zzd, (String) null, this.zze, (Object) null, (zzgc) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
