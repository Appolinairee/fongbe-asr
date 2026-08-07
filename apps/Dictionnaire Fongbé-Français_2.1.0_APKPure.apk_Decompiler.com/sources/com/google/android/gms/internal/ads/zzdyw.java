package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdyw implements zzgbo {
    public final /* synthetic */ zzeuu zza;
    public final /* synthetic */ zzbvk zzb;

    public /* synthetic */ zzdyw(zzeuu zzeuu, zzbvk zzbvk) {
        this.zza = zzeuu;
        this.zzb = zzbvk;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzb().zza(zzbc.zzb().zzi((Bundle) obj), this.zzb.zzm, false);
    }
}
