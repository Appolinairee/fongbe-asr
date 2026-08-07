package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfhw extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzfhw zza;
    private static volatile zzgzk zzb;
    private String zzc = "";

    static {
        zzfhw zzfhw = new zzfhw();
        zza = zzfhw;
        zzgxr.zzbZ(zzfhw.class, zzfhw);
    }

    private zzfhw() {
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
            return new zzfhw();
        } else {
            if (ordinal == 4) {
                return new zzfhu((zzfhv) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzfhw.class) {
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
