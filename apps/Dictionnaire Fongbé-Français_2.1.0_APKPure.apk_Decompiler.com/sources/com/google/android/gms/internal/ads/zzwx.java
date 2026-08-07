package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzwx implements Comparator {
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return zzfxc.zzj().zzc((zzxr) Collections.max(list, new zzxp()), (zzxr) Collections.max(list2, new zzxp()), new zzxp()).zzb(list.size(), list2.size()).zzc((zzxr) Collections.max(list, new zzxq()), (zzxr) Collections.max(list2, new zzxq()), new zzxq()).zza();
    }
}
