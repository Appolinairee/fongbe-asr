package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzatc extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzatc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd = zzgwj.zzb;
    private zzgwj zze;
    private zzgwj zzf;
    private zzgwj zzg;

    static {
        zzatc zzatc = new zzatc();
        zza = zzatc;
        zzgxr.zzbZ(zzatc.class, zzatc);
    }

    private zzatc() {
        zzgwj zzgwj = zzgwj.zzb;
        this.zze = zzgwj;
        this.zzf = zzgwj;
        this.zzg = zzgwj;
    }

    public static zzatb zza() {
        return (zzatb) zza.zzaZ();
    }

    public static zzatc zzc(byte[] bArr, zzgxb zzgxb) throws zzgyg {
        return (zzatc) zzgxr.zzbx(zza, bArr, zzgxb);
    }

    static /* synthetic */ void zzi(zzatc zzatc, zzgwj zzgwj) {
        zzatc.zzc |= 1;
        zzatc.zzd = zzgwj;
    }

    static /* synthetic */ void zzj(zzatc zzatc, zzgwj zzgwj) {
        zzatc.zzc |= 2;
        zzatc.zze = zzgwj;
    }

    static /* synthetic */ void zzk(zzatc zzatc, zzgwj zzgwj) {
        zzatc.zzc |= 8;
        zzatc.zzg = zzgwj;
    }

    static /* synthetic */ void zzl(zzatc zzatc, zzgwj zzgwj) {
        zzatc.zzc |= 4;
        zzatc.zzf = zzgwj;
    }

    public final zzgwj zzd() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzatc();
        } else {
            if (ordinal == 4) {
                return new zzatb((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzatc.class) {
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

    public final zzgwj zzf() {
        return this.zze;
    }

    public final zzgwj zzg() {
        return this.zzg;
    }

    public final zzgwj zzh() {
        return this.zzf;
    }
}
