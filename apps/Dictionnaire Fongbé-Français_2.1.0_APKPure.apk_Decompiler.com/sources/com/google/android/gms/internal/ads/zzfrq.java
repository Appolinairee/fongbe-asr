package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfrq extends zzfsc {
    private String zza;
    private String zzb;

    zzfrq() {
    }

    public final zzfsc zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfsc zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzfsd zzc() {
        return new zzfrs(this.zza, this.zzb, (zzfrr) null);
    }
}
