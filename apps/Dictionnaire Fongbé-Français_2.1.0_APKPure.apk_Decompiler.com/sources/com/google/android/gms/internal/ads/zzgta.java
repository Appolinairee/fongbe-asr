package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgta extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgta zza;
    private static volatile zzgzk zzb;
    private String zzc = "";
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgta zzgta = new zzgta();
        zza = zzgta;
        zzgxr.zzbZ(zzgta.class, zzgta);
    }

    private zzgta() {
    }

    public static zzgsz zza() {
        return (zzgsz) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzgta zzgta, String str) {
        str.getClass();
        zzgta.zzc = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgta();
        } else {
            if (ordinal == 4) {
                return new zzgsz((zzgtb) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgta.class) {
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
