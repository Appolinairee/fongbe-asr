package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfrw extends zzfsz {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfrw() {
    }

    public final zzfsz zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfsz zzb(int i) {
        this.zza = i;
        this.zzc = 1;
        return this;
    }

    public final zzfta zzc() {
        if (this.zzc == 1) {
            return new zzfry(this.zza, this.zzb, (zzfrx) null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
