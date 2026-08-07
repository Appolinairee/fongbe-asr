package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgsv extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgsv zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgsl zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgsv zzgsv = new zzgsv();
        zza = zzgsv;
        zzgxr.zzbZ(zzgsv.class, zzgsv);
    }

    private zzgsv() {
    }

    public static zzgsu zzc() {
        return (zzgsu) zza.zzaZ();
    }

    static /* synthetic */ void zzg(zzgsv zzgsv, zzgsl zzgsl) {
        zzgsl.getClass();
        zzgsv.zzd = zzgsl;
        zzgsv.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgsl zzb() {
        zzgsl zzgsl = this.zzd;
        return zzgsl == null ? zzgsl.zzd() : zzgsl;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzgsv();
        } else {
            if (ordinal == 4) {
                return new zzgsu((zzgsw) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgsv.class) {
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

    public final zzgtp zzf() {
        zzgtp zzb2 = zzgtp.zzb(this.zzg);
        return zzb2 == null ? zzgtp.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            i2 = i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
