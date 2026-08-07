package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzemv implements zzetq {
    private final String zza;
    private final boolean zzb;

    public zzemv(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        zzcuv zzcuv = (zzcuv) obj;
        if (str != null) {
            Bundle zza2 = zzfcx.zza(zzcuv.zza, "pii");
            zza2.putString("afai", str);
            zza2.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
