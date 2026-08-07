package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcnu {
    private final zzdrw zza;
    private final zzfca zzb;

    zzcnu(zzdrw zzdrw, zzfca zzfca) {
        this.zza = zzdrw;
        this.zzb = zzfca;
    }

    public final void zza(long j, int i) {
        String str;
        zzdrv zza2 = this.zza.zza();
        zza2.zzd(this.zzb.zzb.zzb);
        zza2.zzb("action", "ad_closed");
        zza2.zzb("show_time", String.valueOf(j));
        zza2.zzb("ad_format", "app_open_ad");
        int i2 = i - 1;
        if (i2 != 0) {
            str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb";
        } else {
            str = "h";
        }
        zza2.zzb("acr", str);
        zza2.zzg();
    }
}
