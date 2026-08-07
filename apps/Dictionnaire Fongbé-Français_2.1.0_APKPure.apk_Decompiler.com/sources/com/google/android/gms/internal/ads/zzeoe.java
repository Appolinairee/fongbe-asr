package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeoe implements zzetr {
    private final zzeym zza;

    zzeoe(zzeym zzeym) {
        this.zza = zzeym;
    }

    public final int zza() {
        return 15;
    }

    public final ListenableFuture zzb() {
        zzeym zzeym = this.zza;
        if (zzeym == null) {
            return zzgch.zzh(new zzeod((String) null));
        }
        String zza2 = zzeym.zza();
        if (Strings.isEmptyOrWhitespace(zza2)) {
            return zzgch.zzh(new zzeod((String) null));
        }
        return zzgch.zzh(new zzeod(zza2));
    }
}
