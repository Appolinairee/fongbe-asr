package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zztz extends zztu {
    public static final Object zzc = new Object();
    private final Object zzd;
    /* access modifiers changed from: private */
    public final Object zze;

    private zztz(zzbq zzbq, Object obj, Object obj2) {
        super(zzbq);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zztz zzq(zzar zzar) {
        return new zztz(new zzua(zzar), zzbp.zza, zzc);
    }

    public static zztz zzr(zzbq zzbq, Object obj, Object obj2) {
        return new zztz(zzbq, obj, obj2);
    }

    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    public final zzbo zzd(int i, zzbo zzbo, boolean z) {
        this.zzb.zzd(i, zzbo, z);
        if (Objects.equals(zzbo.zzb, this.zze) && z) {
            zzbo.zzb = zzc;
        }
        return zzbo;
    }

    public final zzbp zze(int i, zzbp zzbp, long j) {
        this.zzb.zze(i, zzbp, j);
        if (Objects.equals(zzbp.zzb, this.zzd)) {
            zzbp.zzb = zzbp.zza;
        }
        return zzbp;
    }

    public final Object zzf(int i) {
        Object zzf = this.zzb.zzf(i);
        return Objects.equals(zzf, this.zze) ? zzc : zzf;
    }

    public final zztz zzp(zzbq zzbq) {
        return new zztz(zzbq, this.zzd, this.zze);
    }
}
