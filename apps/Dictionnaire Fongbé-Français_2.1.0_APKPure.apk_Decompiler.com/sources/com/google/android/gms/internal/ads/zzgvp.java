package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgvp {
    private final zzgvo zza;

    private zzgvp(zzgvo zzgvo) {
        this.zza = zzgvo;
    }

    public static zzgvp zzb(byte[] bArr, zzgeo zzgeo) {
        return new zzgvp(zzgvo.zzb(bArr));
    }

    public static zzgvp zzc(int i) {
        return new zzgvp(zzgvo.zzb(zzgnk.zzb(i)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzgeo zzgeo) {
        return this.zza.zzc();
    }
}
