package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcwc implements zzdbi {
    public final /* synthetic */ zzdgb zza;

    public /* synthetic */ zzcwc(zzdgb zzdgb) {
        this.zza = zzdgb;
    }

    public final void zza(Object obj) {
        zzcwj zzcwj = (zzcwj) obj;
        String message = this.zza.getMessage();
        if (message == null) {
            message = "Internal show error.";
        }
        zzcwj.zzq(zzfdk.zzd(12, message, (zze) null));
    }
}
