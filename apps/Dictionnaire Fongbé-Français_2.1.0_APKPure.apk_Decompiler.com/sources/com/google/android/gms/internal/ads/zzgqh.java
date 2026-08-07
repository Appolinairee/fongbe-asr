package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgqh extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgqh zza;
    private static volatile zzgzk zzb;
    /* access modifiers changed from: private */
    public int zzc;

    static {
        zzgqh zzgqh = new zzgqh();
        zza = zzgqh;
        zzgxr.zzbZ(zzgqh.class, zzgqh);
    }

    private zzgqh() {
    }

    public static zzgqf zzb() {
        return (zzgqf) zza.zzaZ();
    }

    public static zzgqh zzd() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        } else if (ordinal == 3) {
            return new zzgqh();
        } else {
            if (ordinal == 4) {
                return new zzgqf((zzgqg) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgqh.class) {
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
