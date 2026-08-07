package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbjc implements zzbjp {
    zzbjc() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzftt.zzc("true", str)) {
                if (!zzftt.zzc("false", str)) {
                    return;
                }
            }
            zzfrb.zza(zzcex.getContext()).zzb(Boolean.parseBoolean(str));
        } catch (IOException e) {
            zzv.zzp().zzw(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
