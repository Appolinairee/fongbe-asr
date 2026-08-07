package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzarp extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzarp zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzarr zzd;
    private zzaru zze;

    static {
        zzarp zzarp = new zzarp();
        zza = zzarp;
        zzgxr.zzbZ(zzarp.class, zzarp);
    }

    private zzarp() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzarp();
        } else {
            if (ordinal == 4) {
                return new zzaro((zzarv) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzarp.class) {
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
