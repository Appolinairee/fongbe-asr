package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhch extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhch zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzhcg zzd;
    private zzgyd zze = zzbK();
    private zzgwj zzf = zzgwj.zzb;
    private zzgwj zzg;
    private int zzh;
    private zzgwj zzi;
    private byte zzj = 2;

    static {
        zzhch zzhch = new zzhch();
        zza = zzhch;
        zzgxr.zzbZ(zzhch.class, zzhch);
    }

    private zzhch() {
        zzgwj zzgwj = zzgwj.zzb;
        this.zzg = zzgwj;
        this.zzi = zzgwj;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        byte b = 1;
        switch (zzgxq.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzj);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.zzj = b;
                return null;
            case 2:
                return zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhbz.class, "zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new zzhch();
            case 4:
                return new zzhce((zzhdx) null);
            case 5:
                return zza;
            case 6:
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhch.class) {
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
