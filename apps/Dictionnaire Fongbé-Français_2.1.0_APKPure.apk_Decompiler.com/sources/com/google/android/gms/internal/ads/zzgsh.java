package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgsh extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgsh zza;
    private static volatile zzgzk zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzgsh zzgsh = new zzgsh();
        zza = zzgsh;
        zzgxr.zzbZ(zzgsh.class, zzgsh);
    }

    private zzgsh() {
    }

    public static zzgsf zzc() {
        return (zzgsf) zza.zzaZ();
    }

    public static zzgsh zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgry zzb() {
        int i = this.zzc;
        zzgry zzgry = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzgry.SHA224 : zzgry.SHA512 : zzgry.SHA256 : zzgry.SHA384 : zzgry.SHA1 : zzgry.UNKNOWN_HASH;
        return zzgry == null ? zzgry.UNRECOGNIZED : zzgry;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzgsh();
        } else {
            if (ordinal == 4) {
                return new zzgsf((zzgsg) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgsh.class) {
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
