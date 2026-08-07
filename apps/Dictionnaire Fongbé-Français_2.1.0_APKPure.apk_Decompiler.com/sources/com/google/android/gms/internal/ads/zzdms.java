package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdms implements zzbfk {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdmt zzb;

    zzdms(zzdmt zzdmt, String str) {
        this.zzb = zzdmt;
    }

    public final JSONObject zza() {
        return null;
    }

    public final JSONObject zzb() {
        return null;
    }

    public final void zzc() {
        zzdmt zzdmt = this.zzb;
        if (zzdmt.zzd != null) {
            zzdmt.zzd.zzF(this.zza);
        }
    }

    public final void zzd(MotionEvent motionEvent) {
    }
}
