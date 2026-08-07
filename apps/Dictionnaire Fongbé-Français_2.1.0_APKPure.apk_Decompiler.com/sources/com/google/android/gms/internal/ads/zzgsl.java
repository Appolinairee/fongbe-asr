package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgsl extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgsl zza;
    private static volatile zzgzk zzb;
    private String zzc = "";
    private zzgwj zzd = zzgwj.zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgsl zzgsl = new zzgsl();
        zza = zzgsl;
        zzgxr.zzbZ(zzgsl.class, zzgsl);
    }

    private zzgsl() {
    }

    public static zzgsi zza() {
        return (zzgsi) zza.zzaZ();
    }

    public static zzgsl zzd() {
        return zza;
    }

    static /* synthetic */ void zzi(zzgsl zzgsl, String str) {
        str.getClass();
        zzgsl.zzc = str;
    }

    static /* synthetic */ void zzj(zzgsl zzgsl, zzgwj zzgwj) {
        zzgwj.getClass();
        zzgsl.zzd = zzgwj;
    }

    public final zzgsj zzb() {
        int i = this.zze;
        zzgsj zzgsj = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzgsj.REMOTE : zzgsj.ASYMMETRIC_PUBLIC : zzgsj.ASYMMETRIC_PRIVATE : zzgsj.SYMMETRIC : zzgsj.UNKNOWN_KEYMATERIAL;
        return zzgsj == null ? zzgsj.UNRECOGNIZED : zzgsj;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgsl();
        } else {
            if (ordinal == 4) {
                return new zzgsi((zzgsk) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgsl.class) {
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

    public final zzgwj zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
