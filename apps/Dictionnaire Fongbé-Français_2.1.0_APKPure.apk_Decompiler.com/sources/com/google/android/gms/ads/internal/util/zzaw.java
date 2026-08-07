package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaw implements DialogInterface.OnClickListener {
    final /* synthetic */ Context zza;

    zzaw(zzax zzax, Context context) {
        this.zza = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzv.zzq();
        zzs.zzU(this.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
