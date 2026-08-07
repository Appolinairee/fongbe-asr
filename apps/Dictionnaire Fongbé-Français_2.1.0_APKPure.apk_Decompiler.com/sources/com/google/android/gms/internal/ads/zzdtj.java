package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdtj implements zzdsx {
    /* access modifiers changed from: private */
    public final long zza;
    private final zzekv zzb;

    zzdtj(long j, Context context, zzdtc zzdtc, zzcgx zzcgx, String str) {
        this.zza = j;
        zzezt zzv = zzcgx.zzv();
        zzv.zzc(context);
        zzv.zza(new zzs());
        zzv.zzb(str);
        zzekv zza2 = zzv.zzd().zza();
        this.zzb = zza2;
        zza2.zzD(new zzdti(this, zzdtc));
    }

    public final void zza() {
        this.zzb.zzx();
    }

    public final void zzb(zzm zzm) {
        this.zzb.zzab(zzm);
    }

    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
