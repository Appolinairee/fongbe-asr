package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzqc {
    private final zzch[] zza;
    private final zzqu zzb;
    private final zzck zzc;

    public zzqc(zzch... zzchArr) {
        zzqu zzqu = new zzqu();
        zzck zzck = new zzck();
        zzch[] zzchArr2 = new zzch[2];
        this.zza = zzchArr2;
        System.arraycopy(zzchArr, 0, zzchArr2, 0, 0);
        this.zzb = zzqu;
        this.zzc = zzck;
        zzchArr2[0] = zzqu;
        zzchArr2[1] = zzck;
    }

    public final long zza(long j) {
        return this.zzc.zzg() ? this.zzc.zzi(j) : j;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbe zzc(zzbe zzbe) {
        this.zzc.zzk(zzbe.zzb);
        this.zzc.zzj(zzbe.zzc);
        return zzbe;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzch[] zze() {
        return this.zza;
    }
}
