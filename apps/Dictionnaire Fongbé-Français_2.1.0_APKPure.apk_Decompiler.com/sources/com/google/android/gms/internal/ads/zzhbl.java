package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhbl extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhbl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private zzgyd zzg = zzgxr.zzbK();
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zzl = "";
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private zzgyd zzu = zzbK();
    private boolean zzv;
    private long zzw;
    private zzgxz zzx = zzbG();
    private boolean zzy;
    private zzgxz zzz = zzbG();

    static {
        zzhbl zzhbl = new zzhbl();
        zza = zzhbl;
        zzgxr.zzbZ(zzhbl.class, zzhbl);
    }

    private zzhbl() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", zzhbk.zza, "zze", "zzf", "zzg", "zzh", zzhbi.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzhbh.class, "zzv", "zzw", "zzx", zzhay.zza(), "zzy", "zzz", zzhbj.zza});
        } else if (ordinal == 3) {
            return new zzhbl();
        } else {
            if (ordinal == 4) {
                return new zzhbe((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhbl.class) {
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
