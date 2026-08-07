package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaaq {
    private final zzaal zza;
    private final zzaaj zzb = new zzaaj();
    private final zzee zzc = new zzee(10);
    private final zzee zzd = new zzee(10);
    private final zzdq zze = new zzdq(16);
    private zzcd zzf;
    private zzcd zzg = zzcd.zza;
    private long zzh;
    private long zzi = -9223372036854775807L;
    private final zzzx zzj;

    public zzaaq(zzzx zzzx, zzaal zzaal) {
        this.zzj = zzzx;
        this.zza = zzaal;
    }

    private static Object zzf(zzee zzee) {
        zzcw.zzd(zzee.zza() > 0);
        while (zzee.zza() > 1) {
            zzee.zzb();
        }
        Object zzb2 = zzee.zzb();
        zzb2.getClass();
        return zzb2;
    }

    public final void zza() {
        this.zze.zzc();
        this.zzi = -9223372036854775807L;
        zzee zzee = this.zzd;
        if (zzee.zza() > 0) {
            Long l = (Long) zzf(zzee);
            l.longValue();
            this.zzd.zzd(0, l);
        }
        if (this.zzf == null) {
            zzee zzee2 = this.zzc;
            if (zzee2.zza() > 0) {
                this.zzf = (zzcd) zzf(zzee2);
                return;
            }
            return;
        }
        this.zzc.zze();
    }

    public final void zzb(int i, int i2) {
        this.zzf = new zzcd(i, i2, 1.0f);
    }

    public final void zzc(long j, long j2) {
        this.zzd.zzd(j, Long.valueOf(j2));
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Throwable, com.google.android.gms.internal.ads.zzbm, java.lang.Object] */
    public final void zzd(long j, long j2) throws zzib {
        long j3;
        while (true) {
            zzdq zzdq = this.zze;
            if (!zzdq.zzd()) {
                zzee zzee = this.zzd;
                long zza2 = zzdq.zza();
                Long l = (Long) zzee.zzc(zza2);
                if (!(l == null || l.longValue() == this.zzh)) {
                    this.zzh = l.longValue();
                    this.zza.zzf();
                }
                int zza3 = this.zza.zza(zza2, j, j2, this.zzh, false, this.zzb);
                if (zza3 == 0 || zza3 == 1) {
                    this.zzi = zza2;
                    Long valueOf = Long.valueOf(this.zze.zzb());
                    Long l2 = valueOf;
                    long longValue = valueOf.longValue();
                    zzcd zzcd = (zzcd) this.zzc.zzc(longValue);
                    if (zzcd != null && !zzcd.equals(zzcd.zza) && !zzcd.equals(this.zzg)) {
                        this.zzg = zzcd;
                        this.zzj.zza(zzcd);
                    }
                    if (zza3 == 0) {
                        j3 = -1;
                    } else {
                        j3 = this.zzb.zzd();
                    }
                    this.zzj.zzb(j3, longValue, this.zza.zzp());
                } else if (zza3 == 2 || zza3 == 3 || zza3 == 4) {
                    this.zzi = zza2;
                    this.zze.zzb();
                    zzzx zzzx = this.zzj;
                    Iterator it = zzzx.zza.zzj.iterator();
                    while (it.hasNext()) {
                        ((zzaac) it.next()).zzz(zzzx.zza);
                    }
                    ? r1 = 0;
                    zzcw.zzb(r1);
                    zzbm zzbm = r1;
                    r1.zza();
                    throw r1;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean zze(long j) {
        long j2 = this.zzi;
        return j2 != -9223372036854775807L && j2 >= j;
    }
}
