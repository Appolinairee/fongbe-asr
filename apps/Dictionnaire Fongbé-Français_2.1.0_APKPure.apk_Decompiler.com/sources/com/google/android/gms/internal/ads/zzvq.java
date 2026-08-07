package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzvq implements zzye {
    public long zza;
    public long zzb;
    public zzyd zzc;
    public zzvq zzd;

    public zzvq(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzvq zzb() {
        this.zzc = null;
        zzvq zzvq = this.zzd;
        this.zzd = null;
        return zzvq;
    }

    public final zzye zzd() {
        zzvq zzvq = this.zzd;
        if (zzvq == null || zzvq.zzc == null) {
            return null;
        }
        return zzvq;
    }

    public final void zze(long j, int i) {
        zzcw.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }

    public final zzyd zzc() {
        zzyd zzyd = this.zzc;
        zzyd.getClass();
        zzyd zzyd2 = zzyd;
        return zzyd;
    }
}
