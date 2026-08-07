package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzebp implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzebv zza;
    public final /* synthetic */ zzm zzb;

    public /* synthetic */ zzebp(zzebv zzebv, zzm zzm) {
        this.zza = zzebv;
        this.zzb = zzm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzl(this.zzb, dialogInterface, i);
    }
}
