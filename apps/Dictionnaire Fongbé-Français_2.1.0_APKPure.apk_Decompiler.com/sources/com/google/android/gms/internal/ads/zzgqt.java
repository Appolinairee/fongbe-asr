package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgqt extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgqt zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgqw zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgqt zzgqt = new zzgqt();
        zza = zzgqt;
        zzgxr.zzbZ(zzgqt.class, zzgqt);
    }

    private zzgqt() {
    }

    public static zzgqr zzb() {
        return (zzgqr) zza.zzaZ();
    }

    public static zzgqt zzd() {
        return zza;
    }

    static /* synthetic */ void zzh(zzgqt zzgqt, zzgqw zzgqw) {
        zzgqw.getClass();
        zzgqt.zzd = zzgqw;
        zzgqt.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgqt();
        } else {
            if (ordinal == 4) {
                return new zzgqr((zzgqs) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgqt.class) {
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

    public final zzgqw zzf() {
        zzgqw zzgqw = this.zzd;
        return zzgqw == null ? zzgqw.zzd() : zzgqw;
    }
}
