package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzlb {
    private static final zzug zzu = new zzug(new Object(), -1);
    public final zzbq zza;
    public final zzug zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzib zzf;
    public final boolean zzg;
    public final zzwj zzh;
    public final zzyc zzi;
    public final List zzj;
    public final zzug zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbe zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzlb(zzbq zzbq, zzug zzug, long j, long j2, int i, zzib zzib, boolean z, zzwj zzwj, zzyc zzyc, List list, zzug zzug2, boolean z2, int i2, int i3, zzbe zzbe, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzbq;
        this.zzb = zzug;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzib;
        this.zzg = z;
        this.zzh = zzwj;
        this.zzi = zzyc;
        this.zzj = list;
        this.zzk = zzug2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = i3;
        this.zzo = zzbe;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzt = j6;
    }

    public static zzlb zzg(zzyc zzyc) {
        zzbq zzbq = zzbq.zza;
        zzug zzug = zzu;
        return new zzlb(zzbq, zzug, -9223372036854775807L, 0, 1, (zzib) null, false, zzwj.zza, zzyc, zzfxn.zzn(), zzug, false, 1, 0, zzbe.zza, 0, 0, 0, 0, false);
    }

    public static zzug zzh() {
        return zzu;
    }

    public final zzlb zza(zzug zzug) {
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzbe zzbe = this.zzo;
        long j = this.zzq;
        long j2 = this.zzr;
        long j3 = this.zzs;
        long j4 = this.zzt;
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzug, z, i, i2, zzbe, j, j2, j3, j4, false);
    }

    public final zzlb zzb(zzug zzug, long j, long j2, long j3, long j4, zzwj zzwj, zzyc zzyc, List list) {
        long j5 = j2;
        long j6 = j3;
        long j7 = j4;
        zzwj zzwj2 = zzwj;
        zzyc zzyc2 = zzyc;
        List list2 = list;
        zzug zzug2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzbe zzbe = this.zzo;
        long j8 = this.zzq;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = this.zze;
        zzib zzib = this.zzf;
        boolean z2 = this.zzg;
        return new zzlb(this.zza, zzug, j5, j6, i3, zzib, z2, zzwj2, zzyc2, list2, zzug2, z, i, i2, zzbe, j8, j7, j, elapsedRealtime, false);
    }

    public final zzlb zzc(boolean z, int i, int i2) {
        zzbe zzbe = this.zzo;
        long j = this.zzq;
        long j2 = this.zzr;
        long j3 = this.zzs;
        long j4 = this.zzt;
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, i2, zzbe, j, j2, j3, j4, false);
    }

    public final zzlb zzd(zzib zzib) {
        boolean z = this.zzg;
        zzwj zzwj = this.zzh;
        zzyc zzyc = this.zzi;
        List list = this.zzj;
        zzug zzug = this.zzk;
        boolean z2 = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzbe zzbe = this.zzo;
        long j = this.zzq;
        long j2 = this.zzr;
        long j3 = this.zzs;
        long j4 = this.zzt;
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzib, z, zzwj, zzyc, list, zzug, z2, i, i2, zzbe, j, j2, j3, j4, false);
    }

    public final zzlb zze(int i) {
        zzib zzib = this.zzf;
        boolean z = this.zzg;
        zzwj zzwj = this.zzh;
        zzyc zzyc = this.zzi;
        List list = this.zzj;
        zzug zzug = this.zzk;
        boolean z2 = this.zzl;
        int i2 = this.zzm;
        int i3 = this.zzn;
        zzbe zzbe = this.zzo;
        long j = this.zzq;
        long j2 = this.zzr;
        long j3 = this.zzs;
        long j4 = this.zzt;
        return new zzlb(this.zza, this.zzb, this.zzc, this.zzd, i, zzib, z, zzwj, zzyc, list, zzug, z2, i2, i3, zzbe, j, j2, j3, j4, false);
    }

    public final zzlb zzf(zzbq zzbq) {
        return new zzlb(zzbq, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
