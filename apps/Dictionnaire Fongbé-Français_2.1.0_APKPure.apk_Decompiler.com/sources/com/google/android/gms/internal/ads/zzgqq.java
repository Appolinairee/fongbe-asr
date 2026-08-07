package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgqq extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgqq zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgqw zze;
    /* access modifiers changed from: private */
    public zzgwj zzf = zzgwj.zzb;

    static {
        zzgqq zzgqq = new zzgqq();
        zza = zzgqq;
        zzgxr.zzbZ(zzgqq.class, zzgqq);
    }

    private zzgqq() {
    }

    public static zzgqo zzb() {
        return (zzgqo) zza.zzaZ();
    }

    public static zzgqq zzd() {
        return zza;
    }

    static /* synthetic */ void zzi(zzgqq zzgqq, zzgqw zzgqw) {
        zzgqw.getClass();
        zzgqq.zze = zzgqw;
        zzgqq.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgqq();
        } else {
            if (ordinal == 4) {
                return new zzgqo((zzgqp) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgqq.class) {
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

    public final zzgqw zzf() {
        zzgqw zzgqw = this.zze;
        return zzgqw == null ? zzgqw.zzd() : zzgqw;
    }

    public final zzgwj zzg() {
        return this.zzf;
    }
}
