package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgty extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgty zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgub zze;

    static {
        zzgty zzgty = new zzgty();
        zza = zzgty;
        zzgxr.zzbZ(zzgty.class, zzgty);
    }

    private zzgty() {
    }

    public static zzgtw zzb() {
        return (zzgtw) zza.zzaZ();
    }

    public static zzgty zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgty) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    static /* synthetic */ void zzg(zzgty zzgty, zzgub zzgub) {
        zzgub.getClass();
        zzgty.zze = zzgub;
        zzgty.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgty();
        } else {
            if (ordinal == 4) {
                return new zzgtw((zzgtx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgty.class) {
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

    public final zzgub zzf() {
        zzgub zzgub = this.zze;
        return zzgub == null ? zzgub.zzd() : zzgub;
    }
}
