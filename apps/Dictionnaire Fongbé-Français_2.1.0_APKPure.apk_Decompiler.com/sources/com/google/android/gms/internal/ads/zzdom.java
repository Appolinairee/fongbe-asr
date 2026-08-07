package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdom implements zzcgn {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzcab zzb;

    public /* synthetic */ zzdom(Bundle bundle, zzcab zzcab) {
        this.zza = bundle;
        this.zzb = zzcab;
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzcab zzcab = this.zzb;
        if (z) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
                this.zza.putLong(zzdre.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), zzv.zzC().currentTimeMillis());
            }
            zzcab.zzc((Object) null);
            return;
        }
        zzcab.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
