package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdic {
    private zzbft zza;

    public zzdic(zzdhn zzdhn) {
        this.zza = zzdhn;
    }

    public final synchronized zzbft zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbft zzbft) {
        this.zza = zzbft;
    }
}
