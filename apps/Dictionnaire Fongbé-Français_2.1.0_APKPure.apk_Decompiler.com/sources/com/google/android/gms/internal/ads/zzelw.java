package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzelw implements zzetr {
    private final zzgcs zza;
    private final zzfcj zzb;

    zzelw(zzgcs zzgcs, zzfcj zzfcj, zzfcy zzfcy) {
        this.zza = zzgcs;
        this.zzb = zzfcj;
    }

    public final int zza() {
        return 5;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzelv(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzelx zzc() throws Exception {
        String str = null;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgR)).booleanValue() && "requester_type_2".equals(zzaa.zzc(this.zzb.zzd))) {
            str = zzfcy.zza();
        }
        return new zzelx(str);
    }
}
