package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzatg extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzatg zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private String zzg = "D";
    private long zzh;

    static {
        zzatg zzatg = new zzatg();
        zza = zzatg;
        zzgxr.zzbZ(zzatg.class, zzatg);
    }

    private zzatg() {
    }

    public static zzatf zza() {
        return (zzatf) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzatg zzatg, String str) {
        zzatg.zzc |= 1;
        zzatg.zzd = "1.671910402";
    }

    static /* synthetic */ void zzd(zzatg zzatg, String str) {
        str.getClass();
        zzatg.zzc |= 2;
        zzatg.zze = str;
    }

    static /* synthetic */ void zzf(zzatg zzatg, String str) {
        str.getClass();
        zzatg.zzc |= 8;
        zzatg.zzg = str;
    }

    static /* synthetic */ void zzg(zzatg zzatg, long j) {
        zzatg.zzc |= 4;
        zzatg.zzf = j;
    }

    static /* synthetic */ void zzh(zzatg zzatg, long j) {
        zzatg.zzc |= 16;
        zzatg.zzh = j;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (ordinal == 3) {
            return new zzatg();
        } else {
            if (ordinal == 4) {
                return new zzatf((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzatg.class) {
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
