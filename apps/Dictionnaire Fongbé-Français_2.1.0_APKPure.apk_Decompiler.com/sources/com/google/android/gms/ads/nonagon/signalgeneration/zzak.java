package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbyy;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzak implements Callable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzbyy zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzak(zzau zzau, zzbyy zzbyy, int i, Bundle bundle) {
        this.zza = zzau;
        this.zzb = zzbyy;
        this.zzc = i;
        this.zzd = bundle;
    }

    public final Object call() {
        return this.zza.zzq(this.zzb, this.zzc, this.zzd);
    }
}
