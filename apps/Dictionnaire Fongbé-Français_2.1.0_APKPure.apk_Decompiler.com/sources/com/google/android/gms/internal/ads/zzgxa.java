package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgxa {
    private final Object zza;
    private final int zzb;

    zzgxa(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgxa)) {
            return false;
        }
        zzgxa zzgxa = (zzgxa) obj;
        if (this.zza == zzgxa.zza && this.zzb == zzgxa.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
