package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbkh implements zzbjp {
    private final zzbkg zza;

    public zzbkh(zzbkg zzbkg) {
        this.zza = zzbkg;
    }

    public static void zzb(zzcex zzcex, zzbkg zzbkg) {
        zzcex.zzag("/reward", new zzbkh(zzbkg));
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbwi zzbwi = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbwi = new zzbwi(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                zzo.zzk("Unable to parse reward amount.", e);
            }
            this.zza.zza(zzbwi);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
