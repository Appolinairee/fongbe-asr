package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfvi implements zzfvf {
    private static final zzfvf zza = new zzfvh();
    private final zzfvm zzb = new zzfvm();
    private volatile zzfvf zzc;
    @CheckForNull
    private Object zzd;

    zzfvi(zzfvf zzfvf) {
        zzfvf zzfvf2 = zzfvf;
        this.zzc = zzfvf;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzd) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    public final Object zza() {
        zzfvf zzfvf = this.zzc;
        zzfvf zzfvf2 = zza;
        if (zzfvf != zzfvf2) {
            synchronized (this.zzb) {
                if (this.zzc != zzfvf2) {
                    Object zza2 = this.zzc.zza();
                    this.zzd = zza2;
                    this.zzc = zzfvf2;
                    return zza2;
                }
            }
        }
        return this.zzd;
    }
}
