package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhep implements zzher {
    private zzhfa zza;

    public static void zza(zzhfa zzhfa, zzhfa zzhfa2) {
        zzhep zzhep = (zzhep) zzhfa;
        if (zzhep.zza == null) {
            zzhep.zza = zzhfa2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zzb() {
        zzhfa zzhfa = this.zza;
        if (zzhfa != null) {
            return zzhfa.zzb();
        }
        throw new IllegalStateException();
    }
}
