package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfic extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzfic zza;
    private static volatile zzgzk zzb;
    private String zzc = "";

    static {
        zzfic zzfic = new zzfic();
        zza = zzfic;
        zzgxr.zzbZ(zzfic.class, zzfic);
    }

    private zzfic() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        } else if (ordinal == 3) {
            return new zzfic();
        } else {
            if (ordinal == 4) {
                return new zzfia((zzfib) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzfic.class) {
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
