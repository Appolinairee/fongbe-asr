package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhes implements zzher, zzhel {
    private static final zzhes zza = new zzhes((Object) null);
    private final Object zzb;

    private zzhes(Object obj) {
        this.zzb = obj;
    }

    public static zzher zza(Object obj) {
        zzhez.zza(obj, "instance cannot be null");
        return new zzhes(obj);
    }

    public static zzher zzc(Object obj) {
        return obj == null ? zza : new zzhes(obj);
    }

    public final Object zzb() {
        return this.zzb;
    }
}
