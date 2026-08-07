package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgse extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgse zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgsh zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgse zzgse = new zzgse();
        zza = zzgse;
        zzgxr.zzbZ(zzgse.class, zzgse);
    }

    private zzgse() {
    }

    public static zzgsc zzc() {
        return (zzgsc) zza.zzaZ();
    }

    public static zzgse zzf() {
        return zza;
    }

    public static zzgse zzg(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgse) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    static /* synthetic */ void zzj(zzgse zzgse, zzgsh zzgsh) {
        zzgsh.getClass();
        zzgse.zzd = zzgsh;
        zzgse.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgse();
        } else {
            if (ordinal == 4) {
                return new zzgsc((zzgsd) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgse.class) {
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

    public final zzgsh zzh() {
        zzgsh zzgsh = this.zzd;
        return zzgsh == null ? zzgsh.zzf() : zzgsh;
    }
}
