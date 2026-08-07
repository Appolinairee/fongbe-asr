package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdgx implements zzbjp {
    private final WeakReference zza;

    /* synthetic */ zzdgx(zzdhb zzdhb, zzdha zzdha) {
        this.zza = new WeakReference(zzdhb);
    }

    public final void zza(Object obj, Map map) {
        zzdhb zzdhb = (zzdhb) this.zza.get();
        if (zzdhb != null && "_ac".equals((String) map.get("eventName"))) {
            zzdhb.zzh.onAdClicked();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                zzdhb.zzi.zzdd();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzdhb.zzi.zzu();
                }
            }
        }
    }
}
