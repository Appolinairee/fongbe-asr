package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeun implements zzetq {
    final String zza;
    final int zzb;

    /* synthetic */ zzeun(String str, int i, zzeum zzeum) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuv = (zzcuv) obj;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                zzcuv.zza.putString("topics", this.zza);
            }
            int i = this.zzb;
            if (i != -1) {
                zzcuv.zza.putInt("atps", i);
            }
        }
    }
}
