package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbrx implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrz zza;

    zzbrx(zzbrz zzbrz) {
        this.zza = zzbrz;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbrz zzbrz = this.zza;
        Intent zzb = zzbrz.zzb();
        zzv.zzq();
        zzs.zzT(zzbrz.zzb, zzb);
    }
}
