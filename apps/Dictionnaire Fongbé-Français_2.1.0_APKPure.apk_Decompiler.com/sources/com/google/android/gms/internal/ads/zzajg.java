package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzajg implements zzadm {
    final /* synthetic */ zzaji zza;

    /* synthetic */ zzajg(zzaji zzaji, zzajh zzajh) {
        this.zza = zzaji;
    }

    public final long zza() {
        zzaji zzaji = this.zza;
        return zzaji.zzd.zzf(zzaji.zzf);
    }

    public final zzadk zzg(long j) {
        zzaji zzaji = this.zza;
        long zzg = zzaji.zzd.zzg(j);
        long zzb = zzaji.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzaji zzaji2 = this.zza;
        long longValue = zzb + valueOf.multiply(BigInteger.valueOf(zzaji2.zzc - zzaji2.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue();
        zzaji zzaji3 = this.zza;
        zzadn zzadn = new zzadn(j, Math.max(zzaji3.zzb, Math.min(longValue - 30000, zzaji3.zzc - 1)));
        return new zzadk(zzadn, zzadn);
    }

    public final boolean zzh() {
        return true;
    }
}
