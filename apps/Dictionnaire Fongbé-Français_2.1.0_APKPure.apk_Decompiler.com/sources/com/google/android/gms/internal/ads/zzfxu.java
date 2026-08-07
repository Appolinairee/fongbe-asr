package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfxu extends zzfvo {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfuo zzb;

    zzfxu(Iterator it, zzfuo zzfuo) {
        this.zza = it;
        this.zzb = zzfuo;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfuo zzfuo = this.zzb;
            Object next = it.next();
            if (zzfuo.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
