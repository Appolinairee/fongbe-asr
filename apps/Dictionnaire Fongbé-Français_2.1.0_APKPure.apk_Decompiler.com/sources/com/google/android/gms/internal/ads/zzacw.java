package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzacw implements zzadm {
    private final zzacy zza;
    private final long zzb;

    public zzacw(zzacy zzacy, long j) {
        this.zza = zzacy;
        this.zzb = j;
    }

    private final zzadn zzb(long j, long j2) {
        return new zzadn((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final zzadk zzg(long j) {
        long j2;
        zzcw.zzb(this.zza.zzk);
        zzacy zzacy = this.zza;
        zzacx zzacx = zzacy.zzk;
        long[] jArr = zzacx.zza;
        long[] jArr2 = zzacx.zzb;
        int zzd = zzei.zzd(jArr, zzacy.zzb(j), true, false);
        long j3 = 0;
        if (zzd == -1) {
            j2 = 0;
        } else {
            j2 = jArr[zzd];
        }
        if (zzd != -1) {
            j3 = jArr2[zzd];
        }
        zzadn zzb2 = zzb(j2, j3);
        if (zzb2.zzb == j || zzd == jArr.length - 1) {
            return new zzadk(zzb2, zzb2);
        }
        int i = zzd + 1;
        return new zzadk(zzb2, zzb(jArr[i], jArr2[i]));
    }

    public final boolean zzh() {
        return true;
    }
}
