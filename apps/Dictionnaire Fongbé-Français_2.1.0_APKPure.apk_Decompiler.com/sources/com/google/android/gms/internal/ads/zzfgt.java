package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfgt implements zzdcx, zzcwj, zzddb {
    private final zzfhh zza;
    private final zzfgw zzb;

    zzfgt(Context context, zzfhh zzfhh) {
        this.zza = zzfhh;
        this.zzb = zzfgv.zza(context, 13);
    }

    public final void zza() {
    }

    public final void zzb() {
        if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
            zzfhh zzfhh = this.zza;
            zzfgw zzfgw = this.zzb;
            zzfgw.zzg(true);
            zzfhh.zza(zzfgw);
        }
    }

    public final void zzk() {
    }

    public final void zzl() {
        if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    public final void zzq(zze zze) {
        if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
            zzfhh zzfhh = this.zza;
            zzfgw zzfgw = this.zzb;
            zzfgw.zzc(zze.zza().toString());
            zzfgw.zzg(false);
            zzfhh.zza(zzfgw);
        }
    }
}
