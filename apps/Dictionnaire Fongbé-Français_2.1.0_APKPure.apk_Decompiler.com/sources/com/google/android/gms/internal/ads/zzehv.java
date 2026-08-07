package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzehv implements zzdgc {
    public final /* synthetic */ zzecz zza;

    public /* synthetic */ zzehv(zzecz zzecz) {
        this.zza = zzecz;
    }

    public final void zza(boolean z, Context context, zzcwg zzcwg) {
        zzecz zzecz = this.zza;
        try {
            ((zzfdh) zzecz.zzb).zzv(z);
            ((zzfdh) zzecz.zzb).zzA();
        } catch (zzfcq e) {
            zzo.zzk("Cannot show rewarded video.", e);
            throw new zzdgb(e.getCause());
        }
    }
}
