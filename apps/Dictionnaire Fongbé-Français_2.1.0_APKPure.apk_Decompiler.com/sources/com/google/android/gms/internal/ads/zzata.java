package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzata extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzata zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private zzgxz zzg = zzbG();
    private long zzh;

    static {
        zzata zzata = new zzata();
        zza = zzata;
        zzgxr.zzbZ(zzata.class, zzata);
    }

    private zzata() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (ordinal == 3) {
            return new zzata();
        } else {
            if (ordinal == 4) {
                return new zzasz((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzata.class) {
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
