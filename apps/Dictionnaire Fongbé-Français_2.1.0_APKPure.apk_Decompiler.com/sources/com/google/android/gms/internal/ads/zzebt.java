package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzebt implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzebv zza;
    public final /* synthetic */ zzm zzb;

    public /* synthetic */ zzebt(zzebv zzebv, zzm zzm) {
        this.zza = zzebv;
        this.zzb = zzm;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.zzp(this.zzb, dialogInterface);
    }
}
