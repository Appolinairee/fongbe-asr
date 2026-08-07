package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgsb extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgsb zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgsh zze;
    /* access modifiers changed from: private */
    public zzgwj zzf = zzgwj.zzb;

    static {
        zzgsb zzgsb = new zzgsb();
        zza = zzgsb;
        zzgxr.zzbZ(zzgsb.class, zzgsb);
    }

    private zzgsb() {
    }

    public static zzgrz zzb() {
        return (zzgrz) zza.zzaZ();
    }

    public static zzgsb zzd() {
        return zza;
    }

    public static zzgsb zzf(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgsb) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    public static zzgzk zzi() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzk(zzgsb zzgsb, zzgsh zzgsh) {
        zzgsh.getClass();
        zzgsb.zze = zzgsh;
        zzgsb.zzc |= 1;
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
            return new zzgsb();
        } else {
            if (ordinal == 4) {
                return new zzgrz((zzgsa) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgsb.class) {
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

    public final zzgsh zzg() {
        zzgsh zzgsh = this.zze;
        return zzgsh == null ? zzgsh.zzf() : zzgsh;
    }

    public final zzgwj zzh() {
        return this.zzf;
    }
}
