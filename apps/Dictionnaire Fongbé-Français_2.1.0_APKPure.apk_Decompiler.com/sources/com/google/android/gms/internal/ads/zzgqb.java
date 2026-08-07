package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgqb extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgqb zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    /* access modifiers changed from: private */
    public zzgwj zze = zzgwj.zzb;
    private zzgqh zzf;

    static {
        zzgqb zzgqb = new zzgqb();
        zza = zzgqb;
        zzgxr.zzbZ(zzgqb.class, zzgqb);
    }

    private zzgqb() {
    }

    public static zzgpz zzb() {
        return (zzgpz) zza.zzaZ();
    }

    public static zzgqb zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgqb) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    public static zzgzk zzh() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzj(zzgqb zzgqb, zzgqh zzgqh) {
        zzgqh.getClass();
        zzgqb.zzf = zzgqh;
        zzgqb.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgqb();
        } else {
            if (ordinal == 4) {
                return new zzgpz((zzgqa) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgqb.class) {
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

    public final zzgqh zzf() {
        zzgqh zzgqh = this.zzf;
        return zzgqh == null ? zzgqh.zzd() : zzgqh;
    }

    public final zzgwj zzg() {
        return this.zze;
    }
}
