package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzerv implements zzetr {
    private final zzgcs zza;
    private final zzfcj zzb;
    private final PackageInfo zzc;
    private final zzg zzd;

    public zzerv(zzgcs zzgcs, zzfcj zzfcj, PackageInfo packageInfo, zzg zzg) {
        this.zza = zzgcs;
        this.zzb = zzfcj;
        this.zzc = packageInfo;
        this.zzd = zzg;
    }

    public static /* synthetic */ zzerw zzc(zzerv zzerv) {
        return new zzerw(zzerv.zzb, zzerv.zzc, zzerv.zzd);
    }

    public final int zza() {
        return 26;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeru(this));
    }
}
