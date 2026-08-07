package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzlg extends zztu {
    private final zzbp zzc = new zzbp();

    zzlg(zzlh zzlh, zzbq zzbq) {
        super(zzbq);
    }

    public final zzbo zzd(int i, zzbo zzbo, boolean z) {
        zzbo zzd = this.zzb.zzd(i, zzbo, z);
        if (this.zzb.zze(zzd.zzc, this.zzc, 0).zzb()) {
            Object obj = zzbo.zza;
            Object obj2 = zzbo.zzb;
            int i2 = zzbo.zzc;
            long j = zzbo.zzd;
            long j2 = zzbo.zze;
            zzd.zzi(obj, obj2, i2, j, 0, zzb.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
