package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzwc extends zzbq {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzar zzf;
    private final zzal zzg;

    static {
        zzaf zzaf = new zzaf();
        zzaf.zza("SinglePeriodTimeline");
        zzaf.zzb(Uri.EMPTY);
        zzaf.zzc();
    }

    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzbo zzd(int i, zzbo zzbo, boolean z) {
        zzcw.zza(i, 0, 1);
        zzbo.zzi((Object) null, z ? zzb : null, 0, this.zzc, 0, zzb.zza, false);
        return zzbo;
    }

    public final zzbp zze(int i, zzbp zzbp, long j) {
        zzcw.zza(i, 0, 1);
        zzal zzal = this.zzg;
        zzbp.zza(zzbp.zza, this.zzf, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zze, false, zzal, 0, this.zzd, 0, 0, 0);
        return zzbp;
    }

    public final Object zzf(int i) {
        zzcw.zza(i, 0, 1);
        return zzb;
    }

    public zzwc(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, zzar zzar, zzal zzal) {
        zzar zzar2 = zzar;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = z;
        zzar.getClass();
        zzar zzar3 = zzar2;
        this.zzf = zzar2;
        this.zzg = zzal;
    }
}
