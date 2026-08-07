package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgue extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgue zza;
    private static volatile zzgzk zzb;
    private int zzc;
    /* access modifiers changed from: private */
    public zzgwj zzd = zzgwj.zzb;

    static {
        zzgue zzgue = new zzgue();
        zza = zzgue;
        zzgxr.zzbZ(zzgue.class, zzgue);
    }

    private zzgue() {
    }

    public static zzguc zzb() {
        return (zzguc) zza.zzaZ();
    }

    public static zzgue zzd(zzgwj zzgwj, zzgxb zzgxb) throws zzgyg {
        return (zzgue) zzgxr.zzbr(zza, zzgwj, zzgxb);
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
            return new zzgue();
        } else {
            if (ordinal == 4) {
                return new zzguc((zzgud) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgue.class) {
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
