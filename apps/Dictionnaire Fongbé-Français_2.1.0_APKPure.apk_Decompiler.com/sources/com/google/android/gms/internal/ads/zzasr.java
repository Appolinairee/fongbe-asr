package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzasr extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzasr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        zzasr zzasr = new zzasr();
        zza = zzasr;
        zzgxr.zzbZ(zzasr.class, zzasr);
    }

    private zzasr() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", zzasg.zza, "zze"});
        } else if (ordinal == 3) {
            return new zzasr();
        } else {
            if (ordinal == 4) {
                return new zzasq((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzasr.class) {
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
