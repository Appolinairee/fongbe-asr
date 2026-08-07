package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzepa implements zzher {
    public static zzepa zza() {
        return zzeoz.zza;
    }

    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        if (!((String) zzbe.zzc().zza(zzbcl.zzlD)).isEmpty()) {
            arrayList = Arrays.asList(((String) zzbe.zzc().zza(zzbcl.zzlD)).split(","));
        }
        zzhez.zzb(arrayList);
        List list = arrayList;
        return arrayList;
    }
}
