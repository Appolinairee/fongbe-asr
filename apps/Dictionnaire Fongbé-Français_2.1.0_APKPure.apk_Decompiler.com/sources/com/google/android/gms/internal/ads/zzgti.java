package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgti extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgti zza;
    private static volatile zzgzk zzb;
    private String zzc = "";

    static {
        zzgti zzgti = new zzgti();
        zza = zzgti;
        zzgxr.zzbZ(zzgti.class, zzgti);
    }

    private zzgti() {
    }

    public static zzgtg zza() {
        return (zzgtg) zza.zzaZ();
    }

    public static zzgti zzc() {
        return zza;
    }

    public static zzgti zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgti) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    static /* synthetic */ void zzg(zzgti zzgti, String str) {
        str.getClass();
        zzgti.zzc = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        } else if (ordinal == 3) {
            return new zzgti();
        } else {
            if (ordinal == 4) {
                return new zzgtg((zzgth) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgti.class) {
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
        return this.zzc;
    }
}
