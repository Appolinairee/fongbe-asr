package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhdq extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhdq zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgxz zzf = zzbG();
    private int zzg;
    private zzgyd zzh = zzbK();
    private zzgwj zzi = zzgwj.zzb;

    static {
        zzhdq zzhdq = new zzhdq();
        zza = zzhdq;
        zzgxr.zzbZ(zzhdq.class, zzhdq);
    }

    private zzhdq() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhdo.class, "zzi"});
        } else if (ordinal == 3) {
            return new zzhdq();
        } else {
            if (ordinal == 4) {
                return new zzhdp((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhdq.class) {
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
