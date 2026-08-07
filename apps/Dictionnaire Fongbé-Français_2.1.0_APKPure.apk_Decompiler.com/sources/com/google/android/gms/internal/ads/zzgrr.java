package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgrr extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgrr zza;
    private static volatile zzgzk zzb;
    /* access modifiers changed from: private */
    public int zzc;
    private int zzd;

    static {
        zzgrr zzgrr = new zzgrr();
        zza = zzgrr;
        zzgxr.zzbZ(zzgrr.class, zzgrr);
    }

    private zzgrr() {
    }

    public static zzgrp zzc() {
        return (zzgrp) zza.zzaZ();
    }

    public static zzgrr zzf(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgrr) zzgxr.zzbr(zza, zzgwj, zzgxb);
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
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
        } else if (ordinal == 3) {
            return new zzgrr();
        } else {
            if (ordinal == 4) {
                return new zzgrp((zzgrq) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgrr.class) {
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
