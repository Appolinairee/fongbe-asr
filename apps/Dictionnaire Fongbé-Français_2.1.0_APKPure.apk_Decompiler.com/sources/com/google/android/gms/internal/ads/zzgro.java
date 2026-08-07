package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgro extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgro zza;
    private static volatile zzgzk zzb;
    private int zzc;
    /* access modifiers changed from: private */
    public zzgwj zzd = zzgwj.zzb;

    static {
        zzgro zzgro = new zzgro();
        zza = zzgro;
        zzgxr.zzbZ(zzgro.class, zzgro);
    }

    private zzgro() {
    }

    public static zzgrm zzb() {
        return (zzgrm) zza.zzaZ();
    }

    public static zzgro zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgro) zzgxr.zzbr(zza, zzgwj, zzgxb);
    }

    public static zzgzk zzg() {
        return zza.zzbN();
    }

    public final int zza() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzgro();
        } else {
            if (ordinal == 4) {
                return new zzgrm((zzgrn) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgro.class) {
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
        return this.zzd;
    }
}
