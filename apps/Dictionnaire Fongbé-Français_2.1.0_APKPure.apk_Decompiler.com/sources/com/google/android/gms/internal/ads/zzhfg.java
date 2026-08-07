package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhfg implements zzhfa {
    private static final Object zza = new Object();
    private volatile zzhfa zzb;
    private volatile Object zzc = zza;

    private zzhfg(zzhfa zzhfa) {
        this.zzb = zzhfa;
    }

    public static zzhfa zza(zzhfa zzhfa) {
        if ((zzhfa instanceof zzhfg) || (zzhfa instanceof zzheq)) {
            return zzhfa;
        }
        zzhfa zzhfa2 = zzhfa;
        return new zzhfg(zzhfa);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhfa zzhfa = this.zzb;
        if (zzhfa == null) {
            return this.zzc;
        }
        Object zzb2 = zzhfa.zzb();
        this.zzc = zzb2;
        this.zzb = null;
        return zzb2;
    }
}
