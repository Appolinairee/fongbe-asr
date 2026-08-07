package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbry implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrz zza;

    zzbry(zzbrz zzbrz) {
        this.zza = zzbrz;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("Operation denied by user.");
    }
}
