package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzciv implements zzdsy {
    private final zzcih zza;
    private final zzciy zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzciv(zzcih zzcih, zzciy zzciy, zzcjm zzcjm) {
        this.zza = zzcih;
        this.zzb = zzciy;
    }

    public final /* bridge */ /* synthetic */ zzdsy zzb(long j) {
        Long valueOf = Long.valueOf(j);
        Long l = valueOf;
        this.zzc = valueOf;
        return this;
    }

    public final zzdsz zzc() {
        zzhez.zzc(this.zzc, Long.class);
        zzhez.zzc(this.zzd, String.class);
        return new zzciw(this.zza, this.zzb, this.zzc, this.zzd, (zzcjm) null);
    }

    public final /* bridge */ /* synthetic */ zzdsy zza(String str) {
        str.getClass();
        String str2 = str;
        this.zzd = str;
        return this;
    }
}
