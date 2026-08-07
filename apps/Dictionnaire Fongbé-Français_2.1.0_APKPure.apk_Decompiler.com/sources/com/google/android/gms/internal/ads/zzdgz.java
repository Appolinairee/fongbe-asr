package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdgz implements zzbjp {
    private final WeakReference zza;
    private final WeakReference zzb;

    /* synthetic */ zzdgz(zzdhb zzdhb, View view, zzdha zzdha) {
        this.zza = new WeakReference(zzdhb);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmK)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference((Object) null);
        }
    }

    public final void zza(Object obj, Map map) {
        zzdhb zzdhb = (zzdhb) this.zza.get();
        if (zzdhb != null) {
            zzdhb.zzg.zza();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzmK)).booleanValue()) {
                zzdhb.zzD.zza((View) this.zzb.get(), zzdhb.zzj);
            }
        }
    }
}
