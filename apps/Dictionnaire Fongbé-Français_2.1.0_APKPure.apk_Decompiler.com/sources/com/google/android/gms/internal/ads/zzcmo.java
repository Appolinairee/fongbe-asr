package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcmo implements zzcvw {
    private final zzfbr zza;
    private final zzfca zzb;
    private final zzfiv zzc;
    private final zzfja zzd;

    public zzcmo(zzfca zzfca, zzfja zzfja, zzfiv zzfiv) {
        this.zzb = zzfca;
        this.zzd = zzfja;
        this.zzc = zzfiv;
        this.zza = zzfca.zzb.zzb;
    }

    public final void zzdz(zze zze) {
        List list = this.zza.zza;
        this.zzd.zze(this.zzc.zzc(this.zzb, (zzfbo) null, list), (zzv) null);
    }
}
