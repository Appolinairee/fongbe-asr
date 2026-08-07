package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzhem {
    final LinkedHashMap zza;

    zzhem(int i) {
        this.zza = zzheo.zzb(i);
    }

    /* access modifiers changed from: package-private */
    public final zzhem zza(Object obj, zzhfa zzhfa) {
        zzhez.zza(obj, "key");
        zzhez.zza(zzhfa, "provider");
        zzhfa zzhfa2 = zzhfa;
        this.zza.put(obj, zzhfa);
        return this;
    }
}
