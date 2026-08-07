package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzebr implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzebv zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ zzm zzc;

    public /* synthetic */ zzebr(zzebv zzebv, Activity activity, zzm zzm) {
        this.zza = zzebv;
        this.zzb = activity;
        this.zzc = zzm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzn(this.zzb, this.zzc, dialogInterface, i);
    }
}
