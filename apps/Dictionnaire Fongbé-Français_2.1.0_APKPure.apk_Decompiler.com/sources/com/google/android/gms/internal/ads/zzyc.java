package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzyc {
    public final int zza;
    public final zzln[] zzb;
    public final zzxv[] zzc;
    public final zzby zzd;
    public final Object zze;

    public zzyc(zzln[] zzlnArr, zzxv[] zzxvArr, zzby zzby, Object obj) {
        int length = zzlnArr.length;
        zzcw.zzd(length == zzxvArr.length);
        this.zzb = zzlnArr;
        this.zzc = (zzxv[]) zzxvArr.clone();
        this.zzd = zzby;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(zzyc zzyc, int i) {
        if (zzyc != null && Objects.equals(this.zzb[i], zzyc.zzb[i]) && Objects.equals(this.zzc[i], zzyc.zzc[i])) {
            return true;
        }
        return false;
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
