package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzade implements zzadm {
    private final zzdp zza;
    private final zzdp zzb;
    private long zzc;

    public zzade(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzcw.zzd(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzdp(length2);
            this.zzb = new zzdp(length2);
        } else {
            int i = length2 + 1;
            zzdp zzdp = new zzdp(i);
            this.zza = zzdp;
            zzdp zzdp2 = new zzdp(i);
            this.zzb = zzdp2;
            zzdp.zzc(0);
            zzdp2.zzc(0);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j;
    }

    public final long zza() {
        return this.zzc;
    }

    public final zzadk zzg(long j) {
        zzdp zzdp = this.zzb;
        if (zzdp.zza() == 0) {
            zzadn zzadn = zzadn.zza;
            return new zzadk(zzadn, zzadn);
        }
        int zzb2 = zzei.zzb(zzdp, j, true, true);
        zzadn zzadn2 = new zzadn(this.zzb.zzb(zzb2), this.zza.zzb(zzb2));
        if (zzadn2.zzb != j) {
            zzdp zzdp2 = this.zzb;
            if (zzb2 != zzdp2.zza() - 1) {
                int i = zzb2 + 1;
                return new zzadk(zzadn2, new zzadn(zzdp2.zzb(i), this.zza.zzb(i)));
            }
        }
        return new zzadk(zzadn2, zzadn2);
    }

    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}
