package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzbtx extends zzbts {
    final /* synthetic */ UpdateClickUrlCallback zza;

    zzbtx(zzbub zzbub, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
