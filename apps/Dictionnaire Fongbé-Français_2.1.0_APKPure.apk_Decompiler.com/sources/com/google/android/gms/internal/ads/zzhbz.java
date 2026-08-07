package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhbz extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhbz zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd = zzgwj.zzb;
    private zzgwj zze = zzgwj.zzb;
    private byte zzf = 2;

    static {
        zzhbz zzhbz = new zzhbz();
        zza = zzhbz;
        zzgxr.zzbZ(zzhbz.class, zzhbz);
    }

    private zzhbz() {
    }

    public static zzhby zzc() {
        return (zzhby) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhbz zzhbz, zzgwj zzgwj) {
        zzhbz.zzc |= 1;
        zzhbz.zzd = zzgwj;
    }

    static /* synthetic */ void zzg(zzhbz zzhbz, zzgwj zzgwj) {
        zzhbz.zzc |= 2;
        zzhbz.zze = zzgwj;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        byte b = 1;
        switch (zzgxq.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.zzf = b;
                return null;
            case 2:
                return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzhbz();
            case 4:
                return new zzhby((zzhdx) null);
            case 5:
                return zza;
            case 6:
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhbz.class) {
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
