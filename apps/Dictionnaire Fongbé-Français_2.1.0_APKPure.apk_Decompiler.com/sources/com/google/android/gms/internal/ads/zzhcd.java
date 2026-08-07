package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhcd extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhcd zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzhcc zzd;
    private zzgyd zze = zzbK();
    private zzgwj zzf = zzgwj.zzb;
    private zzgwj zzg = zzgwj.zzb;
    private int zzh;
    private byte zzi = 2;

    static {
        zzhcd zzhcd = new zzhcd();
        zza = zzhcd;
        zzgxr.zzbZ(zzhcd.class, zzhcd);
    }

    private zzhcd() {
    }

    public static zzhca zzc() {
        return (zzhca) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhcd zzhcd, zzhbz zzhbz) {
        zzhbz.getClass();
        zzgyd zzgyd = zzhcd.zze;
        if (!zzgyd.zzc()) {
            zzhcd.zze = zzgxr.zzbL(zzgyd);
        }
        zzhcd.zze.add(zzhbz);
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        byte b = 1;
        switch (zzgxq.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.zzi = b;
                return null;
            case 2:
                return zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhbz.class, "zzf", "zzg", "zzh"});
            case 3:
                return new zzhcd();
            case 4:
                return new zzhca((zzhdx) null);
            case 5:
                return zza;
            case 6:
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhcd.class) {
                        zzgzk = zzb;
                        if (zzgzk == null) {
                            zzgzk = new zzgxm(zza);
                            zzb = zzgzk;
                        }
                    }
                }
                return zzgzk;
            default:
                throw null;
        }
    }
}
