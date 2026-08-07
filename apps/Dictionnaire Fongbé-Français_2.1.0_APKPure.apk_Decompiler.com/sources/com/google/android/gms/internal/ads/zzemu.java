package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzemu implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    zzemu(zzgcs zzgcs, Context context) {
        this.zzb = zzgcs;
        this.zza = context;
    }

    public final int zza() {
        return 61;
    }

    public final ListenableFuture zzb() {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzmJ)).booleanValue()) {
            return zzgch.zzh(new zzemv((String) null, false));
        }
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            return zzgch.zzh(new zzemv((String) null, false));
        }
        return this.zzb.zzb(new zzemt(contentResolver));
    }
}
