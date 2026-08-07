package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzaq implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzau zza;

    public /* synthetic */ zzaq(zzau zzau) {
        this.zza = zzau;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.zzr();
    }
}
