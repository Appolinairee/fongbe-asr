package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbip implements zzbjp {
    public final void zza(Object obj, Map map) {
        zzcgk zzcgk = (zzcgk) obj;
        zzbjp zzbjp = zzbjo.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzava zzI = zzcgk.zzI();
            if (zzI != null) {
                zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzo.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}
