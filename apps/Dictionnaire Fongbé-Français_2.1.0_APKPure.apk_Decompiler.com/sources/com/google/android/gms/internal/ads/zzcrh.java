package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcrh implements zzegr {
    public final List zza;

    public zzcrh(zzcqz zzcqz) {
        this.zza = Collections.singletonList(zzgch.zzh(zzcqz));
    }

    public zzcrh(List list) {
        this.zza = list;
    }

    public final void zzr() {
        for (ListenableFuture zzr : this.zza) {
            zzgch.zzr(zzr, new zzcrg(this), zzgcz.zzc());
        }
    }
}
