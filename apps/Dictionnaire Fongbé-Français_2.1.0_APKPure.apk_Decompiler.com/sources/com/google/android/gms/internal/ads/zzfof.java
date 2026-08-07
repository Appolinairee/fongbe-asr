package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfof extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzfof zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgxz zzd = zzbG();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzfof zzfof = new zzfof();
        zza = zzfof;
        zzgxr.zzbZ(zzfof.class, zzfof);
    }

    private zzfof() {
    }

    public static zzfod zza() {
        return (zzfod) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzfof zzfof, String str) {
        str.getClass();
        zzfof.zzc |= 1;
        zzfof.zze = str;
    }

    static /* synthetic */ void zzd(zzfof zzfof, int i) {
        zzgxz zzgxz = zzfof.zzd;
        if (!zzgxz.zzc()) {
            zzfof.zzd = zzgxr.zzbH(zzgxz);
        }
        zzfof.zzd.zzi(2);
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfoc.zza, "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzfof();
        } else {
            if (ordinal == 4) {
                return new zzfod((zzfoe) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzfof.class) {
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
