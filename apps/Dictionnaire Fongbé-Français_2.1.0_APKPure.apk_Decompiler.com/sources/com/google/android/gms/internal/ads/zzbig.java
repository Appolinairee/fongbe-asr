package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbig implements zzbjp {
    private final zzbih zza;

    public zzbig(zzbih zzbih) {
        this.zza = zzbih;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzo.zzj("App event with no name parameter.");
        } else {
            this.zza.zzb(str, (String) map.get("info"));
        }
    }
}
