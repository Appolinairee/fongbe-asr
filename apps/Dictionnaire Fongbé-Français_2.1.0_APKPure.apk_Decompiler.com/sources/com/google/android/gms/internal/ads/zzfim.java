package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfim extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzfim zza;
    private static volatile zzgzk zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzfim zzfim = new zzfim();
        zza = zzfim;
        zzgxr.zzbZ(zzfim.class, zzfim);
    }

    private zzfim() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzfim();
        } else {
            if (ordinal == 4) {
                return new zzfik((zzfil) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzfim.class) {
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
