package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzegs {
    private final zzfdb zza;
    private final zzdpj zzb;
    private final zzdrw zzc;

    public zzegs(zzfdb zzfdb, zzdpj zzdpj, zzdrw zzdrw) {
        this.zza = zzfdb;
        this.zzb = zzdpj;
        this.zzc = zzdrw;
    }

    public final void zza(zzfbr zzfbr, zzfbo zzfbo, int i, @Nullable zzeda zzeda, long j) {
        zzdpi zzdpi;
        zzdrv zza2 = this.zzc.zza();
        zza2.zzd(zzfbr);
        zza2.zzc(zzfbo);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j));
        zza2.zzb("sc", Integer.toString(i));
        if (zzeda != null) {
            zza2.zzb("arec", Integer.toString(zzeda.zzb().zza));
            String zza3 = this.zza.zza(zzeda.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdpj zzdpj = this.zzb;
        Iterator it = zzfbo.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdpi = null;
                break;
            }
            zzdpi = zzdpj.zza((String) it.next());
            if (zzdpi != null) {
                break;
            }
        }
        if (zzdpi != null) {
            zza2.zzb("ancn", zzdpi.zza);
            zzbrs zzbrs = zzdpi.zzb;
            if (zzbrs != null) {
                zza2.zzb("adapter_v", zzbrs.toString());
            }
            zzbrs zzbrs2 = zzdpi.zzc;
            if (zzbrs2 != null) {
                zza2.zzb("adapter_sv", zzbrs2.toString());
            }
        }
        zza2.zzg();
    }
}
