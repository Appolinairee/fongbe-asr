package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzebz implements Runnable {
    public final /* synthetic */ zzfkp zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzebz(zzfkp zzfkp, View view) {
        this.zza = zzfkp;
        this.zzb = view;
    }

    public final void run() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && zzfkn.zzb()) {
            this.zza.zzb(this.zzb, zzfkw.NOT_VISIBLE, "Ad overlay");
        }
    }
}
