package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdhz implements zzgcd {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdia zzb;

    zzdhz(zzdia zzdia, View view) {
        this.zza = view;
        this.zzb = zzdia;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
            zzv.zzp().zzv(th, "omid native display exp");
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzad(this.zza, (zzecr) obj);
    }
}
