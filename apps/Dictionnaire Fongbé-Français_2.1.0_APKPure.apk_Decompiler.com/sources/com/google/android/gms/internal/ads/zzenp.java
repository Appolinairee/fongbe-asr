package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzenp implements zzetr {
    private final zzgcs zza;
    private final VersionInfoParcel zzb;

    zzenp(VersionInfoParcel versionInfoParcel, zzgcs zzgcs) {
        this.zzb = versionInfoParcel;
        this.zza = zzgcs;
    }

    public final int zza() {
        return 54;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeno(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzenq zzc() throws Exception {
        return zzenq.zzc(this.zzb);
    }
}
