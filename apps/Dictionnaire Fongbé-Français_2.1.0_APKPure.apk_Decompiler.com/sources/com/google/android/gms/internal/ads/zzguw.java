package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzguw {
    public static final zzguw zza = new zzguw(new zzgux());
    public static final zzguw zzb = new zzguw(new zzgvb());
    private final zzguu zzc;

    static {
        new zzguw(new zzgvd());
        new zzguw(new zzgvc());
        new zzguw(new zzguy());
        new zzguw(new zzgva());
        new zzguw(new zzguz());
    }

    public zzguw(zzgve zzgve) {
        this.zzc = !zzgkt.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgur(zzgve, (zzguv) null) : new zzgus(zzgve, (zzguv) null) : new zzgut(zzgve, (zzguv) null);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String provider : strArr) {
            Provider provider2 = Security.getProvider(provider);
            if (provider2 != null) {
                arrayList.add(provider2);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzc.zza(str);
    }
}
