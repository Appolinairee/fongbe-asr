package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgrc extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgrc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgrf zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgrc zzgrc = new zzgrc();
        zza = zzgrc;
        zzgxr.zzbZ(zzgrc.class, zzgrc);
    }

    private zzgrc() {
    }

    public static zzgra zzb() {
        return (zzgra) zza.zzaZ();
    }

    public static zzgrc zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgrc) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    static /* synthetic */ void zzh(zzgrc zzgrc, zzgrf zzgrf) {
        zzgrf.getClass();
        zzgrc.zzd = zzgrf;
        zzgrc.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgrc();
        } else {
            if (ordinal == 4) {
                return new zzgra((zzgrb) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgrc.class) {
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

    public final zzgrf zzf() {
        zzgrf zzgrf = this.zzd;
        return zzgrf == null ? zzgrf.zzd() : zzgrf;
    }
}
