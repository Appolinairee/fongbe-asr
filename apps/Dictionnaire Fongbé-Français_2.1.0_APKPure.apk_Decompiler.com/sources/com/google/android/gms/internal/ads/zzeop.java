package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeop implements zzetr {
    private final zzgcs zza;
    private final zzdpr zzb;
    private final String zzc;
    private final zzfcj zzd;

    public zzeop(zzgcs zzgcs, zzdpr zzdpr, zzfcj zzfcj, String str) {
        this.zza = zzgcs;
        this.zzb = zzdpr;
        this.zzd = zzfcj;
        this.zzc = str;
    }

    public final int zza() {
        return 17;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeoo(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeoq zzc() throws Exception {
        zzdpr zzdpr = this.zzb;
        return new zzeoq(zzdpr.zzb(this.zzd.zzf, this.zzc), zzdpr.zza());
    }
}
