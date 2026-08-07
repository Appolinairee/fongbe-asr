package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbdj extends CustomTabsCallback {
    final /* synthetic */ zzbdk zza;

    zzbdj(zzbdk zzbdk) {
        this.zza = zzbdk;
    }

    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.zze(i);
    }
}
