package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbjr implements zzbjp {
    private final zzbjs zza;

    public zzbjr(zzbjs zzbjs) {
        this.zza = zzbjs;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzo.zzh("Fail to parse float", e);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f);
        zzcex.zzay(equals);
    }
}
