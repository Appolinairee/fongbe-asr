package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzfyd {
    public static ArrayList zza(int i) {
        zzfwk.zza(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List zzb(List list, zzfuc zzfuc) {
        if (list instanceof RandomAccess) {
            return new zzfya(list, zzfuc);
        }
        return new zzfyc(list, zzfuc);
    }
}
