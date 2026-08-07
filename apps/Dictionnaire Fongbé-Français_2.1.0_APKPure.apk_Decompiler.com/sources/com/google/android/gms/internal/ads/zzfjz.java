package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdy;
import java.util.function.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfjz implements Predicate {
    public final /* synthetic */ Class zza;

    public /* synthetic */ zzfjz(Class cls) {
        this.zza = cls;
    }

    public final boolean test(Object obj) {
        return this.zza.isInstance((zzdy) obj);
    }
}
