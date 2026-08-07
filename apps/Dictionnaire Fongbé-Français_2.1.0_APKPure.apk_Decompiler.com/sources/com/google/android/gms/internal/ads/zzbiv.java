package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbiv implements zzbjp {
    zzbiv() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcex zzcex = (zzcex) obj;
        zzbfk zzK = zzcex.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzcex.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcex.zze("nativeClickMetaReady", zzb);
        }
    }
}
