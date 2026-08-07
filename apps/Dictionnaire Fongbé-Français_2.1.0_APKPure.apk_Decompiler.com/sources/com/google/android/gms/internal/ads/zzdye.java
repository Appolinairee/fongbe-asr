package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdye implements zzdyg {
    private final Map zza;
    private final zzgcs zzb;
    /* access modifiers changed from: private */
    public final zzcyo zzc;

    public zzdye(Map map, zzgcs zzgcs, zzcyo zzcyo) {
        this.zza = map;
        this.zzb = zzgcs;
        this.zzc = zzcyo;
    }

    public final ListenableFuture zzb(zzbvk zzbvk) {
        this.zzc.zzdl(zzbvk);
        ListenableFuture zzg = zzgch.zzg(new zzdvy(3));
        for (String trim : ((String) zzbe.zzc().zza(zzbcl.zzic)).split(",")) {
            zzhfj zzhfj = (zzhfj) this.zza.get(trim.trim());
            if (zzhfj != null) {
                zzg = zzgch.zzf(zzg, zzdvy.class, new zzdyc(zzhfj, zzbvk), this.zzb);
            }
        }
        zzgch.zzr(zzg, new zzdyd(this), zzbzw.zzg);
        return zzg;
    }
}
