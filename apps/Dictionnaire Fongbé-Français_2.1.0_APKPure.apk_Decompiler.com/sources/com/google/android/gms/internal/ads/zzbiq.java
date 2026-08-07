package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbiq implements zzgbo {
    public final /* synthetic */ zzcmk zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbiq(zzcmk zzcmk, String str) {
        this.zza = zzcmk;
        this.zzb = str;
    }

    public final ListenableFuture zza(Object obj) {
        zzcmk zzcmk;
        String str = (String) obj;
        zzbjp zzbjp = zzbjo.zza;
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() || (zzcmk = this.zza) == null || !zzcmk.zzj(this.zzb)) {
            return zzgch.zzh(str);
        }
        return zzcmk.zzb(str, zzbc.zze());
    }
}
