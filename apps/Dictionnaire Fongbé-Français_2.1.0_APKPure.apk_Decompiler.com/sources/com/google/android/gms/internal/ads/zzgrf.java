package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgrf extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgrf zza;
    private static volatile zzgzk zzb;
    /* access modifiers changed from: private */
    public int zzc;

    static {
        zzgrf zzgrf = new zzgrf();
        zza = zzgrf;
        zzgxr.zzbZ(zzgrf.class, zzgrf);
    }

    private zzgrf() {
    }

    public static zzgrd zzb() {
        return (zzgrd) zza.zzaZ();
    }

    public static zzgrf zzd() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        } else if (ordinal == 3) {
            return new zzgrf();
        } else {
            if (ordinal == 4) {
                return new zzgrd((zzgre) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgrf.class) {
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
}
