package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdje implements zzbfk {
    final /* synthetic */ zzdkd zza;
    final /* synthetic */ ViewGroup zzb;

    zzdje(zzdkd zzdkd, ViewGroup viewGroup) {
        this.zza = zzdkd;
        this.zzb = viewGroup;
    }

    public final JSONObject zza() {
        return this.zza.zzo();
    }

    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    public final void zzc() {
        zzfxn zzfxn = zzdjb.zza;
        Map zzm = this.zza.zzm();
        if (zzm != null) {
            int size = zzfxn.size();
            int i = 0;
            while (i < size) {
                Object obj = zzm.get((String) zzfxn.get(i));
                i++;
                if (obj != null) {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch((View) null, motionEvent);
    }
}
