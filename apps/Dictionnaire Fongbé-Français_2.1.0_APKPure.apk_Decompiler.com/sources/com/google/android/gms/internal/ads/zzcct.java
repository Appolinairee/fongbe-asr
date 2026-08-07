package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcct implements zzbjp {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcbs zzcbs = (zzcbs) obj;
        zzcfz zzq = zzcbs.zzq();
        if (zzq == null) {
            try {
                zzcfz zzcfz = new zzcfz(zzcbs, Float.parseFloat((String) map.get(TypedValues.TransitionType.S_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcbs.zzC(zzcfz);
                zzq = zzcfz;
            } catch (NullPointerException e) {
                e = e;
                zzo.zzh("Unable to parse videoMeta message.", e);
                zzv.zzp().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                zzo.zzh("Unable to parse videoMeta message.", e);
                zzv.zzp().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get(TypedValues.TransitionType.S_DURATION));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zze.zzm(3)) {
            zzo.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + parseInt + " , aspectRatio : " + str);
        }
        zzq.zzc(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
