package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfoj extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzfoj zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfof zzg;

    static {
        zzfoj zzfoj = new zzfoj();
        zza = zzfoj;
        zzgxr.zzbZ(zzfoj.class, zzfoj);
    }

    private zzfoj() {
    }

    public static zzfog zza() {
        return (zzfog) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzfoj zzfoj, String str) {
        str.getClass();
        zzfoj.zzc |= 2;
        zzfoj.zze = str;
    }

    static /* synthetic */ void zzd(zzfoj zzfoj, zzfof zzfof) {
        zzfof.getClass();
        zzfoj.zzg = zzfof;
        zzfoj.zzc |= 8;
    }

    static /* synthetic */ void zzf(zzfoj zzfoj, int i) {
        zzfoj.zzd = 1;
        zzfoj.zzc = 1 | zzfoj.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfoh.zza, "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzfoj();
        } else {
            if (ordinal == 4) {
                return new zzfog((zzfoi) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzfoj.class) {
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
