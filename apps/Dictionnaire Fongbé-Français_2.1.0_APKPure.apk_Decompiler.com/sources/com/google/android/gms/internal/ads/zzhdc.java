package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhdc extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhdc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzhcd zzf;
    private zzhch zzg;
    private int zzh;
    private zzgxz zzi = zzbG();
    private String zzj = "";
    private int zzk;
    private zzgyd zzl = zzgxr.zzbK();
    private byte zzm = 2;

    static {
        zzhdc zzhdc = new zzhdc();
        zza = zzhdc;
        zzgxr.zzbZ(zzhdc.class, zzhdc);
    }

    private zzhdc() {
    }

    public static zzhdb zzd() {
        return (zzhdb) zza.zzaZ();
    }

    static /* synthetic */ void zzh(zzhdc zzhdc, String str) {
        str.getClass();
        zzgyd zzgyd = zzhdc.zzl;
        if (!zzgyd.zzc()) {
            zzhdc.zzl = zzgxr.zzbL(zzgyd);
        }
        zzhdc.zzl.add(str);
    }

    static /* synthetic */ void zzi(zzhdc zzhdc, int i) {
        zzhdc.zzc |= 1;
        zzhdc.zzd = i;
    }

    static /* synthetic */ void zzj(zzhdc zzhdc, zzhcd zzhcd) {
        zzhcd.getClass();
        zzhdc.zzf = zzhcd;
        zzhdc.zzc |= 4;
    }

    static /* synthetic */ void zzk(zzhdc zzhdc, String str) {
        str.getClass();
        zzhdc.zzc |= 2;
        zzhdc.zze = str;
    }

    static /* synthetic */ void zzl(zzhdc zzhdc, int i) {
        zzhdc.zzk = i - 1;
        zzhdc.zzc |= 64;
    }

    public final int zzc() {
        return this.zzl.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        byte b = 1;
        switch (zzgxq.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.zzm = b;
                return null;
            case 2:
                return zzbQ(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhcz.zza, "zzl"});
            case 3:
                return new zzhdc();
            case 4:
                return new zzhdb((zzhdx) null);
            case 5:
                return zza;
            case 6:
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhdc.class) {
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

    public final String zzg() {
        return this.zze;
    }
}
