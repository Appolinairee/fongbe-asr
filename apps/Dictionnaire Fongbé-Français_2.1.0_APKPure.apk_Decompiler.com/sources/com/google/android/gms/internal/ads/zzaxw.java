package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxw extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzaxw zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzaxz zzd;
    private zzgwj zze = zzgwj.zzb;
    private zzgwj zzf = zzgwj.zzb;

    static {
        zzaxw zzaxw = new zzaxw();
        zza = zzaxw;
        zzgxr.zzbZ(zzaxw.class, zzaxw);
    }

    private zzaxw() {
    }

    public static zzaxw zzb(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzaxw) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    public final zzaxz zzc() {
        zzaxz zzaxz = this.zzd;
        return zzaxz == null ? zzaxz.zzg() : zzaxz;
    }

    public final zzgwj zzd() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzaxw();
        } else {
            if (ordinal == 4) {
                return new zzaxu((zzaxv) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzaxw.class) {
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

    public final zzgwj zzf() {
        return this.zze;
    }
}
