package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzasl extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzasl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = 1000;
    private int zzf = 1000;

    static {
        zzasl zzasl = new zzasl();
        zza = zzasl;
        zzgxr.zzbZ(zzasl.class, zzasl);
    }

    private zzasl() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzgxx zzgxx = zzate.zza;
            return zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", zzgxx, "zzf", zzgxx});
        } else if (ordinal == 3) {
            return new zzasl();
        } else {
            if (ordinal == 4) {
                return new zzask((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzasl.class) {
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
