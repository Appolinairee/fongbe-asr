package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgnt extends RuntimeException {
    public zzgnt(String str) {
        super(str);
    }

    public static Object zza(zzgns zzgns) {
        try {
            return zzgns.zza();
        } catch (Exception e) {
            throw new zzgnt((Throwable) e);
        }
    }

    public zzgnt(String str, Throwable th) {
        super(str, th);
    }

    public zzgnt(Throwable th) {
        super(th);
    }
}
