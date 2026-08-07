package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfus extends zzful {
    private final Object zza;

    zzfus(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfus) {
            return this.zza.equals(((zzfus) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "Optional.of(" + obj + ")";
    }

    public final zzful zza(zzfuc zzfuc) {
        Object apply = zzfuc.apply(this.zza);
        zzfun.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfus(apply);
    }

    public final Object zzb(Object obj) {
        return this.zza;
    }
}
