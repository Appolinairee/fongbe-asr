package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhde extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhde zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private long zze;
    private boolean zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private boolean zzk;

    static {
        zzhde zzhde = new zzhde();
        zza = zzhde;
        zzgxr.zzbZ(zzhde.class, zzhde);
    }

    private zzhde() {
    }

    public static zzhdd zzc() {
        return (zzhdd) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhde zzhde, String str) {
        zzhde.zzc |= 1;
        zzhde.zzd = str;
    }

    static /* synthetic */ void zzg(zzhde zzhde, long j) {
        zzhde.zzc |= 2;
        zzhde.zze = j;
    }

    static /* synthetic */ void zzh(zzhde zzhde, boolean z) {
        zzhde.zzc |= 4;
        zzhde.zzf = z;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhdf.zza, "zzh", "zzi", "zzj", "zzk"});
        } else if (ordinal == 3) {
            return new zzhde();
        } else {
            if (ordinal == 4) {
                return new zzhdd((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhde.class) {
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
