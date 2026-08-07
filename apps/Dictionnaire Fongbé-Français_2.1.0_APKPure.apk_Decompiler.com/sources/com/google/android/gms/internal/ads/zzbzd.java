package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbzd {
    public final ListenableFuture zza(Context context, int i) {
        zzcab zzcab = new zzcab();
        zzbc.zzb();
        if (zzf.zzt(context)) {
            zzbzw.zza.execute(new zzbzc(this, context, zzcab));
        }
        return zzcab;
    }
}
