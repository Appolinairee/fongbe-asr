package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdln implements Consumer {
    public final /* synthetic */ zzcab zza;

    public /* synthetic */ zzdln(zzcab zzcab) {
        this.zza = zzcab;
    }

    public final void accept(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putString("mediaUrl", (String) obj);
        this.zza.zzc(bundle);
    }
}
