package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdvp extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdvs zzb;

    zzdvp(zzdvs zzdvs, String str) {
        this.zza = str;
        this.zzb = zzdvs;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzm(zzdvs.zzl(loadAdError), this.zza);
    }
}
