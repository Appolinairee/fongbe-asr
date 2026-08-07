package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdt extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzdw zza;

    public zzdt(zzdw zzdw) {
        this.zza = zzdw;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int m = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        boolean z = m == 3 || m == 4 || m == 5;
        zzdw zzdw = this.zza;
        if (true == z) {
            i = 10;
        }
        zzdw.zzc(zzdw, i);
    }
}
