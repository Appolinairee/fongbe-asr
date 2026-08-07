package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzddk;
import com.google.android.gms.internal.ads.zzdee;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzbf(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdee zzdee = (zzw) this.zza.zzb();
        zzdee zzdee2 = (zzbm) this.zzb.zzb();
        Executor zzc2 = zzffh.zzc();
        if (((Integer) this.zzc.zzb()).intValue() == 2) {
            zzdee = zzdee2;
        }
        zzddk zzddk = new zzddk(zzdee, zzc2);
        zzddk zzddk2 = zzddk;
        return zzddk;
    }
}
