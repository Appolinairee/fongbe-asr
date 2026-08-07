package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhbc extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhbc zza;
    private static volatile zzgzk zzb;
    private zzgyd zzc = zzbK();

    static {
        zzhbc zzhbc = new zzhbc();
        zza = zzhbc;
        zzgxr.zzbZ(zzhbc.class, zzhbc);
    }

    private zzhbc() {
    }

    public static zzhbb zzc() {
        return (zzhbb) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhbc zzhbc, zzhba zzhba) {
        zzhba.getClass();
        zzgyd zzgyd = zzhbc.zzc;
        if (!zzgyd.zzc()) {
            zzhbc.zzc = zzgxr.zzbL(zzgyd);
        }
        zzhbc.zzc.add(zzhba);
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhba.class});
        } else if (ordinal == 3) {
            return new zzhbc();
        } else {
            if (ordinal == 4) {
                return new zzhbb((zzhbd) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhbc.class) {
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
