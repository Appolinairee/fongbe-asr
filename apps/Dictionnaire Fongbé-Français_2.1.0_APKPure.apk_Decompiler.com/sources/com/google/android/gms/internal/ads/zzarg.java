package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzarg extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzarg zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzg;
    private boolean zzh = true;
    private zzary zzi;
    private zzasb zzj;
    private boolean zzk;

    static {
        zzarg zzarg = new zzarg();
        zza = zzarg;
        zzgxr.zzbZ(zzarg.class, zzarg);
    }

    private zzarg() {
    }

    public static zzare zza() {
        return (zzare) zza.zzaZ();
    }

    static /* synthetic */ void zzg(zzarg zzarg, boolean z) {
        zzarg.zzc |= 8;
        zzarg.zzg = z;
    }

    static /* synthetic */ void zzh(zzarg zzarg, String str) {
        str.getClass();
        zzarg.zzc |= 4;
        zzarg.zzf = str;
    }

    public final zzary zzc() {
        zzary zzary = this.zzi;
        return zzary == null ? zzary.zzc() : zzary;
    }

    public final zzasb zzd() {
        zzasb zzasb = this.zzj;
        return zzasb == null ? zzasb.zzb() : zzasb;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zzarh.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (ordinal == 3) {
            return new zzarg();
        } else {
            if (ordinal == 4) {
                return new zzare((zzarf) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzarg.class) {
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

    public final String zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzg;
    }
}
