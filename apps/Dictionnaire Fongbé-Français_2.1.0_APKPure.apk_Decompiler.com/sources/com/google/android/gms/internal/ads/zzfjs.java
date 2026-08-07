package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Optional;
import java.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfjs implements Consumer {
    public final /* synthetic */ zzfjv zza;
    public final /* synthetic */ AdFormat zzb;
    public final /* synthetic */ Optional zzc;

    public /* synthetic */ zzfjs(zzfjv zzfjv, AdFormat adFormat, Optional optional) {
        this.zza = zzfjv;
        this.zzb = adFormat;
        this.zzc = optional;
    }

    public final void accept(Object obj) {
        this.zza.zzg(this.zzb, this.zzc, obj);
    }
}
