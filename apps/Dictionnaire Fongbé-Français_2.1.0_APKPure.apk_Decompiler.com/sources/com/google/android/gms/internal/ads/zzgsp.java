package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgsp extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgsp zza;
    private static volatile zzgzk zzb;
    private String zzc = "";
    private zzgwj zzd = zzgwj.zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgsp zzgsp = new zzgsp();
        zza = zzgsp;
        zzgxr.zzbZ(zzgsp.class, zzgsp);
    }

    private zzgsp() {
    }

    public static zzgsn zza() {
        return (zzgsn) zza.zzaZ();
    }

    public static zzgsn zzb(zzgsp zzgsp) {
        return (zzgsn) zza.zzba(zzgsp);
    }

    public static zzgsp zzd() {
        return zza;
    }

    public static zzgsp zzf(byte[] bArr, zzgxb zzgxb) throws zzgyg {
        return (zzgsp) zzgxr.zzbx(zza, bArr, zzgxb);
    }

    static /* synthetic */ void zzk(zzgsp zzgsp, String str) {
        str.getClass();
        zzgsp.zzc = str;
    }

    static /* synthetic */ void zzl(zzgsp zzgsp, zzgwj zzgwj) {
        zzgwj.getClass();
        zzgsp.zzd = zzgwj;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgsp();
        } else {
            if (ordinal == 4) {
                return new zzgsn((zzgso) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgsp.class) {
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

    public final zzgtp zzg() {
        zzgtp zzb2 = zzgtp.zzb(this.zze);
        return zzb2 == null ? zzgtp.UNRECOGNIZED : zzb2;
    }

    public final zzgwj zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
