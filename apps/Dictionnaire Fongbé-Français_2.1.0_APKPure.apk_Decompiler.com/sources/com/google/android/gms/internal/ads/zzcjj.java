package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcjj implements zzab {
    private final zzcih zza;
    private zzcvc zzb;
    private zzaz zzc;

    /* synthetic */ zzcjj(zzcih zzcih, zzcjm zzcjm) {
        this.zza = zzcih;
    }

    public final /* bridge */ /* synthetic */ zzab zza(zzcvc zzcvc) {
        zzcvc zzcvc2 = zzcvc;
        this.zzb = zzcvc;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzab zzb(zzaz zzaz) {
        zzaz zzaz2 = zzaz;
        this.zzc = zzaz;
        return this;
    }

    public final zzac zzc() {
        zzhez.zzc(this.zzb, zzcvc.class);
        zzhez.zzc(this.zzc, zzaz.class);
        return new zzcjk(this.zza, this.zzc, new zzcsf(), new zzcue(), new zzdsl(), this.zzb, (zzezj) null, (zzeym) null, (zzcjm) null);
    }
}
