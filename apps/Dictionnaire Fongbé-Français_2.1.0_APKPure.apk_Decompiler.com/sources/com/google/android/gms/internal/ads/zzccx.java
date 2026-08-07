package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzccx implements Iterable {
    private final List zza = new ArrayList();

    public final Iterator iterator() {
        return this.zza.iterator();
    }

    /* access modifiers changed from: package-private */
    public final zzccw zza(zzcbs zzcbs) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccw zzccw = (zzccw) it.next();
            if (zzccw.zza == zzcbs) {
                return zzccw;
            }
        }
        return null;
    }

    public final void zzb(zzccw zzccw) {
        this.zza.add(zzccw);
    }

    public final void zzc(zzccw zzccw) {
        this.zza.remove(zzccw);
    }

    public final boolean zzd(zzcbs zzcbs) {
        ArrayList<zzccw> arrayList = new ArrayList<>();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccw zzccw = (zzccw) it.next();
            if (zzccw.zza == zzcbs) {
                arrayList.add(zzccw);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzccw zzccw2 : arrayList) {
            zzccw2.zzb.zzf();
        }
        return true;
    }
}
