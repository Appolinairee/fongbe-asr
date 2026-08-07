package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfvr extends zzfyg {
    final /* synthetic */ zzfvt zza;

    zzfvr(zzfvt zzfvt) {
        this.zza = zzfvt;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return zzfwm.zza(this.zza.zza.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzfvs(this.zza);
    }

    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        zzfvt zzfvt = this.zza;
        zzfwg.zzo(zzfvt.zzb, ((Map.Entry) Objects.requireNonNull((Map.Entry) obj)).getKey());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
