package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgqk extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgqk zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgqq zze;
    private zzgsb zzf;

    static {
        zzgqk zzgqk = new zzgqk();
        zza = zzgqk;
        zzgxr.zzbZ(zzgqk.class, zzgqk);
    }

    private zzgqk() {
    }

    public static zzgqi zzb() {
        return (zzgqi) zza.zzaZ();
    }

    public static zzgqk zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgqk) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    public static zzgzk zzh() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzi(zzgqk zzgqk, zzgqq zzgqq) {
        zzgqq.getClass();
        zzgqk.zze = zzgqq;
        zzgqk.zzc |= 1;
    }

    static /* synthetic */ void zzj(zzgqk zzgqk, zzgsb zzgsb) {
        zzgsb.getClass();
        zzgqk.zzf = zzgsb;
        zzgqk.zzc |= 2;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgqk();
        } else {
            if (ordinal == 4) {
                return new zzgqi((zzgqj) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgqk.class) {
                        zzgzk = zzb;
                        if (zzgzk == null) {
                            zzgzk = new zzgxm(zza);
                            zzb = zzgzk;
                        }
                    }
                }
                return zzgzk;
            }
            throw null;
        }
    }

    public final zzgqq zzf() {
        zzgqq zzgqq = this.zze;
        return zzgqq == null ? zzgqq.zzd() : zzgqq;
    }

    public final zzgsb zzg() {
        zzgsb zzgsb = this.zzf;
        return zzgsb == null ? zzgsb.zzd() : zzgsb;
    }
}
