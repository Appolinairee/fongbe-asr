package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbiu implements zzbjp {
    zzbiu() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcex zzcex = (zzcex) obj;
        zzbfk zzK = zzcex.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcex.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcex.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
