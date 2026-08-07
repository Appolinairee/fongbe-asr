package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfsh implements Consumer {
    public final /* synthetic */ Bundle zza;

    public /* synthetic */ zzfsh(Bundle bundle) {
        this.zza = bundle;
    }

    public final void accept(Object obj) {
        int i = zzfsw.zzb;
        this.zza.putString("sessionToken", (String) obj);
    }
}
