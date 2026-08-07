package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzary extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzary zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzary zzary = new zzary();
        zza = zzary;
        zzgxr.zzbZ(zzary.class, zzary);
    }

    private zzary() {
    }

    public static zzary zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (ordinal == 3) {
            return new zzary();
        } else {
            if (ordinal == 4) {
                return new zzarw((zzarx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzary.class) {
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

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzf;
    }

    public final boolean zzh() {
        return this.zzh;
    }
}
