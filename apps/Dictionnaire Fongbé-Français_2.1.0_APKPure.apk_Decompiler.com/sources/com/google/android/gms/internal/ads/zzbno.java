package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbno implements zzcad {
    final /* synthetic */ zzbnm zza;

    zzbno(zzbnr zzbnr, zzbnm zzbnm) {
        this.zza = zzbnm;
    }

    public final void zza() {
        zze.zza("Rejecting reference for JS Engine.");
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
