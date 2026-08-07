package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgtv extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgtv zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgub zze;
    /* access modifiers changed from: private */
    public zzgwj zzf = zzgwj.zzb;

    static {
        zzgtv zzgtv = new zzgtv();
        zza = zzgtv;
        zzgxr.zzbZ(zzgtv.class, zzgtv);
    }

    private zzgtv() {
    }

    public static zzgtt zzb() {
        return (zzgtt) zza.zzaZ();
    }

    public static zzgtv zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgtv) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    static /* synthetic */ void zzi(zzgtv zzgtv, zzgub zzgub) {
        zzgub.getClass();
        zzgtv.zze = zzgub;
        zzgtv.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgtv();
        } else {
            if (ordinal == 4) {
                return new zzgtt((zzgtu) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgtv.class) {
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

    public final zzgub zzf() {
        zzgub zzgub = this.zze;
        return zzgub == null ? zzgub.zzd() : zzgub;
    }

    public final zzgwj zzg() {
        return this.zzf;
    }
}
