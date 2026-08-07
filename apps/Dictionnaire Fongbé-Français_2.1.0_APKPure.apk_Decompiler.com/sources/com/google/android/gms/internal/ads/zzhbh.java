package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhbh extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhbh zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgwj zzf = zzgwj.zzb;

    static {
        zzhbh zzhbh = new zzhbh();
        zza = zzhbh;
        zzgxr.zzbZ(zzhbh.class, zzhbh);
    }

    private zzhbh() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhbg.zza, "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzhbh();
        } else {
            if (ordinal == 4) {
                return new zzhbf((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhbh.class) {
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
