package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgtc extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgtc zza;
    private static volatile zzgzk zzb;
    /* access modifiers changed from: private */
    public int zzc;
    private zzgyd zzd = zzbK();

    static {
        zzgtc zzgtc = new zzgtc();
        zza = zzgtc;
        zzgxr.zzbZ(zzgtc.class, zzgtc);
    }

    private zzgtc() {
    }

    public static zzgsy zza() {
        return (zzgsy) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzgtc zzgtc, zzgta zzgta) {
        zzgta.getClass();
        zzgyd zzgyd = zzgtc.zzd;
        if (!zzgyd.zzc()) {
            zzgtc.zzd = zzgxr.zzbL(zzgyd);
        }
        zzgtc.zzd.add(zzgta);
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgta.class});
        } else if (ordinal == 3) {
            return new zzgtc();
        } else {
            if (ordinal == 4) {
                return new zzgsy((zzgtb) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgtc.class) {
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
