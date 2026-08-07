package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeyx implements zzfuc {
    final /* synthetic */ zzezb zza;

    zzeyx(zzezb zzezb) {
        this.zza = zzezb;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzo.zzh("", (zzdyh) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzezb zzezb = this.zza;
        zzezb.zzd = new zzeyz((zzbvk) null, zzezb.zze(), (zzeza) null);
        return this.zza.zzd;
    }
}
