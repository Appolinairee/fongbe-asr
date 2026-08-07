package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzatn extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzatn zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgyd zzd = zzbK();
    private zzgwj zze = zzgwj.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzatn zzatn = new zzatn();
        zza = zzatn;
        zzgxr.zzbZ(zzatn.class, zzatn);
    }

    private zzatn() {
    }

    public static zzatm zza() {
        return (zzatm) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzatn zzatn, zzgwj zzgwj) {
        zzgyd zzgyd = zzatn.zzd;
        if (!zzgyd.zzc()) {
            zzatn.zzd = zzgxr.zzbL(zzgyd);
        }
        zzatn.zzd.add(zzgwj);
    }

    static /* synthetic */ void zzd(zzatn zzatn, zzgwj zzgwj) {
        zzatn.zzc |= 1;
        zzatn.zze = zzgwj;
    }

    static /* synthetic */ void zzf(zzatn zzatn, int i) {
        zzatn.zzg = i - 1;
        zzatn.zzc |= 4;
    }

    static /* synthetic */ void zzg(zzatn zzatn, int i) {
        zzatn.zzf = 4;
        zzatn.zzc |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzath.zza, "zzg", zzatd.zza});
        } else if (ordinal == 3) {
            return new zzatn();
        } else {
            if (ordinal == 4) {
                return new zzatm((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzatn.class) {
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
