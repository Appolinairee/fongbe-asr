package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgbk extends zzgbi {
    private zzgbk() {
        throw null;
    }

    /* synthetic */ zzgbk(zzgbl zzgbl) {
        super((zzgbl) null);
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzgbm zzgbm) {
        int zzz;
        synchronized (zzgbm) {
            zzz = zzgbm.remaining - 1;
            zzgbm.remaining = zzz;
        }
        return zzz;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzgbm zzgbm, @CheckForNull Set set, Set set2) {
        synchronized (zzgbm) {
            if (zzgbm.seenExceptions == null) {
                zzgbm.seenExceptions = set2;
            }
        }
    }
}
