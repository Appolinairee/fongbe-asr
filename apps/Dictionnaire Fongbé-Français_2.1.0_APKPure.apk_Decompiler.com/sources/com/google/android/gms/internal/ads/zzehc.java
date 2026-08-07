package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzehc implements zzdgc {
    public final /* synthetic */ zzecz zza;

    public /* synthetic */ zzehc(zzecz zzecz) {
        this.zza = zzecz;
    }

    public final void zza(boolean z, Context context, zzcwg zzcwg) {
        zzecz zzecz = this.zza;
        try {
            ((zzfdh) zzecz.zzb).zzv(z);
            ((zzfdh) zzecz.zzb).zzz(context);
        } catch (zzfcq e) {
            throw new zzdgb(e.getCause());
        }
    }
}
