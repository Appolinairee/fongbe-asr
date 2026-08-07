package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfhr extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzfhr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzfho zzd;

    static {
        zzfhr zzfhr = new zzfhr();
        zza = zzfhr;
        zzgxr.zzbZ(zzfhr.class, zzfhr);
    }

    private zzfhr() {
    }

    public static zzfhq zza() {
        return (zzfhq) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzfhr zzfhr, zzfho zzfho) {
        zzfho.getClass();
        zzfhr.zzd = zzfho;
        zzfhr.zzc |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzfhr();
        } else {
            if (ordinal == 4) {
                return new zzfhq((zzfhs) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzfhr.class) {
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
