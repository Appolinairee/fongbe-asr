package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzasf extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzasf zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        zzasf zzasf = new zzasf();
        zza = zzasf;
        zzgxr.zzbZ(zzasf.class, zzasf);
    }

    private zzasf() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", zzasj.zza});
        } else if (ordinal == 3) {
            return new zzasf();
        } else {
            if (ordinal == 4) {
                return new zzase((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzasf.class) {
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
