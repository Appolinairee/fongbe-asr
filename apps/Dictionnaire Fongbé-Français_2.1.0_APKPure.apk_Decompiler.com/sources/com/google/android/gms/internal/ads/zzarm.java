package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzarm extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzarm zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private long zzj;
    private String zzk = "";
    private long zzl;
    private String zzm = "";
    private String zzn = "";
    private zzgyd zzo = zzbK();
    private int zzp;

    static {
        zzarm zzarm = new zzarm();
        zza = zzarm;
        zzgxr.zzbZ(zzarm.class, zzarm);
    }

    private zzarm() {
    }

    public static zzari zza() {
        return (zzari) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzarm zzarm, String str) {
        str.getClass();
        zzarm.zzc |= 1;
        zzarm.zzd = str;
    }

    static /* synthetic */ void zzd(zzarm zzarm, String str) {
        zzarm.zzc |= 16;
        zzarm.zzh = str;
    }

    static /* synthetic */ void zzf(zzarm zzarm, String str) {
        zzarm.zzc |= 1024;
        zzarm.zzn = str;
    }

    static /* synthetic */ void zzg(zzarm zzarm, String str) {
        str.getClass();
        zzarm.zzc |= 8;
        zzarm.zzg = str;
    }

    static /* synthetic */ void zzh(zzarm zzarm, long j) {
        zzarm.zzc |= 2;
        zzarm.zze = j;
    }

    static /* synthetic */ void zzi(zzarm zzarm, String str) {
        str.getClass();
        zzarm.zzc |= 4;
        zzarm.zzf = str;
    }

    static /* synthetic */ void zzj(zzarm zzarm, int i) {
        zzarm.zzp = i - 1;
        zzarm.zzc |= 2048;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzark.class, "zzp", zzarl.zza});
        } else if (ordinal == 3) {
            return new zzarm();
        } else {
            if (ordinal == 4) {
                return new zzari((zzarn) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzarm.class) {
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
