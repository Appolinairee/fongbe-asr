package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgss extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgss zza;
    private static volatile zzgzk zzb;
    private String zzc = "";
    private String zzd = "";
    private int zze;
    private boolean zzf;
    private String zzg = "";

    static {
        zzgss zzgss = new zzgss();
        zza = zzgss;
        zzgxr.zzbZ(zzgss.class, zzgss);
    }

    private zzgss() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzgss();
        } else {
            if (ordinal == 4) {
                return new zzgsq((zzgsr) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgss.class) {
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
