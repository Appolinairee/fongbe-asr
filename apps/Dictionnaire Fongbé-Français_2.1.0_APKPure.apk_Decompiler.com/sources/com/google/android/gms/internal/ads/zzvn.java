package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzvn implements zzuf {
    private final zzfx zza;
    private int zzb = 1048576;
    private final zzvm zzc;
    private final zzyo zzd;

    public zzvn(zzfx zzfx, zzvm zzvm) {
        zzyo zzyo = new zzyo(-1);
        this.zza = zzfx;
        this.zzc = zzvm;
        this.zzd = zzyo;
    }

    public final zzvn zza(int i) {
        this.zzb = i;
        return this;
    }

    public final zzvp zzb(zzar zzar) {
        zzar.zzb.getClass();
        return new zzvp(zzar, this.zza, this.zzc, zzrf.zza, this.zzd, this.zzb, false, (zzfvf) null, (zzvo) null);
    }
}
