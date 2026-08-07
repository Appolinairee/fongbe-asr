package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgqz extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgqz zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgrf zze;
    /* access modifiers changed from: private */
    public zzgwj zzf = zzgwj.zzb;

    static {
        zzgqz zzgqz = new zzgqz();
        zza = zzgqz;
        zzgxr.zzbZ(zzgqz.class, zzgqz);
    }

    private zzgqz() {
    }

    public static zzgqx zzb() {
        return (zzgqx) zza.zzaZ();
    }

    public static zzgqz zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgqz) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    public static zzgzk zzh() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzj(zzgqz zzgqz, zzgrf zzgrf) {
        zzgrf.getClass();
        zzgqz.zze = zzgrf;
        zzgqz.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgqz();
        } else {
            if (ordinal == 4) {
                return new zzgqx((zzgqy) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgqz.class) {
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

    public final zzgrf zzf() {
        zzgrf zzgrf = this.zze;
        return zzgrf == null ? zzgrf.zzd() : zzgrf;
    }

    public final zzgwj zzg() {
        return this.zzf;
    }
}
