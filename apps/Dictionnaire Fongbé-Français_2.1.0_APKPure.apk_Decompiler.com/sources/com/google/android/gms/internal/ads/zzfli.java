package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfli implements zzfll {
    private static final zzfli zza = new zzfli(new zzflm());
    private Date zzb;
    private boolean zzc;
    private final zzflm zzd;
    private boolean zze;

    private zzfli(zzflm zzflm) {
        this.zzd = zzflm;
    }

    public static zzfli zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void zzc(boolean z) {
        if (!this.zze && z) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    for (zzfkt zzg : zzflk.zza().zzb()) {
                        zzg.zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z;
    }

    public final void zzd(Context context) {
        if (!this.zzc) {
            this.zzd.zzd(context);
            this.zzd.zze(this);
            this.zzd.zzf();
            this.zze = this.zzd.zza;
            this.zzc = true;
        }
    }
}
