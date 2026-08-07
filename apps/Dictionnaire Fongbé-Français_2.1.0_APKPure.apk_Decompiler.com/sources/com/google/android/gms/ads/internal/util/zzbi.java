package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbi implements zzapq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbk zzb;

    zzbi(zzbo zzbo, String str, zzbk zzbk) {
        this.zza = str;
        this.zzb = zzbk;
    }

    public final void zza(zzapv zzapv) {
        String zzapv2 = zzapv.toString();
        zzo.zzj("Failed to load URL: " + this.zza + "\n" + zzapv2);
        this.zzb.zza((Object) null);
    }
}
