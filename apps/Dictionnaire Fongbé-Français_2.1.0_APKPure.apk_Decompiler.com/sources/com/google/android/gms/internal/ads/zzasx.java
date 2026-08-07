package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzasx extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzasx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzasx zzasx = new zzasx();
        zza = zzasx;
        zzgxr.zzbZ(zzasx.class, zzasx);
    }

    private zzasx() {
    }

    public static zzasw zza() {
        return (zzasw) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzasx zzasx, long j) {
        zzasx.zzc |= 32;
        zzasx.zzi = j;
    }

    static /* synthetic */ void zzd(zzasx zzasx, long j) {
        zzasx.zzc |= 4;
        zzasx.zzf = j;
    }

    static /* synthetic */ void zzf(zzasx zzasx, long j) {
        zzasx.zzc |= 1;
        zzasx.zzd = j;
    }

    static /* synthetic */ void zzg(zzasx zzasx, long j) {
        zzasx.zzc |= 8;
        zzasx.zzg = j;
    }

    static /* synthetic */ void zzh(zzasx zzasx, long j) {
        zzasx.zzc |= 16;
        zzasx.zzh = j;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (ordinal == 3) {
            return new zzasx();
        } else {
            if (ordinal == 4) {
                return new zzasw((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzasx.class) {
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
