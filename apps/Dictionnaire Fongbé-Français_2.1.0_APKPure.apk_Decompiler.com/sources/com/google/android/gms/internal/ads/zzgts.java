package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgts extends zzgxr implements zzgzd {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final zzgts zzb;
    private static volatile zzgzk zzc;
    private String zzd = "";
    private zzgyd zze = zzbK();

    static {
        zzgts zzgts = new zzgts();
        zzb = zzgts;
        zzgxr.zzbZ(zzgts.class, zzgts);
    }

    private zzgts() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgss.class});
        } else if (ordinal == 3) {
            return new zzgts();
        } else {
            if (ordinal == 4) {
                return new zzgtq((zzgtr) null);
            }
            if (ordinal == 5) {
                return zzb;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzc;
                if (zzgzk == null) {
                    synchronized (zzgts.class) {
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
