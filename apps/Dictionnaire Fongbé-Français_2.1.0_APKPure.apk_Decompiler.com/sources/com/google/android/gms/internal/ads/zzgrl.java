package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgrl extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgrl zza;
    private static volatile zzgzk zzb;
    /* access modifiers changed from: private */
    public int zzc;
    private int zzd;

    static {
        zzgrl zzgrl = new zzgrl();
        zza = zzgrl;
        zzgxr.zzbZ(zzgrl.class, zzgrl);
    }

    private zzgrl() {
    }

    public static zzgrj zzc() {
        return (zzgrj) zza.zzaZ();
    }

    public static zzgrl zzf(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgrl) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzgrl();
        } else {
            if (ordinal == 4) {
                return new zzgrj((zzgrk) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgrl.class) {
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
