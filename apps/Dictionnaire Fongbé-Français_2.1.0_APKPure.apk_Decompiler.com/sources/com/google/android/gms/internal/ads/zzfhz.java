package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfhz extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzfhz zza;
    private static volatile zzgzk zzb;
    private String zzc = "";
    private int zzd;

    static {
        zzfhz zzfhz = new zzfhz();
        zza = zzfhz;
        zzgxr.zzbZ(zzfhz.class, zzfhz);
    }

    private zzfhz() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzfhz();
        } else {
            if (ordinal == 4) {
                return new zzfhx((zzfhy) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzfhz.class) {
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
