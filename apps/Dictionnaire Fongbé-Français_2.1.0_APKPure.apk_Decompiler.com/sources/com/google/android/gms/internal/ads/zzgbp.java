package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgbp extends zzgbr {
    zzgbp(zzfxi zzfxi, boolean z) {
        super(zzfxi, z);
        zzv();
    }

    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfyd.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgbq zzgbq = (zzgbq) it.next();
            zza.add(zzgbq != null ? zzgbq.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
