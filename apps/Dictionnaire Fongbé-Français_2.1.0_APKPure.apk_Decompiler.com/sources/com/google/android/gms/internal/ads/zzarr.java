package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzarr extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzarr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd = 2;

    static {
        zzarr zzarr = new zzarr();
        zza = zzarr;
        zzgxr.zzbZ(zzarr.class, zzarr);
    }

    private zzarr() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", zzars.zza});
        } else if (ordinal == 3) {
            return new zzarr();
        } else {
            if (ordinal == 4) {
                return new zzarq((zzarv) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzarr.class) {
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
