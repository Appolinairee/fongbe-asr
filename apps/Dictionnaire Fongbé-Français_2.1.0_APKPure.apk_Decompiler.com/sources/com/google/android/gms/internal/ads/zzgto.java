package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgto extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgto zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private zzgsp zze;

    static {
        zzgto zzgto = new zzgto();
        zza = zzgto;
        zzgxr.zzbZ(zzgto.class, zzgto);
    }

    private zzgto() {
    }

    public static zzgtm zzb() {
        return (zzgtm) zza.zzaZ();
    }

    public static zzgto zzd() {
        return zza;
    }

    public static zzgto zzf(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgto) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    static /* synthetic */ void zzh(zzgto zzgto, zzgsp zzgsp) {
        zzgsp.getClass();
        zzgto.zze = zzgsp;
        zzgto.zzc |= 1;
    }

    static /* synthetic */ void zzi(zzgto zzgto, String str) {
        str.getClass();
        zzgto.zzd = str;
    }

    public final zzgsp zza() {
        zzgsp zzgsp = this.zze;
        return zzgsp == null ? zzgsp.zzd() : zzgsp;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgto();
        } else {
            if (ordinal == 4) {
                return new zzgtm((zzgtn) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgto.class) {
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

    public final String zzg() {
        return this.zzd;
    }
}
