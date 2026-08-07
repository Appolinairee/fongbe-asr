package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzazm implements Comparator {
    zzazm(zzazo zzazo) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazs zzazs = (zzazs) obj;
        zzazs zzazs2 = (zzazs) obj2;
        int i = zzazs.zzc - zzazs2.zzc;
        if (i != 0) {
            return i;
        }
        return Long.compare(zzazs.zza, zzazs2.zza);
    }
}
