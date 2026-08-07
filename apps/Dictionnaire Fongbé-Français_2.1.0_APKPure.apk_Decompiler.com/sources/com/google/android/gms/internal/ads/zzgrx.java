package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgrx extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgrx zza;
    private static volatile zzgzk zzb;

    static {
        zzgrx zzgrx = new zzgrx();
        zza = zzgrx;
        zzgxr.zzbZ(zzgrx.class, zzgrx);
    }

    private zzgrx() {
    }

    public static zzgrx zzb() {
        return zza;
    }

    public static zzgrx zzc(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgrx) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0000", (Object[]) null);
        }
        if (ordinal == 3) {
            return new zzgrx();
        }
        if (ordinal == 4) {
            return new zzgrv((zzgrw) null);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal == 6) {
            zzgzk zzgzk = zzb;
            if (zzgzk == null) {
                synchronized (zzgrx.class) {
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
