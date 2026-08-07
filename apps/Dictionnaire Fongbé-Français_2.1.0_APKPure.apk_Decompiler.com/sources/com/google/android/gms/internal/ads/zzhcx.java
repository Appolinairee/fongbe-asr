package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhcx extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhcx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgwj zzf = zzgwj.zzb;
    private zzgwj zzg = zzgwj.zzb;

    static {
        zzhcx zzhcx = new zzhcx();
        zza = zzhcx;
        zzgxr.zzbZ(zzhcx.class, zzhcx);
    }

    private zzhcx() {
    }

    public static zzhcv zzc() {
        return (zzhcv) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhcx zzhcx, zzgwj zzgwj) {
        zzgwj.getClass();
        zzhcx.zzc |= 4;
        zzhcx.zzf = zzgwj;
    }

    static /* synthetic */ void zzg(zzhcx zzhcx, String str) {
        zzhcx.zzc |= 2;
        zzhcx.zze = "image/png";
    }

    static /* synthetic */ void zzh(zzhcx zzhcx, int i) {
        zzhcx.zzd = 1;
        zzhcx.zzc = 1 | zzhcx.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhcw.zza, "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzhcx();
        } else {
            if (ordinal == 4) {
                return new zzhcv((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhcx.class) {
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
