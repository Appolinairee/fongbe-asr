package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
abstract class zzgbr extends zzgbh {
    @CheckForNull
    private List zza;

    zzgbr(zzfxi zzfxi, boolean z) {
        super(zzfxi, z, true);
        List list;
        if (zzfxi.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzfyd.zza(zzfxi.size());
        }
        for (int i = 0; i < zzfxi.size(); i++) {
            list.add((Object) null);
        }
        this.zza = list;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzG(List list);

    /* access modifiers changed from: package-private */
    public final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgbq(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
