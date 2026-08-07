package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzasb extends zzgxr implements zzgzd {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final zzasb zzb;
    private static volatile zzgzk zzc;
    private int zzd;
    private long zze = 100;
    private boolean zzf;
    private boolean zzg;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        zzasb zzasb = new zzasb();
        zzb = zzasb;
        zzgxr.zzbZ(zzasb.class, zzasb);
    }

    private zzasb() {
    }

    public static zzasb zzb() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (ordinal == 3) {
            return new zzasb();
        } else {
            if (ordinal == 4) {
                return new zzarz((zzasa) null);
            }
            if (ordinal == 5) {
                return zzb;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzc;
                if (zzgzk == null) {
                    synchronized (zzasb.class) {
                        zzgzk = zzc;
                        if (zzgzk == null) {
                            zzgzk = new zzgxm(zzb);
                            zzc = zzgzk;
                        }
                    }
                }
                return zzgzk;
            }
            throw null;
        }
    }
}
