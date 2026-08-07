package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfht extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzfht zza;
    private static volatile zzgzk zzb;
    /* access modifiers changed from: private */
    public zzgyd zzc = zzbK();

    static {
        zzfht zzfht = new zzfht();
        zza = zzfht;
        zzgxr.zzbZ(zzfht.class, zzfht);
    }

    private zzfht() {
    }

    public static zzfhp zzb() {
        return (zzfhp) zza.zzaZ();
    }

    static /* synthetic */ void zzd(zzfht zzfht, zzfhr zzfhr) {
        zzfhr.getClass();
        zzgyd zzgyd = zzfht.zzc;
        if (!zzgyd.zzc()) {
            zzfht.zzc = zzgxr.zzbL(zzgyd);
        }
        zzfht.zzc.add(zzfhr);
    }

    public final int zza() {
        return this.zzc.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfhr.class});
        } else if (ordinal == 3) {
            return new zzfht();
        } else {
            if (ordinal == 4) {
                return new zzfhp((zzfhs) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzfht.class) {
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
