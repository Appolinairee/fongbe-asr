package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfcp {
    public static zzs zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbp zzfbp = (zzfbp) it.next();
            if (zzfbp.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfbp.zza, zzfbp.zzb));
            }
        }
        return new zzs(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfbp zzb(zzs zzs) {
        return zzs.zzi ? new zzfbp(-3, 0, true) : new zzfbp(zzs.zze, zzs.zzb, false);
    }
}
