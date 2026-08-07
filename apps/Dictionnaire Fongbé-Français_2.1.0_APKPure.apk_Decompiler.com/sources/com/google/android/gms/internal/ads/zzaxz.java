package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxz extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzaxz zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzaxz zzaxz = new zzaxz();
        zza = zzaxz;
        zzgxr.zzbZ(zzaxz.class, zzaxz);
    }

    private zzaxz() {
    }

    public static zzaxx zzd() {
        return (zzaxx) zza.zzaZ();
    }

    public static zzaxz zzg() {
        return zza;
    }

    public static zzaxz zzh(zzgwj zzgwj) throws zzgyg {
        return (zzaxz) zzgxr.zzbm(zza, zzgwj);
    }

    public static zzaxz zzi(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzaxz) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    static /* synthetic */ void zzl(zzaxz zzaxz, String str) {
        str.getClass();
        zzaxz.zzc |= 2;
        zzaxz.zze = str;
    }

    static /* synthetic */ void zzm(zzaxz zzaxz, long j) {
        zzaxz.zzc |= 8;
        zzaxz.zzg = j;
    }

    static /* synthetic */ void zzn(zzaxz zzaxz, long j) {
        zzaxz.zzc |= 4;
        zzaxz.zzf = j;
    }

    static /* synthetic */ void zzo(zzaxz zzaxz, long j) {
        zzaxz.zzc |= 16;
        zzaxz.zzh = j;
    }

    static /* synthetic */ void zzp(zzaxz zzaxz, String str) {
        str.getClass();
        zzaxz.zzc |= 1;
        zzaxz.zzd = str;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final long zzc() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (ordinal == 3) {
            return new zzaxz();
        } else {
            if (ordinal == 4) {
                return new zzaxx((zzaxy) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzaxz.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
