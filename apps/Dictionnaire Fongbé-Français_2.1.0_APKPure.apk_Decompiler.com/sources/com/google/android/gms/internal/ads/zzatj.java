package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzatj extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzatj zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzgwj zzf = zzgwj.zzb;

    static {
        zzatj zzatj = new zzatj();
        zza = zzatj;
        zzgxr.zzbZ(zzatj.class, zzatj);
    }

    private zzatj() {
    }

    public static zzatj zzc() {
        return zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzgwj zzd() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzatj();
        } else {
            if (ordinal == 4) {
                return new zzati((zzato) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzatj.class) {
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

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return (this.zzc & 1) != 0;
    }
}
