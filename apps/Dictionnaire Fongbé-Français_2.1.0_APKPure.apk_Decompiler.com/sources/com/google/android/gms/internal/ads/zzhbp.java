package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhbp extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhbp zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhbp zzhbp = new zzhbp();
        zza = zzhbp;
        zzgxr.zzbZ(zzhbp.class, zzhbp);
    }

    private zzhbp() {
    }

    public static zzhbo zzc() {
        return (zzhbo) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhbp zzhbp, String str) {
        zzhbp.zzc |= 1;
        zzhbp.zzd = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzhbp();
        } else {
            if (ordinal == 4) {
                return new zzhbo((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhbp.class) {
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
