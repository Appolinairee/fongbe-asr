package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfzj extends zzfzn {
    final /* synthetic */ Set zza;
    final /* synthetic */ Set zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzj(Set set, Set set2) {
        super((zzfzo) null);
        this.zza = set;
        this.zzb = set2;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.contains(obj) && this.zzb.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.zza.containsAll(collection) && this.zzb.containsAll(collection);
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.zzb, this.zza);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.zza) {
            if (this.zzb.contains(contains)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: zza */
    public final zzfzt iterator() {
        return new zzfzi(this, this.zza, this.zzb);
    }
}
