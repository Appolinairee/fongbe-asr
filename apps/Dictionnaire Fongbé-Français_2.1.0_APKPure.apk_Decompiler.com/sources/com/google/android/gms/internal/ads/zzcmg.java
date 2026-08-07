package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcmg implements zzgbo {
    public final /* synthetic */ Uri.Builder zza;

    public /* synthetic */ zzcmg(Uri.Builder builder) {
        this.zza = builder;
    }

    public final ListenableFuture zza(Object obj) {
        zzbcc zzbcc = zzbcl.zzkc;
        Uri.Builder builder = this.zza;
        builder.appendQueryParameter((String) zzbe.zzc().zza(zzbcc), "12");
        return zzgch.zzh(builder.toString());
    }
}
