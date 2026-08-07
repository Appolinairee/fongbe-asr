package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzxe extends zzxo implements Comparable {
    private final int zze;
    private final int zzf = this.zzd.zza();

    public zzxe(int i, zzbr zzbr, int i2, zzxh zzxh, int i3) {
        super(i, zzbr, i2);
        this.zze = zzlk.zza(i3, zzxh.zzO) ? 1 : 0;
    }

    /* renamed from: zza */
    public final int compareTo(zzxe zzxe) {
        return Integer.compare(this.zzf, zzxe.zzf);
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzxo zzxo) {
        zzxe zzxe = (zzxe) zzxo;
        return false;
    }
}
