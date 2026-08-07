package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhdl extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhdl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze = "";

    static {
        zzhdl zzhdl = new zzhdl();
        zza = zzhdl;
        zzgxr.zzbZ(zzhdl.class, zzhdl);
    }

    private zzhdl() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", zzhdk.zza, "zze"});
        } else if (ordinal == 3) {
            return new zzhdl();
        } else {
            if (ordinal == 4) {
                return new zzhdj((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhdl.class) {
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
