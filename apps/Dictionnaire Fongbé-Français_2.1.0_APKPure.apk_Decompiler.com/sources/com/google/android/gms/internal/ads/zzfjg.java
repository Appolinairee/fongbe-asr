package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfjg {
    private final long zza;
    private final long zzb;
    private long zzc;
    private long zzd = 5;
    private long zze;
    private final Random zzf = new Random();

    public zzfjg(long j, double d, long j2, double d2) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = 0;
        zzc();
    }

    public final long zza() {
        double d = (double) this.zze;
        double d2 = 0.2d * d;
        long j = (long) (d - d2);
        return j + ((long) (this.zzf.nextDouble() * ((double) ((((long) (d + d2)) - j) + 1))));
    }

    public final void zzb() {
        double d = (double) this.zze;
        this.zze = Math.min((long) (d + d), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zze = this.zza;
        this.zzc = 0;
    }

    public final synchronized void zzd(int i) {
        Preconditions.checkArgument(i > 0);
        this.zzd = (long) i;
    }

    public final boolean zze() {
        return this.zzc > Math.max(this.zzd, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzz)).intValue()) && this.zze >= this.zzb;
    }
}
