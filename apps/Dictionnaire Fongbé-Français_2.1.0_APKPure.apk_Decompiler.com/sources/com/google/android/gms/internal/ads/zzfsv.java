package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfsv extends zzfro {
    final /* synthetic */ zzfsw zza;
    private final zzftb zzb;

    zzfsv(zzfsw zzfsw, zzftb zzftb) {
        this.zza = zzfsw;
        this.zzb = zzftb;
    }

    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfsz zzc = zzfta.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zza();
        }
    }
}
