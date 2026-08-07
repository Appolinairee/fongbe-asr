package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgwb extends zzgwc {
    final /* synthetic */ zzgwj zza;
    private int zzb = 0;
    private final int zzc;

    zzgwb(zzgwj zzgwj) {
        this.zza = zzgwj;
        this.zzc = zzgwj.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
