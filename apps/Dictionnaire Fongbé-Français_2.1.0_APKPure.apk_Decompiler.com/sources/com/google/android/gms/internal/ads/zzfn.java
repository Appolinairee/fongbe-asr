package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfn implements Comparable {
    /* access modifiers changed from: private */
    public final zzdy zza = new zzdy();
    /* access modifiers changed from: private */
    public long zzb = -9223372036854775807L;
    private long zzc;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfn zzfn = (zzfn) obj;
        int compare = Long.compare(this.zzb, zzfn.zzb);
        if (compare != 0) {
            return compare;
        }
        return Long.compare(this.zzc, zzfn.zzc);
    }

    public final void zzc(long j, long j2, zzdy zzdy) {
        zzcw.zzf(j != -9223372036854775807L);
        this.zzb = j;
        this.zzc = j2;
        this.zza.zzI(zzdy.zzb());
        System.arraycopy(zzdy.zzN(), zzdy.zzd(), this.zza.zzN(), 0, zzdy.zzb());
    }
}
