package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcky {
    private final Map zza;
    private final Map zzb;

    zzcky(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfca zzfca) throws Exception {
        for (zzfby zzfby : zzfca.zzb.zzc) {
            if (this.zza.containsKey(zzfby.zza) && zzfby.zzb != null) {
                ((zzclb) this.zza.get(zzfby.zza)).zza(zzfby.zzb);
            } else if (this.zzb.containsKey(zzfby.zza) && zzfby.zzb != null) {
                zzcla zzcla = (zzcla) this.zzb.get(zzfby.zza);
                JSONObject jSONObject = zzfby.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcla.zza(hashMap);
            }
        }
    }
}
