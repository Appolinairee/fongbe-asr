package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgqn extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgqn zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgqt zzd;
    private zzgse zze;

    static {
        zzgqn zzgqn = new zzgqn();
        zza = zzgqn;
        zzgxr.zzbZ(zzgqn.class, zzgqn);
    }

    private zzgqn() {
    }

    public static zzgql zza() {
        return (zzgql) zza.zzaZ();
    }

    public static zzgqn zzc(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgqn) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    static /* synthetic */ void zzg(zzgqn zzgqn, zzgqt zzgqt) {
        zzgqt.getClass();
        zzgqn.zzd = zzgqt;
        zzgqn.zzc |= 1;
    }

    static /* synthetic */ void zzh(zzgqn zzgqn, zzgse zzgse) {
        zzgse.getClass();
        zzgqn.zze = zzgse;
        zzgqn.zzc |= 2;
    }

    public final zzgqt zzd() {
        zzgqt zzgqt = this.zzd;
        return zzgqt == null ? zzgqt.zzd() : zzgqt;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgqn();
        } else {
            if (ordinal == 4) {
                return new zzgql((zzgqm) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgqn.class) {
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

    public final zzgse zzf() {
        zzgse zzgse = this.zze;
        return zzgse == null ? zzgse.zzf() : zzgse;
    }
}
