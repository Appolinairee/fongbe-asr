package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbru implements zzr {
    final /* synthetic */ zzbrw zza;

    zzbru(zzbrw zzbrw) {
        this.zza = zzbrw;
    }

    public final void zzdE() {
        zzo.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzdi() {
        zzo.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zzdo() {
        zzo.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzdp() {
        zzo.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbrw zzbrw = this.zza;
        zzbrw.zzb.onAdOpened(zzbrw);
    }

    public final void zzdr() {
    }

    public final void zzds(int i) {
        zzo.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbrw zzbrw = this.zza;
        zzbrw.zzb.onAdClosed(zzbrw);
    }
}
