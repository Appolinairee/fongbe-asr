package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzccq implements zzbjp {
    private final Consumer zza;

    public zzccq(Consumer consumer) {
        this.zza = consumer;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcbs zzcbs = (zzcbs) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zzo.zzj("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                zzo.zzj("src missing from video GMSG.");
            } else {
                this.zza.accept(str2);
            }
        }
    }
}
