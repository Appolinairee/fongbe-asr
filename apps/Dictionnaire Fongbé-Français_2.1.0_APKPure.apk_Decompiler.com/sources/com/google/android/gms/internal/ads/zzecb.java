package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzecb implements Runnable {
    public final /* synthetic */ zzfkp zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzecb(zzfkp zzfkp, View view) {
        this.zza = zzfkp;
        this.zzb = view;
    }

    public final void run() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && zzfkn.zzb()) {
            this.zza.zzd(this.zzb);
        }
    }
}
