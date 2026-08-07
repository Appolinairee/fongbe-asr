package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzevn implements zzetr {
    public zzevn(zzbza zzbza, zzgcs zzgcs, String str) {
    }

    public final int zza() {
        return 47;
    }

    public final ListenableFuture zzb() {
        ListenableFuture zzh = zzgch.zzh((Object) null);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfJ)).booleanValue()) {
            zzh = zzgch.zzh((Object) null);
        }
        ListenableFuture zzh2 = zzgch.zzh((Object) null);
        return zzgch.zzc(zzh, zzh2).zza(new zzevm(zzh, zzh2), zzbzw.zza);
    }
}
