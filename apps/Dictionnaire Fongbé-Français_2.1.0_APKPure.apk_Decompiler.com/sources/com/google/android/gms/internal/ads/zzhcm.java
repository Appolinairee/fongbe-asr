package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhcm extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhcm zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzhcl zze;
    private zzhcl zzf;

    static {
        zzhcm zzhcm = new zzhcm();
        zza = zzhcm;
        zzgxr.zzbZ(zzhcm.class, zzhcm);
    }

    private zzhcm() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhcj.zza, "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzhcm();
        } else {
            if (ordinal == 4) {
                return new zzhci((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhcm.class) {
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
