package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhbt extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhbt zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private zzhbs zze;
    private long zzf;
    private String zzg = "";

    static {
        zzhbt zzhbt = new zzhbt();
        zza = zzhbt;
        zzgxr.zzbZ(zzhbt.class, zzhbt);
    }

    private zzhbt() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzhbt();
        } else {
            if (ordinal == 4) {
                return new zzhbq((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhbt.class) {
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
