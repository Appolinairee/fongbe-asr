package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgqw extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgqw zza;
    private static volatile zzgzk zzb;
    /* access modifiers changed from: private */
    public int zzc;

    static {
        zzgqw zzgqw = new zzgqw();
        zza = zzgqw;
        zzgxr.zzbZ(zzgqw.class, zzgqw);
    }

    private zzgqw() {
    }

    public static zzgqu zzb() {
        return (zzgqu) zza.zzaZ();
    }

    public static zzgqw zzd() {
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
            return new zzgqw();
        } else {
            if (ordinal == 4) {
                return new zzgqu((zzgqv) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgqw.class) {
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
