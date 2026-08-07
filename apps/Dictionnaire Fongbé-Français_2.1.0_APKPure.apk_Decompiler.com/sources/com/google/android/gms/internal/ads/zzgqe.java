package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgqe extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgqe zza;
    private static volatile zzgzk zzb;
    private int zzc;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgqh zze;

    static {
        zzgqe zzgqe = new zzgqe();
        zza = zzgqe;
        zzgxr.zzbZ(zzgqe.class, zzgqe);
    }

    private zzgqe() {
    }

    public static zzgqc zzb() {
        return (zzgqc) zza.zzaZ();
    }

    public static zzgqe zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgqe) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    static /* synthetic */ void zzh(zzgqe zzgqe, zzgqh zzgqh) {
        zzgqh.getClass();
        zzgqe.zze = zzgqh;
        zzgqe.zzc |= 1;
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
            return new zzgqe();
        } else {
            if (ordinal == 4) {
                return new zzgqc((zzgqd) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgqe.class) {
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

    public final zzgqh zzf() {
        zzgqh zzgqh = this.zze;
        return zzgqh == null ? zzgqh.zzd() : zzgqh;
    }
}
