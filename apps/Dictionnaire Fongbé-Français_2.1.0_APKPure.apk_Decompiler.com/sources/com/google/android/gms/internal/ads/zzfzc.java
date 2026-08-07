package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfzc extends zzfxs {
    private final transient zzfxq zza;
    private final transient zzfxn zzb;

    zzfzc(zzfxq zzfxq, zzfxn zzfxn) {
        this.zza = zzfxq;
        this.zzb = zzfxn;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    public final zzfxn zzd() {
        return this.zzb;
    }

    public final zzfzt zze() {
        return this.zzb.listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }
}
