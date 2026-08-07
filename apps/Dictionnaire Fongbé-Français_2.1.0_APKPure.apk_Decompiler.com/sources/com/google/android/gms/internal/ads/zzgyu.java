package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgyu implements zzgzw {
    private static final zzgza zza = new zzgys();
    private final zzgza zzb;

    public zzgyu() {
        zzgza zzgza = zza;
        int i = zzgzm.zza;
        zzgyt zzgyt = new zzgyt(zzgxk.zza(), zzgza);
        byte[] bArr = zzgye.zzb;
        this.zzb = zzgyt;
    }

    public final zzgzv zza(Class cls) {
        int i = zzgzx.zza;
        if (!zzgxr.class.isAssignableFrom(cls)) {
            int i2 = zzgzm.zza;
        }
        zzgyz zzb2 = this.zzb.zzb(cls);
        if (!zzb2.zzb()) {
            int i3 = zzgzm.zza;
            return zzgzf.zzm(cls, zzb2, zzgzj.zza(), zzgyq.zza(), zzgzx.zzm(), zzb2.zzc() + -1 != 1 ? zzgxe.zza() : null, zzgyy.zza());
        }
        int i4 = zzgzm.zza;
        return zzgzg.zzc(zzgzx.zzm(), zzgxe.zza(), zzb2.zza());
    }
}
