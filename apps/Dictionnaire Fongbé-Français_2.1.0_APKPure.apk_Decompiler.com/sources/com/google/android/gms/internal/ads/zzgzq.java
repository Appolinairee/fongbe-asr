package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgzq extends zzgwc {
    final zzgzs zza;
    zzgwe zzb = zzb();
    final /* synthetic */ zzgzu zzc;

    zzgzq(zzgzu zzgzu) {
        this.zzc = zzgzu;
        this.zza = new zzgzs(zzgzu, (zzgzt) null);
    }

    private final zzgwe zzb() {
        zzgzs zzgzs = this.zza;
        if (zzgzs.hasNext()) {
            return zzgzs.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final byte zza() {
        zzgwe zzgwe = this.zzb;
        if (zzgwe != null) {
            byte zza2 = zzgwe.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza2;
        }
        throw new NoSuchElementException();
    }
}
