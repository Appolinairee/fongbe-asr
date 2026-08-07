package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhcr extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhcr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private long zze;

    static {
        zzhcr zzhcr = new zzhcr();
        zza = zzhcr;
        zzgxr.zzbZ(zzhcr.class, zzhcr);
    }

    private zzhcr() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzhcr();
        } else {
            if (ordinal == 4) {
                return new zzhcq((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhcr.class) {
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
