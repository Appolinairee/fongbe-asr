package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzasn extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzasn zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd = -1;

    static {
        zzasn zzasn = new zzasn();
        zza = zzasn;
        zzgxr.zzbZ(zzasn.class, zzasn);
    }

    private zzasn() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzasn();
        } else {
            if (ordinal == 4) {
                return new zzasm((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzasn.class) {
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
