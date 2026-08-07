package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfig extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzfig zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private int zze;
    private String zzf = "";

    static {
        zzfig zzfig = new zzfig();
        zza = zzfig;
        zzgxr.zzbZ(zzfig.class, zzfig);
    }

    private zzfig() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzfig();
        } else {
            if (ordinal == 4) {
                return new zzfie((zzfif) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzfig.class) {
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
}
