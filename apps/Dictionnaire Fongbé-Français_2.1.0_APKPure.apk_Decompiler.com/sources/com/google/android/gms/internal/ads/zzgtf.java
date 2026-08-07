package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgtf extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgtf zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgti zze;

    static {
        zzgtf zzgtf = new zzgtf();
        zza = zzgtf;
        zzgxr.zzbZ(zzgtf.class, zzgtf);
    }

    private zzgtf() {
    }

    public static zzgtd zzb() {
        return (zzgtd) zza.zzaZ();
    }

    public static zzgtf zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgtf) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    public static zzgzk zzg() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzh(zzgtf zzgtf, zzgti zzgti) {
        zzgti.getClass();
        zzgtf.zze = zzgti;
        zzgtf.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgtf();
        } else {
            if (ordinal == 4) {
                return new zzgtd((zzgte) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgtf.class) {
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

    public final zzgti zzf() {
        zzgti zzgti = this.zze;
        return zzgti == null ? zzgti.zzc() : zzgti;
    }
}
