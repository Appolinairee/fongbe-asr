package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbse implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsf zza;

    zzbse(zzbsf zzbsf) {
        this.zza = zzbsf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("User canceled the download.");
    }
}
